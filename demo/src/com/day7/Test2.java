package com.day7;


class SubClass{
	
	int a,b; //instance ���� ( 0���� �ʱ�ȭ )
	
	
	
}






public class Test2 {

	public static void main(String[] args) {
		
		SubClass ob1 = new SubClass();
		SubClass ob2 = new SubClass();
		
		ob1.a = 10;
		ob1.b = 20;
		
		System.out.println("ob1.a : "+ob1.a);		//ob1
		System.out.println("ob1.b : "+ob1.b);

		System.out.println("ob2.a : "+ob2.a);		//ob2
		System.out.println("ob2.b : "+ob2.b);
		
		ob2.a = 100;								//ob2 �ʱ�ȭ
		ob2.b = 200;
		
		System.out.println("ob2.a : "+ob2.a);		//ob2
		System.out.println("ob2.b : "+ob2.b);
		
		System.out.println("ob1.a : "+ob1.a);		//ob1
		System.out.println("ob1.b : "+ob1.b);
		
	}

}
