package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test13 {

	public static void main(String[] args) {
		
		String str1 = "d:\\doc\\temp\\java1\\test.txt";
		
//		��� 1
		/*
		String path = str1.substring(0,str1.lastIndexOf("\\"));
		
//		System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();			// ��θ� ����
		}
		*/
		
//		��� 2 
		File f = new File(str1);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();		// 		String path = str1.substring(0,str1.lastIndexOf("\\")); �� ���� ������ ����� �ڵ�
			
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(str1);
			System.out.println("���ڿ� �Է� : ");
			
			int data;
			
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
