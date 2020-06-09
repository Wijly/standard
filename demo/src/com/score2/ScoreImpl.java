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
		System.out.print("�ο��� �Է��ϼ���. : ");
		inwon= sc.nextInt();
		rec = new Record[inwon];
		}while(inwon<0);
	}

	@Override
	public void input() {
		for(i = 0; i<rec.length; i++) {
			
			rec[i] = new Record();
			
			System.out.print((i+1)+"��° �й�, �̸�, ��������, ��������, ���������� �Է��ϼ���. : ");
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
		case 9 : part = "��";break;
		case 8 : part = "��";break;
		case 7 : part = "��";break;
		case 6 : part = "��";break;
		default : part = "��";
		}
		
		return part;
	}
	

	@Override
	public void print() {
		// 123 kim, 50 50 50 150�� 50���
		for(i=0;i<inwon;i++) {
			System.out.print(i+1+"��° �й� : "+rec[i].grade);
			System.out.println(", �̸� : "+rec[i].name);
			System.out.println("�������� : "+rec[i].kor +" "+ result(rec[i].kor));
			System.out.println("�������� : "+rec[i].eng +" "+ result(rec[i].eng));
			System.out.println("�������� : "+rec[i].mat +" "+result(rec[i].mat));
			System.out.println("������ : "+rec[i].tot + "��� : "+ rec[i].avg);
			System.out.println();
		}
	}

}
