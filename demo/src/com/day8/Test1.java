package com.day8;

import java.util.Scanner;

//private

class Circle{
	
	private int r;		//정보의 은닉화(캡슐화)		//클래스 안에서만 사용가능
	
	public void setData(int r) {			// private r을 우회하여 초기화 메소드	//setData(int r, Circle this)
		this.r = r;							//this(ME) : 전역변수
	}
	
	public double area() {				// 넓이계산
		
		return r*r*3.14;
	}
	
	public void write(double a) {			//write(double a, circle this)
		
		System.out.println("반지름 : "+r);
		System.out.println("넓이 : "+ a);		
		
	}

}

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle ob = new Circle();
		
		int r;
		
		System.out.print("정수를 입력하세요. : ");
		r = sc.nextInt();
		
//		ob.setData(10);
		ob.setData(r);	//setData(r,ob)
		double a = ob.area();
		ob.write(a);		//write(a,ob)
	
	}	
}
