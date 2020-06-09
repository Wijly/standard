package com.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

// 역 직렬화

public class Test7 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out8.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Hashtable<String, String> h = (Hashtable<String, String>) ois.readObject();		// 다운캐스트 (Test6에서 object로 업캐스트 했으므로)
			
			Iterator<String> it = h.keySet().iterator();		// map의 출력 iterator
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
