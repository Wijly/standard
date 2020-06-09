package com.day17;

import java.io.FileInputStream;

//FileInputStream


public class Test5 {

	public static void main(String[] args){
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");		// 파일의 위치를 fis에 저장
			
			int data;
			int tot = 0;
			while((data =fis.read())!=-1) {
//				System.out.print((char)data);			// 읽었다고해서 char로 출력할 수 없음
				System.out.print((char)data);
				tot += (char)data;
				System.out.println(tot);
				System.out.flush();			// 버퍼가 차기전에는 내용을 보내지지 않는데 flush는 버퍼의 내용을 채워준다
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
