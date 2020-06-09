package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

//	List<ScoreVO> vo = new Vector<ScoreVO>();
	private List<ScoreVO> lists = new ArrayList<ScoreVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		ScoreVO vo = new ScoreVO();

		System.out.print("학번을 입력하세요 : ");
		vo.setHak(sc.next());

		System.out.print("이름을 입력하세요 : ");
		vo.setName(sc.next());

		System.out.print("국어 점수를 입력하세요 : ");
		vo.setKor(sc.nextInt());

		System.out.print("영어 점수를 입력하세요 : ");
		vo.setEng(sc.nextInt());

		System.out.print("수학 점수를 입력하세요 : ");
		vo.setMat(sc.nextInt());

		lists.add(vo);

		return 0;
	}

	@Override
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		while (it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
//			System.out.println(vo.getHak()+", "+vo.getName()+ ", "+ vo.getKor()+", "+vo.getEng()+", "+vo.getMat());
//			System.out.printf("%6s, %6s, %4d, %4d, %4d\n",vo.getHak(),vo.getName(),
//					vo.getKor(),vo.getEng(),vo.getMat());			// 점수

		}
	}

	@Override
	public void searchHak() {

		Iterator<ScoreVO> it = lists.iterator();

		System.out.print("찾으시는 학번을 입력해주세요 : ");
		String numhak = sc.next();
		boolean flag = false;

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (numhak.equals(vo.getHak())) {
				flag = true;
			}
			if (flag = true) {
				System.out.println(vo.toString());
				return;
			}
//			if(vo.getHak().equals(numhak)){ flag = true;}
//			if(flag == true) {
//				System.out.println(vo.toString());
//				break;
//			}
		}
		if (flag == false) {
			System.out.println("학번이 존재하지않습니다.");
		}
	}

	@Override
	public void searchName() {

		Iterator<ScoreVO> it = lists.iterator();

		System.out.print("찾으시는 이름을 입력해주세요 : ");
		String searchName = sc.next();
		boolean flag = false;

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			if (searchName.equals(vo.getName())) {
				flag = true;
			}
			if (flag == true) {
				System.out.println(vo.toString());
			}
		}
		if (flag == false)
			System.out.println("이름이 존재하지 않습니다.");

	}

	@Override
	public void descSortTot() {

		// 무명의 클래스 // Test3에 있는 정렬
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // vo1이 작으면 1, vo1이 크면 -1 내림차순, 반대로하면 오름차순
			}

		};
		Collections.sort(lists, comp); // lists를 comp방식으로 정렬 (내림차순으로)
		print();
	}

	@Override
	public void ascSortHak() {

		// 무명의 클래스 // Test3에 있는 정렬
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}

		};
		Collections.sort(lists, comp); // lists를 comp방식으로 정렬 (오름차순으로)
		print();

//		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
//
//			@Override
//			public int compare(ScoreVO o1, ScoreVO o2) {
//				String userOV1 = o1.getHak();
//				String userOV2 = o2.getHak();
//				
//				return userOV1.compareToIgnoreCase(userOV2);
//			}
//		};
//		Collections.sort(lists,comp);
//		print();
	}
}
