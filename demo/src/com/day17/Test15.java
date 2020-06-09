package com.day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

//RandomAccessFile
// 일반적인 파일은 순차적으로 데이터를 읽음
//RandomAccessFile은 원하는 곳으로 이동해서 읽기가 가능

public class Test15 {

	public static void main(String[] args) throws IOException{
		
		File f = File.createTempFile("ismi", ".tmp");			// 임시파일
		f.deleteOnExit();				// 프로그램이 종료되면 자동으로 삭제
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i = 0;i<100;i++) {
			fos.write(i);
		}
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30);		// 30번째 데이터를 찾음
		System.out.println("seek(30): "+ raf.readByte());		// 찾은 것을 바이트단위로 출력
		
		for(int i=0; i<100;i++) {
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();
		
	}

}
