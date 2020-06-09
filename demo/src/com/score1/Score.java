package com.score1;

import java.util.Scanner;

public class Score {

	int inwon;			//instance ����
	
	Record[] rec;			//
	
	Scanner sc = new Scanner(System.in);
	String[] title = {" �������� :"," �������� :"," �������� :"};
	
	public void set() {					//�⺻ ����
		
		do {
			System.out.print("�ο����� �Է��ϼ��� : ");
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		// �迭�� ��ü ����
		rec = new Record[inwon];				// �迭�ȿ� Record Ÿ�� Ŭ���� �ֱ�	(name, score,tot,avg,rank)	
	}
	
	public void input() {
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
	
			System.out.print((i+1)+"��°�� �̸� : ");
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
				System.out.print((i+1)+"��° "+title[j]);
				rec[i].score[j] = sc.nextInt();			//���� ���� ����
				
				rec[i].tot += rec[i].score[j];			//����
			}
			
			rec[i].avg = rec[i].tot;					//���
		}
	}
	
	private void ranking() {
		
		int i, j;
		
		for(i = 0; i<inwon; i++) {			//�ʱ�ȭ
			rec[i].rank = 1;
		}
		for(i=0; i<inwon-1;i++) {				// �������ϱ�
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot) {				//�������� rank ++
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
			System.out.printf("�̸� : %s", rec[i].name);		//�̸�
			
			for(int j=0;j<3;j++) {
				System.out.printf("%s%2d",title[j],rec[i].score[j]);		//���� ���� ������ ����
			}
			
			System.out.printf(" ������ : %d",rec[i].tot);			//�� ����
			System.out.printf(" ��� : %d",rec[i].avg);			// ���
			System.out.printf(" ���� : %d\n",rec[i].rank);

		}
	}
	
}
