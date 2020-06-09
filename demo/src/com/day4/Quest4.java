package com.day4;

public class Quest4 {

	public static void main(String[] args) {
		int cnt=0;
		for (int i = 1;i<=100; i++) {
			if(i%3==0) {
				cnt ++;
			}
		}
		System.out.println("3의 배수의 개수 : "+cnt);
	}

}
