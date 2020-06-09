package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1, num2;
	private char oper;
	
	public boolean input() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 수를 입력하세요 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요.(+,-,*,/) : ");
		oper = (char)System.in.read();
		
		if(oper !='+' && oper !='-' && oper!='*' && oper!='/') {
			return false;
		}
		return true;
	}
	
	public int result() {
		int r = 0;
		switch(oper) {
		case '+' :
			r= num1+num2; break;
		case '-' :
			r= num1-num2; break;
		case '*' :
			r= num1*num2; break;
		case '/' :
			r= num1/num2; break;
		}
		return r;
	}
	public void print(int r) {
		System.out.printf("%d %c %d = %d\n",num1,oper,num2,r);
	}
}


public class Test7 {

	public static void main(String[] args) throws IOException {
		
		Calc ob = new Calc();
		
		// true = 제대로 입력, false = 잘못입력
//		boolean b = ob.input();
		if (!ob.input()) {			// boolean값으로 받으므로 바로 if문에 때려넣음
			//false값을 if문 안에 넣는다 
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		int r = ob.result();
		ob.print(r);		
		
	}

}
