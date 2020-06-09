package com.day21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규화 표현식
// 단어바꾸기, 메일주소검사, 파일이름제어 등에 사용
/*
 	c[a-z]* : c로 시작하는 영단어 (c, ca, caaa)
 	c[a-z] : c로 시작하는 두개의 영단어(ca, cb, cz)
 	c[a-zA-Z0-9]: ca, cA, c9
 	c. : ca,cB,c&
 	c.* : c로 시작하는 모든 문자
 	c.*t : ct, chhhht, c632t 등 c로시작해서 t로끝나는 문자
 	[b|c].* 또는 [b-c].* : b나 c로 시작하는 단어,bbb,bfa,csaf
 	[\\b]+ 또는 [0-9]+ : 하나 이상의 숫자
  
*/
public class Test3 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "cb", "c.", "c0", "car", "commit", "count", "date", "disc",
				"rubat" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		System.out.println("---------------");
		
		p = Pattern.compile("c[a-z]+");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		
		System.out.println("---------------");
		
		p = Pattern.compile("c.*");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 메일 확인
		String[] mails = {"abc@naver.com","@aaa.co.kr","@bbb.com","aaa@hanmire.co.kr","sbs.co.kr","abc@abc"};
		
		// [\\w]+ : 한글자 이상의 영,숫자
		// @ : at
		// (\\.[\\w]+) : 괄호안에 있는것은 반드시 한번은 나옴
		// \\. : 도트는 반드시 나옴
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";		// 한글이상 영숫자 + @가 나옴 + 반드시나와야하는 .영숫자
		
		for(String s : mails) {
			
			if(Pattern.matches(pat, s)) {
				System.out.println(s);
			}
		}
		
	}
}
