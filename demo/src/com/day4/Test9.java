package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		int tot = 0;
		char oper;
		
		System.out.print("ù��° �� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���. (+,-,*,/) : ");
		oper = (char)System.in.read();
		
		
		// %d(����), %f(float), %g(double), %c(char), %s(String)
		
		switch(oper) {
		
			case('+'):
				tot = num1+num2;
//				System.out.printf("%d %c %d = %d\n",num1,oper,num2,(num1+num2));
				break;
			case('-'):
				tot = num1-num2;
				break;
			case('*'):
				tot = num1*num2;
				break;
			case('/'):
				tot = num1/num2;
				break;
		}
		
		
			System.out.println(num1+" "+oper+" "+num2+" = "+tot);
			
	}

}
