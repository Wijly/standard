package com.day15;

class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // Exception의 용량이 너무 커서 메모리를 할당받는 코드

	public MyException(String msg) { // 생성자를 오버로딩
		super(msg);
	}

}

public class Test1 {

	private int value;

	public void setValue(int value) throws MyException {
		
		if (value < 0) {
			throw new MyException("수는 0보다 작을 수 없습니다.");
		} else
			this.value = value;

	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Test1 ob = new Test1();

		try {

			ob.setValue(22);

		} catch (MyException e) {
			e.printStackTrace();
		}

		System.out.println(ob.getValue());

	}

}
