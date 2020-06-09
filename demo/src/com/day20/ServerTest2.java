package com.day20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {
	
	private ArrayList<Socket> clients = new ArrayList<>();
	
	public void serverStart() {
		
		try {
			
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작");
			
			while(true) {
				Socket sc = ss.accept();
				
				WorkThread wt = new WorkThread(sc);
				wt.start();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	class WorkThread extends Thread{
		
		private Socket sc;
		
		public WorkThread(Socket sc) {
			this.sc = sc;
		}
		
		@Override
		public void run() {
			
			String ip = null;
			String msg = null;
			
			try {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));		// 바로 넣어서 넘김
				
				ip = sc.getInetAddress().getHostAddress();	// 그때마다 ip 주소를 받아냄
				
				clients.add(sc);			// ip를 받아서 리스트에저장
				
				msg = ip + "]가 입장했습니다. ";
				
				// ip 입장 출력
				for(Socket s : clients) {			// ip가 입장했습니다 전송
					if(s==sc) {
						continue;
					}
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true);		// ip가 전송
					pw.println(msg);
				}
				System.out.println(msg);

				// 나를 제외한 사람들에게 대화 출력
				while((msg=br.readLine())!=null) {
					for(Socket s : clients) {
						if(s==sc) {
							continue;
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);		// ip가 전송
						pw.println(msg);
					}
					System.out.println(msg);
				}				
			} catch (Exception e) {
				
				msg = ip + "]가 퇴장했습니다. ";
				
				// 나를 제외한 사람들에게 퇴장했습니다를 보냄
				try {
					for(Socket s : clients) {			// ip가 입장했습니다 전송
						if(s==sc) {
							continue;
						}
						PrintWriter pw = new PrintWriter(s.getOutputStream(),true);		// ip가 전송
						pw.println(msg);
					}
					System.out.println(msg);
					sc=null;					// 초기화
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}	
	}
	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}
}
