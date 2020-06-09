package com.score3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();			// 자식의 객체를 생성해서 부모로 업캐스팅
		
		int ch;			// 선택하는 변수
		
		while(true) {
			do {
				System.out.print("1.입력, 2.출력, 3.학번검색, 4.이름검색, 5.총점 내림차순정렬, 6.학번 오름차순 정렬, 7. 종료 : ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
			case 1 :
				ob.input();break;
			case 2 :
				ob.print();break;
			case 3 :
				ob.searchHak();break;
			case 4 :
				ob.searchName();break;
			case 5 :
				ob.descSortTot();break;
			case 6 :
				ob.ascSortHak();break;
			default :
				System.out.println("종료합니다.");
				System.exit(0);		// 자바를 종료하는 exit 메소드
			}
		}	
	}
}
