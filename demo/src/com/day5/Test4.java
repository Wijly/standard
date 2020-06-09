package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		int[] num = {59,45,36,27,8};
		int i,j,temp;

		System.out.print("Source Data : ");
		for(i=0; i<num.length;i++) {
			System.out.printf("%4d",num[i]);
		}
		System.out.println();

		for(i = 0; i<num.length-1;i++) {
			for(j=i+1; j<num.length;j++) {
				//				System.out.println(i + " : " + j);
				if(num[i]>num[j]) {			//	오름차순
					temp= num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("정렬 후 Data : ");

		for(int su : num) {		// 확장 for문(배열)

			System.out.printf("%4d",su);

		}
		System.out.println();

		//----------------------------------------------------------------------------------------
		//---------------------------------------------사용자 입력
		
		System.out.print("Data Input : ");
		Scanner sc = new Scanner(System.in);
		for(i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		for(i = 0; i<num.length-1;i++) {
			for(j=i+1; j<num.length;j++) {
				
				if(num[i]>num[j]) {			//	오름차순
					temp= num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.print("정렬 후 Data : ");

		for(int su : num) {		// 확장 for문(배열)

			System.out.printf("%4d",su);

		}
		System.out.println();
	}
}
