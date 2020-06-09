package com.day17;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader
// 1byte stream을 2byte stream으로 변환하는 stream


public class Test3 {

	public static void main(String[] args) throws IOException {
		
		int data;
		
		System.out.print("문자열 입력 : ");
		
		Reader rd = new InputStreamReader(System.in);		// 읽어낸 것을 저장해주는 역할 (InputStreamReader)
		
		while((data = rd.read())!= -1) {
			char ch = (char)data;
			System.err.print(ch);
		}
		
	}

}
