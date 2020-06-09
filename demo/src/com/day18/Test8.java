package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test8 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out9.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new MyData("즐리", 77));
			oos.writeObject(new MyData("다슬", 80));
			oos.writeObject(new MyData("차돌", 88));
			oos.writeObject(new MyData("루뱃", 99));
			oos.writeObject(new MyData("빙시", 90));
					// 직렬화되어 파일안에 들어가있음, 직렬화 시키지않으면 파일을 출력하지 않음
			oos.close();
			fos.close();
			
			//역 직렬화
			FileInputStream fis = new FileInputStream("d:\\doc\\out9.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			MyData ob;
			
			while(true) {
				
				ob = (MyData)ois.readObject();
				
				if(ob==null) {
					break;
				}
				System.out.println(ob.toString());
			}
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
