package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test9 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private transient String pwd;
	
	public Test9(String name,String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	
	public void print() {
		System.out.println(name +" : " + id + ", " + pwd);
	}

	public static void main(String[] args) {
		
		Test9 ob = new Test9("다스리","dasual","0124");
		
		try {
//			직렬화
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out10.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			
			oos.close();
			fos.close();		

//			역직렬화
			FileInputStream fis = new FileInputStream("d:\\doc\\out10.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Test9 t = (Test9)ois.readObject();		// 다운캐스트
			
			t.print();
			
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
