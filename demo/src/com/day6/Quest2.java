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
				System.out.printf("������ �Է��ϼ���.(%d��° ��ȸ) : ",cnt);
				a= sc.nextInt();
				if(a != num) {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					cnt++;
				}else if( a == num ){
					System.out.println("�����Դϴ�!");
					break;
				}else {
					System.out.println("��ȿ���� ���� ���Դϴ�. (1~10)�� ���� �Է����ּ���");
				}
				if(cnt>3) {
					break;
				}
			}
			System.out.printf("������ %d�Դϴ�.\n",num);
			
			System.out.print("����Ͻðڽ��ϱ�? (Y/N) : ");
			user = sc.next();
			
			if(user.equals("N")||user.equals("n")) {
				System.out.println("�����մϴ�.");
				break;
			}else if(user.equals("Y")||user.equals("y")){
				continue;
			}else
				System.out.println("�߸��� ���Դϴ�. �ѹ� �� �����մϴ�.");
			
			System.out.println("��������������������������������������������������");
		}
	}
}
