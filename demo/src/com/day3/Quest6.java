package com.day3;
import java.util.Scanner;

public class Quest6 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		String name;
		int num1,num2,num3;
		int sum = 0;
		int avg = 0;
		String result="";
		
		System.out.print("이름을 압력하세요 : ");
		name = sc.next();
		System.out.print("세과목 점수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
			
		sum = num1+num2+num3;
		avg = sum/3;
		
		if (num1>=40 && num2 >=40 && num3>=40) {
			if(avg>=60) {
				result= "합격";
			}
			else {
				result ="불합격";
			}
		}
		else if(avg>=60){
			result = "과락";
		}
		else
			result = "불합격";
		
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+sum+", 평균 : "+avg+", 판정 : "+result);
	}

}
