package com.day16;


//Thread 클래스
class MyThread1 extends Thread{
	
	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;	
	}

	@Override
	public void run() {			// java의 VM(버츄얼 머신)이 호출
		
		int i = 0;
		
		while(i<num) {
			
			System.out.println(this.getName() + " : " + name + i);
			i++;
			
			
			// try-catch 문이 있어야 멀티스레드가 진행된다.
			try {
				
				sleep(10);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	

}

public class Test1 {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1(100, "첫번째");
		MyThread1 t2 = new MyThread1(222, "두번째");
		
		// 스레드 실행 
		t1.start();
		t2.start();
		
		System.out.println("main문 종료됨 ");
		
	}

}
