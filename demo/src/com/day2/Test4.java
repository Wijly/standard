package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

class Test4{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.in : 사용자가 키보드로 입력 받은 1byte의 문자
		// InputStreamReader : System. in으로 입력받은 1bye를 문자(2byte)로 변환
		// BufferedReader : 메모리에 공간을 만들고 데이터를 저장하는 것.
		// 입력 받은 것을 변환하여 만들어진 메모리인 br에 저장

		int r;
		double a, l;

		System.out.printf("반지름 입력 : ");
		
		r = Integer.parseInt(br.readLine());	// br을 문자로 반환하기 때문에 Integer를 사용해 정수로 형 변환한다.
												// readLine을 사용하려면 throws IOException을 사용해야한다고 API에 명시되어있다.

		a = (double)r * r * 3.14;
		l = (double)2 * r * 3.14;
		
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}
}