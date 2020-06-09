package com.day2;

public class study1 { //배열

	public static void main(String[] args) {
		//EX1
		/*
		int sum = 0;
		int score [] = {1 , 10, 100, 1000, 10000};
		
		for ( int i = 0; i<score.length;i++) {
			sum += score[i];
		}
		System.out.printf("총점 : "+ sum);
		*/
		//EX2
		/*
		int number [] = new int [10];
		
		for ( int i=0; i<number.length; i++) {
			System.out.print(number[i]=i);
		}
		System.out.println();
		
		for (int i = 0; i<100; i++) {
			int n =(int)(Math.random()*10);
			int tempt = number[0];
			number[0]= number[n];
			number[n]= tempt;
		}
		for(int i =0; i < number.length; i++) {
			System.out.print(number[i]);
		}
		*/
		// 다차원배열 달팽이
		int dal[][]=new int [5][5];
		int n;//달팽이 차수
		
		int a,b; //a는 행, b는 열
		int k = 0; //감소되는 변수
		int i=1;	//달팽이 값
		
		for(n=5; n>0; n-=2) {	//달팽이 차수에 따라 몇번 반복할지
			for(b=0; b<n; b++) {
				dal[k][k+b]=i;
				i++;
			}
			for(a=1;a<n;a++) {
				dal[k+a][5-k-1]=i;
				i++;
			}
			for(b=1;b<n;n++) {
				dal[k+a-1][5-k-b-1]=i;
				i++;
			}
			for(b=1;b<n-1;n++) {
				dal[5-k-b-1][k]=i;
				i++;
			}
			k++;
		}
		for(a=0;a<5;a++) {
			for(b=0;b<5;b++) {
				System.out.print("%d"+dal[a][b]);
			}
			System.out.println();
		}
		
	}

}
