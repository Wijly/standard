package com.day10;

class TestA extends Object{
	
	private int a = 10;
	
	public void write() {
		System.out.println("a : "+a);
	}
}


public class Test3 {

	public static void main(String[] args) {
		
		TestA ob1 = new TestA();
		TestA ob2 = new TestA();
		
		System.out.println("ob1 == ob2 : "+(ob1==ob2));		//ob1 의 주소와 ob2의 주소는 다름
		System.out.println("ob1.equals(ob2) : "+ob1.equals(ob2)); 	// Object를 상속받기 때문에 .equals를 사용가능하다
		
		System.out.println("ob1 : "+ob1); 	//ob1 : com.day10.TestA@7852e922	(해쉬코드.hashcode)
		System.out.println("ob2 : "+ob2);
		System.out.println("ob1.toString() : "+ ob1.toString());


	}

}
