package com.day17;

import java.io.FileOutputStream;

public class Test6 {

//	FileOutputStream
	
	
	public static void main(String[] args) {

		try {	
		
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out.txt");
			
			int data;
			
			System.out.print("문자열 입력 : ");
			while((data=System.in.read())!=-1) {
				fos.write(data);
				fos.flush();
			}
			
			
		}catch(Exception e){
		
		}
	}

}
