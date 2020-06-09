package com.day11;

import java.util.Calendar;
import java.util.Scanner;

public class Quest2 {
	
	private static String[] yoil = {"일","월","화","수","목","금","토"};
	
	public static void main(String[] args) {
		

		int y, m, d, day;
		int week ;
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		do {
			System.out.print("처음만난 년도를 입력해주세요. : ");
			y = sc.nextInt();
		} while (y < 0);
		
		do {
			System.out.print("처음만난 월을 입력해주세요. : ");
			m = sc.nextInt();
		} while (m < 1 || m > 13);
		
		do {
			System.out.print("처음만난 일을 입력해주세요. : ");
			d = sc.nextInt();
		}while (d<0||d>31);
		
		do {
			System.out.print("며칠 후를 입력해주세요. : ");
			day = sc.nextInt();
		}while(day<0);
	
		cal.set(y,m-1,d);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("만난 날 : " + y + "년 "+ m +"월 "+d+"일 "+ yoil[week-1]+"요일" );
		
		cal.add(Calendar.DATE, day);
		
		y = cal.get(Calendar.YEAR);		//년
		m = cal.get(Calendar.MONTH)+1;		//월 (0~11)이므로 +1
		d = cal.get(Calendar.DATE);		// 일
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(day+"일 후 : "+y +"년 "+m+"월 " +d+ "일 " + yoil[week-1]+ "요일");
	}

}
