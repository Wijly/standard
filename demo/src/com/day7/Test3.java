package com.day7;

import java.util.Scanner;

//class Hap{
//	
//	int su, sum;	// instance ���� ����
//	
//	public void input() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("������ �Է��ϼ��� : ");
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
//		System.out.println("1���� "+su+"������ �հ� : "+ a);
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
	
	int su, sum;	// instance ���� ����
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		su = sc.nextInt();
		
	}
	
	public void cnt() {
		
		for(int i=0; i<=su; i++) {
			sum += i;
		}

	}
	
	public void print() {
		System.out.println("1���� "+su+"������ �հ� : "+sum );
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
	
	int su;	// instance ���� ����
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
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
		System.out.println("1���� "+su+"������ �հ� : "+ a);
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