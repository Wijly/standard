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
		
		System.out.println("ob1 == ob2 : "+(ob1==ob2));		//ob1 �� �ּҿ� ob2�� �ּҴ� �ٸ�
		System.out.println("ob1.equals(ob2) : "+ob1.equals(ob2)); 	// Object�� ��ӹޱ� ������ .equals�� ��밡���ϴ�
		
		System.out.println("ob1 : "+ob1); 	//ob1 : com.day10.TestA@7852e922	(�ؽ��ڵ�.hashcode)
		System.out.println("ob2 : "+ob2);
		System.out.println("ob1.toString() : "+ ob1.toString());


	}

}
