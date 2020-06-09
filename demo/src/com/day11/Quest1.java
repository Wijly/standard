package com.day11;

import java.util.Calendar;
import java.util.Scanner;

// 년,월,일을 입력받아서	만년 달력 만들기
// 년, 월, 일 , 며칠 후를 입력받고. 만날날 출력, x일 후 출력
// 

public class Quest1 {

	public static void main(String[] args) {

		int y, m;
		int i;

		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();

		do {
			System.out.print("원하시는 년도를 입력해주세요. : ");
			y = sc.nextInt();
		} while (y < 0);
		do {
			System.out.print("원하시는 월을 입력해주세요. : ");
			m = sc.nextInt();
		} while (m < 1 || m > 13);

//		cal.set(Calendar.YEAR, y); 		// 해당 연도로 세팅
//		cal.set(Calendar.MONTH, m);		 // 해당 월로 세팅

		cal.set(y,m-1,1);
		
		int endDay = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("───────────────");
		
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
