package com.day9;

class Rect{
	
	private int w,h;
	
	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a, int l) {
		System.out.println("���� : " + w+" ���� : "+h);
		System.out.println("���� : "+a);
		System.out.println("�ѷ� : "+l);
	}

	// ���� Ŭ���� �ȿ���
	// ����� ������ �ϴ� �޼ҵ��� �̸��� ���� ��Ŵ.
	// �޼ҵ� overloading
	// ���� : �޼ҵ� �̸��� ����, �Ű������� ������ Ÿ���̳� ������ �޶����
	
	public void print() {
		System.out.println("���� : " + w+" ���� : "+h);
	}
	public void print(int a) {
		System.out.println("���� : " + w+" ���� : "+h);
		System.out.println("���� : "+a);
	}
	// �Ű������� 1���� ���� �� ���Ƽ� �����ε� ������ ������������
	public void dul(int l) {
		System.out.println("���� : " + w+" ���� : "+h);
		System.out.println("�ѷ� : "+l);
	}
	public void print(double l) {
		System.out.println("���� : " + w+" ���� : "+h);
		System.out.println("�ѷ� : "+l);
	}
	
}



public class Test1 {
	
	public static void main(String[] args){
		Rect ob = new Rect();
		
		ob.set(10, 20);
		
		int a = ob.area();
		int l = ob.length();
/*
		ob.print(a, l);
		System.out.println("--------------------------------------------");
		ob.write();
		System.out.println("--------------------------------------------");
		ob.cul(a);
		System.out.println("--------------------------------------------");
		ob.dul(l);
		System.out.println("--------------------------------------------");
*/	
		ob.print(a, l);
		
		String s = "";
		System.out.println(s);
	}

}
