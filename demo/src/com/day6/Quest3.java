package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Quest3 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int user1;
		int com;
		int cnt =0;
		int vs=0;

		
		String comPosition[] = {"����","����","��"};
		
		while(true) {
			
			com = rd.nextInt(3);
			vs++;
			System.out.print("1:����, 2:����, 3:�� : ");
			user1 = sc.nextInt();
			user1 -= 1;
			System.out.println("��ǻ�� : "+comPosition[com]+ " ��� : "+comPosition[user1]);

			
			if(user1==0 && com==1 || user1==1 && com==2 || user1==2 && com==1) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");

			} else if(user1==com) {
				System.out.println("�����ϴ�.");

			}else {
				System.out.println("����ڰ� �̰���ϴ�.");
				cnt++;
			}
			System.out.printf("����Ƚ�� : %d, �̱�Ƚ�� : %d \n",vs,cnt);
			System.out.println();
		}
	}

}
