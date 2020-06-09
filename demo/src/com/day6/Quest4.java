package com.day6;

public class Quest4 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		int i, j;
		int n = 1;

		for (i = 0; i < 5; i++) {
			if(i%2==0) {	
				for (j = 0; j < 5; j++) {
					arr[i][j]=n++;
				}
			}
			else {
				for(j=0;j<5;j++) {
					arr[i][4-j]=n++;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}

