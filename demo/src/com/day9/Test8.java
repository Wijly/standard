package com.day9;

// Call by Value : stack ������ �����Ͱ� heap �������� ���� ��. ���굵 ����
// Call by Reference : ���� ��ü�� ������ �� �ι������� �ʰ� �ּҸ� ������ ��������.

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
	
		System.out.println("sub()�޼ҵ� ���� �� ob.x : "+ob.x);
		
		ob.sub(a);				// Call by Value
		System.out.println("sub()�޼ҵ� ���� �� ob.x : "+ob.x);
		
		Test ob1;
		ob1 = ob;		//Call by Reference
		System.out.println("ob.x : " + ob.x);		
		System.out.println("ob1.x : "+ ob1.x); // ��ü�� �ƴ� ��ü�� �ּҸ� �����Ѵ� (10����)
		
	}

}
