package com.day10;

// Override
// 상속 관계에서 부모가 가지고있는 메소드를 재정의.

class Shape{
	
	private String title;
	protected double area;
	
	public Shape() {}
	
	public Shape(String title) {
		this.title = title;
	}
	
	public void write() {
		System.out.println(title + " : " + area);
	}
}
class Circle extends Shape{

	private int r;
	
	protected static final double PI = 3.141592;
	
	public Circle(int r) {		// 생성자 오버로딩 ( 중복 정의 )
		super("원");
		this.r = r;		
	}
	
	public void circleArea(){
		area = r*r*PI;
	}
}

class RectA extends Shape{
	
	private int w,h;
	
//	public RectA() {				// 생략되어짐
//		super();
//	}
	
	public void rectArea(int w,int h) {	// 메소드로 초기화

		this.w = w;
		this.h = h;
		
		area = w*h;
		
	}
//	public void print() {

	@Override				//어노테이션 : 감시를 하는 역할
	public void write() {
		System.out.println("가로 : "+ w);
		System.out.println("세로 : "+ h);
		System.out.println("넓이 : "+ area);
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Circle ob1 = new Circle(12);
		RectA ob2 = new RectA();
		
		ob1.circleArea();
		ob1.write();
		
		ob2.rectArea(10, 20);
//		ob2.print();
		ob2.write();
	}

}
