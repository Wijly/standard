package com.day21;

//class Ŭ����
// Ư�� Ŭ������ �������̽��� ���� ������ �˻��� �� �ִ� �޼ҵ带 ������ �ִ�.

class Test{

	public void write() {
		System.out.println("�׽�Ʈ");
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
