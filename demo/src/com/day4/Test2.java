package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 수를 입력받아 3또는 4의 배수인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		String str="";
		
		System.out.print("수를 입력해주세요. : ");
		num = sc.nextInt();
		
		if(num % 3 == 0) {
			if(num%4 == 0) {
				str = "3, 4의 배수 입니다.";
			}
			else
				str = "3의 배수 입니다.";
		}
		else if(num %4 == 0) {
			str = "4의 배수 입니다.";
		}
		else 
			str = "3과 4의 배수가 아닙니다.";
		
		System.out.println(num + " : "+str);
		
		
	}

}
