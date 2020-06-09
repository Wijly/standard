package com.day10;

// Override
// ��� ���迡�� �θ� �������ִ� �޼ҵ带 ������.

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
	
	public Circle(int r) {		// ������ �����ε� ( �ߺ� ���� )
		super("��");
		this.r = r;		
	}
	
	public void circleArea(){
		area = r*r*PI;
	}
}

class RectA extends Shape{
	
	private int w,h;
	
//	public RectA() {				// �����Ǿ���
//		super();
//	}
	
	public void rectArea(int w,int h) {	// �޼ҵ�� �ʱ�ȭ

		this.w = w;
		this.h = h;
		
		area = w*h;
		
	}
//	public void print() {

	@Override				//������̼� : ���ø� �ϴ� ����
	public void write() {
		System.out.println("���� : "+ w);
		System.out.println("���� : "+ h);
		System.out.println("���� : "+ area);
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
