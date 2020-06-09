package com.day7;


class SubClass{
	
	int a,b; //instance 변수 ( 0으로 초기화 )
	
	
	
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
		
		ob2.a = 100;								//ob2 초기화
		ob2.b = 200;
		
		System.out.println("ob2.a : "+ob2.a);		//ob2
		System.out.println("ob2.b : "+ob2.b);
		
		System.out.println("ob1.a : "+ob1.a);		//ob1
		System.out.println("ob1.b : "+ob1.b);
		
	}

}
