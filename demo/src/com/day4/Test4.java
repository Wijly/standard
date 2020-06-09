package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num; 
		int sum;
		char ch;
		
		while(true) {		// 무한루프
			
			do {
				System.out.print("수를 입력하세요. (1~9999): ");
				num = Integer.parseInt(br.readLine());
			}
			while(num<1 || num>10000);

			sum = 0;
			for(int i=1;i<=num;i++) {
				sum += i;
			}		
			System.out.println("1 ~ "+num+"까지의 합 : "+sum);		
			
			// 진행 여부
			System.out.print("한번 더 실행한다.(Y/N) : ");
			ch = (char)System.in.read();
			if(ch != 'Y'&&ch !='y') {
				System.out.println("프로그램을 종료 합니다.");
				break;
			}
			
			System.in.skip(2);		// 엔터 (아스키값 10, 13 삭제)
			
		}
		
	}

}
