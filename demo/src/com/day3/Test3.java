package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		
/*		//char
		char a = 'a';
		char b = '위';
		String s = "즐리";
	*/	
		char ch = 'a';
		
		// 아스키 값을 보여주는 것. 즉 a = 97번째 아스키코드 이므로 a를 저장하는 것이 아닌 97번째를 저장
		System.out.println(ch);
		System.out.println(Integer.toString(ch));
		
		char ar,result;
		
		System.out.print("한개의 문자 : "); //ab(97,98)을 입력해도 char이므로 a(97)만 보여줌
		ar = (char)System.in.read();
		
			// 대문자가 들어오면 +32를 해서 소문자로 바꿈 // 소문자가 들어오면 대문자로 바꿈
		result = ar>=65 && ar<=90?(char)(ar+32):(ar>='a'&&ar<=122?(char)(ar-32):ar);
		
		System.out.println(ar + " => "+ result);
		
		
	}

}
