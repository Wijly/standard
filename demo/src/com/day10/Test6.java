package com.day10;

public class Test6 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		// 데이터타입이 StringBuffer
		sb.append("서울");
		sb.append("부산");
		sb.append("대구");
		
		System.out.println(sb);
		
		// 데이터타입을 String으로 변환해서 사용한다.
		String str = sb.toString();
		
		System.out.println(str);			// 변수 str로 넣어 다른곳에 보낼 수 있다.
		
		//Integer
		int a = 25;
		System.out.println(a);
		System.out.println(Integer.toString(a)+1);		// 문자로 변환
		System.out.println(Integer.toString(a,2));		// 2진수로 데이터가 나옴
		System.out.println(Integer.toString(a,16));		// 16진수로 데이터가 나옴
		
	}

}
