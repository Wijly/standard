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

public class ServerTest extends Frame implements ActionListener,Runnable{
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	// 서버라서 필요한 것
	private ServerSocket  ss = null;			
	private Socket sc = null;
	
	public ServerTest() {
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
		new ServerTest().serverStart();
	}

	@Override
	public void run() {		// 스레드
		
		// 데이터를 받을 때 필요
		
		String str;
		String ip;
		
		try {
			
			if(sc==null) {		// 소켓이 null이면 멈춤
				return;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			ip = sc.getInetAddress().getHostAddress();		//클라이언트 ip
			
			ta.append("\r\n["+ip+"] 접속");
			
			while((str=br.readLine())!=null) {		// 대화 내용 출력
				ta.append("\r\n"+str);
			}
			
		} catch (Exception e) {
			
			ta.append("\r\n 클라이언트 연결 종료 ");
			sc = null;			// null로 초기화를 해야 두번째로 사용할 때 재사용 가능
			ss = null;
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
			pw.println("서버 : "+str);			// 네트워크에 보내는 것
			
			ta.append("\r\n서버 : "+str); 		//자기자신에게도 보여야함
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
			ta.append("\r\n 클라이언트와의 연결이 끊겼습니다.");
			sc=null;
		}
		
	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);
			ta.setText("서버시작");
			
			sc = ss.accept();		// 자기 소켓을 연결
			
			Thread th = new Thread(this);		// 쓰레드 생성
			th.start();			// 쓰레드 run 실행
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
