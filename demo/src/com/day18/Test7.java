package com.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

// �� ����ȭ

public class Test7 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out8.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Hashtable<String, String> h = (Hashtable<String, String>) ois.readObject();		// �ٿ�ĳ��Ʈ (Test6���� object�� ��ĳ��Ʈ �����Ƿ�)
			
			Iterator<String> it = h.keySet().iterator();		// map�� ��� iterator
			while(it.hasNext()) {
				String key = it.next();
				String value = h.get(key);
				System.out.println(key + " : " + value);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}