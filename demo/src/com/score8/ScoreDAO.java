package com.score8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

import oracle.jdbc.internal.OracleTypes;

// Data Access Object
// SQL 명령어를 모아놓은 클래스

public class ScoreDAO {

	// INSERT문. 매개변수로 ?에 값을 넣어줄 수 있음
	public int insertData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();
		
		// 프로시저 호출
		CallableStatement cstmt = null;
		String sql;
		int result = 0;

		try {
			// insertScore라는 프로시저 호출
			sql = "{call insertScore(?,?,?,?,?)}";

			// conn이 위치정보를 알고으니 db를 찾아가서 sql문(score insert)에 대한 정보를 받아옴
			// 받아와서 pstmt에 넣음
			cstmt = conn.prepareCall(sql);

			// ?에 값을 넣기(매개변수)
			// n번 인덱스에 학번을 넣음
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			// result로 받고 끝냄, 또는 그냥 pstmt.executeUpdate()
			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// 하나의 행을 읽어서 dto 에 담음
	// 두번째도 dto에 담음
	// --> list에 dto를 담아서 list를 넘겨줌
	public List<ScoreDTO> selectList() {

		List<ScoreDTO> lists = new ArrayList<ScoreDTO>();
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			// 외부로 가는 커서를 받는 코드
			sql = "{call selectAllScore(?)}";

			cstmt = conn.prepareCall(sql);
			
			// out 파라미터 자료형, ?의 자료형 = CURSOR.
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				
			// 프로시저 실행, 이곳으로 데이터가 나옴
			cstmt.executeUpdate();
			
			// out 파라미터의 값을 받음 -> rs로 받음
			ResultSet rs = (ResultSet)cstmt.getObject(1); 

			// rs값이 있을 때 까지
			while (rs.next()) {

				ScoreDTO dto = new ScoreDTO();

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));
				dto.setRank(rs.getInt("rank"));

				// 이것들을 읽어서 list에 저장, 한행에 한번씩 저장
				// 10개면 리스트 10개
				lists.add(dto);

			}
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 반환값은 lists, lists를 읽어야함
		return lists;
	}

	public int updateData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement 상위호환
		CallableStatement cstmt = null;
		String sql;
		int result = 0;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			// ?에 값을 넣기(매개변수)
			// n번 인덱스에 학번을 넣음
			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());


			// result로 받고 끝냄, 또는 그냥 pstmt.executeUpdate()
			result = cstmt.executeUpdate();

			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	public int deleteData(String hak) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		String sql;

		try {

			sql = "{call deleteScore(?)}";
			cstmt = conn.prepareCall(sql);

			cstmt.setString(1, hak);

			result = cstmt.executeUpdate();
			cstmt.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return result;
	}

	// 학번으로 찾기
	public ScoreDTO searchData(String hak) {

		// 있을수도있고 없을수도 있다
		ScoreDTO dto = null;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			// 하나는 집어넣는값, 하나는 받아내는 값
			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);
		
			// out 파라미터 자료형 선언, 첫뻔째 물음표에 커서
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			// in 파라미터 자료형 선언, 두번째 물음표에는 학번을 집어넣음
			cstmt.setString(2, hak);

			// rs에 담음
			rs = (ResultSet)cstmt.getObject(1);

			// 학번은 1개만 있으므로
			if(rs.next()) {

				dto = new ScoreDTO();

				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAvg(rs.getInt("avg"));

			}
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 반환값은 lists, lists를 읽어야함
		return dto;
	}

}
