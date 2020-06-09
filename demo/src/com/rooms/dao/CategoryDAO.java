package com.rooms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;
import com.rooms.domain.CategoryVO;

public class CategoryDAO {

	public int insert(CategoryVO vo) {
		
		int result = 0;
		
		try {
			
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;
			
			sql = "insert into category(cate_num, cate_name) values(IDX_CATE_NUM.NEXTVAL, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCate_name());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		
		return result;
	}
	
	public int update(CategoryVO vo) {
		
		int result = 0;
		
		try {
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;
			
			sql = "update category set cate_name = ? where cate_num = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCate_name());
			pstmt.setInt(2, vo.getCate_num());
			
			result = pstmt.executeUpdate();
			
			pstmt.close();
			
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		
		return result;
		
	}
	
	public List<CategoryVO> select(){
		List<CategoryVO> list = new ArrayList<>();
		try {
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql;
			
			sql = "select cate_num, cate_name from category";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CategoryVO vo = new CategoryVO();
				
				vo.setCate_num(rs.getInt("cate_num"));
				vo.setCate_name(rs.getString("cate_name"));
				
				list.add(vo);
				
			}
			
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
	
	public int delete(int cate_num) {
		
		int result = 0;
		
		try {
			Connection conn = DBConn.getConnection();
			PreparedStatement pstmt = null;
			String sql;
			
			sql = "delete category where cate_num = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, cate_num);
			
			result = pstmt.executeUpdate();
			
			
			pstmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
		
	}
}
