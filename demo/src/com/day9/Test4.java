package com.day9;

// 초기화 블럭


public class Test4 {
	
	int a = 5;
	
	{		//초기화 블럭
		System.out.println("초기화 블럭 a : "+a);
		a = 10;
		System.out.println("초기화 블럭 a : "+a);
	}
	
	static int b;			// instance 변수, b에 초깃값 0
	
	static {		// static 블럭 , 초기화블럭. 이미 메모리상에 올라가있는 블럭
		b = 20;
		System.out.println("static 블럭 b : "+b);
	}
	
	// 상수	(대문자로 사용) -변하지않는 수, 무조건 초기화
	final int C;
	
	public Test4() {		//생성자	, 젤 마지막에 실행
		
		System.out.println("생성자 " );
		
		C = 100;
		
		System.out.println("C : "+C);
	}

	public static void main(String[] args) {
		
		Test4 ob1 = new Test4();		// 우선순위
		System.out.println();
		Test4 ob2 = new Test4();
		new Test4();
	}

}
