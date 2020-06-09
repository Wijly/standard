package com.rooms.threads;

import java.io.FileInputStream;
import java.io.IOException;

public class Main_Thread {

	public void image_main() throws IOException{
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\work\\demo\\src\\com\\rooms\\threads\\main.txt");
			
			int image;
			int cnt=0;
			
			while((image = fis.read()) != -1 ) {
				System.out.write(image);
				System.out.flush();
				
				if(cnt%150==0) {
					Thread.sleep(30);
				}
				cnt++;
			}
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	}

}

