package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// ��ü�� ����ȭ
// �޸𸮿� ������ Ŭ���� ��ü�� ��������� ������¸� �״�� �����ؼ� ���Ͽ� �����ϰų�
// ��Ʈ��ũ�� ���� ���� �� �� �ִ� ���
// ������ ����Ʈ �����θ� �����͸� �ۼ���

// ���� : ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ����ʰ� ��ü�� ���������ν�
//		  ���Ӽ��� ������ �� �ִ�. ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ ����

// implements Serializable�� ���� ( �޼ҵ�� ���� )
// 	map<> ���� serializable�� �����Ǿ��ִ�.

public class Test6 {

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "�ٽ���");
		h.put("2", "��");
		h.put("3", "chadol");		// ����ȭ �� ����
		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\out8.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);		// object < ��ĳ��Ʈ
			
			oos.writeObject(h);
			
			oos.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		

	}

}
