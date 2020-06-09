package com.day17;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test11 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos;
			PrintStream ps;
			
			fos = new FileOutputStream("d:\\doc\\text11.txt");
			
			ps = new PrintStream(fos);
			ps.println("다스리");
			ps.println("위주녕");
			ps.println("babofig");
			
			ps.close();
			fos.close();
			
			fos = new FileOutputStream("d:\\doc\\test11.txt",true);
			ps.println("차도르박");
			ps.println("루뱃");
			ps.println("soso");
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
