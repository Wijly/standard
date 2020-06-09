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
		
		System.out.print("고민중");
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
		{"박서연","천홍철","이준성","경기민","성시연",
		"채종완","이혜경","차종민","김진수","전정민",
		"김현아","김원아","위준형","임현재","서혁호",
		"서예지","원도현","이상훈","최보경","신지예",
		"김세이","양서윤","김희연","최원식","정태양",
		"임충환","이건우"};
	
	private final static int nameEa = name.length;
	
	public void randomOper(int num) {
			
		Random rd = new Random();
		int rand=0;
		int cnt=1;
		
		while(num>0)			{
			
			rand = rd.nextInt(nameEa); 

			for(int i = 0; i<nameEa;i++) {

				if(name[rand] == name[i]) {
					System.out.println(cnt +"번째 발표자 : " +name[i]);
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
			System.out.print("발표자 인원수 : ");
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