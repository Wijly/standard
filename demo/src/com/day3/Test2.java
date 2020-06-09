package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int num1, num2;
		
		System.out.print("첫번째 수 : ");
		num1 = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 수 : ");
		num2 = Integer.parseInt(br.readLine());
		
		System.out.printf("%d + %d = %d \t",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
		System.out.printf("%d * %d = %d \t",num1,num2,num1*num2);
		System.out.printf("%d / %d = %d \t",num1,num2,num1/num2);
		System.out.printf("%d %% %d = %d \n",num1,num2,num1%num2);	//나머지 구하기 %%로 입력  % = 나머지
	
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

		str1 = num1%2 ==0?"num1은 짝수":"num1은 홀수";		//삼항연산자 (조건,참값,거짓값)
		str2 = num1>=num2?"num1>num2":"num1<num2";
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = num1>0?"num1은 양수":(num1<0?"num1은 음수":"num1은 0");
		System.out.println(str1);
		
		// A&&B (A and B) A||B (A or B)
		str1 = num1%4==0&&num1%100!=0||num1%400==0?"윤년":"평년";
		System.out.println("num1값 " + num1 + " = " + str1);
	}

}
