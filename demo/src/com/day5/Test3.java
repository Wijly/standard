package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String nday[] = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		int y, m, day, i, week;
		int ill;

		// 한번만 실행하기 위해서 do-while문을 실행 조건에 맞지않으면 나옴 , 조건에 맞으면 반복실행
		do {
			System.out.print("해당 연도를 입력하세요. : ");
			y = sc.nextInt();
		}while(y<0);

		do {
			System.out.print("해당 월을 입력하세요. : ");
			m = sc.nextInt();
		}while(m<1||m>12);
		// y년이 윤년인지 구분
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		do { 
			System.out.print("해당 일을 입력하세요. : ");
			ill = sc.nextInt();
		}while(ill<1 || ill>months[m-1]);


		// y-1의 12월 31일까지의 day수 + 윤년
		day = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);
		int yy= (y-1)/4-(y-1)/100+(y-1)/400;

		// y년 m-1월 말일 까지의 day수
		for(i = 0;i<m-1;i++) {
			day += months[i];
		}

		day += ill; // 해당월의 ill일까지의 덧셈
		week = day%7;
		System.out.printf("%d년 %d월 %d일 %s",y,m,ill,nday[week]);
	}

}
