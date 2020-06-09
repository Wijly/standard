package com.score5;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		Score_t ob = new Score_t();

		while(true) {
			
			do {
				System.out.print("입력 (1), 출력 (2), 저장후 종료(3) : ");
				n = sc.nextInt();
			}while(n<1||n>3);
			
			switch(n) {
			case 1 :
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3 :
				ob.writeFile();
				System.exit(0);

			}
		}

	}

}
