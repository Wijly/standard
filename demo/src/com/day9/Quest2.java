package com.day9;

import java.util.Scanner;

class Exam{
	
	int i,j,inwon;
	Quest2_re rec[];
	
	String[] title = {"���� ? ","���� ? ","���� ? "};
	Scanner sc = new Scanner(System.in);
		
	public void set(){					// �ο��� �Է�
		System.out.print("�ο��� : ");
		inwon = sc.nextInt();
		
		rec = new Quest2_re[inwon];
	}
	
	public void inputData() {
		
		for( i=0; i<inwon; i++) {
			rec[i] = new Quest2_re();		// Ŭ���� �迭 ����
			
			System.out.print((i+1)+"��° �̸� : ");
			rec[i].name = sc.next();
			for(j= 0; j<title.length;j++) {
				System.out.print(title[j] +" : ");
				rec[i].score[j] = sc.nextInt();		// ���� �Է�
				rec[i].tot += rec[i].score[j];		// ������ �Է¹ޱ�
			}
			rec[i].avg = rec[i].tot/3;
		}
	}
	private void partScore() {
		
		for(i=0; i<inwon;i++) {
			for(j=0; j<3;j++) {
				if(rec[i].score[j]>80) { rec[i].as[j] = "(��)";}
				else if(rec[i].score[j]<80 && rec[i].score[j]>60) { rec[i].as[j] = "(��)";}
				else if(rec[i].score[j]<60 && rec[i].score[j]>40) { rec[i].as[j] = "(��)";}
				else if(rec[i].score[j]<40 && rec[i].score[j]>20) { rec[i].as[j] = "(��)";}
				else rec[i].as[j] = "(��)";
			}
		}
		
	}
	public void print() {
		
		partScore();
		
		for(i = 0; i<inwon; i++) {
			System.out.println();
			System.out.printf("�̸� : %s", rec[i].name);		//�̸�
			System.out.println();
			
			for(int j=0;j<3;j++) {
				System.out.printf("%s%2d%s",title[j],rec[i].score[j],rec[i].as[j]);		//���� ���� ������ ����
			}
			System.out.printf(" ������ : %d",rec[i].tot);			//�� ����
			System.out.printf(" ��� : %d",rec[i].avg);			// ���
			System.out.println();
		}
	}
}

