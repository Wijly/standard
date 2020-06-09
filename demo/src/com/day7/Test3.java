package com.day7;

import java.util.Scanner;

//class Hap{
//	
//	int su, sum;	// instance 변수 선언
//	
//	public void input() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		su = sc.nextInt();
//		
//	}
//	
//	public int cnt() {
//		
//		for(int i=0; i<=su; i++) {
//			sum += i;
//		}
//		
//		return sum;
//	}
//	
//	public void print(int a) {
//		System.out.println("1부터 "+su+"까지의 합계 : "+ a);
//	}
//}
//
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		
//		Hap ob = new Hap();
//		ob.input();
//		int sum = ob.cnt();
//		ob.print(sum);
//
//	}
//
//}
/*
class Hap{
	
	int su, sum;	// instance 변수 선언
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		su = sc.nextInt();
		
	}
	
	public void cnt() {
		
		for(int i=0; i<=su; i++) {
			sum += i;
		}

	}
	
	public void print() {
		System.out.println("1부터 "+su+"까지의 합계 : "+sum );
	}
}


public class Test3 {

	public static void main(String[] args) {
		
		Hap ob = new Hap();
		ob.input();
		ob.cnt();
		ob.print();
		
	}
*/
class Hap{
	
	int su;	// instance 변수 선언
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		su = sc.nextInt();
		
	}
	
	public int cnt() {
		
		int sum = 0;
		
		for(int i=0; i<=su; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public void print(int a) {
		System.out.println("1부터 "+su+"까지의 합계 : "+ a);
	}
}


public class Test3 {

	public static void main(String[] args) {
		
		Hap ob = new Hap();
		ob.input();
		int sum = ob.cnt();
		ob.print(sum);

	}

}