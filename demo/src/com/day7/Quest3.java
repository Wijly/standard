package com.day7;

import java.util.Scanner;

class SubQuest3{
	
	Scanner sc = new Scanner(System.in);
	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	int y,m,d, i , week;
	
	public void input(){
		do {
			System.out.print("원하는 연도를 입력하세요. : ");
			y = sc.nextInt();
		}while(y<0);
		do {
			System.out.println("원하는 월을 입력하세요. : ");
			m = sc.nextInt();
		}while(m<1 || m>12);
	}
	public void calcY() {				
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		d = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);	// y-1년의 12월 31일까지의 day수
	}
	public int calcM() {
		for(i=0;i<m-1;i++) {
			d += months[i];
		}
		d +=1;
		week = d%7;
		return week;
	}
	public void print_1() {
		System.out.println("해당 월의 시작 위치(배열 0:일요일~ 6:토요일) : " + week);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("───────────────");
		for(i = 0;i<week;i++) {				// 1이 시작할 공백 생성
			System.out.print("    ");	
		}
	}
	public void print_2(int a) { 
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
	}
}

public class Quest3 {
	public static void main(String[] argc) {
		
		SubQuest3 ob1= new SubQuest3();
		
		ob1.input();
		ob1.calcY();
		ob1.calcM();
		
		
	}
}
