package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ���� �Է¹޾� 3�Ǵ� 4�� ������� ���
		
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		String str="";
		
		System.out.print("���� �Է����ּ���. : ");
		num = sc.nextInt();
		
		if(num % 3 == 0) {
			if(num%4 == 0) {
				str = "3, 4�� ��� �Դϴ�.";
			}
			else
				str = "3�� ��� �Դϴ�.";
		}
		else if(num %4 == 0) {
			str = "4�� ��� �Դϴ�.";
		}
		else 
			str = "3�� 4�� ����� �ƴմϴ�.";
		
		System.out.println(num + " : "+str);
		
		
	}

}
