package com.day6;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 10�� �̳��� ����̸��� ������ �Է¹޾�
		// �������ؼ� ����ϱ�

		Scanner sc = new Scanner(System.in);
		
		String name[] ;
		int score[];
		int rank[];
		
		int inwon,i,j;
		
		do {
			System.out.print("�ο� ���� �Է��ϼ���. : ");
			inwon = sc.nextInt();
		}while(inwon<0 || inwon>10);
		
		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];
		
		for(i=0;i<inwon; i++) {
			System.out.print((i+1)+"��° �̸� : ");
			name[i] = sc.next();
			
			System.out.print((i+1)+"�� ���� : " );
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
			System.out.printf("%6s�� ���� : %d, ���� : %d��\n",name[i],score[i],rank[i]+1);
		}
				
	}

}
