package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ���� �޷�

		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y, m, day, i, week;

		// �ѹ��� �����ϱ� ���ؼ� do-while���� ���� ���ǿ� ���������� ���� , ���ǿ� ������ �ݺ�����
		do {
			System.out.print("�ش� ������ �Է��ϼ���. : ");
			y = sc.nextInt();
		}while(y<0);

		do {
			System.out.print("�ش� ���� �Է��ϼ���. :");
			m = sc.nextInt();
		}while(m<1||m>12);

		// y���� �������� ����
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		

		// y-1�� 12�� 31�ϱ����� day�� + ����
		day = (y-1)*365;
		System.out.println("y-1������ day��(���������) : "+day);
		day = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);
		int yy= (y-1)/4-(y-1)/100+(y-1)/400;

		System.out.println("y-1������ day��(��������) : "+day);
		System.out.println("���� day�� : "+yy);

		// y�� m-1�� ���� ������ day��
		for(i = 0;i<m-1;i++) {
			day += months[i];
		}
		System.out.println("�ش� ��-1������ day�� : "+day);

		day += 1; // �ش���� 1�� (ex 1�� 31�ϱ��� ����� �� +1 ���ϸ� 2�� 1���� ��)
		week = day%7;

		System.out.println("�ش� ���� ���� ��ġ(�迭 0:�Ͽ���~ 6:�����) : " + week);

		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("������������������������������");

		for(i = 0;i<week;i++) {				// 1�� ������ ���� ����
			System.out.print("    ");	
		}

		for(i=1;i<months[m-1];i++) {		// months[m-1] �� ���� : �迭 ������ġ�� ��ĭ �ٸ��� ������ ex 2���� ������ months[1]
			System.out.printf("%4d",i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("������������������������������");

	}

}
