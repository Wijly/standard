package com.day11;

class Test{
	
	protected int a= 10, b=20;
	
	public void write() {
		System.out.println("�θ�Ŭ���� write() ");
		System.out.println("a : "+ a+", b : "+b);
	}
}

class Demo extends Test{
	
	protected int b= 30, c= 40;
	
	@Override
	public void write() {
		System.out.println("�ڽ�Ŭ���� write() ");
		System.out.println("a : "+a+", b : "+b + ", c : "+c);
		System.out.println("super.b : "+super.b);
	}
	
	public void print() {
		System.out.println("�ڽ�Ŭ���� print1 write() ȣ�� ");
		write();
	}
	
	public void print2() {
		System.out.println("�ڽ�Ŭ���� print2 write() ȣ�� ");
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
		System.out.println("((Test)ob).ob : "+((Test)ob).b); 		//Test�� ����ȯ�� �ؼ� b�� ����, up-cast
		System.out.println();
		
		((Test)ob).write();					// �ڽ� Ŭ������ �θ�Ŭ������ �޼ҵ带 ����Ϸ������� ���Ȼ� �ڽ� Ŭ���� �޼ҵ尡 �����
//		((Test)ob).print();					// ���� �ȉ�
		
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
�θ� = �ڽ�;				//O
�θ� = (�θ�)�ڽ�;			//o : UP CAST

�ڽ� = �θ�;				//X
�ڽ� = (�ڽ�)�θ�; 			//O : DOWN CAST
*/