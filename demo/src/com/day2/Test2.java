package com.day2;


class Test2{

	public static void main(String[] args) {
		
		// 자료형(정수형) 변수
		int i=20;
		int j=5;
		int s, m;

		s = i + j;
		m = i - j;

		System.out.println( s );
		System.out.println( m );

		System.out.println( i+" * "+ j +" = "+ i*j);
		System.out.println( i+" / "+ j +" = "+ i/j);

		System.out.printf("%d + %d = %d %n",i,j,s);
		System.out.printf("%d - %d = %d \n",i,j,m);

		System.out.println();
		

	}
}
