package com.day8.bank;

import java.util.Scanner;

public class Bankbook {

	public static void main(String[] args) {
		
		Calc ob = new Calc();
		
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println();
		while(true) {
			
			System.out.print("1.���� ����, 2. �Ա�, 3. ���, 4. ���¸�� 5. ������ : ");
			input = sc.nextInt();
			
			switch(input) {
				case 1: ob.set();
						ob.createAccount();
						break;
						
				case 2: ob.inputWon();
						break;
				case 3:
				case 4:	ob.viewAccount();
						break;
						
				case 5: break;
				
			}
				
		}

	}

}
