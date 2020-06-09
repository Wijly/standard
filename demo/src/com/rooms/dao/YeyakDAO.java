package com.rooms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import com.rooms.domain.ReservationVO;
import com.rooms.domain.RoomsVO;

public class YeyakDAO {
	
	public List<RoomsVO> showRooms() {
		
		List<RoomsVO> lists = new ArrayList<RoomsVO>();
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt= null;	
		ResultSet rs = null;
		String sql;
		try {
			sql = "select NUM,ROOM_NAME,ROOM_TEL,FULL_ADDR from Rooms";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				RoomsVO rvo = new RoomsVO();
				
				rvo.setNum(rs.getInt("num"));
				rvo.setRoom_name(rs.getString("room_name"));
				rvo.setRoom_tel(rs.getString("room_tel"));
				rvo.setFull_addr(rs.getString("full_addr"));
				
				lists.add(rvo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lists;
	
	}
	
	// 예약 있는지 없는지 확인하는 메소드
	public boolean possibleYeyak(String id) {
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt= null;	
		ResultSet rs = null;
		String sql;
		boolean result = false;
		
		try {
			
			sql = "select * from reservation where ID=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = true;
			}
			pstmt.close();
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	
	// 예약 
	public int insertYeyak(int h_num, String id, String date1, String date2) {
		ReservationVO res_dto = null;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null; // reservation의 pstmt
		PreparedStatement pstmt2 = null; // member update의 pstmt
		PreparedStatement pstmt3 = null; // Rooms의 순위 update
		String sql; // reservation에 예약 넣기
		String sql2; // memeber 예약번호 넣기
		String sql3; // 순위 매기기 위한 쿼리

		int result = 0; // reservation 반환값을 위한 result
		int result1 = 0; // member 반환값을 위한 result
		int result2 = 0; // 반환할 값, 합친 값
		int result3 = 0; // 예약하면 건수 1개 추가
		try {

			sql = "insert into RESERVATION(RE_NUM,ID,ROOM_NUM,ROOM_NAME,FULL_ADDR,ROOM_TEL,MEM_TEL) ";
			sql += "select IDX_RESERVATION.NEXTVAL,A.id, B.NUM,B.room_name,FULL_ADDR,B.room_tel,A.TEL ";
			sql += "FROM MEMBER A, ROOMS B ";
			sql += "WHERE  A.ID=? AND  B.NUM=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setInt(2, h_num);
			result = pstmt.executeUpdate();

			// ------------------------
			sql2 = "update member set re_num=(SELECT RE_NUM FROM RESERVATION WHERE ID=?) where id=?";
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, id);
			pstmt2.setString(2, id);
			result1 = pstmt2.executeUpdate();

			sql3 = "update rooms set re_cnt = re_cnt + 1 where num = ?";
			pstmt3 = conn.prepareStatement(sql3);
			pstmt3.setInt(1, h_num);

			result3 = pstmt3.executeUpdate();

			sql = "update reservation set re_start = ?, re_end = ? where room_num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, date1);
			pstmt.setString(2, date2);
			pstmt.setInt(3, h_num);
			pstmt.executeUpdate();
			pstmt.close();
			pstmt2.close();
			pstmt3.close();
			
			if (result == 1 && result1 == 1) {
				result2 = 1;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result2;
	}
	
	// 예약 취소
	public int deleteYeyak(String id) {
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt= null;
		PreparedStatement pstmt2 = null;
		int result = 0;
		String sql;
		String sql2;
		ResultSet rs = null;
		try {
			
			sql = "select room_num from reservation where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			rs = pstmt.executeQuery();
			
			int num = 0;
			
			while(rs.next()) {
				num = rs.getInt(1);
			}
			
			sql2 = "update rooms set re_cnt = re_cnt -1 where num = ?";
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setInt(1, num);
			pstmt2.executeUpdate();
			
			sql = "DELETE RESERVATION WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
			pstmt.close();
			
			pstmt2.close();
			pstmt.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
		
	
	}
	
	// 예약 확인 메소드
	public ReservationVO yeyakSearch(String id) {
		ReservationVO vo = null;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {
			
			sql ="select ID,ROOM_NAME,FULL_ADDR,ROOM_TEL, RE_START, RE_END from reservation where id=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new ReservationVO();
				vo.setId(rs.getString("id"));
				vo.setRoom_name(rs.getString("room_name"));
				vo.setFULL_ADDR(rs.getString("FULL_ADDR"));
				vo.setRoom_tel(rs.getString("ROOM_TEL"));
				vo.setRe_start(rs.getDate("RE_START"));
				vo.setRe_end(rs.getDate("RE_END"));
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return vo;
		
	}
	
}
