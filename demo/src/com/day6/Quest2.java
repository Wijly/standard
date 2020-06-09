package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int	cnt;
		int num,a;
		String user= "";
		
		while(true) {
			
			cnt=1;
			num = rd.nextInt(10)+1;

			while(true) {
				System.out.printf("정수를 입력하세요.(%d번째 기회) : ",cnt);
				a= sc.nextInt();
				if(a != num) {
					System.out.println("틀렸습니다.");
					cnt++;
				}else if( a == num ){
					System.out.println("정답입니다!");
					break;
				}else {
					System.out.println("유효하지 않은 값입니다. (1~10)의 수를 입력해주세요");
				}
				if(cnt>3) {
					break;
				}
			}
			System.out.printf("정답은 %d입니다.\n",num);
			
			System.out.print("계속하시겠습니까? (Y/N) : ");
			user = sc.next();
			
			if(user.equals("N")||user.equals("n")) {
				System.out.println("종료합니다.");
				break;
			}else if(user.equals("Y")||user.equals("y")){
				continue;
			}else
				System.out.println("잘못된 값입니다. 한번 더 실행합니다.");
			
			System.out.println("─────────────────────────");
		}
	}
}
