package com.score6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Score {
	
	Scanner sc = new Scanner(System.in);

	// 1. �Է�(insert)
	public int insertData() {
		
		int result = 0;
		
		try {
			
			// db���� �ߺ�
			Connection conn = DBConn.getConnection();
			
			Statement stmt = null;
			String sql;
			
			
			ScoreDTO dto = new ScoreDTO();
			
			System.out.print("�й� : ");
			dto.setHak(sc.next());
			
			System.out.print("�̸� : ");
			dto.setName(sc.next());
			
			System.out.print("�������� : ");
			dto.setKor(sc.nextInt());
			
			System.out.print("�������� : ");
			dto.setEng(sc.nextInt());
			
			System.out.print("�������� : ");
			dto.setMat(sc.nextInt());
			
			sql = "insert into score (hak,name,kor,eng,mat) values ('" + dto.getHak() + "', '" + dto.getName()+"', "+ dto.getKor()+", "+dto.getEng()+", "+dto.getMat() + ")";
			
			stmt = conn.createStatement();
			
			// �� ������1, �ȵ����� 0
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			
			System.out.println("�Ϸηη�");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	return result;
		
	}
	
	// ���� (update ��)
	public int updateData() {
		
		int result = 0;
		try {
			
			Connection conn = DBConn.getConnection();
			Statement stmt = null;
			String sql;
			
			ScoreDTO dto = new ScoreDTO();
			
			System.out.print("������ �й� : ");
			dto.setHak(sc.next());
			
			System.out.print("�������� : ");
			dto.setKor(sc.nextInt());
			
			System.out.print("�������� : ");
			dto.setEng(sc.nextInt());
			
			System.out.print("�������� : ");
			dto.setMat(sc.nextInt());
			
			//mat �ڿ��� ��ĭ �پ����
			sql = "update score set kor="+dto.getKor()+", "+"eng="+dto.getEng()+", "+"mat="+dto.getMat()+" ";
			sql += "where hak='"+dto.getHak()+"'";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();
			
			System.out.println("������Ʈ ����");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	
		return result;
	}
	
	public int deleteData() {
		
		int result = 0;
		
		try {
			
			Connection conn = DBConn.getConnection();
			Statement stmt = null;
			String sql;
			
			String hak;
			System.out.print("������ �й� : ");
			hak = sc.next();
			
			sql = "delete score where hak='"+hak+"'";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return result;
	}
	
	// ��񿡼� �����͸� ������ ���̺��� ǥ �������� ��µǴµ�
	// �� ǥ ������ ���� �׸��� �ʿ���
	public void selectAll() {

		try {
			
			Connection conn = DBConn.getConnection();
			// sql������ �����ϴ� �Լ�
			Statement stmt = null;
			// sql���� �ݴ� �Լ�
			String sql;
			
			//select ������ ���Ǵ� ǥ������ ���� �Լ�
			ResultSet rs = null;
			
			sql = "SELECT HAK,NAME,KOR,ENG,MAT,";
			sql+= "(kor+eng+mat) tot,(kor+eng+mat)/3 avg ";
			sql+= "from score order by hak";
			
			stmt = conn.createStatement();
			
			// rescultset �Լ�
			rs = stmt.executeQuery(sql);
			// rs�� �����Ͱ� ���� �� ����
			
			System.out.println(" Hak��name�� kor �� eng �� mat �� tot �� avg ");
			System.out.println("����������������������������������������������");
			while(rs.next()) {
				// �������� ������ŭ dto�� ���� ���྿ ��Ƽ� ������´� (�������̹Ƿ�), dto�� ��´�
				// �÷��� �ε�����ȣ�� �� �տ������� 1~
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString(1));	// �й��� �ε�����ȣ 1�� ������
				dto.setName(rs.getString("name")); 		// �������� �̸��� ������
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));		// ������ �ε�����ȣ
				dto.setTot(rs.getInt("tot"));	// total�� (�ε�����ȣ 6)
				dto.setAvg(rs.getInt(7));		// ����� �ε�����ȣ
		
				System.out.printf("%4s %6s %4d %6d %5d %7d %5d\n",dto.getHak(),dto.getName(),dto.getKor(),dto.getEng(),dto.getMat(),dto.getTot(),dto.getAvg());
				
			}
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public void nameSearch() {
		
		
		try {
			Connection conn = DBConn.getConnection();
			Statement stmt = null;
			ResultSet rs = null;
			String sql;
			String name;
			
			System.out.print("�˻��� �̸� �Է� : ");
			name = sc.next();
			sql = "select hak,name,kor,eng,mat from score where name like '%"+name+"%'";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString(1));	
				dto.setName(rs.getString("name")); 
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));	
			
				System.out.printf("%4s %6s %4d %6d %5d\n",dto.getHak(),dto.getName(),dto.getKor(),dto.getEng(),dto.getMat());
			}
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	
	}
	
}
