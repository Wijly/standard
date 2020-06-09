package com.day4;

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		int sum=0;
		
		System.out.print("첫번째 수를 입력하세요. : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요. : ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			for(int i = num2;i<=num1;i++) {
				sum += i;
			}
		}
		else if(num1<num2){
			for(int i = num1;i<=num2;i++) {
				sum += i;
			}
		}
		else
			sum= num1+num2;
		
		System.out.println("두 숫자 사이의 총 합은 : "+sum);
	}

}
