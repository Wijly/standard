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
		
		// getter, setter�� �������ʾ����Ƿ� ����
		int id;
		String name,birth,tel;
		
		try {
			
			while(true) {
				
				do {
					System.out.println("1)�Է�, 2)���, 3)���� : ");
					n = sc.nextInt();
				}while(n<1|| n>3);
				
				switch(n) {
				
				case 1:
					
					// �ڵ�Ŀ�Ե����ʵ��� false ����
					conn.setAutoCommit(false);
					// ���̵� �Է�
					System.out.print("���̵� : ");
					id = sc.nextInt();
					
					System.out.print("�̸� : ");
					name = sc.next();
					// date�� �־��� ������ Ÿ���� ���������	(yy/mm/dd)
					System.out.print("���� : ");
					birth = sc.next();
					System.out.print("��ȭ��ȣ : ");
					tel = sc.next();
					
					// Test1�� �Է�
					sql = String.format("insert into test1(id,name) values (%d,'%s')", id,name);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
			
					// Test2�� �Է�
					sql = String.format("insert into test2(id,birth) values (%d,'%s')", id,birth);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					// Test3�� �Է�
					sql = String.format("insert into test3(id,tel) values (%d,'%s')", id,tel);
					stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					
					// Ŀ��
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
