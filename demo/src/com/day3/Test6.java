package com.day3;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] argc) {

		// Scanner �ܶ� ������ ������ ����ؼ� �з�
		// �⺻ ������ ����

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		/*
		 * System.out.print("�̸��� �Է��ϼ���. : "); name = sc.next();
		 * 
		 * System.out.print("���������� �Է��ϼ���. : "); kor = sc.nextInt();
		 * 
		 * System.out.print("���������� �Է��ϼ���. : "); eng = sc.nextInt();
		 * 
		 * System.out.print("���������� �Է��ϼ���. : "); mat = sc.nextInt();
		 * 
		 * System.out.println(name + "�� ������ " + (kor+eng+mat));
		 */

		System.out.print("�̸�, ����, ����, ���м����� �Է��ϼ���. : ");

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // ����ȭ ǥ����

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + "�� ������ " + (kor + eng + mat));
	}
}
