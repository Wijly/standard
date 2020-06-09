package com.day3;

import java.util.Scanner;

public class Quest5 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a = 15800;
		int n;
		double total;

		System.out.print("구매 개수를 입력 해주세요. : ");
		n = sc.nextInt();
		
		if(n>=10) {
			total = a*n*0.9;
		}else if(n>=20) {
			total = a*n*0.85;
		}else if(n>=30) {
			total = a*n*0.8;
		}else
			total = a*n;
		
		
		System.out.println("구입 수량 : "+n+"개, 판매 총금액 : "+total+"원");
	}

}
