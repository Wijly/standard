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
			
			System.out.print("두개의 수를 입력하세요.(예시 : a, b) : ");
			str = br.readLine();
			auth.inputFormat(str);
			
			String[] temp = str.split(",");
			auth.number(temp[0]); 		// 첫번째 수 a를 검증
			num1 = Double.parseDouble(temp[0]);		// 형변환
			
			auth.number(temp[1]);			// 두번째 수 b를 형변환
			num2 = Double.parseDouble(temp[1]);
			
			System.out.print("연산자를 입력하세요 : ");
			str = br.readLine();
			
			auth.operator(str.charAt(0));		// 연산자 검사
			
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
