package com.day3;

public class Test1 {

	public static void main(String[] args) {
		
		// float, double
		
		float f = 0; // 0.0
		double d = 0;	// 0.0
		
		//System.out.println(f);
		
		for (int i = 0; i<100000; i++) {
			
			System.out.println("A");
			
			//f ++;
			//d += 2;
			f = f + 100000;
			d = d + 100000;
			
			
		}
		System.out.println("float: " + (f/100000));
		System.out.println("double: "+ (d/100000));

	}

}
