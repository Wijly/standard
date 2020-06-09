package com.black;

import java.io.FileInputStream;

// ���̺� ī����� ������ 1,2,3,4
class Table_Thread1 extends Thread {

	FileInputStream fis;

	@Override
	public void run() {
		try {

			fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_card1.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
			sleep(1000);
		} catch (Exception e) {
		}

		System.out.println();
		thread2();
	}

	public void thread2() {
		try {
			fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_card2.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
			sleep(1000);
		} catch (Exception e) {
		}
		System.out.println();
		thread3();
	}

	public void thread3() {
		try {
			fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_card3.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
			sleep(1000);
		} catch (Exception e) {
		}
		System.out.println();
		thread4();
	}

	public void thread4() {
		try {
			fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_card4.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
		}
		System.out.println();
	}
}

class DealerWait extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.print("����������*");
			try {
				sleep(350);
			}catch (Exception e) {
			}
		}
		System.out.println();
	}

}

//      ���̺� ī����� print
class Table {

	public void print() {

		Table_Thread1 ob1 = new Table_Thread1();

		ob1.start();
		try {

			ob1.join();

		} catch (Exception e) {
		}
	}

	// �����ϱ� �� �̹���
	public void no_coin() {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
		}
	}

	// ���̺� ���� ����
	public void coin() {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_coin.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Hit- ���� ī�� ���� ��
	public void imageHit() {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\hit.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// hit�� �ι� ���� �� ī�� ����
	public void imageHit2() {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\hit2.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void coin_parebit() {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\table_parebit.txt");
			int image;

			while ((image = fis.read()) != -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}