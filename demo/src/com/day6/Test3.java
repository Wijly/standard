package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10명 이내의 사람이름과 정수를 입력받아
		// 석차구해서 출력하기

		Scanner sc = new Scanner(System.in);
		
		String name[] ;
		int score[];
		int rank[];
		
		int inwon,i,j;
		
		do {
			System.out.print("인원 수를 입력하세요. : ");
			inwon = sc.nextInt();
		}while(inwon<0 || inwon>10);
		
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i=0;i<inwon; i++) {
			System.out.print((i+1)+"번째 이름 : ");
			name[i] = sc.next();
			
			System.out.print((i+1)+"의 점수 : " );
			score[i] = sc.nextInt();
		
		}
		
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				if(score[i]<score[j]) {
					rank[i] +=1;
				}else if(score[i]>score[j])
					rank[j] +=1;
			}
		}
		
		
		for(i=0;i<inwon;i++) {
			System.out.printf("%6s의 점수 : %d, 순위 : %d등\n",name[i],score[i],rank[i]+1);
		}
				
	}

}
