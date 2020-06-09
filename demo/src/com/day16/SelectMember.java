package com.day16;

import java.util.Random;
import java.util.Scanner;


class RandomThread implements Runnable{
	
	private int num;
	
	public RandomThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		
		System.out.print("�����");
		for(int i=0; i<num; i++) {
			
			System.out.print(".");
			
			try {
				Thread.sleep(250);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println();
	}

}

public class SelectMember{
	
	private static String[] name = 
		{"�ڼ���","õȫö","���ؼ�","����","���ÿ�",
		"ä����","������","������","������","������",
		"������","�����","������","������","����ȣ",
		"������","������","�̻���","�ֺ���","������",
		"�輼��","�缭��","����","�ֿ���","���¾�",
		"����ȯ","�̰ǿ�"};
	
	private final static int nameEa = name.length;
	
	public void randomOper(int num) {
			
		Random rd = new Random();
		int rand=0;
		int cnt=1;
		
		while(num>0)			{
			
			rand = rd.nextInt(nameEa); 

			for(int i = 0; i<nameEa;i++) {

				if(name[rand] == name[i]) {
					System.out.println(cnt +"��° ��ǥ�� : " +name[i]);
					cnt++;
				}
			}
			num--;
		}
	}
	
	public static void main(String[] args) {
		
		SelectMember sm = new SelectMember();
		
		Scanner sc = new Scanner(System.in);		
		Thread ob1;
		
		int num;
			do {
			System.out.print("��ǥ�� �ο��� : ");
			num = sc.nextInt();
			}while(num<1||num>nameEa);
		ob1 = new Thread(new RandomThread(num));
		
		ob1.setDaemon(true);
		ob1.start();
		
		try {
		
			ob1.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		sm.randomOper(num);
			
	}


}