package com.day3;
import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String str = "";
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		str = num%2==0?"¦��":"Ȧ��";
		
		System.out.println(num + " => "+str );
		
		/*
		if(num %2==0){
			str = "¦��";
		}
		else {
			str = "Ȧ��";
		}
		System.out.println(num + " => "+str );
		*/
	}

}
