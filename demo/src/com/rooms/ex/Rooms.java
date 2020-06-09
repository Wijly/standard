package com.rooms.ex;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.RoomsDAO;
import com.rooms.domain.RoomsVO;

public class Rooms {

	Scanner scan = new Scanner(System.in);
	RoomsDAO dao = new RoomsDAO();

	// �Ӽ��߰�
	public void insert() {

		try {

			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			RoomsVO vo = new RoomsVO();
			System.out.println("��������������������������������������������������������������������������������������������");
			System.out.println("�� 1  �� ���μ���   �� 2  �� ������ �� 3  �� �Ϲ�ȣ�� �� 4  �� ����ȣ��   �� 5  �� ���ھ� ��");
			System.out.println("��������������������������������������������������������������������������������������������");
			System.out.println("������������������");
			System.out.println("��   ���Һз�   ��");
			System.out.println("������������������");
			System.out.print("�Է� : ");
			vo.setCate_num(scan.nextInt());
			scan.nextLine();

			System.out.println("������������������");
			System.out.println("��   �����̸�   ��");
			System.out.println("������������������");
			System.out.print("�Է� : ");
			vo.setRoom_name(scan.nextLine());

			System.out.println("������������������������");
			System.out.println("��   ����  ��ȭ��ȣ   ��");
			System.out.println("������������������������");
			System.out.print("�Է� : ");
			vo.setRoom_tel(scan.nextLine());

			System.out.println("������������������������");
			System.out.println("��   ����  ��ü�ּ�   ��");
			System.out.println("������������������������");
			System.out.print("�Է� : ");
			vo.setFull_addr(scan.nextLine());

			System.out.println("��������������������������");
			System.out.println("��   ����  ���θ��ּ�   ��");
			System.out.println("��������������������������");
			System.out.print("�Է� : ");
			vo.setStreet_addr(scan.nextLine());

			System.out.println("������������������������");
			System.out.println("��   ����  �����ȣ   ��");
			System.out.println("������������������������");
			System.out.print("�Է� : ");
			vo.setZipcode(scan.nextLine());

			int result = dao.insert(vo);

			if (result == 1) {
				System.out.println("������ �߰� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			} else {
				System.out.println("������ �߰� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ���� ��ü �˻�
	public void select() {

		try {
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			List<RoomsVO> list = dao.select();
			Iterator<RoomsVO> it = list.iterator();

			while (it.hasNext()) {
				RoomsVO vo = it.next();

				System.out.println(vo);
			}

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// �Ӽ� ����
	public void update() {

		try {

			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			RoomsVO vo = new RoomsVO();
			System.out.println("��������������������");
			System.out.println("��    ���� ��ȣ   ��");
			System.out.println("��������������������");
			System.out.print("�Է� : ");
			vo.setNum(scan.nextInt());

			System.out.println("��������������������������");
			System.out.println("��   ������ ���� �̸�   ��");
			System.out.println("��������������������������");
			System.out.print("�Է� : ");
			vo.setRoom_name(scan.next());

			System.out.println("����������������������������");
			System.out.println("��   ������ ���� ����ó   ��");
			System.out.println("����������������������������");
			System.out.print("�Է� : ");
			vo.setRoom_tel(scan.next());

			System.out.println("������������������������������");
			System.out.println("��   ���� ����(����/���)   ��");
			System.out.println("������������������������������");
			System.out.print("�Է� : ");
			vo.setRun_status(scan.next());

			int result = dao.update(vo);

			if (result == 1) {
				System.out.println("������ ���� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			} else {
				System.out.println("������ ���� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// �Ӽ� ����
	public void delete() {

		try {
			System.out.println("��������������������������");
			System.out.println("��    ���� ���� ��ȣ    ��");
			System.out.println("��������������������������");
			System.out.print("�Է� : ");
			int num = scan.nextInt();

			int result = dao.delete(num);

			if (result == 1) {
				System.out.println("������ ���� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			} else {
				System.out.println("������ ���� ����");
				System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// �Ӽ� �˻�
	public void search() {
		try {

			System.out.println("��������������������������");
			System.out.println("��    �˻� ���� �̸�    ��");
			System.out.println("��������������������������");
			System.out.print("�Է� : ");
			String search = scan.next();
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			dao.searchRooms(search);
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ���� �˻�
	public void rankSelect() {

		try {
			List<RoomsVO> list = dao.rankSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			while (it.hasNext()) {
				RoomsVO vo = it.next();

				System.out.print("���� �з� : " + vo.getCate().getCate_name() + ", ���� �̸� : " + vo.getRoom_name()
						+ ", ���� ��ȭ��ȣ : " + vo.getRoom_tel() + ", ���� �ּ� : " + vo.getFull_addr() + ", ����� : "
						+ vo.getRe_cnt() + ", ���� : " + vo.getCount());
				System.out.println();
			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ���� ���� ���
	public void regionSelect() {

		try {

			List<RoomsVO> list = dao.regionSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.println(vo.toString2());
			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.println();

		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}

	// �˻��� ���� ���� ���� ���� 20�� ������ ���
	public void regionSearch() {

		try {
			System.out.print("�˻��� ���� : ");
			String region = scan.nextLine();

			List<RoomsVO> list = dao.regionSearch(region);
			Iterator<RoomsVO> it = list.iterator();

			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.print("���� ��ȣ : " + vo.getNum() + ", ���� ���� : " + vo.getRegion() + ", ���� �̸� : "
						+ vo.getRoom_name() + ", ���� ��ȭ��ȣ : " + vo.getRoom_tel() +", ����� : " + vo.getRe_cnt() + ", ���� : " + vo.getCount()
						);
				System.out.println();
			}
			System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������");

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
