package com.score8;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Score �Է�â

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();

	public void insert() {

		try {

			ScoreDTO dto = new ScoreDTO();
			System.out.print("�й� : ");
			dto.setHak(sc.next());

			System.out.print("�̸� : ");
			dto.setName(sc.next());

			System.out.print("���� : ");
			dto.setKor(sc.nextInt());

			System.out.print("���� : ");
			dto.setEng(sc.nextInt());

			System.out.print("���� : ");
			dto.setMat(sc.nextInt());

			int result = dao.insertData(dto);

			if (result != 0)
				System.out.println("�Ϸηη�");
			else
				System.out.println("�߰� ����");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ��ü���
	public void selectAll() {

		// list�� �ҷ���
		List<ScoreDTO> lists = dao.selectList();

		// list�� ����ϱ� ���� iterator
		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}

	public void update() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("�й� : ");
			dto.setHak(sc.next());

			System.out.print("���� : ");
			dto.setKor(sc.nextInt());

			System.out.print("���� : ");
			dto.setEng(sc.nextInt());

			System.out.print("���� : ");
			dto.setMat(sc.nextInt());

			int result = dao.updateData(dto);

			if (result != 0)
				System.out.println("�Ϸηη�");
			else
				System.out.println("�߰� ����");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void delete() {
		try {

			System.out.println("�й� : ");
			String str = sc.next();

			int result = dao.deleteData(str);

			if (result != 0)
				System.out.println("�Ϸηη�");
			else
				System.out.println("���� ����");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// �й����� ã��
	public void searchHak() {

		System.out.print("�й� : ");
		String hak = sc.next();
		
		ScoreDTO dto = dao.searchData(hak);
		
		// ���� dto�� ���̾ƴҶ� ���
		if(dto!=null) {
			System.out.println(dto.toString());
		}
		
	}

}
