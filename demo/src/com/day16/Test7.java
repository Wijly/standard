package com.day16;

//인터럽트 : 우선순위가 높은 프로그램을 먼저 실행시키고 돌아옴
// 세수 - 밥 - 택배 - 전화 - 밥

class MyThread7	 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			
			try {
				
				sleep(2000);		// 스레드가 2초씩 쉼
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(getName() + " : " + i);
			
			// 현재 스레드를 중지시키고 다음 스레드 시작
			if(next.isAlive())
				next.interrupt();
		}
		
	}

}


public class Test7 {

	public static void main(String[] args) {

		MyThread7 t1 = new MyThread7();
		MyThread7 t2 = new MyThread7();
		MyThread7 t3 = new MyThread7();
		
		t1.setNext(t2);		// t1 다음 t2
		t2.setNext(t3);		// t2 다음 t3
		t3.setNext(t1);		// t3 다음 t1
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();			// t1을 일시정지 시켜서 순서를 일정화되게 맞춤
		
		try {
			
			t1.join();
			t2.join();
			t3.join();			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
