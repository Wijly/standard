package com.day11;

import java.util.Calendar;
import java.util.Scanner;

// ��,��,���� �Է¹޾Ƽ�	���� �޷� �����
// ��, ��, �� , ��ĥ �ĸ� �Է¹ް�. ������ ���, x�� �� ���
// 

public class Quest1 {

	public static void main(String[] args) {

		int y, m;
		int i;

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		do {
			System.out.print("���Ͻô� �⵵�� �Է����ּ���. : ");
			y = sc.nextInt();
		} while (y < 0);
		do {
			System.out.print("���Ͻô� ���� �Է����ּ���. : ");
			m = sc.nextInt();
		} while (m < 1 || m > 13);

//		cal.set(Calendar.YEAR, y); 		// �ش� ������ ����
//		cal.set(Calendar.MONTH, m);		 // �ش� ���� ����

		cal.set(y,m-1,1);
		
		int endDay = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("������������������������������");
		
		for(i = 1; i<week; i++) {
			System.out.print("    ");
		}
		for(i = 1;i<endDay;i++) {
			System.out.printf("%4d",i);
			week++;
			if(week % 7==1) {
				System.out.println();
			}
		}
		if(week %7 !=1) {
			System.out.println();
		}
	}
}
