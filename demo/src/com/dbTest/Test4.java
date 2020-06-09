package com.dbTest;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql;
		
		int n;
		
		// getter, setter를 만들지않았으므로 예시
		int id;
		String name,birth,tel;
		
		try {
			
			while(true) {
				
				do {
					System.out.println("1)입력, 2)출력, 3)종료 : ");
					n = sc.nextInt();
				}while(n<1|| n>3);
				
				switch(n) {
				
				case 1:
					
					// 자동커밋되지않도록 false 설정
					conn.setAutoCommit(false);
					// 아이디 입력
					System.out.print("아이디 : ");
					id = sc.nextInt();
					
					System.out.print("이름 : ");
					name = sc.next();
					// date로 주었기 때문에 타입을 맞춰줘야함	(yy/mm/dd)
					System.out.print("생일 : ");
					birth = sc.next();
					System.out.print("전화번호 : ");
					tel = sc.next();
					
					// Test1에 입력
					sql = String.format("insert into test1(id,name) values (%d,'%s')", id,name);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
			
					// Test2에 입력
					sql = String.format("insert into test2(id,birth) values (%d,'%s')", id,birth);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					// Test3에 입력
					sql = String.format("insert into test3(id,tel) values (%d,'%s')", id,tel);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					// 커밋
					conn.commit();
					break;
					
				case 2:
					break;
				case 3:
					DBConn.close();
					System.exit(0);
				}
			
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
