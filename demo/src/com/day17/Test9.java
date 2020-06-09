package com.day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test9 {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");
			
			BufferedReader br = new BufferedReader((new InputStreamReader(fis)));		// 파일 읽은 것을 inputstreamreader에 넣고 br로 저장
			
			String str;
			
			while((str = br.readLine())!=null) {		// string이므로 null
			
				System.out.println(str);
				
			}
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
