package com.day12;

// 3. ���� Ŭ����( ��øŬ����)

class Outer3{
	
	static int a =10;
	int b= 20;
	
	public static class Inner3{
		int c = 30;
		
		public void write() {
		
			System.out.println(a);
//			System.out.println(b);			 static ������ �����ʾƼ� �ҷ��� �� ����. ��ü���� �ʿ�
			System.out.println(c);
			
			Outer3 out = new Outer3(); 			// ��ü ���� �� b ȣ�Ⱑ��
			System.out.println(out.b);
		}
	}
	
	public void print() {
		Inner3 ob = new Inner3();
		ob.write();
	}
}


public class Test8 {

	public static void main(String[] args) {
		
		Outer3 out = new Outer3();
		out.print();
		
		Outer3.Inner3 in = new Outer3.Inner3();
		in.write();

	}

}
