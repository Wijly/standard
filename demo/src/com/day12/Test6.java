package com.day12;

// 郴何 努贰胶 (Inner 努贰胶)

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

		// 按眉积己 规过 1
		Outer out = new Outer();
		out.print();
		
		// 按眉积己 规过 2
		Outer.Inner in = out.new Inner();
		in.write();
		
	}

}
