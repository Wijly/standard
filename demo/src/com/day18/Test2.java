package com.day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

//FileWriter
// 출력할 유니코드 문자열을 시스템에 맞는 디폴트 문자 인코딩의 바이트로 변환해서 저장
//
//BufferedWriter
//	필터스트림으로 다른 출력 스트림을 생성자의 인수로 가지며
//	문자를 버퍼링 라는것에따라 문자, 배열, 스트링으로 문자형태를 출력
// 문자, 바이트 스트림을 버퍼로 출력


public class Test2 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			FileWriter fw = new FileWriter("d:\\doc\\out6.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String str;
			
			System.out.print("문자열을 입력하세요. : ");
			
			while ((str= br.readLine())!=null) {
				bw.write(str);
				bw.newLine();		// str + "\r\n"
			}
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
