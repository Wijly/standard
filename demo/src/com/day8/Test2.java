package com.day8;

//static
//1. �˾Ƽ� �޸𸮷� �ö󰣴�.
//2. ��ü�� 1000�� �����ǵ� �޸� ������ 1���� ���
//static�� ������ �� �ν��Ͻ� �޼ҵ�, �ν��Ͻ� ���� �����

public class Test2 {

	public static int a = 10; // class ���� , Ŭ��������, Ŭ���� �޼ҵ�
								// Ŭ������ �ε��Ǵ� ���� �޸� �Ҵ��� �̷����
								// [Ŭ�����̸�, ��ü�̸�] ���� ���� ����, ��, new�� ���ؼ� �޸� �Ҵ��� �����ʾƵ� ��밡��

	private int b = 20; // instance ����, �ν��Ͻ� �޼ҵ�
						// new�� ���� ��ü�� �����ؾ߸� �޸𸮿� �ö� �� �ִ�.
						// Ŭ���� �޼ҵ忡���� ������ �� ����.

	public static void print() { // class �޼ҵ�
		System.out.println("class ���� a : " + a);
//		System.out.println("instance ���� b : "+ b);
	}

	public void write() {
		System.out.println("class ���� a : " + a);
		System.out.println("instance ���� b : " + b);
	}

	public static void main(String[] args) { // Ŭ���� �޼ҵ�

		System.out.println("class ���� a : " + a);
		System.out.println("calss ���� a : " + Test2.a);

		print();
		Test2.print();

		Test2 ob = new Test2();
		System.out.println("clas ���� a : " + ob.a);

		ob.write();
		ob.print();				// static���� �����߱⶧���� print();�θ� �ᵵ �ȴ�.

		System.out.println("ob1-------------------------------------------------");
		
		Test2 ob1 = new Test2();
		
		ob1.a = 100;
		ob1.b = 200;
		
		ob1.write();
		ob1.print();
		
		System.out.println("ob2-------------------------------------------------");		// static�� �޸� ������ 1���� ���Ƿ� �ʱ�ȭ�� ���׾ �ٽ� 100���� ���
		
		Test2 ob2 = new Test2();

		ob2.write();
		ob2.print();
		
		System.out.println("*************************************************************");
		
		ob.write();					// ó�����޸� �޸𸮸� �ʱ�ȭ ���ױ� ������ a�� 100�� ����
		print();				//
		
	}
}
