package com.day7;

import java.util.Random;
import java.util.Scanner;

class Rock {
	
	int su, com;
	String str [] = {"����","����","��"};
	String a;
	
	public void user() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1: ����, 2:����, 3: �� = ");
		su = sc.nextInt()-1;		
	}
	
	public void rand() {
		
		Random rd = new Random();
		com = rd.nextInt(3);
	}
	
	public String result() {
		
		if(com==su) { 
			a = "�����ϴ�";
		}else if((su+2)%3==com) 
			a = "����� �̰���ϴ�.";
		else
			a = "��ǻ�Ͱ� �̰���ϴ�.";
		
		return a;
	}
	
	public void print(String b) {
		System.out.println(b);
	}
}

public class Quest1 {

	public static void main(String[] args) {
		
		Rock rk = new Rock();
		
		rk.user();
		rk.rand();
		String str = rk.result();
		rk.print(str);
	}

}
