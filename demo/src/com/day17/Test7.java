package com.day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� ����

public class Test7 {

	public static void main(String[] args) {
		
		// ���� ���� : d:\\doc\\test.txt
		// ��� ���� : d:\\doc\\out1.txt
		// ���� �Ϸ�!
		
		FileInputStream fis;
		FileOutputStream fos;

		
		try {
			
			Scanner sc = new Scanner(System.in);
			String str1, str2;
			
			System.out.print("���� ���� �ּ� : ");
			str1 = sc.next();
			System.out.print("��� ���� �ּ� : ");
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
			
			System.out.println("���� �Ϸ�.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
