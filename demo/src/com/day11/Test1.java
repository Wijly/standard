package com.day11;

// Wrapper 클래스  : 기본자료형을 객체로 사용 가능
//레퍼런스자료형 : Boolean, Byte, Character, Short, Integer, Long, Float, Double

// Auto-Boxing : stack -> heap
// Auto-UnBoxing : heap -> stack


public class Test1 {

	public static void main(String[] args) {
		
		// 같은 자료형이지만 저장되는 위치만 다르다.
		int n1 = 10;
		int n2;
		Integer num1;		// 래퍼클래스
		Integer num2 = new Integer(20);
		
		num1 = n1;
		n2 = num2;
		
		System.out.println(n1 + " : " +num1 );
		System.out.println(n2 + " : " + num2);

	}

}
