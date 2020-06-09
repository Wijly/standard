package com.day10;

class Test{

	private String title;
	protected int area;
	
//	public Test(){}
	
	public Test(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println(title +" : " + area);
	}
}

class Rect extends Test{		//Rect 에러이유 : 기본생성자가 생성되어있는데 그 안에 부모클래스의 생성자를 선언. 메모리는 부모클래스 먼저,
	
	private int w,h;
	
	public Rect(int w, int h) {
		
		super("사각형");		// 부모의 기본 생성자를 찾음(ex.String)
		this.w = w;
		this.h = h;
	}
	
	public void rectArea() {
		area = w*h;
	}
	
}

public class Test1 {

	public static void main(String[] args) {

		Rect r = new Rect(10,20);
		
		r.rectArea();	// area = 200
		r.print();
		
	}

}
