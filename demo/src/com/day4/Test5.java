package com.day4;

public class Test5 {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		//100������ ��
	
		for(int i = 1;i<=100;i++) 
			sum += i;
		
		System.out.println("��� : "+sum);
		sum=0;
		//Ȧ���� ��
		for(int i = 1; i<=100;i+=2)
			sum +=i;
			
		System.out.println("Ȧ���� �� : "+sum);
		sum=0;
		
		for(int i = 2; i<=100; i+=2)
			sum +=i;
		
		System.out.println("¦���� �� : "+sum);
		sum=0;
		
		for(int i = 0;i<=100; i+=3)
			sum +=i;
		
		System.out.println("3�� ��� �� : "+sum);
		
		
		for(int i=1,num1=0; i<=100;num1+=i,i++);
		
		
	}

}
