package com.day10;

//String의 메소드

public class Test7 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String ss[] = s1.split(",");		// split 나누는 메소드. 쉼표로 나눔
		
		for(String s: ss)
			System.out.print(s+" ");
		
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "SeOul";
		
		System.out.println(s2.equals(s3));			//		false = 대소문자가 틀리기때문에
		System.out.println(s2.equalsIgnoreCase(s3));	// 	true = 대소문자를 구분하지않고 비교
		
		String s4 = "abc.def.ghi";
		//			 01234567890
		System.out.println(s4.indexOf("."));		// 앞에서부터 .을 찾음 = 3 번째
		System.out.println(s4.lastIndexOf("."));	// 뒤에서부터 .을 찾음 = 7 번째
		System.out.println(s4.indexOf("def"));		// 앞에서부터 def를 찾음 = 4 번째
		System.out.println(s4.indexOf("x"));		// 값이 없으므로 -1			//데이터가 없다-
		//if(s4.indexOf("x") != -1){ }					// 결과값이 -1이 아니면 = 데이터가 있으면			
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");		// 치환		(	\n\r -> </br>	)
		System.out.println(s6);
		
		String s7 = "  a  b  c";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ",""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);		// 2번째 넘기기 = c
		
		System.out.println("abcdefg".length()); 		// 문자의 갯수 7
		
		System.out.println("abcdefg".startsWith("abc"));	// abc로 시작하는가 - true
		System.out.println("abcdefg".startsWith("abd"));	// abd로 시작하는가 - false
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		//사전식 정열
		System.out.println(s8.compareTo(s9));		
		System.out.println(s9.compareTo(s8));		
//===============================================================================================================================================		

	}

}
