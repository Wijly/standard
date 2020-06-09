package com.day12;

// ���� Ŭ���� (Inner Ŭ����)

class Outer{
	
	static int a = 10;
	int b = 20;
	
	public class Inner{		//Outer$Inner.class
	
		int c= 30;
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	public void print() {
		Inner ob = new Inner();
		ob.write();
	}

}

public class Test6 {

	public static void main(String[] args) {

		// ��ü���� ��� 1
		Outer out = new Outer();
		out.print();
		
		// ��ü���� ��� 2
		Outer.Inner in = out.new Inner();
		in.write();
		
	}

}
