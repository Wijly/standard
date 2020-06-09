package com.day2;

class Test3{

	public static void main(String[] args) {

		int r = 10;
	//	double pie = 3.141592;
		float a, l;

	//	a = r * r * pie;	// 10 * 10 * 3.14
	//	l = r * 2 * pie;
		a = r * r * 3.141592f;
		l = r * 2 * 3.141592f;

		System.out.printf(" 반지름 : %d, 넓이 : %f\n",r,a); 
		System.out.printf(" 반지름 : %d, 넓이 : %.3f\n",r,a); 
		System.out.println("반지름 : " + r + ", 둘레 : " + l );
		
	}
}
