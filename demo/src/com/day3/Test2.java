package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num1, num2;
		
		System.out.print("ù��° �� : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° �� : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d \t",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d \t",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d \t",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d \n",num1,num2,num1%num2);	//������ ���ϱ� %%�� �Է�  % = ������
	
		System.out.print("--------------------*--------------------------\n");
		
		System.out.println("num1 > num2 : " + (num1>num2));	//true , false 
		

		
		/*
		if(num1> num2) {
			System.out.println("num1 > num2");
		} 
		else if(num1 < num2) {
			System.out.println("num1 < num2");
		}
		*/
		String str1,str2;

		str1 = num1%2 ==0?"num1�� ¦��":"num1�� Ȧ��";		//���׿����� (����,����,������)
		str2 = num1>=num2?"num1>num2":"num1<num2";
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = num1>0?"num1�� ���":(num1<0?"num1�� ����":"num1�� 0");
		System.out.println(str1);
		
		// A&&B (A and B) A||B (A or B)
		str1 = num1%4==0&&num1%100!=0||num1%400==0?"����":"���";
		System.out.println("num1�� " + num1 + " = " + str1);
	}

}
