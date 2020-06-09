package com.day15;

import java.util.Scanner;

class MyExecp{

	// 5~10자 이내의 영문자를 입력받기 (대소문자 가리지않음)
	// 문자열의 길이는 5~10자 입니다.
	// 영문자만 가능합니다.
	
	public void imputFormat(String str) throws Exception{
		
		int len = str.length();


		if(len<5 || len>10) {
			throw new Exception("문자열의 길이는 5~10자만 가능합니다 ");
		}	
	
		for (int i = 0; i<len; i++) {
			
			char ch = str.charAt(i);
			
			if((ch<65||ch>90)&&(ch<97||ch>122)) {
				throw new Exception("영문자만 가능합니다. ");	
			}
//			if((str.charAt(i)<'a' || str.charAt(i)>'z' )&& (str.charAt(i)<'A' || str.charAt(i)>'Z')) {
//				throw new Exception("영문자만 가능합니다. ");
//			}	
		}
	}

}


public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		MyExecp auth = new MyExecp();
		
		try {
			
			System.out.print("문자열을 입력하세요 : ");
			str = sc.next();
			
			auth.imputFormat(str);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
	}

}
