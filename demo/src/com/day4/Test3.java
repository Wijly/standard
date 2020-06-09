package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//반복문 (for, while, do-while)
		
		Scanner sc = new Scanner(System.in);
		 int dan;
		 
		 System.out.print("단 입력 : ");
		 dan = sc.nextInt();
		/*
		 for ( int i = 1; i < 9; i++) {
			 
			 //System.out.println(dan + " x " + i  + " = " + (dan*i));
			 System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
			 
		 }
		 */
		 //------------------------------------------------------------------------------------
		 
		 // while(조건= 최댓값)
		 
		 int j = 1;
		 
		 while(j<10) {
			 
			 System.out.printf("%d x %d = %d\n",dan,j,(dan*j));
			 j++;
			 
		 }
		 System.out.println("------------------------------------------------------------------");
		 
		 // do - while(조건 = 최댓값);
		 
		 int k = 0;
		 
		 do { 
			 k++;
			 System.out.printf("%d x %d = %d\n",dan,k,(dan*k));		 
		 } 
		 while(k<9);
		 
		 
	}

}
