package com.day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class IClock implements Runnable{

//	SimpleDateFormat simple_format = new SimpleDateFormat("yyyy-MM-dd , HH��mm��ss��");
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
		
		// ���� �ý����� ��¥�� �ð��� 1�ʿ� �ѹ��� ���
		
		Thread t1 = new Thread(new IClock());
		
		t1.start();

	}

}
