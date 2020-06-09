package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10명이내의 이름과 점수를 입력받아
		// 점수가 높은 사람 순으로 정렬 ( 내림차순 )

		Scanner sc = new Scanner(System.in);
		
		int score[];
		String name[];
		
		int i,j,inwon,t1;
		String t2;
		
		do {
			System.out.print("인원수를 입력해주세요. : ");
			inwon = sc.nextInt();
		}while(inwon<0 || inwon>10);
		
		
		// 배열의 메모리 할당(객체생성)
		score = new int[inwon];
		name = new String[inwon];
		
		for(i=0;i<inwon;i++) {
			
			System.out.print((i+1)+"번째 이름을 입력하세요 : ");
			name[i]=sc.next();
			
			System.out.print("점수를 입력하세요 : ");
			score[i]=sc.nextInt();			
		}
		
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(score[i]>score[j]) {
					
					t1=score[i];
					score[i]=score[j];
					score[j]=t1;
					
					t2=name[i];
					name[i]=name[j];
					name[j]=t2;
					
				}
				
			}
		}
		
		
		for(i=0;i<inwon;i++) {
			System.out.printf("이름 :%3s, 점수 :%3d\n",name[i],score[i]);
		
		}
		
		
	}

}
