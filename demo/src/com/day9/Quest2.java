package com.day9;

import java.util.Scanner;

class Exam{
	
	int i,j,inwon;
	Quest2_re rec[];
	
	String[] title = {"국어 ? ","영어 ? ","수학 ? "};
	Scanner sc = new Scanner(System.in);
		
	public void set(){					// 인원수 입력
		System.out.print("인원수 : ");
		inwon = sc.nextInt();
		
		rec = new Quest2_re[inwon];
	}
	
	public void inputData() {
		
		for( i=0; i<inwon; i++) {
			rec[i] = new Quest2_re();		// 클래스 배열 생성
			
			System.out.print((i+1)+"번째 이름 : ");
			rec[i].name = sc.next();
			for(j= 0; j<title.length;j++) {
				System.out.print(title[j] +" : ");
				rec[i].score[j] = sc.nextInt();		// 점수 입력
				rec[i].tot += rec[i].score[j];		// 총점수 입력받기
			}
			rec[i].avg = rec[i].tot/3;
		}
	}
	private void partScore() {
		
		for(i=0; i<inwon;i++) {
			for(j=0; j<3;j++) {
				if(rec[i].score[j]>80) { rec[i].as[j] = "(수)";}
				else if(rec[i].score[j]<80 && rec[i].score[j]>60) { rec[i].as[j] = "(우)";}
				else if(rec[i].score[j]<60 && rec[i].score[j]>40) { rec[i].as[j] = "(미)";}
				else if(rec[i].score[j]<40 && rec[i].score[j]>20) { rec[i].as[j] = "(양)";}
				else rec[i].as[j] = "(가)";
			}
		}
		
	}
	public void print() {
		
		partScore();
		
		for(i = 0; i<inwon; i++) {
			System.out.println();
			System.out.printf("이름 : %s", rec[i].name);		//이름
			System.out.println();
			
			for(int j=0;j<3;j++) {
				System.out.printf("%s%2d%s",title[j],rec[i].score[j],rec[i].as[j]);		//국어 영어 수학의 점수
			}
			System.out.printf(" 총점수 : %d",rec[i].tot);			//총 점수
			System.out.printf(" 평균 : %d",rec[i].avg);			// 평균
			System.out.println();
		}
	}
}

