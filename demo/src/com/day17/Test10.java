package com.day17;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {
		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out3.txt");
			
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			
			System.out.print("문자열 입력 : ");
			while((str=br.readLine())!=null) {
				ps.println(str);
			}
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
