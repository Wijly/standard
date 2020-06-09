package com.day4;

public class Test5 {

	public static void main(String[] args) {
		
		int num,sum=0;
		
		//100까지의 합
	
		for(int i = 1;i<=100;i++) 
			sum += i;
		
		System.out.println("결과 : "+sum);
		sum=0;
		//홀수의 합
		for(int i = 1; i<=100;i+=2)
			sum +=i;
			
		System.out.println("홀수의 합 : "+sum);
		sum=0;
		
		for(int i = 2; i<=100; i+=2)
			sum +=i;
		
		System.out.println("짝수의 합 : "+sum);
		sum=0;
		
		for(int i = 0;i<=100; i+=3)
			sum +=i;
		
		System.out.println("3의 배수 합 : "+sum);
		
		
		for(int i=1,num1=0; i<=100;num1+=i,i++);
		
		
	}

}
