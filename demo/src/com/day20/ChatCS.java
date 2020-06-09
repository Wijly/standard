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
//	DatagramSocket : UDP�� �����ͱ׷� ��Ŷ�� �����ϰų� ����
//	DatagramPacket : UDP�� �̿��Ͽ� ���۵� �� �ִ� ������
//	MulticaseSocket : �ټ��� Ŭ���̾�Ʈ���� �����ͱ׷���Ŷ�� ����


public class ChatCS extends Frame implements ActionListener,Runnable{
	
	private MulticastSocket ms = null;
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.4";
	private int port = 7777;
	private String userName = "��";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	public ChatCS() {
		
		ta.setEditable(false);	// ��Ȱ��ȭ
		
		add(ta,BorderLayout.CENTER);
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("�׷�ä��");
		setSize(400,400);
		setVisible(true);
		
		tf.requestFocus();
		
	}
	
	public void setup() {		// ��ŸƮ
		
		try {
			
			xGroup = InetAddress.getByName(host);		// ������ 230.0.0.1
			ms = new MulticastSocket(port);		// ��Ʈ 7777 ���
			
			ms.joinGroup(xGroup);		// ��Ʈ�� �����Ǹ� ����ϴ� ������� ����
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void disconnect() {		// ���� ����
		
		try {
			
			ms.leaveGroup(xGroup);		// �׷쿡�� ���������� 		
			ms.close();					// ����
			
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
			
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port); // ���۸� ������ ���̸�ŭ �����ǿ� ��Ʈ�� ���ؼ�
			
			ms.send(dp);
			
			tf.setText("");		// �ʱ�ȭ
			tf.requestFocus();	// Ŀ�� ����
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				byte[] buffer = new byte[512];
				
				// ���۹��� ��Ŷ
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
					
				// ���۹���
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
