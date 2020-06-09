package com.day18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream
// 자바의 자료형을 직접 읽을 수 있도록 하는 스트림
// 이러한 읽기 동작은 플랫폼과는 무관하게 작동한다.


public class Test4 {

	public static void main(String[] args) {

		try {
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out7.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("대한민국");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(50);
			
			fos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc\\out7.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			
			fis.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
