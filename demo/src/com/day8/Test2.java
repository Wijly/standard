package com.day8;

//static
//1. 알아서 메모리로 올라간다.
//2. 객체가 1000번 생성되도 메모리 공간은 1개만 사용
//static이 없으면 다 인스턴스 메소드, 인스턴스 변수 라고함

public class Test2 {

	public static int a = 10; // class 변수 , 클래스변수, 클래스 메소드
								// 클래스가 로딩되는 순간 메모리 할당이 이루어짐
								// [클래스이름, 객체이름] 으로 접근 가능, 즉, new를 통해서 메모리 할당을 받지않아도 사용가능

	private int b = 20; // instance 변수, 인스턴스 메소드
						// new를 통해 객체를 생성해야만 메모리에 올라갈 수 있다.
						// 클래스 메소드에서는 접근할 수 없음.

	public static void print() { // class 메소드
		System.out.println("class 변수 a : " + a);
//		System.out.println("instance 변수 b : "+ b);
	}

	public void write() {
		System.out.println("class 변수 a : " + a);
		System.out.println("instance 변수 b : " + b);
	}

	public static void main(String[] args) { // 클래스 메소드

		System.out.println("class 변수 a : " + a);
		System.out.println("calss 변수 a : " + Test2.a);

		print();
		Test2.print();

		Test2 ob = new Test2();
		System.out.println("clas 변수 a : " + ob.a);

		ob.write();
		ob.print();				// static으로 선언했기때문에 print();로만 써도 된다.

		System.out.println("ob1-------------------------------------------------");
		
		Test2 ob1 = new Test2();
		
		ob1.a = 100;
		ob1.b = 200;
		
		ob1.write();
		ob1.print();
		
		System.out.println("ob2-------------------------------------------------");		// static은 메모리 공간을 1개를 쓰므로 초기화를 시켰어도 다시 100으로 출력
		
		Test2 ob2 = new Test2();

		ob2.write();
		ob2.print();
		
		System.out.println("*************************************************************");
		
		ob.write();					// 처음과달리 메모리를 초기화 시켰기 때문에 a는 100이 나옴
		print();				//
		
	}
}
