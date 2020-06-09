package com.day8.bank;

import java.util.Random;
import java.util.Scanner;

// 1.���¸���� 2.�Ա� 3.��� 4.��ȸ
// (��ϵ� ���°� �����ϴ�.) ��ȸ - �̸�, ���¹�ȣ, ��й�ȣ �Է� - ������ ���� �ݾ� ���
// ���¸���� = �ֹε�Ϲ�ȣ Ȯ��, �̸��Է� - ������ȣ 15�ڸ� - ��й�ȣ �Է� �� ���-

public class Calc {
	
	int input;
	static int count=0; 			// Ŭ���� �迭, +1���ϸ鼭 �߰��ϱ�
	int i,j;				//for���� �� ���� ����
	int succ = 0;
	
	Record[] rec= new Record[100];
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {										// �ֹε�Ϲ�ȣ Ȯ��
		
		int t,temp;
		int[] chk = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};		// �ֹι�ȣ üũ
						
		System.out.print("�ֹι�ȣ 13�ڸ��� �Է��ϼ��� (xxxxxx-xxxxxxx): ");
		String userNum = sc.next();
		
		if(userNum.length()!=14){
			System.out.println("�ֹι�ȣ �Է� ���� ");
			return;		// stop �� �ǹ�
		}
		
		t = 0;
		
		for(i=0; i<12; i++) {	// ��ȣ�� �������ڸ��� �� 12�ڸ�
			
			if(i>=6) 			// �ֹι�ȣ ���ڸ�
				t += chk[i]*Integer.parseInt(userNum.substring(i+1,i+2));
			
			else				// ������� ��
				t += chk[i]*Integer.parseInt(userNum.substring(i,i+1));
		}
		
		temp = 11-t%11;
		temp = temp%10;
		
		if(temp==Integer.parseInt(userNum.substring(13))) {
			System.out.println("��Ȯ�� �ֹι�ȣ�Դϴ�.");
		}else
			System.out.println("��Ȯ�� �ֹι�ȣ�� �ƴմϴ�.");
	}
	
	public void createAccount() {								// ���� ����
		
		String name;
		
		rec[count] = new Record();
		
		Random rd = new Random();
		
		System.out.print("�̸��� �Է����ּ���. : ");
		rec[count].name = sc.next();
		System.out.print("����Ͻ� ��й�ȣ�� �Է����ּ���. : ");
		rec[count].pass = sc.nextInt();
		System.out.println("���¸� �Է����ּ���. :");
		rec[count].account = sc.nextInt();
		rec[count].won = 0;							// ����ڰ� �����ݾ��� 0���� �ʱ�ȭ.
		System.out.println(rec[count].account +"�� ���°� �����Ǿ����ϴ�. ");
		
		count ++;
		
	}
	
	private int passwordCheck(int account,int pass) {
		
		for(i=0;i<count;i++) {
			if(account == rec[i].account && pass == rec[i].pass) {
				System.out.println("���°� Ȯ�εǾ����ϴ�. ");
				succ = 1;
			}else {
				System.out.println("���� Ȥ�� ��й�ȣ�� Ȯ�����ֽʽÿ�.");
				succ = 0;

			}
		}
		return succ;
		
	}
	
	public void inputWon(){
		
		int account ,pass, money;				// Ȯ���� ������ ��й�ȣ, ���� ��
		
		while(true) {
			System.out.print("���¹�ȣ�� �Է����ּ���. : ");
			account = sc.nextInt();
			System.out.print("��й�ȣ�� �Է����ּ���. : ");
			pass = sc.nextInt();
			passwordCheck(account, pass);
			
			if(succ == 1) {
				System.out.print("�Ա��Ͻ� �ݾ��� �����ּ���. : ");
				money = sc.nextInt();
				for(i=0;i<count;i++) {
					if(account == rec[i].account)
						rec[i].won += money;
				}
				break;
			}else if(succ == 0){
				System.out.println("���� Ȥ�� ��й�ȣ�� Ȯ�����ּ���. ");
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
				break;
			}
		}
	}
	
	public void viewUser(int a) {
		
	}
	
	public void viewAccount() {								// ���� ��� �����ֱ�
		for(i=0;i<count;count++) {
			System.out.printf("%s,%3d,%2d,%2d\n",rec[i].name, rec[i].account,rec[i].pass,rec[i].won );
		}
	}
	

}
