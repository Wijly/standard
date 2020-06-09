package com.day12;

// 3. 내부 클래스( 중첩클래스)

class Outer3{
	
	static int a =10;
	int b= 20;
	
	public static class Inner3{
		int c = 30;
		
		public void write() {
		
			System.out.println(a);
//			System.out.println(b);			 static 선언을 하지않아서 불러올 수 없음. 객체생성 필요
			System.out.println(c);
			
			Outer3 out = new Outer3(); 			// 객체 생성 후 b 호출가능
			System.out.println(out.b);
		}
	}
	
	public void print() {
		Inner3 ob = new Inner3();
		ob.write();
	}
}


public class Test8 {

	public static void main(String[] args) {
		
		Outer3 out = new Outer3();
		out.print();
		
		Outer3.Inner3 in = new Outer3.Inner3();
		in.write();

	}

}
