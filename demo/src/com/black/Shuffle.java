package com.black;

import java.io.FileInputStream;

// 카드섞기 스레드

class Shuffle1 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			
			try {
			
				sleep(5000);		
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				
				FileInputStream fis = new FileInputStream( "D:\\java\\work\\demo\\src\\com\\black\\1.txt");
				int image;
				
				while((image = fis.read())!=-1) {
					System.out.write(image);
					System.out.flush();
				}
				fis.close();	
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println();
			System.out.println();
			if(next.isAlive())
				next.interrupt();
		}
	}
}

class Shuffle2 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			
			try {

				sleep(5000);				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				
				FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\2.txt");
				int image;
				
				while((image = fis.read())!=-1) {
					System.out.write(image);
					System.out.flush();
				}
				fis.close();	
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println();
			System.out.println();
			if(next.isAlive())
				next.interrupt();
		}
	}
}

class Shuffle3 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			
			try {		
				sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				
				FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\3.txt");
				int image;
				
				while((image = fis.read())!=-1) {
					System.out.write(image);
					System.out.flush();
				}
				fis.close();					
				sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println();
			System.out.println();
			if(next.isAlive())
				next.interrupt();
		}
	}
}

// 카드 셔플 프린트
class Shuffle{
	
	public void suffle() {
		
		Shuffle1 t1 = new Shuffle1();
		Shuffle2 t2 = new Shuffle2();
		Shuffle3 t3 = new Shuffle3();
		
		t1.setNext(t2);
		t2.setNext(t3);
		t3.setNext(t1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		}catch(Exception e) {
			
		}
	}
}
