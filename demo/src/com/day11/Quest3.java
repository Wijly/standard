package com.day11;

import java.util.Scanner;

/*
1. 자바를 컴파일하고 실행하는 방법
: 메인문 안에 함수,수식을 입력하고 ctrl + F11 또는 런을 누름

2. 자료형
day5.Test1
: boolean(true, false)
: byte < short <  int < long		정수형
: float < double					실수형
: char (2byte)
산술연산자 : +,-,*,/,%,++,--
관계 연산자 : >, <, <=, >=
등가 연산자 : ==, !=
논리 연산자 : &&, ||, !
비트 연산자 :  &, |, ^, ~, >>, <<, >>>
대입 연산자 : =, +=, -=, *=, /=

3. 삼항 연산자의 형식 및 간단한 예제 만들기
day3.Test2
조건 ? (참일때의 실행) : (거짓일때의 실행)
int a=5;
String str;

str = a>0 ? "a는 양수":(a<0 ?"a는 음수":"a=0")
// a가 0보다 크면 "a는 양수", 
// a가 0보다 작으면, a<0을 조건으로걸고
// 0보다 작으면 음수, 0과 같으면 "a=0" 출력

4. 제어문의 종류 및 형식을 설명하고 제어문당 간단한 예제 하나씩 만들기
조건문 : if문, switch문
반복문 : for문, while문, do-while문

5. 배열의 개요 및 배열의 생성, 초기값을 부여하는 방법
day6.Test1

6. 생성자, 디폴트 생성자 개요
day9.Test2

7. 메소드 오버로딩
day9.Test3
*/
public class Quest3 {
	
	//6
	public Quest3() {			// 기본생성자
	}
	public void print() {
		System.out.println("기본생성자 입니다.");
	} 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("두 수를 입력하세요. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//4.
		if(a>b) {
			System.out.println("a는 b보다 크다.");
			for(int i = b; i<a; i++) {
				System.out.print(b+" ");
				b++;
			}
		}else if(a<b){
			System.out.println("a는 b보다 작다.");
			for(int i = a; i<b; i++) {
				System.out.print(a+" ");
				a++;
			}
		}else
			System.out.println("a와 b는 같다");
		
		
		//5
		int score;
		int[] num;
		System.out.print("배열갯수입력 : ");
		int c = sc.nextInt();
		num = new int[c];		//메모리 할당, 객체생성
		for(int i = 0; i<num.length; i++) {		// 배열 초기화
//			num[i]=0;
			System.out.print(i+"번째 값 입력 : ");
			score = sc.nextInt();
			num[i]=score;
		}
		
		Quest3 ob = new Quest3();
		ob.print();

	}

}
