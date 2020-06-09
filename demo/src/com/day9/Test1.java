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
		System.out.println("가로 : " + w+" 세로 : "+h);
		System.out.println("넓이 : "+a);
		System.out.println("둘레 : "+l);
	}

	// 같은 클래스 안에서
	// 비슷한 역할을 하는 메소드의 이름을 통일 시킴.
	// 메소드 overloading
	// 조건 : 메소드 이름은 같고, 매개변수의 데이터 타입이나 갯수가 달라야함
	
	public void print() {
		System.out.println("가로 : " + w+" 세로 : "+h);
	}
	public void print(int a) {
		System.out.println("가로 : " + w+" 세로 : "+h);
		System.out.println("넓이 : "+a);
	}
	// 매개변수가 1개인 것이 위 같아서 오버로딩 조건이 성립하지않음
	public void dul(int l) {
		System.out.println("가로 : " + w+" 세로 : "+h);
		System.out.println("둘레 : "+l);
	}
	public void print(double l) {
		System.out.println("가로 : " + w+" 세로 : "+h);
		System.out.println("둘레 : "+l);
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
