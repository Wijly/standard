package com.day3;
import java.util.Scanner;
public class Quest3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num[] = new int [4];
		int max, min;
		
		System.out.print("숫자를 4개 입력하세요. : ");

		for (int i=0;i<num.length;i++) {
			num[i]= sc.nextInt();
		}
		max = num[0];
		min = num[0];
		for(int i = 0; i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("제일 큰 숫자 "+max+", 제일 작은숫자 "+min);

	/*	
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		int max, min;
		
		System.out.print("숫자를 4개 입력하세요. : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		max = num1;
		min = num1;
		
		if (num1<num2) {
			max = num2;
			min = num1;
		}
		if(max<num3) {
			max = num3;
			if(min >num3){
				min = num3;
			}
		}
		if(max<num4) {
			max = num4;
			if(min>num4) {
				min = num4;
			}
		}
		System.out.println("제일 큰 숫자 "+max+", 제일 작은숫자 "+min);
		*/
	}

}
