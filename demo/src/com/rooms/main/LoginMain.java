package com.rooms.main;

import java.util.Scanner;

import com.rooms.ex.Rooms;
import com.rooms.ex.Yeyak;
import com.rooms.threads.Login;

public class LoginMain {

	public static void main(String[] args, String id) {

		Scanner sc = new Scanner(System.in);
		Rooms r = new Rooms();
		Yeyak y = new Yeyak();
		Login lg = new Login();
		int choice;
		try {
			
			while (true) {
				do {
					// �̹���
					lg.run();
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("�� 1�� ������ü�˻� �� 2��  ����  �� 3��  ���� Ȯ��   �� 4��  ���� ���   �� 5  ��  ���� �˻�   �� 6  ��  ����  �� 7  �������� ���Ұ˻� ��n ���α׾ƿ���");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.print(" �Է� : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 8);

				switch (choice) {
				case 1:
					y.select();
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					break;
				case 2:
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					
					// ������ ������ ����
					if(y.yeyakPossible(id) == false) {
						y.insertReserv(id);
					}
					else {
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
						System.out.println(" Ȯ�� : �̹� ����� ���� �ֽ��ϴ�. ");
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					}
					break;
				case 3:
					y.searchYeyak(id);
					break;
				case 4:
					if(y.yeyakPossible(id) == false) {
						System.out.println("������������������������������������");
						System.out.println("�� ������ ����� ���� �����ϴ�. ��");
						System.out.println("������������������������������������");
					} else {
						y.yeyakCancel(id);
					}
					break;
				case 5:
					r.search();
					break;
				case 6:
					r.rankSelect();
					break;
				case 7:	
					r.regionSearch();
					break;
				default:
					System.out.println("����ȭ������ �̵��մϴ�.");
					Main.main(args);
					break;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}