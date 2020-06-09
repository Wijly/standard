package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요. : ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println("num"+i+"번째자리 입력된 수 : "+ num[i]+"\t");
		}
		
		System.out.println("num4 - num0 : "+(num[4]-num[0]));
		
//		
//		int num[] = new int[5];
//		
//		for(int i = 0; i<num.length;i++) {
//			num[i] += (i+1)*10;
//		}
//		for(int i = 0;i<5;i++){
//			System.out.println("num["+i+"] : "+num[i]);
//		}
//		
	}

}

/*
 * 
 * 자료형 boolean : 1byte (True / False)
 * 
 * 정수형 byte : 1byte -128 ~ 127 short : 2byte int : 4byte long : 8byte
 * 
 * 실수형 ( 자바는 소수를 만나면 더블로 인식) float :4byte(단정도, 3.14f) double :8byte(배정도, 3.14)
 * 
 * char : 2byte(URF-16, 유니코드) 'a'
 * 
 * [연산자] 산술연산자 +,-,*,/,%,++,--
 * 
 * 관계형 연산자 >, <, >=, <=, : (True/ False)
 * 
 * 등가연산자 ==, !=
 * 
 * 논리연산자 &&(AND), ||(OR), !(not)
 * 
 * 비트연산자 &, |, ^, ~, >>, <<, >>>
 * 
 * 삼항연산자 조건?(참일때의 값):(거짓일때의 값)
 * 
 * 대입연산자 =, +=, -=, *=, /=
 * 
 * --------------------------------------------
 * 
 * int a = 10; float b; b=a; // b = 10.0 - 암시적 형변환 b=(float)a; // -명시적(강제) 형변환
 * 
 * if(조건문){ 작업 } if(조건문){ 작업 }else{ 작업 }
 * 
 * while(조건문){ 작업 }
 * 
 * do{ 작업 }while(조건);
 * 
 * while(true){ //무한루프 작업 }
 * 
 */