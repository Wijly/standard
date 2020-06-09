package com.day14;



//Generic
class Box<T>{
	
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}

}


public class Test4 {

	public static void main(String[] args) {

		Box<Integer> b1 = new Box<Integer>();
		b1.set(new Integer(25));	// =b1.set(22);
		Integer i = b1.get();
		System.out.println(i);
		
		Box<String> b2 = new Box<String>();
		b2.set("화성");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box();
		b3.set(30); 		// upcast
		Integer j = (Integer)b3.get();		// downcast
		System.out.println(j);
		
		//25는 자료형	-스택에 저장
		// new Integer(25) : 객체
	}

}
