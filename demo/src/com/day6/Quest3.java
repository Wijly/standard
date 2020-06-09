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

		
		String comPosition[] = {"가위","바위","보"};
		
		while(true) {
			
			com = rd.nextInt(3);
			vs++;
			System.out.print("1:가위, 2:바위, 3:보 : ");
			user1 = sc.nextInt();
			user1 -= 1;
			System.out.println("컴퓨터 : "+comPosition[com]+ " 사람 : "+comPosition[user1]);

			
			if(user1==0 && com==1 || user1==1 && com==2 || user1==2 && com==1) {
				System.out.println("컴퓨터가 이겼습니다.");

			} else if(user1==com) {
				System.out.println("비겼습니다.");

			}else {
				System.out.println("사용자가 이겼습니다.");
				cnt++;
			}
			System.out.printf("게임횟수 : %d, 이긴횟수 : %d \n",vs,cnt);
			System.out.println();
		}
	}

}
