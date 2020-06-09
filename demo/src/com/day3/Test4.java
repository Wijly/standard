package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	
		public static void main(String[] args) throws IOException {
		
			//제어문
			// if, for, while, do-while, switch
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num;
			String str = ""; // null로 초기화
			
			System.out.println("수를 입력하세요. : ");
			num = Integer.parseInt(br.readLine());
			
			
			// 단일 if문
/*			if(num%2==0) {
				str = "짝수";		
			}
			if(num%2 !=0) 
				str = "홀수";
			System.out.println(num + " : " +str);
			
*/
			
			if(num %2 == 0) {
				str ="짝수";
			}else
				str ="홀수 ";
		
			System.out.println(num + " : " +str);
		}
	
}
