package com.day3;

import java.util.Scanner;

public class Test5 {
	public static void main(String [] args) {
		
		// Scanner
		Scanner sc = new Scanner (System.in);
		
		String name;
		int kor;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		
		String pan;
		
		if(kor>=90) {
			pan = "수";
		}else if(kor>=80) {
			pan = "우";
		}else if(kor>=70) {
			pan="미";
		}else if(kor>=70) {
			pan="양";	
		}else{
			pan="가";
		}
		
		System.out.println(name + " : "+pan);
	}
}
