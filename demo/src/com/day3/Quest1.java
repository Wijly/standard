package com.day3;
import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String str = "";
		
		System.out.print("¼ıÀÚ ÀÔ·Â : ");
		num = sc.nextInt();
		
		str = num%2==0?"Â¦¼ö":"È¦¼ö";
		
		System.out.println(num + " => "+str );
		
		/*
		if(num %2==0){
			str = "Â¦¼ö";
		}
		else {
			str = "È¦¼ö";
		}
		System.out.println(num + " => "+str );
		*/
	}

}
