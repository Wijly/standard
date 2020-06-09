package com.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {
	
	public boolean fileCopy(String file1, String file2) {
		
		File f = new File(file1);
		
		if(!f.exists()) {
			return false;
		}
		try {
			
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(file2);
			
			int data = 0;
			byte[] buffer = new byte[1024];		// 1024개씩 저장
			
			while((data=fis.read(buffer,0,1024))!=-1) {			// fis의 버퍼의 0번째부터 1024번째까지 읽는다.
			
				fos.write(buffer);
				
			}
			
			fos.close();
			fis.close();
			
		} catch (Exception e) {

			System.out.println(e.toString());
			return false;
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		Test8 ob = new Test8();
		
		if(ob.fileCopy("d:\\doc\\test.txt", "d:\\doc\\out2.txt")) {
			System.out.println("파일 복사 성공");
		}else {
			System.out.println("파일 복사 실패");
		}

	}

}
