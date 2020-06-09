package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

// JDBC : Java DataBase Connectivity

public class DBConn {
	
	// 연결하는 변수
	private static Connection dbConn;
	
	public static Connection getConnection() {
		
		// dbConn이 연결이 안되면
		if(dbConn == null) {		
			try {
				// 내 오라클서버를 이용함
				String url = "jdbc:oracle:thin:@192.168.16.22:1521:TestDB";
				String user = "suzi";
				String password = "a123";
				
				// 클래스내용을 가져옴
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 드라이버 매니저가 3개의 정보를가지고 연결, dbConn을 가져다가 사용하면 연결가능
				dbConn = DriverManager.getConnection(url, user, password);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		return dbConn;
		
	}
	
	// db가 한번사용되면 연결을 끊음
	public static void close() {
	
		if(dbConn != null){
			
			try {
				// 만약 디비가 닫혀있지않으면
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
							
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		// 두번째 연결시 쓰레기값때문에 연결이 되지않으므로 초기화시킴
		dbConn=null;
	}
}
