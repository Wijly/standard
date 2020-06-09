package com.day11;

//final
//Instance변수에 붙이면 한번만 초기화가 가능하다.
// 메소드에 붙이면 		Override가 불가능하다.
// 클래스에 붙이면		상속이 불가능하다.


class TestF{
	
	public static final double PI;
	static {
		PI = 3.141592;
	}
	
	public double area;
	
	public final void write(String title) {					// final을 붙여서 오버라이드가 불가능함
		System.out.println(title + " : " + area);
	}
}


public class Test5 extends TestF {
	
//	@Override
//	public void write(String title) {
//		super.write(title);
//	}
	
	public void circleArea(int r) {
		area = (double)r*r*PI;
	}

	public static void main(String[] args) {
		Test5 ob = new Test5();
		
		ob.circleArea(5);
		ob.write("원");
	}

}
