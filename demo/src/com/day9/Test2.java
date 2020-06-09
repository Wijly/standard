package com.day9;

// 생성자
// 1. 메모리를 할당받을 때 사용(객체 생성)
// 2. 변수초기화
// 생성자의 특징 
// 1.class의 이름과 동일하다.
// 2.return 값이 없기 때문에 property가 없다.
// 3.중복정의가 가능하다.(overload)
// 생성자안에서 생성자 호출 가능.
// 단, 맨 처음에서만 호출가능하다.

// 생성자를 오버로딩 시켜놓으면 기본생성자를 만들어놔야한다.
// public Test2(){}

public class Test2 {
	
	private int x;
	
	public Test2() {		// 기본 생성자
		
		this(50);
		
		System.out.println("기본 생성자");
		x = 10;
		System.out.println(" x : "+x);
		
	}
	public Test2(int x){		// 생성자 오버로딩
		
//		this();			//기본생성자 호출
		
		System.out.println("생성자 중복정의, ( 오버로딩)");
		this.x = x;
		System.out.println("x : "+x);
	}
	
	
	public void set(int x) {	// 초기화 메소드
		this.x = x;
		
	}
	public void print() {
		System.out.println("x : "+x);
	}

	public static void main(String[] args) {
		
		new Test2().print();
		
		Test2 ob1 = new Test2();			// 기본생성자
		ob1.set(10);				
		ob1.set(10);
		ob1.print();
		
		Test2 ob2 = new Test2(20);			// 생성자 오버로딩, 중복정의
	}

}
