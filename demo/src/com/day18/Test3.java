package com.day18;

import java.io.BufferedReader;
import java.io.FileReader;

//FileReader
// 파일에서 바이트를 읽어들여 문자, 바이트 스트림으로 변환

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("d:\\doc\\test.txt");
			BufferedReader br = new BufferedReader(fr);		// 인풋스트림리더가 하던 것을 파일 리더가 하므로 fr을 바로 집어넣음
			
			String str;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
