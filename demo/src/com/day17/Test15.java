package com.day17;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

//RandomAccessFile
// �Ϲ����� ������ ���������� �����͸� ����
//RandomAccessFile�� ���ϴ� ������ �̵��ؼ� �бⰡ ����

public class Test15 {

	public static void main(String[] args) throws IOException{
		
		File f = File.createTempFile("ismi", ".tmp");			// �ӽ�����
		f.deleteOnExit();				// ���α׷��� ����Ǹ� �ڵ����� ����
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i = 0;i<100;i++) {
			fos.write(i);
		}
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30);		// 30��° �����͸� ã��
		System.out.println("seek(30): "+ raf.readByte());		// ã�� ���� ����Ʈ������ ���
		
		for(int i=0; i<100;i++) {
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		
		raf.close();
		
	}

}
