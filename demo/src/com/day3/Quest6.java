package com.day3;
import java.util.Scanner;

public class Quest6 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String name;
		int num1,num2,num3;
		int sum = 0;
		int avg = 0;
		String result="";
		
		System.out.print("�̸��� �з��ϼ��� : ");
		name = sc.next();
		System.out.print("������ ������ �Է��ϼ��� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
			
		sum = num1+num2+num3;
		avg = sum/3;
		
		if (num1>=40 && num2 >=40 && num3>=40) {
			if(avg>=60) {
				result= "�հ�";
			}
			else {
				result ="���հ�";
			}
		}
		else if(avg>=60){
			result = "����";
		}
		else
			result = "���հ�";
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+sum+", ��� : "+avg+", ���� : "+result);
	}

}
