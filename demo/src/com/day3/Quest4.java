package com.day3;

import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		
		System.out.print("�⵵�� �Է��ϼ���. : ");
		num = sc.nextInt();
		
		str = num%4==0&&num%100!=0||num%400==0?"����":"���";
		System.out.println(num + "�� " + str);
	}

}
