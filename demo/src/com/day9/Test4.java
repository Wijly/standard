package com.day9;

// �ʱ�ȭ ��


public class Test4 {
	
	int a = 5;
	
	{		//�ʱ�ȭ ��
		System.out.println("�ʱ�ȭ �� a : "+a);
		a = 10;
		System.out.println("�ʱ�ȭ �� a : "+a);
	}
	
	static int b;			// instance ����, b�� �ʱ갪 0
	
	static {		// static �� , �ʱ�ȭ��. �̹� �޸𸮻� �ö��ִ� ��
		b = 20;
		System.out.println("static �� b : "+b);
	}
	
	// ���	(�빮�ڷ� ���) -�������ʴ� ��, ������ �ʱ�ȭ
	final int C;
	
	public Test4() {		//������	, �� �������� ����
		
		System.out.println("������ " );
		
		C = 100;
		
		System.out.println("C : "+C);
	}

	public static void main(String[] args) {
		
		Test4 ob1 = new Test4();		// �켱����
		System.out.println();
		Test4 ob2 = new Test4();
		new Test4();
	}

}
