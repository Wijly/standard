package com.day10;

// 	String = class
//	����ϴ� �󵵴� ���� �����ϴ� �����ʹ� ũ��.
//	�Һ��� ��Ģ�� �������ִ�.


public class Test4 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		
		System.out.println("ob1 == ob2 : "+(ob1==ob2));				// ���� �ּ��� ��
		System.out.println("ob1 == ob3 : "+(ob1==ob3));				
		System.out.println("ob1.equals(ob3) : "+ ob1.equals(ob3));		//���ڴ� equals�� �񱳸� �ؾ��Ѵ�.
		//	Object�� equals �� �ּҸ� ���ϰ� String�� equals�� �ּҹ����� ���� ���Ѵ�.
		
		ob2 = "Korea" ;
		System.out.println("ob1 == ob2 : "+(ob1==ob2));
		
		ob2 = "Japan" ;
		System.out.println("ob1 == ob2 : "+(ob1==ob2));
		
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
