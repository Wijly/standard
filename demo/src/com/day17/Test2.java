package com.day17;

import java.io.IOException;
import java.io.OutputStream;

//outputStream

public class Test2 {

	public static void main(String[] args) throws IOException{

		OutputStream os = System.out;
		
		byte[] b = new byte[3];			// buffer
		
		b[0] = 65;		//A
		b[1] = 97;		//a
		b[2] = 122;		//z
		
		os.write(b);
		os.close();
		
		System.out.println("실행확인 출력문");
		
	}

}
