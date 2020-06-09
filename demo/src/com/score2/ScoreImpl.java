package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score{
	
	Record[] rec;
	Scanner sc = new Scanner(System.in);
	int i;
	int inwon;
	
	
	@Override
	public void set() {
		do {
		System.out.print("인원을 입력하세요. : ");
		inwon= sc.nextInt();
		rec = new Record[inwon];
		}while(inwon<0);
	}

	@Override
	public void input() {
		for(i = 0; i<rec.length; i++) {
			
			rec[i] = new Record();
			
			System.out.print((i+1)+"번째 학번, 이름, 국어점수, 영어점수, 수학점수를 입력하세요. : ");
			rec[i].grade = sc.next();
			rec[i].name = sc.next();
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = (rec[i].kor) + (rec[i].eng) + (rec[i].mat);
			rec[i].avg = (rec[i].tot)/3;
		}
		
	}
	private String result(int num) {
		String part = "";
		
		switch(num/10) {
		case 10:
		case 9 : part = "수";break;
		case 8 : part = "우";break;
		case 7 : part = "미";break;
		case 6 : part = "양";break;
		default : part = "가";
		}
		
		return part;
	}
	

	@Override
	public void print() {
		// 123 kim, 50 50 50 150합 50평균
		for(i=0;i<inwon;i++) {
			System.out.print(i+1+"번째 학번 : "+rec[i].grade);
			System.out.println(", 이름 : "+rec[i].name);
			System.out.println("국어점수 : "+rec[i].kor +" "+ result(rec[i].kor));
			System.out.println("영어점수 : "+rec[i].eng +" "+ result(rec[i].eng));
			System.out.println("수학점수 : "+rec[i].mat +" "+result(rec[i].mat));
			System.out.println("총점수 : "+rec[i].tot + "평균 : "+ rec[i].avg);
			System.out.println();
		}
	}

}
