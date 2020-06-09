package com.day16;

//���ͷ�Ʈ : �켱������ ���� ���α׷��� ���� �����Ű�� ���ƿ�
// ���� - �� - �ù� - ��ȭ - ��

class MyThread7	 extends Thread{
	
	private Thread next;
	
	public void setNext(Thread next) {
		this.next = next;
	}
	
	@Override
	public void run() {
		for(int i = 1; i<=20; i++) {
			
			try {
				
				sleep(2000);		// �����尡 2�ʾ� ��
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println(getName() + " : " + i);
			
			// ���� �����带 ������Ű�� ���� ������ ����
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
		
		t1.setNext(t2);		// t1 ���� t2
		t2.setNext(t3);		// t2 ���� t3
		t3.setNext(t1);		// t3 ���� t1
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();			// t1�� �Ͻ����� ���Ѽ� ������ ����ȭ�ǰ� ����
		
		try {
			
			t1.join();
			t2.join();
			t3.join();			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
