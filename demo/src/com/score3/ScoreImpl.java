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

		System.out.print("�й��� �Է��ϼ��� : ");
		vo.setHak(sc.next());

		System.out.print("�̸��� �Է��ϼ��� : ");
		vo.setName(sc.next());

		System.out.print("���� ������ �Է��ϼ��� : ");
		vo.setKor(sc.nextInt());

		System.out.print("���� ������ �Է��ϼ��� : ");
		vo.setEng(sc.nextInt());

		System.out.print("���� ������ �Է��ϼ��� : ");
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
//					vo.getKor(),vo.getEng(),vo.getMat());			// ����

		}
	}

	@Override
	public void searchHak() {

		Iterator<ScoreVO> it = lists.iterator();

		System.out.print("ã���ô� �й��� �Է����ּ��� : ");
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
			System.out.println("�й��� ���������ʽ��ϴ�.");
		}
	}

	@Override
	public void searchName() {

		Iterator<ScoreVO> it = lists.iterator();

		System.out.print("ã���ô� �̸��� �Է����ּ��� : ");
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
			System.out.println("�̸��� �������� �ʽ��ϴ�.");

	}

	@Override
	public void descSortTot() {

		// ������ Ŭ���� // Test3�� �ִ� ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // vo1�� ������ 1, vo1�� ũ�� -1 ��������, �ݴ���ϸ� ��������
			}

		};
		Collections.sort(lists, comp); // lists�� comp������� ���� (������������)
		print();
	}

	@Override
	public void ascSortHak() {

		// ������ Ŭ���� // Test3�� �ִ� ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}

		};
		Collections.sort(lists, comp); // lists�� comp������� ���� (������������)
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
