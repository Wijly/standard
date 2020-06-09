package com.day6;

public class Test7 {

	public static void main(String[] args) {
		
		int a[][] = {{5,4,3},{2,6,5},{7,4,3}};
		int b[][] = {{7,6,5},{3,5,7},{6,9,1}};
		
		int sum[][] = new int [3][3];
		
		int i,j;
		
		for(i=0; i<a.length; i++) {
			for(j=0; j<b.length; j++) {
				
				sum[i][j] = a[i][j] + b[i][j];
				
				System.out.printf("%5d", sum[i][j]);
			}
			System.out.println();
		}
	}

}
