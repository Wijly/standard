package com.day10;

//StringBuffer		동기화를 지원한다.

//StringBuilder		동기화를 지원하지않는다

public class Test5 {

	public void stringTime() {

		System.out.println("StringTime  . ");

//	long start = System.currentTimeMillis();
		long start = System.nanoTime(); // 작업시작

		String str = "A";

		for (int i = 1; i <= 50000; i++) {
			str += "A";

		}

		long end = System.nanoTime(); // 작업종료

		System.out.println("실행 시간 : " + (end - start));
	}

	public void stringBufferTime() {

		System.out.println("StringBufferTime  . ");

//	long start = System.currentTimeMillis();
		long start = System.nanoTime(); // 작업시작

		StringBuffer str = new StringBuffer("A");

		for (int i = 1; i <= 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime(); // 작업종료

		System.out.println("실행 시간 : " + (end - start));
	}
	
	public void stringBuilderTime() {

		System.out.println("stringBuilderTime  . ");

//	long start = System.currentTimeMillis();
		long start = System.nanoTime(); // 작업시작

		StringBuilder str = new StringBuilder("A");

		for (int i = 1; i <= 50000; i++) {
			str.append("A");

		}

		long end = System.nanoTime(); // 작업종료

		System.out.println("실행 시간 : " + (end - start));
	}


	public static void main(String[] args) {

		Test5 ob1 = new Test5();
		
		ob1.stringTime();
		System.out.println();

		ob1.stringBufferTime();
		System.out.println();
		
		ob1.stringBuilderTime();

	}

}
