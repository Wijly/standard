package com.day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class IClock implements Runnable{

//	SimpleDateFormat simple_format = new SimpleDateFormat("yyyy-MM-dd , HH시mm분ss초");
//	Calendar time = Calendar.getInstance();
//	String get_time = simple_format.format(time.getTime());
	
	@Override
	public void run() {
		
		while(true) {
			System.out.printf("%1$tF %1$tT\n",Calendar.getInstance());
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}

}




public class Test3 {

	public static void main(String[] args) {
		
		// 현재 시스템의 날짜와 시간을 1초에 한번씩 출력
		
		Thread t1 = new Thread(new IClock());
		
		t1.start();

	}

}
