package com.day16;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

// 정해진 시간마다 특정 작업을 할 때

public class Test10 extends Thread{
	
	private int num = 1;
	
	public Test10() {
		
		TimerTask task = new TimerTask() {

			@Override
			public void run() {			// 이 것을 task에 넣어놈
				// 반복 실행할 작업
				num = 1;
				
			}		
		};
		
		Timer t = new Timer();
		
		Calendar d = Calendar.getInstance();
		
//		// 내일 0시 0분 0초부터 하루에 한번씩
//		d.add(Calendar.DATE,1);		// 하루 후
//		d.set(Calendar.HOUR, 0);	// 오후 1시 : 13
//		d.set(Calendar.MINUTE, 0);
//		d.set(Calendar.SECOND, 0);
//		d.set(Calendar.MILLISECOND, 0);
//		
//		t.schedule(task, d.getTime(),1000*60*60*24); 		// 밀리세건 *초 * 분*시
		
		
		t.schedule(task, d.getTime(),5000); 		// 5초마다 실행
	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println(num++);
			
			try {
				sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
		
	}

	public static void main(String[] args) {
		
		new Test10().start();

	}

}
