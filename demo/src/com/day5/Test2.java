package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 만년 달력

		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};

		int y, m, day, i, week;

		// 한번만 실행하기 위해서 do-while문을 실행 조건에 맞지않으면 나옴 , 조건에 맞으면 반복실행
		do {
			System.out.print("해당 연도를 입력하세요. : ");
			y = sc.nextInt();
		}while(y<0);

		do {
			System.out.print("해당 월을 입력하세요. :");
			m = sc.nextInt();
		}while(m<1||m>12);

		// y년이 윤년인지 구분
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		

		// y-1의 12월 31일까지의 day수 + 윤년
		day = (y-1)*365;
		System.out.println("y-1까지의 day수(윤년미포함) : "+day);
		day = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);
		int yy= (y-1)/4-(y-1)/100+(y-1)/400;

		System.out.println("y-1까지의 day수(윤년포함) : "+day);
		System.out.println("윤년 day수 : "+yy);

		// y년 m-1월 말일 까지의 day수
		for(i = 0;i<m-1;i++) {
			day += months[i];
		}
		System.out.println("해당 월-1까지의 day수 : "+day);

		day += 1; // 해당월의 1일 (ex 1월 31일까지 계산한 후 +1 을하면 2월 1일이 됌)
		week = day%7;

		System.out.println("해당 월의 시작 위치(배열 0:일요일~ 6:토요일) : " + week);

		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("───────────────");

		for(i = 0;i<week;i++) {				// 1이 시작할 공백 생성
			System.out.print("    ");	
		}

		for(i=1;i<months[m-1];i++) {		// months[m-1] 인 이유 : 배열 저장위치가 한칸 다르기 때문에 ex 2월의 저장은 months[1]
			System.out.printf("%4d",i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("───────────────");

	}

}
