package com.day9;

// Call by Value : stack 영역의 데이터가 heap 영역으로 가는 것. 연산도 가능
// Call by Reference : 같은 객체를 생성할 때 두번만들지 않고 주소를 복사해 가져간다.

class Test{

	public int x = 10;
	
	public void sub(int a) {
		x += a;
	}
	
}

public class Test8 {

	public static void main(String[] args) {
		
		Test ob = new Test();
		
		int a = 20;
	
		System.out.println("sub()메소드 실행 전 ob.x : "+ob.x);
		
		ob.sub(a);				// Call by Value
		System.out.println("sub()메소드 실행 후 ob.x : "+ob.x);
		
		Test ob1;
		ob1 = ob;		//Call by Reference
		System.out.println("ob.x : " + ob.x);		
		System.out.println("ob1.x : "+ ob1.x); // 객체가 아닌 객체의 주소를 복사한다 (10번지)
		
	}

}
