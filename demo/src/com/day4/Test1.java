package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 세 개의 수를 입력받아 작은수에서 큰수 순으로 출력
		//
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;
		int temp;
		
		System.out.print("3개의수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	
		if(num1>num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1>num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2>num3) {
			temp=num2;
			num2=num3;
			num3=temp;
		}
		
		System.out.printf("결과 : %d %d %d \n",num1, num2, num3);
		/*
		int num[] = new int [3];
		int temp;
		
		System.out.print("숫자를 세개 입력 : ");
		
		for(int i = 0; i< num.length;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i<num.length;i++) {
			for(int j = 0; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i = 0; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		*/
	}

}
