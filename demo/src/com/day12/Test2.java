package com.day12;

//up-cast, down-Cast

class SuperTest{
	public int a = 10, b = 20;
	
	public void write() {
		
		System.out.println("슈퍼 클래스 write() .");	
	}
	
	public int hap() {
		return a+b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 20000, c = 400;
	
	public void print() {
		System.out.println("서브 클래스 print() . ");
	}

	@Override
	public int hap() {
		return a+b+c;
	}
}

public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		System.out.println("ob.1 : "+ ob1.b); 			// 20000 출력
		
		SuperTest ob2 = ob1;		// SuperTest ob2 = (SuperTest)ob1;		UP-Cast
		
		System.out.println("ob2.b : " + ob2.b);		// 20
		
		System.out.println("합 : "+ob2.hap()); 			// a(부모) : 10, b(자식) : 20000, c(자식):400
		
		ob2.write();
		
//		ob2.print();			 자기것
		((SubTest)ob2).print();				// Down Cast
		
		
	}

}
