package com.day8;

import java.util.Scanner;

//private

class Circle{
	
	private int r;		//������ ����ȭ(ĸ��ȭ)		//Ŭ���� �ȿ����� ��밡��
	
	public void setData(int r) {			// private r�� ��ȸ�Ͽ� �ʱ�ȭ �޼ҵ�	//setData(int r, Circle this)
		this.r = r;							//this(ME) : ��������
	}
	
	public double area() {				// ���̰��
		
		return r*r*3.14;
	}
	
	public void write(double a) {			//write(double a, circle this)
		
		System.out.println("������ : "+r);
		System.out.println("���� : "+ a);		
		
	}

}

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle ob = new Circle();
		
		int r;
		
		System.out.print("������ �Է��ϼ���. : ");
		r = sc.nextInt();
		
//		ob.setData(10);
		ob.setData(r);	//setData(r,ob)
		double a = ob.area();
		ob.write(a);		//write(a,ob)
	
	}	
}
