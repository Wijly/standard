package com.day11;

import java.util.Calendar;
import java.util.Scanner;

public class Quest2 {
	
	private static String[] yoil = {"��","��","ȭ","��","��","��","��"};
	
	public static void main(String[] args) {
		

		int y, m, d, day;
		int week ;
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		do {
			System.out.print("ó������ �⵵�� �Է����ּ���. : ");
			y = sc.nextInt();
		} while (y < 0);
		
		do {
			System.out.print("ó������ ���� �Է����ּ���. : ");
			m = sc.nextInt();
		} while (m < 1 || m > 13);
		
		do {
			System.out.print("ó������ ���� �Է����ּ���. : ");
			d = sc.nextInt();
		}while (d<0||d>31);
		
		do {
			System.out.print("��ĥ �ĸ� �Է����ּ���. : ");
			day = sc.nextInt();
		}while(day<0);
	
		cal.set(y,m-1,d);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("���� �� : " + y + "�� "+ m +"�� "+d+"�� "+ yoil[week-1]+"����" );
		
		cal.add(Calendar.DATE, day);
		
		y = cal.get(Calendar.YEAR);		//��
		m = cal.get(Calendar.MONTH)+1;		//�� (0~11)�̹Ƿ� +1
		d = cal.get(Calendar.DATE);		// ��
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(day+"�� �� : "+y +"�� "+m+"�� " +d+ "�� " + yoil[week-1]+ "����");
	}

}
