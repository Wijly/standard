package com.day11;

class Test{
	
	protected int a= 10, b=20;
	
	public void write() {
		System.out.println("부모클래스 write() ");
		System.out.println("a : "+ a+", b : "+b);
	}
}

class Demo extends Test{
	
	protected int b= 30, c= 40;
	
	@Override
	public void write() {
		System.out.println("자식클래스 write() ");
		System.out.println("a : "+a+", b : "+b + ", c : "+c);
		System.out.println("super.b : "+super.b);
	}
	
	public void print() {
		System.out.println("자식클래스 print1 write() 호출 ");
		write();
	}
	
	public void print2() {
		System.out.println("자식클래스 print2 write() 호출 ");
		super.write();
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Demo ob = new Demo();
		
		ob.write();
		System.out.println();
		
		ob.print();
		System.out.println();
		
		ob.print2();
		System.out.println();
		
		System.out.println("ob.b : "+ob.b);
		System.out.println("((Test)ob).ob : "+((Test)ob).b); 		//Test로 형변환을 해서 b를 찍음, up-cast
		System.out.println();
		
		((Test)ob).write();					// 자식 클래스가 부모클래스의 메소드를 사용하려했으나 보안상 자식 클래스 메소드가 실행됨
//		((Test)ob).print();					// 실행 안됌
		
	}

}
/*
int a =10;
double b;

b=a;					//o
b=(double)a;			//o

a=b;				//x
a=(int)b			//o
-----------------------------------------
부모 = 자식;				//O
부모 = (부모)자식;			//o : UP CAST

자식 = 부모;				//X
자식 = (자식)부모; 			//O : DOWN CAST
*/