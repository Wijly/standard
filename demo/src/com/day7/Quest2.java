package com.day7;

import java.util.Scanner;

class SubQuest2{
	
	Scanner sc = new Scanner(System.in);
	
	int a,b,i;
	int temp;
	
	public void input1() {
		System.out.print("ù��° ������ �Է����ּ���. : ");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ���. : ");
		b = sc.nextInt();
	}
	
	public int sum() {
		
		int result = 0;
		
		if(a>b) {
			for(i=b;i<a;i++) {
				result += i;
			}
		}else if(b>a) {
			for(i=a;i<b;i++) {
				result +=i;
			}
		}	
		return result;
	}
	
	public void print(int value) {
			System.out.println(a+"���� "+b+ "������ ���� "+value);
	}
}

public class Quest2 {

	public static void main(String[] args) {
		
		SubQuest2 sq = new SubQuest2();
		
		sq.input1();
		int result = sq.sum();
		sq.print(result);
		
	}

}
