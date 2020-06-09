package com.day3;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		
		System.out.print("년도를 입력하세요. : ");
		num = sc.nextInt();
		
		str = num%4==0&&num%100!=0||num%400==0?"윤년":"평년";
		System.out.println(num + "은 " + str);
	}

}
