package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// 파일 복사

public class Test7 {

	public static void main(String[] args) {
		
		// 원본 파일 : d:\\doc\\test.txt
		// 대상 파일 : d:\\doc\\out1.txt
		// 복사 완료!
		
		FileInputStream fis;
		FileOutputStream fos;

		
		try {
			
			Scanner sc = new Scanner(System.in);
			String str1, str2;
			
			System.out.print("원본 파일 주소 : ");
			str1 = sc.next();
			System.out.print("대상 파일 주소 : ");
			str2 = sc.next();
			
			fis = new FileInputStream(str1);
			fos = new FileOutputStream(str2);
			
			int data;
			
			while((data=fis.read()) != -1) {
				fos.write(data);
				fos.flush();
				
			}
			fis.close();
			fos.close();
			
			System.out.println("복사 완료.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
