package com.day7;

import java.util.Scanner;

class SubQuest3{
	
	Scanner sc = new Scanner(System.in);
	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	int y,m,d, i , week;
	
	public void input(){
		do {
			System.out.print("���ϴ� ������ �Է��ϼ���. : ");
			y = sc.nextInt();
		}while(y<0);
		do {
			System.out.println("���ϴ� ���� �Է��ϼ���. : ");
			m = sc.nextInt();
		}while(m<1 || m>12);
	}
	public void calcY() {				
		if(y%4==0&&y%100!=0||y%400==0) {
			months[1]=29;
		}
		d = (y-1)*365+((y-1)/4-(y-1)/100+(y-1)/400);	// y-1���� 12�� 31�ϱ����� day��
	}
	public int calcM() {
		for(i=0;i<m-1;i++) {
			d += months[i];
		}
		d +=1;
		week = d%7;
		return week;
	}
	public void print_1() {
		System.out.println("�ش� ���� ���� ��ġ(�迭 0:�Ͽ���~ 6:�����) : " + week);
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("������������������������������");
		for(i = 0;i<week;i++) {				// 1�� ������ ���� ����
			System.out.print("    ");	
		}
	}
	public void print_2(int a) { 
		for(i=1;i<months[m-1];i++) {		// months[m-1] �� ���� : �迭 ������ġ�� ��ĭ �ٸ��� ������ ex 2���� ������ months[1]
			System.out.printf("%4d",i);
			week++;
			if(week%7==0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
	}
}

public class Quest3 {
	public static void main(String[] argc) {
		
		SubQuest3 ob1= new SubQuest3();
		
		ob1.input();
		ob1.calcY();
		ob1.calcM();
		
		
	}
}
