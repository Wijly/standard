package com.rooms.main;

import java.util.Scanner;

import com.db.DBConn;
import com.rooms.ex.Member;
import com.rooms.threads.Loading;
import com.rooms.threads.Main_Thread;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		Main_Thread mt = new Main_Thread();
		Loading ld = new Loading();
		
		int choice;
		try {
			mt.image_main();
			while (true) {
				do {
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.println("��   1  ��  ȸ�� ����   ��   2  ��  �α���  ��   3  ��  ȸ�� ����   ��   4  ��  ȸ�� Ż��   ��   5  ��  ������ �α���   ��   6  ��  ����  ��");
					System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					System.out.print(" �Է� : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 6);
				switch (choice) {
				case 1:
					m.register();
					break;
				case 2:
					String id = m.login();
					ld.loading();
					if(id.equals("fail")) {
						System.out.println("���� : �������� ���� ���̵��̰ų�, �߸��� ��й�ȣ�Դϴ�.");
					} else {
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
						System.out.println("�α��ο� �����ϼ̽��ϴ�");
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
						LoginMain.main(args, id);	
					}
					break;
				case 3:
					m.update();
					break;
				case 4:
					m.delete();
					break;
				case 5:
					String admin = m.login();
					ld.loading();
					if(admin.equals("fail")) {
						System.out.println("���� : �������� ���̵� �ƴϰų�, �߸��� ��й�ȣ�Դϴ�.");
					} else {
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
						System.out.println("������ �α��ο� �����ϼ̽��ϴ�");
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
						adminMain.main(args);	
					}
					break;
				default:
					System.out.println("������");
					DBConn.close();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}