package com.day11;

// Wrapper Ŭ����  : �⺻�ڷ����� ��ü�� ��� ����
//���۷����ڷ��� : Boolean, Byte, Character, Short, Integer, Long, Float, Double

// Auto-Boxing : stack -> heap
// Auto-UnBoxing : heap -> stack


public class Test1 {

	public static void main(String[] args) {
		
		// ���� �ڷ��������� ����Ǵ� ��ġ�� �ٸ���.
		int n1 = 10;
		int n2;
		Integer num1;		// ����Ŭ����
		Integer num2 = new Integer(20);
		
		num1 = n1;
		n2 = num2;
		
		System.out.println(n1 + " : " +num1 );
		System.out.println(n2 + " : " + num2);

	}

}
