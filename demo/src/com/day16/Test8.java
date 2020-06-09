package com.day16;

class MyThread8 implements Runnable{

	private int bank = 10000;
	
	private int getBank() {			// 잔액
		return bank;
	}
	
	private int drawMoney(int m) {		// 출금
		bank -= m;
		return m;	
	}
	
	@Override
	public void run() {
		
		int money_need = 6000;
		int money;
		String msg = "";
		
		try {
			
			// 동기화 블럭
			// 스레드가 하나 나오기전까지는 절대들어가지 않는다.
			synchronized (this) {
				
				if(getBank()>=money_need) {
					
					Thread.yield();
					
					money = drawMoney(money_need);
					msg = "인출 성공";
				}else {
					money = 0;
					msg = "인출 실패";
				}
				
			}
			
			System.out.println(Thread.currentThread().getName() + msg +", 인출금액 : "+money+", 잔고 : "+getBank() );
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

public class Test8 {

	public static void main(String[] args) {
		
		MyThread8 ob = new MyThread8();
		
//		Thread t1 = new Thread(new MyThread8());
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();

	}

}
