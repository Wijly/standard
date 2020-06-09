package com.score8;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Score 입력창

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();

	public void insert() {

		try {

			ScoreDTO dto = new ScoreDTO();
			System.out.print("학번 : ");
			dto.setHak(sc.next());

			System.out.print("이름 : ");
			dto.setName(sc.next());

			System.out.print("국어 : ");
			dto.setKor(sc.nextInt());

			System.out.print("영어 : ");
			dto.setEng(sc.nextInt());

			System.out.print("수학 : ");
			dto.setMat(sc.nextInt());

			int result = dao.insertData(dto);

			if (result != 0)
				System.out.println("뾰로로롱");
			else
				System.out.println("추가 실패");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 전체출력
	public void selectAll() {

		// list를 불러옴
		List<ScoreDTO> lists = dao.selectList();

		// list를 출력하기 위해 iterator
		Iterator<ScoreDTO> it = lists.iterator();

		while (it.hasNext()) {
			ScoreDTO dto = it.next();
			System.out.println(dto.toString());
		}
	}

	public void update() {

		try {

			ScoreDTO dto = new ScoreDTO();

			System.out.print("학번 : ");
			dto.setHak(sc.next());

			System.out.print("국어 : ");
			dto.setKor(sc.nextInt());

			System.out.print("영어 : ");
			dto.setEng(sc.nextInt());

			System.out.print("수학 : ");
			dto.setMat(sc.nextInt());

			int result = dao.updateData(dto);

			if (result != 0)
				System.out.println("뾰로로롱");
			else
				System.out.println("추가 실패");

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void delete() {
		try {

			System.out.println("학번 : ");
			String str = sc.next();

			int result = dao.deleteData(str);

			if (result != 0)
				System.out.println("뾰로로롱");
			else
				System.out.println("삭제 실패");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	// 학번으로 찾기
	public void searchHak() {

		System.out.print("학번 : ");
		String hak = sc.next();
		
		ScoreDTO dto = dao.searchData(hak);
		
		// 받은 dto가 널이아닐때 출력
		if(dto!=null) {
			System.out.println(dto.toString());
		}
		
	}

}
