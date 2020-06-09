package com.day4;

public class Quest2 {

	public static void main(String[] args) {
		int sum =0;
		
		for(int i = 1;i<=100;i++) {
			sum += i;
		}
		System.out.println("ÇÕ : "+sum);
		sum = 0;
		for(int i = 2;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("Â¦¼öÀÇ ÇÕ : "+sum);
		sum = 0;
		for(int i = 1;i<=100;i+=2) {
			sum += i;
		}
		System.out.println("È¦¼öÀÇ ÇÕ : "+sum);
	}

}
