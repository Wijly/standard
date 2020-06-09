package com.day7;

import java.util.Random;
import java.util.Scanner;

class Rock {
	
	int su, com;
	String str [] = {"가위","바위","보"};
	String a;
	
	public void user() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1: 가위, 2:바위, 3: 보 = ");
		su = sc.nextInt()-1;		
	}
	
	public void rand() {
		
		Random rd = new Random();
		com = rd.nextInt(3);
	}
	
	public String result() {
		
		if(com==su) { 
			a = "비겼습니다";
		}else if((su+2)%3==com) 
			a = "당신이 이겼습니다.";
		else
			a = "컴퓨터가 이겼습니다.";
		
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
