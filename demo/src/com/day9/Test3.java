package com.day9;

class Rect1{
	
	// �����ε� : ����� �޼ҵ带 �̸��� ���� ���(�Ű������� �ٸ��� ����)
	
	private int w,h;
	
	public Rect1() {		// �⺻������
	
	}
	
	public Rect1(int w,int h) {		// ������ �����ε�
		
		this.w = w;
		this.h = h;
	}
	
	public void set(int w,int h) {		// �ʱ�ȭ �޼ҵ�
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a) {
		System.out.println("���� : "+w+", ���� : "+h);
		System.out.println("���� : "+a);
	}
	public void print(int a,int l) {					// �޼ҵ� �����ε�
		System.out.println("���� : "+w+", ���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}	
}


public class Test3 {

	public static void main(String[] args) {
	
		Rect1 ob1 = new Rect1();		// �⺻�����ڸ� �����س��� �⺻�����ڷ� ���� ����, �����ε��� ���ѳ���
		ob1.set(10, 20);
		int a = ob1.area();
		ob1.print(a);
		int l = ob1.length();
		ob1.print(a, l);
		
		System.out.println("-------------");
		
		Rect1 ob2 = new Rect1(30,40);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		ob2.print(a, l);
		
	}

}
