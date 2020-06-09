package com.dbTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn = DBConn.getConnection();
		// 작고 간단한 것들은 statement로 사용
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		int ch;
			
		try {
			
			sql="select hak,name from score";
			
			stmt = conn.createStatement();	// 순방향
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// TYPE_SCROLL_SENSITIVE : 수정결과를 바로 반영
			// TYPE_SCROLL_INSENSITIVE : 수정결과가 바로 반영안됨
			// CONCUR_READ_ONLY		: 읽기 가능
			// CONCUR_UPDATABLE		: 수정 가능
			
			rs = stmt.executeQuery(sql);
			
			while(true) {
				do {
					System.out.print("1)처음, 2)이전, 3)다음, 4)마지막, 5)종료 : ");
					ch = sc.nextInt();
				}while(ch<1|| ch>6);
				
				switch (ch) {
				case 1: 
					if(rs.first()) {
						System.out.println("처음 : " + rs.getString(1) + " : " + rs.getString(2));
						
					}
					break;
				case 2: 
					if(rs.previous()) {
						System.out.println("이전 : " + rs.getString(1) + " : " + rs.getString(2));
						
					}
					break;
				case 3: 
					if(rs.next()) {
						System.out.println("다음 : " + rs.getString(1) + " : " + rs.getString(2));
						
					}
					break;
				case 4: 
					if(rs.last()) {
						System.out.println("마지막 : " + rs.getString(1) + " : " + rs.getString(2));
						
					}
					break;
				default:
					rs.close();
					stmt.close();
					DBConn.close();
					System.exit(0);
						
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
