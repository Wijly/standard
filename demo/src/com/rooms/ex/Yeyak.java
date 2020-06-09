package com.rooms.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.RoomsDAO;
import com.rooms.dao.YeyakDAO;
import com.rooms.domain.ReservationVO;
import com.rooms.domain.RoomsVO;

public class Yeyak {
	Scanner sc = new Scanner(System.in);
	YeyakDAO dao = new YeyakDAO();
	RoomsDAO rdao = new RoomsDAO();

	// ��ü ���� Ȯ��
	public void select() {

		try {

			List<RoomsVO> list = rdao.select();
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

	// ������ �������� Ȯ���ϴ� �޼ҵ�
	public boolean yeyakPossible(String id) {

		// ��ȯ���� 0�̿����� ���� �޼ҵ尡 ����
		boolean yeyak_acc = dao.possibleYeyak(id);
		return yeyak_acc;
	}
	
	// ���� �����ϱ�
		public void insertReserv(String id) {

			try {
				System.out.println("��������������������");
				System.out.println("��   ȣ��  ��ȣ   ��");
				System.out.println("��������������������");
				System.out.print("�Է� : ");
				int h_num = sc.nextInt();
				System.out.println("��������������������");
				System.out.println("��   ����  �⵵   ��");
				System.out.println("��������������������");
				System.out.print("�Է� : ");
				int year = sc.nextInt();
				System.out.println("������������������");
				System.out.println("��   ����  ��   ��");
				System.out.println("������������������");
				System.out.print("�Է� : ");
				int month = sc.nextInt();
				System.out.println("��������������������");
				System.out.println("��   ����  ��¥   ��");
				System.out.println("��������������������");
				System.out.print("�Է� : ");
				int day = sc.nextInt();

				System.out.println("����������������������");
				System.out.println("��   ���� �Ⱓ(��)  ��");
				System.out.println("����������������������");
				System.out.print("�Է� : ");
				int bak = sc.nextInt();

				String date1 = "" + year + "-" + month + "-" + day;
				Calendar cal = Calendar.getInstance();
				cal.set(year, month - 1, day + bak);
				Date date = cal.getTime();
				DateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				String date2 = sf.format(date);

				int res_dto = dao.insertYeyak(h_num, id, date1, date2);

				if (res_dto != 1) {
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("���� ����");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				} else {
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("����Ǿ����ϴ�.");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	
	// ���� Ȯ��
	public void searchYeyak(String id) {

		ReservationVO rsv = dao.yeyakSearch(id);

		if (rsv != null) {
			System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.print(rsv.toString());
			System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		} else {
			System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.println("���� : ����� ���Ұ� �����ϴ�.");
			System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		}

	}

	// ���� ���
	public void yeyakCancel(String id) {
		int cancel_hak = 0;
		ReservationVO rsv = dao.yeyakSearch(id);
		System.out.println("��������������������������������������������������������������������������������������������������");
		System.out.println("������ ����� ���� " + rsv.getRoom_name() + "�Դϴ�.");
		System.out.println("������ ����� ���Ҹ� ����Ͻðڽ��ϱ�?                                                          ��");
		System.out.println("��������������������������������������������������������������������������������������������������");
		System.out.print(" �Է�(Y/N) : ");
		String ans = sc.next();
		if (ans.equalsIgnoreCase("y")) {
			cancel_hak = dao.deleteYeyak(id);
			if (cancel_hak == 1) {
				System.out.println("������ ��ҵǾ����ϴ�.");
			} else {
				System.out.println("���� : ��� ����");
			}
		} else {
			System.out.println("��ҵǾ����ϴ�.");
			
		}

	}


}
