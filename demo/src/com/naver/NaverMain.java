package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();
		
		int sel;


		while(true) {
			System.out.print("1)�����, 2)��ü ���, 3)���̵� ����Ȯ��, 4)����, 5) ��й�ȣ ����, 6)���� : ");
			sel = sc.nextInt();
			switch(sel) {
			case 1: ob.input();break;
			case 2: ob.print();break;
			case 3: ob.searchID(); break;
			case 4: ob.delectID();break;
			case 5: ob.updateId();break;
			default :
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		}

	}

}
