package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// �� ���� ���� �Է¹޾� ���������� ū�� ������ ���
		//
		
		Scanner sc = new Scanner(System.in);

		int num1,num2,num3;
		int temp;
		
		System.out.print("3���Ǽ� �Է� : ");
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
		
		System.out.printf("��� : %d %d %d \n",num1, num2, num3);
		/*
		int num[] = new int [3];
		int temp;
		
		System.out.print("���ڸ� ���� �Է� : ");
		
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
