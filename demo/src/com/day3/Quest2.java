package com.day3;
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("����1, ����2 �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println("ū���� : "+num1+" ���� ���� : "+num2);
		}else if(num1 < num2) {
			System.out.println("ū���� : "+num2+" ���� ���� : "+num1);
		}else 
			System.out.println("�� ���ڰ� �����ϴ�.");
		
	}

}
