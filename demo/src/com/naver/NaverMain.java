package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();
		
		int sel;


		while(true) {
			System.out.print("1)만들기, 2)전체 출력, 3)아이디 정보확인, 4)삭제, 5) 비밀번호 변경, 6)종료 : ");
			sel = sc.nextInt();
			switch(sel) {
			case 1: ob.input();break;
			case 2: ob.print();break;
			case 3: ob.searchID(); break;
			case 4: ob.delectID();break;
			case 5: ob.updateId();break;
			default :
				System.out.println("종료합니다");
				System.exit(0);
			}
		}

	}

}
