package com.day9;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1, num2;
	private char oper;
	
	public boolean input() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ���� �Է��ϼ��� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���.(+,-,*,/) : ");
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
		
		// true = ����� �Է�, false = �߸��Է�
//		boolean b = ob.input();
		if (!ob.input()) {			// boolean������ �����Ƿ� �ٷ� if���� ��������
			//false���� if�� �ȿ� �ִ´� 
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		int r = ob.result();
		ob.print(r);		
		
	}

}
