package com.day12;

class TestA{
	public void print() {
		System.out.println("A 클래스 .");
	}	
}

class TestB{
	public void print() {
		System.out.println("B 클래스 .");
	}	
}


public class Test1 {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		
		TestB b;
		
//		b = (Test)a;				// 상속관계도 아니라서 불가능

	}

}
