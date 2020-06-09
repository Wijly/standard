package com.rooms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import com.rooms.domain.ReservationVO;
import com.rooms.domain.RoomsVO;

public class RoomsDAO {

	public int insert(RoomsVO vo) {

		int result = 0;

		try {
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;

			sql = "insert into rooms(num, room_name, room_tel, full_addr, street_addr, zipcode,cate_num)";
			sql += "values(IDX_ROOMS.NEXTVAL, ?, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getRoom_name());
			pstmt.setString(2, vo.getRoom_tel());
			pstmt.setString(3, vo.getFull_addr());
			pstmt.setString(4, vo.getStreet_addr());
			pstmt.setString(5, vo.getZipcode());
			pstmt.setInt(6, vo.getCate_num());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		return result;
	}

	public List<RoomsVO> select() {
		List<RoomsVO> list = new ArrayList<RoomsVO>();
		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;

			sql = "select num, b.cate_name, room_name, room_tel, full_addr, street_addr, zipcode, run_status ";
			sql += "from rooms a, category b where a.cate_num = b.cate_num";

			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				RoomsVO vo = new RoomsVO();

				vo.setNum(rs.getInt("num"));
				vo.getCate().setCate_name(rs.getString("cate_name"));
				vo.setRoom_name(rs.getString("room_name"));
				vo.setRoom_tel(rs.getString("room_tel"));
				vo.setFull_addr(rs.getString("full_addr"));
				vo.setStreet_addr(rs.getString("street_addr"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setRun_status(rs.getString("run_status"));

				list.add(vo);

			}

			rs.close();
			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return list;
	}

	public int update(RoomsVO vo) {

		int result = 0;

		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;

			sql = "update rooms set room_name = ?, room_tel = ?, run_status = ? where num = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getRoom_name());
			pstmt.setString(2, vo.getRoom_tel());
			pstmt.setString(3, vo.getRun_status());
			pstmt.setInt(4, vo.getNum());

			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		return result;
	}

	public int delete(int num) {
		int result = 0;

		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;

			sql = "delete rooms where num = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, num);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return result;
	}

	public RoomsVO searchRooms(String room_name) {

		RoomsVO vo = null;

		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;

			sql = "select num, b.cate_name, room_name, room_tel, full_addr, street_addr, zipcode, run_status ";
			sql += "from rooms a, category b where a.cate_num = b.cate_num and room_name like ? ";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, "%" + room_name + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {

				vo = new RoomsVO();

				vo.setNum(rs.getInt("num"));
				vo.getCate().setCate_name(rs.getString("cate_name"));
				vo.setRoom_name(rs.getString("room_name"));
				vo.setRoom_tel(rs.getString("room_tel"));
				vo.setFull_addr(rs.getString("full_addr"));
				vo.setStreet_addr(rs.getString("street_addr"));
				vo.setZipcode(rs.getString("zipcode"));
				vo.setRun_status(rs.getString("run_status"));

				System.out.println(vo);

			}

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		return vo;
	}

	public List<RoomsVO> rankSelect() {
		List<RoomsVO> list = new ArrayList<>();

		try {
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;

			sql = "SELECT CATE_NAME, ROOM_NAME, ROOM_TEL, FULL_ADDR, RE_CNT, RANK ";
			sql += "FROM (SELECT B.CATE_NAME, ROOM_NAME, ROOM_TEL, FULL_ADDR, RE_CNT, RANK() OVER(ORDER BY RE_CNT DESC) RANK FROM ROOMS A, CATEGORY B WHERE A.CATE_NUM = B.CATE_NUM) ";
			sql += "WHERE ROWNUM <= 20";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				RoomsVO vo = new RoomsVO();

				vo.getCate().setCate_name(rs.getString("cate_name"));
				vo.setRoom_name(rs.getString("room_name"));
				vo.setRoom_tel(rs.getString("room_tel"));
				vo.setFull_addr(rs.getString("full_addr"));
				vo.setRe_cnt(rs.getInt("re_cnt"));
				vo.setCount(rs.getInt("rank"));
				list.add(vo);
			}

			rs.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return list;
	}

	// 지역별 숙박업소 통계
	public List<RoomsVO> regionSelect() {
		List<RoomsVO> list = new ArrayList<>();

		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;

			sql = "SELECT SUBSTR(FULL_ADDR, 0, INSTR(FULL_ADDR, ' ', 1, 2)) region, COUNT(ROOM_NAME) count, RANK() OVER(ORDER BY COUNT(ROOM_NAME) DESC) re_cnt ";
			sql += "FROM ROOMS GROUP BY SUBSTR(FULL_ADDR, 0, INSTR(FULL_ADDR, ' ', 1, 2))";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				RoomsVO vo = new RoomsVO();

				vo.setRegion(rs.getString("region"));
				vo.setCount(rs.getInt("count"));
				vo.setRe_cnt(rs.getInt("re_cnt"));
				list.add(vo);

			}

			rs.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// 검색한 지역 구분 없이 상위 20개 데이터 출력
	public List<RoomsVO> regionSearch(String region) {

		List<RoomsVO> list = new ArrayList<>();

		try {

			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;

			sql = "SELECT NUM, ROOM_TEL, SUBSTR(FULL_ADDR, 0, INSTR(FULL_ADDR, ' ', 1, 2)) REGION, ROOM_NAME, RE_CNT, RANK ";
			sql += "FROM (SELECT NUM, B.CATE_NAME, ROOM_NAME, ROOM_TEL, FULL_ADDR, RE_CNT, RANK() OVER(ORDER BY RE_CNT DESC) RANK FROM ROOMS A, CATEGORY B ";
			sql += "WHERE SUBSTR(FULL_ADDR, 0, INSTR(FULL_ADDR, ' ', 1, 2)) LIKE ? AND A.CATE_NUM = B.CATE_NUM) ";
			sql += "WHERE ROWNUM <= 20 GROUP BY NUM, ROOM_TEL, SUBSTR(FULL_ADDR, 0, INSTR(FULL_ADDR, ' ', 1, 2)), ROOM_NAME, RE_CNT,  RANK ";
			sql += "ORDER BY RANK ASC";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + region + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				RoomsVO vo = new RoomsVO();

				vo.setNum(rs.getInt("num"));
				vo.setRoom_tel(rs.getString("room_tel"));
				vo.setRegion(rs.getString("region"));
				vo.setRoom_name(rs.getString("room_name"));
				vo.setRe_cnt(rs.getInt("re_cnt"));
				vo.setCount(rs.getInt("rank"));

				list.add(vo);
			}

		} catch (Exception e) {

			System.out.println(e.toString());
		}

		return list;
	}
}
