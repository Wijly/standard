package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

// JDBC : Java DataBase Connectivity

public class DBConn {
	
	// �����ϴ� ����
	private static Connection dbConn;
	
	public static Connection getConnection() {
		
		// dbConn�� ������ �ȵǸ�
		if(dbConn == null) {		
			try {
				// �� ����Ŭ������ �̿���
				String url = "jdbc:oracle:thin:@192.168.16.22:1521:TestDB";
				String user = "suzi";
				String password = "a123";
				
				// Ŭ���������� ������
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// ����̹� �Ŵ����� 3���� ������������ ����, dbConn�� �����ٰ� ����ϸ� ���ᰡ��
				dbConn = DriverManager.getConnection(url, user, password);
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		
		return dbConn;
		
	}
	
	// db�� �ѹ����Ǹ� ������ ����
	public static void close() {
	
		if(dbConn != null){
			
			try {
				// ���� ��� ��������������
				if(!dbConn.isClosed()) {
					dbConn.close();
				}
							
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		// �ι�° ����� �����Ⱚ������ ������ ���������Ƿ� �ʱ�ȭ��Ŵ
		dbConn=null;
	}
}
