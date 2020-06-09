package com.day16;

class MyThread6 extends Thread{
	
	@Override
	public void run() {
		
		try {
			
			System.out.println("������ ����");
			
			System.out.println("�켱���� : "+getPriority());
			System.out.println("�������� �̸� : "+getName());
			
			sleep(500);
			
			//�켱���� ����
			setPriority(2);
			System.out.println("����� �켱���� : "+getPriority());
			
			System.out.println("������ ����");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class Test6 {

	public static void main(String[] args) {

		Thread t1 = Thread.currentThread();		// main �� = main���� ������
		Thread t2 = new MyThread6();				// Thread-0
		
		System.out.println("main ������ �켱���� : " + t1.getPriority());
		System.out.println("main ������ �̸� : "+t1.getName());
		System.out.println("������ ������ t2 : "+t2.isAlive());		// ��������� true , ������ false
		
		try {
		
			t2.start();
			System.out.println("������ ������ t2 �������� : " +t2.isAlive());		// ��������� true
			System.out.println("t2�� �켱���� : "+t2.getPriority());
			
			t2.setPriority(1);
			
			Thread.sleep(100);		// main�� 1�� �� , t2 ������ ����
			System.out.println("0.1�ʽ��� t2 �������� : " +t2.isAlive());		// ��������� true
			
			Thread.sleep(1000);
			
			System.out.println("1�ʽ��� t2 �������� : " +t2.isAlive());		// ��������� true
			
			t2.join();		// t2�� ���������� main���� ����������
			
			System.out.println("t2 �������� : "+t2.isAlive());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
