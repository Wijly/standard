package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest extends Frame implements ActionListener,Runnable{
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	private Socket sc = null;
	private int port = 7777;		// 클라이언트포트
	private String host = "192.168.16.0";		// 아이피주소,
	
	
	public ClientTest() {
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);
		
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("채팅 서버");
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ClientTest().connect();
	}

	@Override
	public void run() {		// 스레드
		
		// 서버에 보낼 때
		
		String str;
		
		try {
			
			if(sc==null) {		// 소켓이 null이면 멈춤
				return;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
//			ip = sc.getInetAddress().getHostAddress();		
			
//			ta.append("\r\n["+ip+"] 접속");			// 클라이언트가 먼저 접속함
			
			while((str=br.readLine())!=null) {
				ta.append("\r\n"+str);
			}
			
		} catch (Exception e) {
			
			ta.append("\r\n 서버 연결 종료 ");
//			sc = null;			// 서버소켓 필요없음
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 데이터를 보낼 때 사용
		
		String str = tf.getText();
		if(str.trim().equals("")){
			return;
		}
		if(sc==null) {
			return;
		}
		
		try {
			
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os,true);
			pw.println("주녕 : "+str);
			ta.append("\r\n주녕 "+str); 		//자기자신에게도 보여야함
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
			ta.append("\r\n 서버와의 연결이 끊겼습니다.");
			sc=null;
		}
		
	}
	
	public void connect() {
		
		try {
			
			sc = new Socket(host,port);
						
			Thread th = new Thread(this);		// 쓰레드 생성
			th.start();			// 쓰레드 run 실행
			
		} catch (Exception e) {
			ta.append("서버가 죽어있습니다.");
		}
	
	}

}
