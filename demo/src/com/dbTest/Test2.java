package com.dbTest;

import java.sql.Connection;
import java.sql.Statement;

import com.db.DBConn;

//DB�� ����ϴ� ���
//	Statement
//PreparedStatement
//		-- ���� �� ����
//CallableStatement

/*

DB���� ����
1. DraverManager�� Connection�� ����	- DBConn
2. Connection�� Statement�� ����
3. Statement�� ������ �����Ѵ�

������ sql���� �׻� �⺻commit�̴�
	
*/

public class Test2 {

	public static void main(String[] args) {
		
		Connection conn = DBConn.getConnection();
		
		if(conn==null) {
			System.out.println("�����ͺ��̽� ���� ����");
			System.exit(0);
		}
		
		try {
			
			Statement stmt = conn.createStatement();
			String sql;		// sql���� ��Ʈ������
			
			/*

			// INSERT
			sql = "insert into score(hak,name,kor,eng,mat) ";// �ݵ�� �������� ��ĭ ���� �ؿ� ������� ��
			sql += "values('1111','�ٽ���',90,70,20)";

			// statement�� ������ ����
			// insert, select, delete�� ��� executeUpdate�� ó��
			// �̻��� ������ 1���� ��ȯ, ������������ 0���� ��ȯ -> result
			int result = stmt.executeUpdate(sql);
			
			if(result==1) {
				System.out.println("�߰�����");
			}
			
			*/
			/*
			// UPDATE
			sql = "update score set name='������',kor=50,eng=80,mat=10 ";
			sql += "where hak='1111'";
			
			int result = stmt.executeUpdate(sql);

			if(result==1) {
				System.out.println("�߰�����");
			}
			*/
			
			// DELETE
			sql = "delete score where hak='1111'";
			
			int result = stmt.executeUpdate(sql);

			if(result==1) {
				System.out.println("�߰�����");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		// �׻� ��� �ҷ������� Ŭ����
		DBConn.close();

	}	

}
