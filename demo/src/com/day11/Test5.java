package com.day11;

//final
//Instance������ ���̸� �ѹ��� �ʱ�ȭ�� �����ϴ�.
// �޼ҵ忡 ���̸� 		Override�� �Ұ����ϴ�.
// Ŭ������ ���̸�		����� �Ұ����ϴ�.


class TestF{
	
	public static final double PI;
	static {
		PI = 3.141592;
	}
	
	public double area;
	
	public final void write(String title) {					// final�� �ٿ��� �������̵尡 �Ұ�����
		System.out.println(title + " : " + area);
	}
}


public class Test5 extends TestF {
	
//	@Override
//	public void write(String title) {
//		super.write(title);
//	}
	
	public void circleArea(int r) {
		area = (double)r*r*PI;
	}

	public static void main(String[] args) {
		Test5 ob = new Test5();
		
		ob.circleArea(5);
		ob.write("��");
	}

}
