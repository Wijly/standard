package com.day6;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 10���̳��� �̸��� ������ �Է¹޾�
		// ������ ���� ��� ������ ���� ( �������� )

		Scanner sc = new Scanner(System.in);
		
		int score[];
		String name[];
		
		int i,j,inwon,t1;
		String t2;
		
		do {
			System.out.print("�ο����� �Է����ּ���. : ");
			inwon = sc.nextInt();
		}while(inwon<0 || inwon>10);
		
		
		// �迭�� �޸� �Ҵ�(��ü����)
		score = new int[inwon];
		name = new String[inwon];
		
		for(i=0;i<inwon;i++) {
			
			System.out.print((i+1)+"��° �̸��� �Է��ϼ��� : ");
			name[i]=sc.next();
			
			System.out.print("������ �Է��ϼ��� : ");
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
			System.out.printf("�̸� :%3s, ���� :%3d\n",name[i],score[i]);
		
		}
		
		
	}

}
