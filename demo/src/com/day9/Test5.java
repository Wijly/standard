package com.day9;

// �Ǻθ� �Լ�
// �ҽ��� �����ϳ� ó���ӵ��� ����
// �����͸� stack�� �����ߴٰ� ���


public class Test5 {
	
	public void print(int a) {
		if (a!=1) {
			print(a-1);			// �Ǻθ� �Լ�,  �ڱ��ڽ��� ȣ���ϴ� �Լ�
		}
		
		System.out.printf("%4d\n", a);
	}
	public int sum(int n) {
		return n>1 ? n+sum(n-1):n;
	}
	public int pow(int a, int b) {
		return b>=1 ? a*pow(a,b-1):1;
	}
	

	public static void main(String[] args) {

		Test5 ob = new Test5();
		
		ob.print(5);
	
		System.out.println("\n-------");
		int s= ob.sum(10);			// 10 +sum(9), 9+sum(8), 8+sum(7) ..... 1~10������ ����
		System.out.println(s);
		System.out.println("---------");
		System.out.println("pow(2,10) : "+ob.pow(2,10));		// 2�� 10��
	}

}
