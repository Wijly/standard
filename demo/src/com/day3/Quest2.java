package com.day3;
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("숫자1, 숫자2 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println("큰숫자 : "+num1+" 작은 숫자 : "+num2);
		}else if(num1 < num2) {
			System.out.println("큰숫자 : "+num2+" 작은 숫자 : "+num1);
		}else 
			System.out.println("두 숫자가 같습니다.");
		
	}

}
