package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.print.DocFlavor.STRING;

//	UDP
//	D-Class :224.0.0.0 ~ 239.255.255.255
//	DatagramSocket : UDP로 데이터그램 패킷을 전송하거나 수신
//	DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터
//	MulticaseSocket : 다수의 클라이언트에게 데이터그램패킷을 전송


public class ChatCS extends Frame implements ActionListener,Runnable{
	
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.4";
	private int port = 7777;
	private String userName = "즐리";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	public ChatCS() {
		
		ta.setEditable(false);	// 비활성화
		
		add(ta,BorderLayout.CENTER);
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("그룹채팅");
		setSize(400,400);
		setVisible(true);
		
		tf.requestFocus();
		
	}
	
	public void setup() {		// 스타트
		
		try {
			
			xGroup = InetAddress.getByName(host);		// 아이피 230.0.0.1
			ms = new MulticastSocket(port);		// 포트 7777 사용
			
			ms.joinGroup(xGroup);		// 포트와 아이피를 사용하는 사람에게 전송
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void disconnect() {		// 연결 끊기
		
		try {
			
			ms.leaveGroup(xGroup);		// 그룹에서 빠져나오기 		
			ms.close();					// 종료
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new ChatCS().setup();;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();
		
		if(str.equals("")){
			return;
		}
		
		byte[] buffer = (userName+ "]" + str).getBytes();
		
		try {
			
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port); // 버퍼를 버퍼의 길이만큼 아이피와 포트를 통해서
			
			ms.send(dp);
			
			tf.setText("");		// 초기화
			tf.requestFocus();	// 커서 놓기
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				byte[] buffer = new byte[512];
				
				// 전송받을 패킷
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
					
				// 전송받음
				ms.receive(dp);
				
				String str = new String(dp.getData()).trim();
				ta.append(str+"\r\n");
			
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disconnect();
		}
		
	}

}
