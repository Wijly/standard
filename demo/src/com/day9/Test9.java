package com.day9;

import java.util.Set;

// ��� �θ� �Ѣ� �ڽ�
// 1. �θ� ���� �ڽĲ�
// 2. private�� ������ ���� ����� �ȉ�
// 3. protected�� ������ ���� ����� �����ϴ�.
// 4. �θ�� ���� ���� ��ü�� ������������ �ڱ���� ����.
// ��5.	�ڱ���� �ڱ��. �ڽİ��� �θ� �����ٰ� �� �� ����. 


class SuperC{
	private String title;
//	private int area;
	protected int area;
	
//	public void set(String title, int area) {		// �ʱ�ȭ�۾� - �޼ҵ�� �ʱ�ȭ
	public void set(String title) {
		this.title = title;
//		this.area = area;
	}
	
	public void print() {
		
		System.out.println(title+" : " + area);
		
	}
}
class RectA extends SuperC{				//extends SuperC << �θ�Ŭ�����κ��� ���
	
	private int w,h;
	
	public RectA(int w, int h){				// �ʱ�ȭ �۾� - �����ڷ� �ʱ�ȭ
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
	
		area = w*h;
		set("�簢��");			// �θ�Ŭ���� �޼ҵ� ���
		
	}
	
}

public class Test9 {

	public static void main(String[] args) {
		
		RectA ra = new RectA(10,20);			// �����ڷ� ��ü�� ����
		
		ra.rectArea();
		ra.print();
		

	}

}
