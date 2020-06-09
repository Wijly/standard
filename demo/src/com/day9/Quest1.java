package com.day9;

import java.io.IOException;

public class Quest1 {

	public static void main(String[] args) throws IOException {

		int n=0,s=0;
		int data;
		System.out.print("어떤수 : ");
		while((data = System.in.read()) !=13)					{		//13은 Enter
			n=n*10+data-48;												//문자0->ASCII48
		}
		
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		System.out.print("결과  : " + s);

	}
}
