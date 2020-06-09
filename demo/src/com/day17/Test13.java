package com.day17;

import java.io.File;
import java.io.FileOutputStream;

public class Test13 {

	public static void main(String[] args) {
		
		String str1 = "d:\\doc\\temp\\java1\\test.txt";
		
//		방법 1
		/*
		String path = str1.substring(0,str1.lastIndexOf("\\"));
		
//		System.out.println(path);
		
		File f = new File(path);
		
		if(!f.exists()) {
			f.mkdirs();			// 경로를 만듬
		}
		*/
		
//		방법 2 
		File f = new File(str1);
		
		if(!f.getParentFile().exists()) {
			f.getParentFile().mkdirs();		// 		String path = str1.substring(0,str1.lastIndexOf("\\")); 와 같이 폴더를 만드는 코드
			
		}
		
		try {
			FileOutputStream fos = new FileOutputStream(str1);
			System.out.println("문자열 입력 : ");
			
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
