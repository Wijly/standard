package com.day3;

public class Study{
	public static void main(String[] argc) {
		MyMath2 mm2 = new MyMath2();
		System.out.println("mm2.add(3, 3) ��� : "+mm2.add(3,3));
		System.out.println("mm2.add(3L,3) ��� : "+mm2.add(3L, 3));
		System.out.println("mm2.add(3,3L) ��� : "+mm2.add(3,3L));
		System.out.println("mm2.add(3L,3L)��� : "+mm2.add(3L,3L));
		
		int [] a = {100,200,300};
		System.out.println("mm2.add(a) ��� : "+mm2.add(a));
	}
	
}
class MyMath2{
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
		}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {		// �迭�� ��� ����� ���� ����� �����ش�
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for ( int i = 0; i< a.length; i++) {
			result += a[i];
		}
		return result;
	}
}