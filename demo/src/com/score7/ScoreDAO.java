package com.score7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

// Data Access Object
// SQL 명령어를 모아놓은 클래스

public class ScoreDAO {

	// INSERT문. 매개변수로 ?에 값을 넣어줄 수 있음
	public int insertData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement 상위호환
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;

		try {
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values (?,?,?,?,?)"; // 데이터 값 입력 : ?

			// conn이 위치정보를 알고으니 db를 찾아가서 sql문(score insert)에 대한 정보를 받아옴
			// 받아와서 pstmt에 넣음
			pstmt = conn.prepareStatement(sql);

			// ?에 값을 넣기(매개변수)
			// n번 인덱스에 학번을 넣음
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			// result로 받고 끝냄, 또는 그냥 pstmt.executeUpdate()
			result = pstmt.executeUpdate();

			pstmt.close();

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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 avg, ";
			sql += "rank() over (order by (kor+eng+mat) desc) rank ";
			sql += "from score";

			pstmt = conn.prepareStatement(sql);

			// rs에 담음
			rs = pstmt.executeQuery();

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

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 반환값은 lists, lists를 읽어야함
		return lists;
	}

	public int updateData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement 상위호환
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;

		try {

			sql = "update score set kor=?,eng=?,mat=? where hak=?";

			// conn이 위치정보를 알고으니 db를 찾아가서 sql문(score insert)에 대한 정보를 받아옴
			// 받아와서 pstmt에 넣음
			pstmt = conn.prepareStatement(sql);

			// ?에 값을 넣기(매개변수)
			// n번 인덱스에 학번을 넣음
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			// result로 받고 끝냄, 또는 그냥 pstmt.executeUpdate()
			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	public int deleteData(String hak) {
		int result = 0;

		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		String sql;

		try {

			sql = "delete score where hak=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, hak);

			result = pstmt.executeUpdate();
			pstmt.close();

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
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 avg ";
			// 학을 찾음
			sql += "from score where hak=?";

			pstmt = conn.prepareStatement(sql);
			
			// 학번을 가져와서 검색해야하므로 매개변수를 가져옴
			// LIKE를 사용할 때는 SQL문이 아닌 이곳에 적음 EX) where=?; =>  pstmt.setString(1,name+"%");
			pstmt.setString(1, hak);

			// rs에 담음
			rs = pstmt.executeQuery();

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

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 반환값은 lists, lists를 읽어야함
		return dto;
	}

}
