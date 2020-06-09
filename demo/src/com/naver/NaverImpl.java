package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class IdExcept {

	public void inputFormat(String str) throws Exception {

		boolean num = false;
		boolean eng = false;
		
		int len = str.length();

		if (len < 8 || len > 15) {
			throw new Exception("���ڿ��� ���̴� 8~15�ڸ� �����մϴ� ");
		}
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if ((ch > 48 && ch < 57)) {
				num = true;
			}
			if((ch > 65 && ch < 90) || (ch > 97 && ch < 122)) {
				eng = true;
			}
		}
		if(num == false || eng == false) {
			throw new Exception("������ �Ǵ� ���� ȥ�븸 �����մϴ�.");
		}
	}
}

public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<NaverVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {

		NaverVO vo = new NaverVO();
		IdExcept auth = new IdExcept();

		try {

			System.out.print("���̵� : ");
			vo.setId(sc.next());
			if (successId(vo.getId())) {
				System.out.println("���̵� �����մϴ�.");
				return;
			}
			auth.inputFormat(vo.getId());
		} catch (Exception e) {
			System.out.println(e.toString());
			return;
		}
		System.out.print("��й�ȣ : ");
		vo.setPw1(sc.next());
		System.out.print("��й�ȣ Ȯ�� : ");
		vo.setPw2(sc.next());
		if(!(vo.getPw1().equals(vo.getPw2()))) {
			System.out.println("��й�ȣ�� �ٸ��ϴ�.");
			return;
		}
		System.out.print("�̸� : ");
		vo.setName(sc.next());
		System.out.print("���� (��,��) : ");
		vo.setGender(sc.next());
		System.out.print("�������(��.19960222) : ");
		vo.setBirth(sc.next());
		System.out.print("Ȯ�� �̸��� �ּ� (��. abc@naver.com ) : ");
		vo.setEmail(sc.next());
		System.out.print("��ȭ��ȣ : ");
		vo.setTel(sc.next());

		lists.add(vo);
		System.out.println("�����Ǿ����ϴ�.");

		return;
	}

	@Override
	public boolean successId(String id) { // 1. ���� ���̵��� �����ϴ���

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean succesccLogin(String id, String pw) { // ���̵�� ��й�ȣ Ȯ�� �޼ҵ�

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if ((id.equals(vo.getId())) && (pw.equals(vo.getPw1()))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void print() { // ��ü��� �޼ҵ�
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.println(vo.toString());
		}
	}

	@Override
	public void searchID() { // ���̵� �˻� �޼ҵ�

		System.out.print("ã���ô� ���̵� �Է����ּ���. : ");
		String searchID = sc.next();
		if (!successId(searchID)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.print("��й�ȣ�� �Է����ּ���. : ");
		String searchPw = sc.next();
		if (!succesccLogin(searchID, searchPw)) {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ�����ּ���.");
			return;
		}
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (searchID.equals(vo.getId())) {
				System.out.println(vo.toString());
			}
		}

	}

	@Override
	public void delectID() {

		String del;
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("�����ϰ��� �ϴ� ���̵� �Է����ּ���. : ");
		String searchID = sc.next();
		if (!successId(searchID)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.print("��й�ȣ�� �Է����ּ���. : ");
		String searchPw = sc.next();

		if (!succesccLogin(searchID, searchPw)) {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ�����ּ���.");
			return;
		}

		System.out.print("�����Ͻðڽ��ϱ�? (Y/N) : ");
		del = sc.next();
		
		if (del.equals("y") || del.equals("Y")) {
		
			while (it.hasNext()) {
				NaverVO vo = it.next();
				if (searchID.equals(vo.getId())) {
					lists.remove(vo);
					System.out.println("�����Ǿ����ϴ�.");
					return;
				}
			}
		} else
			return;
	}

	@Override
	public void updateId() {
		
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("�����ϰ��� �ϴ� ���̵� �Է����ּ���. : ");
		String updateID = sc.next();
		if (!successId(updateID)) {
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.print("��й�ȣ�� �Է����ּ���. : ");
		String updatePw = sc.next();

		if (!succesccLogin(updateID, updatePw)) {
			System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ�����ּ���.");
			return;
		}
		while(it.hasNext()) {
			NaverVO vo = it.next();
			if(updateID.equals(vo.getId())){
				System.out.print("������ ��й�ȣ�� �Է����ּ���.: ");
				vo.setPw1(sc.next());
				System.out.print("�ѹ� �� �Է����ּ���. : ");
				vo.setPw2(sc.next());
				if(!(vo.getPw1().equals(vo.getPw2()))) {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					return;
				}
			}
		}
	}

}
