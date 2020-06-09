package com.score6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db.DBConn;

public class Score {
	
	Scanner sc = new Scanner(System.in);

	// 1. 입력(insert)
	public int insertData() {
		
		int result = 0;
		
		try {
			
			// db연결 중복
			Connection conn = DBConn.getConnection();
			
			Statement stmt = null;
			String sql;
			
			
			ScoreDTO dto = new ScoreDTO();
			
			System.out.print("학번 : ");
			dto.setHak(sc.next());
			
			System.out.print("이름 : ");
			dto.setName(sc.next());
			
			System.out.print("국어점수 : ");
			dto.setKor(sc.nextInt());
			
			System.out.print("영어점수 : ");
			dto.setEng(sc.nextInt());
			
			System.out.print("수학점수 : ");
			dto.setMat(sc.nextInt());
			
			sql = "insert into score (hak,name,kor,eng,mat) values ('" + dto.getHak() + "', '" + dto.getName()+"', "+ dto.getKor()+", "+dto.getEng()+", "+dto.getMat() + ")";
			
			stmt = conn.createStatement();
			
			// 잘 들어갔으면1, 안들어갔으면 0
			result = stmt.executeUpdate(sql);
			
			stmt.close();
			
			System.out.println("뾰로로롱");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	return result;
		
	}
	
	// 수정 (update 문)
	public int updateData() {
		
		int result = 0;
		try {
			
			Connection conn = DBConn.getConnection();
			Statement stmt = null;
			String sql;
			
			ScoreDTO dto = new ScoreDTO();
			
			System.out.print("변경할 학번 : ");
			dto.setHak(sc.next());
			
			System.out.print("국어점수 : ");
			dto.setKor(sc.nextInt());
			
			System.out.print("영어점수 : ");
			dto.setEng(sc.nextInt());
			
			System.out.print("수학점수 : ");
			dto.setMat(sc.nextInt());
			
			//mat 뒤에는 한칸 뛰어야함
			sql = "update score set kor="+dto.getKor()+", "+"eng="+dto.getEng()+", "+"mat="+dto.getMat()+" ";
			sql += "where hak='"+dto.getHak()+"'";
			
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			stmt.close();
			
			System.out.println("업데이트 성공");
			
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
			System.out.print("삭제할 학번 : ");
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
	
	// 디비에서 데이터를 받으면 테이블을 표 형식으로 출력되는데
	// 그 표 형식을 받을 그릇이 필요함
	public void selectAll() {

		try {
			
			Connection conn = DBConn.getConnection();
			// sql문장을 실행하는 함수
			Statement stmt = null;
			// sql문을 닫는 함수
			String sql;
			
			//select 문에서 사용되는 표형식을 받을 함수
			ResultSet rs = null;
			
			sql = "SELECT HAK,NAME,KOR,ENG,MAT,";
			sql+= "(kor+eng+mat) tot,(kor+eng+mat)/3 avg ";
			sql+= "from score order by hak";
			
			stmt = conn.createStatement();
			
			// rescultset 함수
			rs = stmt.executeQuery(sql);
			// rs의 데이터가 있을 때 까지
			
			System.out.println(" Hakㅣnameㅣ kor ㅣ eng ㅣ mat ㅣ tot ㅣ avg ");
			System.out.println("───────────────────────");
			while(rs.next()) {
				// 데이터의 갯수만큼 dto를 만들어서 한행씩 담아서 가지고온다 (여러개이므로), dto에 담는다
				// 컬럼의 인덱스번호는 맨 앞에서부터 1~
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString(1));	// 학번의 인덱스번호 1을 가져옴
				dto.setName(rs.getString("name")); 		// 데이터의 이름을 가져옴
				dto.setKor(rs.getInt(3));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt(5));		// 수학의 인덱스번호
				dto.setTot(rs.getInt("tot"));	// total값 (인덱스번호 6)
				dto.setAvg(rs.getInt(7));		// 평균의 인덱스번호
		
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
			
			System.out.print("검색할 이름 입력 : ");
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
