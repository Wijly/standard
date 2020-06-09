package com.day4;

public class Quest6 {

	public static void main(String[] args) {

		int sum = 0;

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 5; i++) {
				sum = i * j;
				System.out.print(i + " X " + j + " = " + sum + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (int j = 1; j <= 9; j++) {
			for (int i = 6; i <= 9; i++) {
				sum = i * j;
				System.out.print(i + " X " + j + " = " + sum + "\t");
			}
			System.out.println();
		}

	}

}
