package com.day10;

// 	String = class
//	사용하는 빈도는 많고 저장하는 데이터는 크다.
//	불변의 법칙을 가지고있다.


public class Test4 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 : "+(ob1==ob2));				// 같은 주소의 값
		System.out.println("ob1 == ob3 : "+(ob1==ob3));				
		System.out.println("ob1.equals(ob3) : "+ ob1.equals(ob3));		//문자는 equals로 비교를 해야한다.
		//	Object의 equals 는 주소를 비교하고 String의 equals는 주소번지의 값을 비교한다.
		
		ob2 = "Korea" ;
		System.out.println("ob1 == ob2 : "+(ob1==ob2));
		
		ob2 = "Japan" ;
		System.out.println("ob1 == ob2 : "+(ob1==ob2));
		
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
