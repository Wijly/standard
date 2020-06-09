package com.score1;

import java.util.Scanner;

public class Score {

	int inwon;			//instance 변수
	
	Record[] rec;			//
	
	Scanner sc = new Scanner(System.in);
	String[] title = {" 국어점수 :"," 영어점수 :"," 수학점수 :"};
	
	public void set() {					//기본 셋팅
		
		do {
			System.out.print("인원수를 입력하세요 : ");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		// 배열의 객체 생성
		rec = new Record[inwon];				// 배열안에 Record 타입 클래스 넣기	(name, score,tot,avg,rank)	
	}
	
	public void input() {
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
	
			System.out.print((i+1)+"번째의 이름 : ");
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
				System.out.print((i+1)+"번째 "+title[j]);
				rec[i].score[j] = sc.nextInt();			//국어 영어 수학
				
				rec[i].tot += rec[i].score[j];			//총점
			}
			
			rec[i].avg = rec[i].tot;					//평균
		}
	}
	
	private void ranking() {
		
		int i, j;
		
		for(i = 0; i<inwon; i++) {			//초기화
			rec[i].rank = 1;
		}
		for(i=0; i<inwon-1;i++) {				// 순위구하기
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot) {				//작은값에 rank ++
					rec[j].rank++;
				}else if(rec[i].tot<rec[j].tot) {
					rec[i].rank++;
				}
			}
		}
	}
	public void print() {
	
		ranking();
		for(int i=0;i<inwon;i++) {
			System.out.println();
			System.out.printf("이름 : %s", rec[i].name);		//이름
			
			for(int j=0;j<3;j++) {
				System.out.printf("%s%2d",title[j],rec[i].score[j]);		//국어 영어 수학의 점수
			}
			
			System.out.printf(" 총점수 : %d",rec[i].tot);			//총 점수
			System.out.printf(" 평균 : %d",rec[i].avg);			// 평균
			System.out.printf(" 순위 : %d\n",rec[i].rank);

		}
	}
	
}
