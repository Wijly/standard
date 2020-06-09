package com.rooms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.db.DBConn;
import com.rooms.domain.MemberVO;

public class MemberDAO {

	public int register(MemberVO vo) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;
		try {
			sql = "insert into member(id,pwd,name,tel,email,birth) values(?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getEmail());
			pstmt.setDate(6, (Date)vo.getBirth());
			result = pstmt.executeUpdate();
			conn.commit();
			conn.setAutoCommit(true); 
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}

	public boolean checkid(String id) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		boolean check = false;
		try {	
			sql = "select * from member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return check;
	}

	public boolean checklogin(String id, String pwd) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		boolean check = false;
		try {
			sql = "select * from member where id = ? and pwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return check;
	}

	public void update(MemberVO vo, String id) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		try {
			sql = "update member set id = ?, pwd = ?, name = ?, tel = ?, email = ? where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getEmail());
			pstmt.setString(6, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void delete(String id) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;
		try {
			sql = "delete member where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
