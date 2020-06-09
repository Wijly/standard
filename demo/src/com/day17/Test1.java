package com.day17;

import java.io.IOException;

// Stream
// 데이터 입출력시 모든 데이터를 형태와 관련없이 일련된 흐름으로 전송하는 것
// byte 스트림 = 컴퓨터와 컴퓨터사이에서 파일을 전송할 때 byte로 보낸다.


public class Test1 {

	public static void main(String[] args) throws IOException{
		
		int data;
		System.out.print("문자열을 입력하세요. :");
		while((data = System.in.read())!=-1) {			// system.in.read 는 int로 받아낸다.
			char ch = (char)data;
			System.out.print(ch);
		
		}
		

	}

}
