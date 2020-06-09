package com.day21;

//class 클래스
// 특정 클래스나 인터페이스에 관한 정보를 검색할 수 있는 메소드를 가지고 있다.

class Test{

	public void write() {
		System.out.println("테스트");
	}

}

public class Test1 {

	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName("com.day21.Test");
		
		Object ob = c.newInstance();
		
		Test t = (Test)ob;
		t.write();
		
	}

}
