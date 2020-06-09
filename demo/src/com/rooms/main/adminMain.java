package com.rooms.main;

import java.util.Scanner;

import com.db.DBConn;
import com.rooms.ex.Rooms;
import com.rooms.threads.Admin_main;

public class adminMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rooms r = new Rooms();
		Admin_main am = new Admin_main();
		int choice;
		try {
			am.run();
			while (true) {
				do {
					System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("�� 1  �� �����߰� �� 2  �� ���� ��ü �˻� �� 3  ������ ���� �� 4  ������ ���� �� 5  ������ �˻� ��6 ������ �˻� ��7 ������ ���� �˻���8 �� ī�װ� �� n�� ���� ��");
					System.out.println("������������������������������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.print(" �Է� : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 9);

				switch (choice) {
				case 1:
					r.insert();			
					break;
				case 2:
					r.select();
					break;
				case 3:
					r.update();
					break;
				case 4:
					r.delete();
					break;
				case 5:
					r.search();
					break;
				case 6:
					r.rankSelect();
					break;
				case 7:
					r.regionSelect();
					break;
				case 8:
					cateMain.main(args);
					break;
				default:
					Main.main(args);
					break;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}
