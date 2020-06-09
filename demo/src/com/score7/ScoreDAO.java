package com.score7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConn;

// Data Access Object
// SQL ��ɾ ��Ƴ��� Ŭ����

public class ScoreDAO {

	// INSERT��. �Ű������� ?�� ���� �־��� �� ����
	public int insertData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement ����ȣȯ
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;

		try {
			sql = "insert into score (hak,name,kor,eng,mat) ";
			sql += "values (?,?,?,?,?)"; // ������ �� �Է� : ?

			// conn�� ��ġ������ �˰����� db�� ã�ư��� sql��(score insert)�� ���� ������ �޾ƿ�
			// �޾ƿͼ� pstmt�� ����
			pstmt = conn.prepareStatement(sql);

			// ?�� ���� �ֱ�(�Ű�����)
			// n�� �ε����� �й��� ����
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getKor());
			pstmt.setInt(4, dto.getEng());
			pstmt.setInt(5, dto.getMat());

			// result�� �ް� ����, �Ǵ� �׳� pstmt.executeUpdate()
			result = pstmt.executeUpdate();

			pstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;

	}

	// �ϳ��� ���� �о dto �� ����
	// �ι�°�� dto�� ����
	// --> list�� dto�� ��Ƽ� list�� �Ѱ���
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

			// rs�� ����
			rs = pstmt.executeQuery();

			// rs���� ���� �� ����
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

				// �̰͵��� �о list�� ����, ���࿡ �ѹ��� ����
				// 10���� ����Ʈ 10��
				lists.add(dto);

			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// ��ȯ���� lists, lists�� �о����
		return lists;
	}

	public int updateData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement ����ȣȯ
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;

		try {

			sql = "update score set kor=?,eng=?,mat=? where hak=?";

			// conn�� ��ġ������ �˰����� db�� ã�ư��� sql��(score insert)�� ���� ������ �޾ƿ�
			// �޾ƿͼ� pstmt�� ����
			pstmt = conn.prepareStatement(sql);

			// ?�� ���� �ֱ�(�Ű�����)
			// n�� �ε����� �й��� ����
			pstmt.setInt(1, dto.getKor());
			pstmt.setInt(2, dto.getEng());
			pstmt.setInt(3, dto.getMat());
			pstmt.setString(4, dto.getHak());

			// result�� �ް� ����, �Ǵ� �׳� pstmt.executeUpdate()
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

	// �й����� ã��
	public ScoreDTO searchData(String hak) {

		// ���������ְ� �������� �ִ�
		ScoreDTO dto = null;
		
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			sql = "select hak,name,kor,eng,mat,(kor+eng+mat) tot, (kor+eng+mat)/3 avg ";
			// ���� ã��
			sql += "from score where hak=?";

			pstmt = conn.prepareStatement(sql);
			
			// �й��� �����ͼ� �˻��ؾ��ϹǷ� �Ű������� ������
			// LIKE�� ����� ���� SQL���� �ƴ� �̰��� ���� EX) where=?; =>  pstmt.setString(1,name+"%");
			pstmt.setString(1, hak);

			// rs�� ����
			rs = pstmt.executeQuery();

			// �й��� 1���� �����Ƿ�
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

		// ��ȯ���� lists, lists�� �о����
		return dto;
	}

}
