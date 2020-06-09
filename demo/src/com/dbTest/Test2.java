package com.dbTest;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//DB를 사용하는 방법
//	Statement
//PreparedStatement
//		-- 한층 더 발전
//CallableStatement

/*

DB연결 순서
1. DraverManager가 Connection을 생성	- DBConn
2. Connection이 Statement를 생성
3. Statement가 쿼리를 실행한다

들어오는 sql문은 항상 기본commit이다
	
*/

public class Test2 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		if(conn==null) {
			System.out.println("데이터베이스 연결 실패");
			System.exit(0);
		}
		
		try {
			
			Statement stmt = conn.createStatement();
			String sql;		// sql문은 스트링으로
			
			/*

			// INSERT
			sql = "insert into score(hak,name,kor,eng,mat) ";// 반드시 마지막에 한칸 띄어야 밑에 밸류값이 들어감
			sql += "values('1111','다스리',90,70,20)";

			// statement가 쿼리를 실행
			// insert, select, delete는 모두 executeUpdate로 처리
			// 이상이 없으면 1값을 반환, 오류가있으면 0값을 반환 -> result
			int result = stmt.executeUpdate(sql);
			
			if(result==1) {
				System.out.println("추가성공");
			}
			
			*/
			/*
			// UPDATE
			sql = "update score set name='따스리',kor=50,eng=80,mat=10 ";
			sql += "where hak='1111'";
			
			int result = stmt.executeUpdate(sql);

			if(result==1) {
				System.out.println("추가성공");
			}
			*/
			
			// DELETE
			sql = "delete score where hak='1111'";
			
			int result = stmt.executeUpdate(sql);

			if(result==1) {
				System.out.println("추가성공");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		// 항상 디비 불러왔으면 클로즈
		DBConn.close();

	}	

}
