package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String nday[] = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		int y, m, day, i, week;
		int ill;

		// �ѹ��� �����ϱ� ���ؼ� do-while���� ���� ���ǿ� ���������� ���� , ���ǿ� ������ �ݺ�����
		do {
			System.out.print("�ش� ������ �Է��ϼ���. : ");
			y = sc.nextInt();
		}while(y<0);

		do {
			System.out.print("�ش� ���� �Է��ϼ���. : ");
			m = sc.nextInt();
		}while(m<1||m>12);
		// y���� �������� ����
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		do { 
			System.out.print("�ش� ���� �Է��ϼ���. : ");
			ill = sc.nextInt();
		}while(ill<1 || ill>months[m-1]);


		// y-1�� 12�� 31�ϱ����� day�� + ����
		day = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);
		int yy= (y-1)/4-(y-1)/100+(y-1)/400;

		// y�� m-1�� ���� ������ day��
		for(i = 0;i<m-1;i++) {
			day += months[i];
		}

		day += ill; // �ش���� ill�ϱ����� ����
		week = day%7;
		System.out.printf("%d�� %d�� %d�� %s",y,m,ill,nday[week]);
	}

}
