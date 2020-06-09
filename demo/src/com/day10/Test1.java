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

class Rect extends Test{		//Rect �������� : �⺻�����ڰ� �����Ǿ��ִµ� �� �ȿ� �θ�Ŭ������ �����ڸ� ����. �޸𸮴� �θ�Ŭ���� ����,
	
	private int w,h;
	
	public Rect(int w, int h) {
		
		super("�簢��");		// �θ��� �⺻ �����ڸ� ã��(ex.String)
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
