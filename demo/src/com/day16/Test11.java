package com.day16;

public class Test11 {

	public static void main(String[] args) {
		
		System.out.println("메인스레드 그룹 : "+Thread.currentThread().getThreadGroup());
		
		System.out.println("메인 : " + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1 스레드 그룹 : "+ Thread.currentThread().getThreadGroup());
		System.out.println("t1 : "+ t1);

		ThreadGroup tg = new ThreadGroup("sh");
		
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
	}

}
