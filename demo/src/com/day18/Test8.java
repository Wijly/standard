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
			
			oos.writeObject(new MyData("��", 77));
			oos.writeObject(new MyData("�ٽ�", 80));
			oos.writeObject(new MyData("����", 88));
			oos.writeObject(new MyData("���", 99));
			oos.writeObject(new MyData("����", 90));
					// ����ȭ�Ǿ� ���Ͼȿ� ������, ����ȭ ��Ű�������� ������ ������� ����
			oos.close();
			fos.close();
			
			//�� ����ȭ
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
