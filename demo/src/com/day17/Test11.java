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
			ps.println("�ٽ���");
			ps.println("���ֳ�");
			ps.println("babofig");
			
			ps.close();
			fos.close();
			
			fos = new FileOutputStream("d:\\doc\\test11.txt",true);
			ps.println("��������");
			ps.println("���");
			ps.println("soso");
			
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
