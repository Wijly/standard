package com.day14;

class Box2<T>{
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
	public <U> void print(U u) {
		
		System.out.println(u);
		System.out.println("t 클래스 : " + t.getClass().getName());
		System.out.println("u 메소드 : " + u.getClass().getName());
		
	}
	
	
}

public class Test5 {

	public static void main(String[] args) {
		
		Box2<Integer> b = new Box2<Integer>();
		b.set(new Integer(30));		// t 를 30으로 초기화
		System.out.println(b.get());
		b.print("Test");
		b.print(50);

	}

}
