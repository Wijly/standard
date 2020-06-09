package com.day16;

class MyThread6 extends Thread{
	
	@Override
	public void run() {
		
		try {
			
			System.out.println("스레드 시작");
			
			System.out.println("우선순위 : "+getPriority());
			System.out.println("스레드의 이름 : "+getName());
			
			sleep(500);
			
			//우선순위 변경
			setPriority(2);
			System.out.println("변경된 우선순위 : "+getPriority());
			
			System.out.println("스레드 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();		// main 문 = main문도 스레드
		Thread t2 = new MyThread6();				// Thread-0
		
		System.out.println("main 스레드 우선순위 : " + t1.getPriority());
		System.out.println("main 스레드 이름 : "+t1.getName());
		System.out.println("스레드 시작전 t2 : "+t2.isAlive());		// 살아있으면 true , 없으면 false
		
		try {
		
			t2.start();
			System.out.println("스레드 시작후 t2 생존여부 : " +t2.isAlive());		// 살아있으면 true
			System.out.println("t2의 우선순위 : "+t2.getPriority());
			
			t2.setPriority(1);
			
			Thread.sleep(100);		// main문 1초 쉼 , t2 스레드 실행
			System.out.println("0.1초쉬고 t2 생존여부 : " +t2.isAlive());		// 살아있으면 true
			
			Thread.sleep(1000);
			
			System.out.println("1초쉬고 t2 생존여부 : " +t2.isAlive());		// 살아있으면 true
			
			t2.join();		// t2가 끝날때까지 main문을 끝내지않음
			
			System.out.println("t2 생존여부 : "+t2.isAlive());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
