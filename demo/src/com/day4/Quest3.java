package com.day4;

public class Quest3 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=10;i+=2) { sum +=i; }
		for(int i=2;i<=10;i+=2) { sum -=i; }
		
		System.out.println("1-2+3-4+5-6+7-8+9-10 : "+sum);
	}

}
