package com.day12;

//up-cast, down-Cast

class SuperTest{
	public int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("���� Ŭ���� write() .");	
	}
	
	public int hap() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 20000, c = 400;
	
	public void print() {
		System.out.println("���� Ŭ���� print() . ");
	}

	@Override
	public int hap() {
		return a+b+c;
	}
}

public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		System.out.println("ob.1 : "+ ob1.b); 			// 20000 ���
		
		SuperTest ob2 = ob1;		// SuperTest ob2 = (SuperTest)ob1;		UP-Cast
		
		System.out.println("ob2.b : " + ob2.b);		// 20
		
		System.out.println("�� : "+ob2.hap()); 			// a(�θ�) : 10, b(�ڽ�) : 20000, c(�ڽ�):400
		
		ob2.write();
		
//		ob2.print();			 �ڱ��
		((SubTest)ob2).print();				// Down Cast
		
		
	}

}
