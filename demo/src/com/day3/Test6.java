package com.day3;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] argc) {

		// Scanner 단락 문자의 패턴을 사용해서 분류
		// 기본 패턴은 공백

		Scanner sc = new Scanner(System.in);

		String name;
		int kor, eng, mat;

		/*
		 * System.out.print("이름을 입력하세요. : "); name = sc.next();
		 * 
		 * System.out.print("국어점수를 입력하세요. : "); kor = sc.nextInt();
		 * 
		 * System.out.print("수학점수를 입력하세요. : "); eng = sc.nextInt();
		 * 
		 * System.out.print("영어점수를 입력하세요. : "); mat = sc.nextInt();
		 * 
		 * System.out.println(name + "의 총점은 " + (kor+eng+mat));
		 */

		System.out.print("이름, 국어, 영어, 수학순서로 입력하세요. : ");

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); // 정규화 표현식

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		System.out.println(name + "의 총점은 " + (kor + eng + mat));
	}
}
