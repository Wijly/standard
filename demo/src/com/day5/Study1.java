package com.day5;

public class Study1 {

	public static void main(String[] args) {
		
		Study2 myCalc = new Study2();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(10,12);
		System.out.println("result1 (study1.plus) : "+result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 (study2.divide) : "+result2);
		
		myCalc.powerOff();
	}

}
