package com.day7;

public class Test1 {

	public static void main(String[] args) {
		// public : ����������
		// private :  
		// �� : ��ȯ��(return ) �ڷ���. void
		// �ı� : �Ű�����
		
		Rect r1 = new Rect();
		
		r1.input();
		int a = r1.area();		// ������� ���� a ����
		int l = r1.length();	// ������� ���� l ����
		r1.print(a, l);
		
		Rect r2 = new Rect();
		
		r2.input();
		a = r2.area();
		l = r2.length();
		r2.print(a, l);
		
		System.out.println("r1 : "+r1.w+ ", " + r1.h);
		System.out.println("r2 : "+r2.w+ ", " + r2.h);
	}

}
