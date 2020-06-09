package com.day11;

//추상 클래스
//메모리의 낭비 없이 클래스를 미리 설계해서 메소드를 재정의하여 사용
// abstract
// -상속할 때 최소 한개는 override 하나는 받아야한다.

abstract class ShapeClass {
	abstract void draw();

}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그린다.");		
	}

}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다.");
	}

}

class Tri extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}

}

public class Test6 {

	public static void main(String[] args) {
		
		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();

	}

}
