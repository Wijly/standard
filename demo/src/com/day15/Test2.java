package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		double num1, num2, result;
		
		OperationAuthenticator auth = new OperationAuthenticator();
		
		try {
			
			System.out.print("�ΰ��� ���� �Է��ϼ���.(���� : a, b) : ");
			str = br.readLine();
			auth.inputFormat(str);
			
			String[] temp = str.split(",");
			auth.number(temp[0]); 		// ù��° �� a�� ����
			num1 = Double.parseDouble(temp[0]);		// ����ȯ
			
			auth.number(temp[1]);			// �ι�° �� b�� ����ȯ
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("�����ڸ� �Է��ϼ��� : ");
			str = br.readLine();
			
			auth.operator(str.charAt(0));		// ������ �˻�
			
			char ch = str.charAt(0);
			result = 0;
			
			if(ch=='+')
				result = num1 + num2;
			else if(ch=='-')
				result = num1 - num2;
			else if(ch=='*')
				result = num1 * num2;
			else if(ch=='/')
				result = num1 / num2;
			
			System.out.printf("%f %c %f = %f\n",num1,ch,num2,result);
			
		} catch (IOException e) {
			
			System.out.println(e.toString());
			
		}catch (AuthenticatorException e) {
			
			// TODO: handle exception
			System.out.println(e.toString());
			
		}
		

	}

}
