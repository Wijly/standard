package com.black;

import java.io.FileInputStream;
import java.io.IOException;

public class Main_Close {
	
	public void image_main() throws IOException {
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\main.txt"); // 메인화면
			int image;
			int cnt=0;

			while ((image = fis.read()) != -1) {
				
				System.out.write(image);
				System.out.flush();
				
				if(cnt%150==0) {
					Thread.sleep(25);
				}
				cnt++;
			}
			fis.close();

		} catch (Exception e) {
		}
	}
	
	public void image_close() throws IOException{			//  종료 화면
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\black\\1336.txt");
			int image;
			
			while((image = fis.read())!= -1) {
				System.out.write(image);
				System.out.flush();
			}
			fis.close();
		}catch (Exception e) {
		}
		System.out.println();
	}
	
}

