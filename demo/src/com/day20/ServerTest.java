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

	// ������ �ʿ��� ��
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
		
		setTitle("ä�� ����");
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ServerTest().serverStart();
	}

	@Override
	public void run() {		// ������
		
		// �����͸� ���� �� �ʿ�
		
		String str;
		String ip;
		
		try {
			
			if(sc==null) {		// ������ null�̸� ����
				return;
			}
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			ip = sc.getInetAddress().getHostAddress();		//Ŭ���̾�Ʈ ip
			
			ta.append("\r\n["+ip+"] ����");
			
			while((str=br.readLine())!=null) {		// ��ȭ ���� ���
				ta.append("\r\n"+str);
			}
			
		} catch (Exception e) {
			
			ta.append("\r\n Ŭ���̾�Ʈ ���� ���� ");
			sc = null;			// null�� �ʱ�ȭ�� �ؾ� �ι�°�� ����� �� ���� ����
			ss = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// �����͸� ���� �� ���
		
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
			pw.println("���� : "+str);			// ��Ʈ��ũ�� ������ ��
			
			ta.append("\r\n���� : "+str); 		//�ڱ��ڽſ��Ե� ��������
			
			tf.setText("");
			tf.requestFocus();
			
		} catch (Exception e2) {
			// TODO: handle exception
			ta.append("\r\n Ŭ���̾�Ʈ���� ������ ������ϴ�.");
			sc=null;
		}
		
	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777);
			ta.setText("��������");
			
			sc = ss.accept();		// �ڱ� ������ ����
			
			Thread th = new Thread(this);		// ������ ����
			th.start();			// ������ run ����
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}