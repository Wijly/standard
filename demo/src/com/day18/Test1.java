package com.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {
	
	public final static int BUFFER_SIZE = 512;
	

	public static void main(String[] args) {
		
		byte[] buffer = new byte[BUFFER_SIZE];
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			int data,len=0;
			
			while((data = bis.read(buffer))!=-1) {
				System.out.println("읽은 문자열 길이 : "+data);
				len += data;
				
				bos.write(buffer,0,data);
				bos.flush();
			}
			
			System.out.println("읽어드린 전체 길이 : "+len);
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
