package com.day7;

public class Test1 {

	public static void main(String[] args) {
		// public : 접근지정자
		// private :  
		// 떡 : 반환값(return ) 자료형. void
		// 식권 : 매개변수
		
		Rect r1 = new Rect();
		
		r1.input();
		int a = r1.area();		// 결과값을 받을 a 선언
		int l = r1.length();	// 결과값을 받을 l 선언
		r1.print(a, l);
		
		Rect r2 = new Rect();
		
		r2.input();
		a = r2.area();
		l = r2.length();
		r2.print(a, l);
		
		System.out.println("r1 : "+r1.w+ ", " + r1.h);
		System.out.println("r2 : "+r2.w+ ", " + r2.h);
	}

}
