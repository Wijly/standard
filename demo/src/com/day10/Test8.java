package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("수식을 입력하세요(ex: x + y) : ");
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");
		
//		String[] oper = {"+", "-", "*", "/"};
//		for(String op : oper) {
//			
//		}
		for(String op : new String[] {"+", "-", "*", "/"}) {
			int pos = str.indexOf(op);		// 부호가 있는 곳 번호 찾기
			if(pos>-1) {						// 부호가 없으면 -1
				int num1 = Integer.parseInt(str.substring(0,pos));		//substring(1,10) = 1에서부터 10까지를 찾고 -1
				int num2 = Integer.parseInt(str.substring(pos+1)); 		//pos+1부터 끝자리까지
			
				int result = 0;
				char operator = str.charAt(pos);				// 포스번째 것을 가지고와라
			
				switch(operator) {
				
				case '+' :
					result = num1+num2;break;
				case '-' :
					result = num1-num2;break;
				case '*' :
					result = num1*num2;break;
				case '/' :
					result = num1/num2;break;				
				}
				
				System.out.printf("%d %c %d = %d",num1,operator,num2,result);
				System.out.println();
				String s = String.format("%d %c %d = %d", num1,operator,num2,result);		// 결과값을 만들어서 변수 s 안에 넣어놈
				
				System.out.println(s);
			
			}			
		}
	}

}
