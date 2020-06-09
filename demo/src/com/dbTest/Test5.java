package com.dbTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.db.DBConn;

// MetaData (DESC)
// 해당 테이블의 정보를 갖고있는 데이터에 액세스
// 테이블이 가지고있는 정보를 액세스
// DB내의 데이터에 대한 소유자, 데이터 크기 등등

public class Test5 {

	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		// 메타데이타
		ResultSetMetaData rsmd = null;
		
		String sql;
		
		try {
			
			sql = "select * from score";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// rs의 메타데이타만 가져옴, desc
			rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for(int i = 1; i<=cols; i++) {
				System.out.print("필드명 : " + rsmd.getColumnName(i));
				System.out.print(", 필드타입 : " + rsmd.getColumnType(i));
				System.out.print(", 필드타입명 : " + rsmd.getColumnTypeName(i));
				System.out.print(", 필드 폭 : " + rsmd.getPrecision(i));
				System.out.println();
			}
			
			System.out.println();
			
			while(rs.next()) {
				
				// 데이터 꺼내오기
				for(int i=1; i<=cols; i++) {
					System.out.print(rs.getString(i)+ " ");
				}
				System.out.println();
			}
			
			rs.close();
			stmt.close();
			DBConn.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
