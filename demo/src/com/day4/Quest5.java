package com.day4;

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		int sum=0;
		
		System.out.print("ù��° ���� �Է��ϼ���. : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���. : ");
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
		
		System.out.println("�� ���� ������ �� ���� : "+sum);
	}

}
