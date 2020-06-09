package com.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

// 파일 전송을 위한 클래스

public class FileClientTest {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		String host = "127.0.0.1";
		
		Socket sc =null;
		
		ObjectOutputStream oos = null;
		
		Scanner scan = new Scanner(System.in);
		
		String file;
		
		try {
			
			System.out.print("전송할 파일 경로 : ");
			file = scan.next();
			
			File f = new File(file);	// 파일의 경로를 가진 파일 생성
			
			if(!f.exists()) {		// 파일이 없을경우
				System.out.println("파일이 없습니다.");
				System.exit(0);
			}
			
			// 파일이 있으면 서버 연결
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();		// 버퍼가 꽉차지않아도 마지막 데이터까지 내보냄
			
			//파일 전송 시작
			FileInfo info;
			info = new FileInfo();
			info.setCode(100);		// 파일전송 코드 100번
			info.setData(f.getName().getBytes()); 	// 파일이름을 바이트타입으로 바꿈
			info.setSize((int)f.length());		// 파일사이즈를 정수로 변환해서 담음
			
			oos.writeObject(info); 		//info를 내보냄
			System.out.println(f.getName()+"파일 전송 시작");
			
			Thread.sleep(30);		// 하드웨어로 보내기때문에 렉이 걸려서 쉬게함
			
			//파일내용 전송
			FileInputStream fis = new FileInputStream(f);	//파일 읽기
			int data;
			byte[] buffer = new byte[1024];
			
			while((data=fis.read(buffer,0,1024))!=-1) {
				
				info = new FileInfo();
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data+"byte 전송중");
					
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();
			
			//파일전송 종료
			info = new FileInfo();
			
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"파일 전송 끝");
			
			Thread.sleep(300);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
