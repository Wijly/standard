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
// SQL ��ɾ ��Ƴ��� Ŭ����

public class ScoreDAO {

	// INSERT��. �Ű������� ?�� ���� �־��� �� ����
	public int insertData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();
		
		// ���ν��� ȣ��
		CallableStatement cstmt = null;
		String sql;
		int result = 0;

		try {
			// insertScore��� ���ν��� ȣ��
			sql = "{call insertScore(?,?,?,?,?)}";

			// conn�� ��ġ������ �˰����� db�� ã�ư��� sql��(score insert)�� ���� ������ �޾ƿ�
			// �޾ƿͼ� pstmt�� ����
			cstmt = conn.prepareCall(sql);

			// ?�� ���� �ֱ�(�Ű�����)
			// n�� �ε����� �й��� ����
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());

			// result�� �ް� ����, �Ǵ� �׳� pstmt.executeUpdate()
			result = cstmt.executeUpdate();

			cstmt.close();

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
		CallableStatement cstmt = null;
		String sql;

		try {

			// �ܺη� ���� Ŀ���� �޴� �ڵ�
			sql = "{call selectAllScore(?)}";

			cstmt = conn.prepareCall(sql);
			
			// out �Ķ���� �ڷ���, ?�� �ڷ��� = CURSOR.
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				
			// ���ν��� ����, �̰����� �����Ͱ� ����
			cstmt.executeUpdate();
			
			// out �Ķ������ ���� ���� -> rs�� ����
			ResultSet rs = (ResultSet)cstmt.getObject(1); 

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
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// ��ȯ���� lists, lists�� �о����
		return lists;
	}

	public int updateData(ScoreDTO dto) {

		Connection conn = DBConn.getConnection();

		// Statement ����ȣȯ
		CallableStatement cstmt = null;
		String sql;
		int result = 0;

		try {

			sql = "{call updateScore(?,?,?,?)}";

			cstmt = conn.prepareCall(sql);

			// ?�� ���� �ֱ�(�Ű�����)
			// n�� �ε����� �й��� ����
			cstmt.setString(1, dto.getHak());
			cstmt.setInt(2, dto.getKor());
			cstmt.setInt(3, dto.getEng());
			cstmt.setInt(4, dto.getMat());


			// result�� �ް� ����, �Ǵ� �׳� pstmt.executeUpdate()
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

	// �й����� ã��
	public ScoreDTO searchData(String hak) {

		// ���������ְ� �������� �ִ�
		ScoreDTO dto = null;
		
		Connection conn = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;

		try {

			// �ϳ��� ����ִ°�, �ϳ��� �޾Ƴ��� ��
			sql = "{call selectHakScore(?,?)}";

			cstmt = conn.prepareCall(sql);
		
			// out �Ķ���� �ڷ��� ����, ù��° ����ǥ�� Ŀ��
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			// in �Ķ���� �ڷ��� ����, �ι�° ����ǥ���� �й��� �������
			cstmt.setString(2, hak);

			// rs�� ����
			rs = (ResultSet)cstmt.getObject(1);

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
			
			rs.close();
			cstmt.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// ��ȯ���� lists, lists�� �о����
		return dto;
	}

}
