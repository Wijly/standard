package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���. : ");
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println("num"+i+"��°�ڸ� �Էµ� �� : "+ num[i]+"\t");
		}
		
		System.out.println("num4 - num0 : "+(num[4]-num[0]));
		
//		
//		int num[] = new int[5];
//		
//		for(int i = 0; i<num.length;i++) {
//			num[i] += (i+1)*10;
//		}
//		for(int i = 0;i<5;i++){
//			System.out.println("num["+i+"] : "+num[i]);
//		}
//		
	}

}

/*
 * 
 * �ڷ��� boolean : 1byte (True / False)
 * 
 * ������ byte : 1byte -128 ~ 127 short : 2byte int : 4byte long : 8byte
 * 
 * �Ǽ��� ( �ڹٴ� �Ҽ��� ������ ����� �ν�) float :4byte(������, 3.14f) double :8byte(������, 3.14)
 * 
 * char : 2byte(URF-16, �����ڵ�) 'a'
 * 
 * [������] ��������� +,-,*,/,%,++,--
 * 
 * ������ ������ >, <, >=, <=, : (True/ False)
 * 
 * ������� ==, !=
 * 
 * �������� &&(AND), ||(OR), !(not)
 * 
 * ��Ʈ������ &, |, ^, ~, >>, <<, >>>
 * 
 * ���׿����� ����?(���϶��� ��):(�����϶��� ��)
 * 
 * ���Կ����� =, +=, -=, *=, /=
 * 
 * --------------------------------------------
 * 
 * int a = 10; float b; b=a; // b = 10.0 - �Ͻ��� ����ȯ b=(float)a; // -�����(����) ����ȯ
 * 
 * if(���ǹ�){ �۾� } if(���ǹ�){ �۾� }else{ �۾� }
 * 
 * while(���ǹ�){ �۾� }
 * 
 * do{ �۾� }while(����);
 * 
 * while(true){ //���ѷ��� �۾� }
 * 
 */