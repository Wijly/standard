package com.day9;

// ������
// 1. �޸𸮸� �Ҵ���� �� ���(��ü ����)
// 2. �����ʱ�ȭ
// �������� Ư¡ 
// 1.class�� �̸��� �����ϴ�.
// 2.return ���� ���� ������ property�� ����.
// 3.�ߺ����ǰ� �����ϴ�.(overload)
// �����ھȿ��� ������ ȣ�� ����.
// ��, �� ó�������� ȣ�Ⱑ���ϴ�.

// �����ڸ� �����ε� ���ѳ����� �⺻�����ڸ� ���������Ѵ�.
// public Test2(){}

public class Test2 {
	
	private int x;
	
	public Test2() {		// �⺻ ������
		
		this(50);
		
		System.out.println("�⺻ ������");
		x = 10;
		System.out.println(" x : "+x);
		
	}
	public Test2(int x){		// ������ �����ε�
		
//		this();			//�⺻������ ȣ��
		
		System.out.println("������ �ߺ�����, ( �����ε�)");
		this.x = x;
		System.out.println("x : "+x);
	}
	
	
	public void set(int x) {	// �ʱ�ȭ �޼ҵ�
		this.x = x;
		
	}
	public void print() {
		System.out.println("x : "+x);
	}

	public static void main(String[] args) {
		
		new Test2().print();
		
		Test2 ob1 = new Test2();			// �⺻������
		ob1.set(10);				
		ob1.set(10);
		ob1.print();
		
		Test2 ob2 = new Test2(20);			// ������ �����ε�, �ߺ�����
	}

}
