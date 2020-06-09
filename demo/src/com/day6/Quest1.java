package com.day6;

import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[]= new int[5];
		int i,j,temp;
		int max,min;
		
		System.out.print("정수 5개를 입력해주세요. : ");
		for(i=0; i<num.length;i++) {
			num[i] = sc.nextInt();
		}
		max=num[0];
		min=num[0];
		for(i=0;i<num.length-1;i++) {
			for(j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					max=num[i];
					min=num[j];
				}
			}
		}
		System.out.println("가장 큰 수 : "+max+" 가장 작은수 : "+min);
	}
}
