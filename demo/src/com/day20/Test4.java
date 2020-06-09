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
import java.net.URL;
import java.net.URLConnection;

public class Test4 extends Frame implements ActionListener{
	
	private TextArea ta;
	private TextField tf;
	
	public Test4() {
		ta = new TextArea();
		add(ta);
		
		tf = new TextField("https://www.");
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("HTML Viewer");
		setSize(500,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			String str;
			URL url = new URL(tf.getText());
			
			ta.setText("");
			
			/*
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));		// is�� ���۸����� ����
			*/
			
			URLConnection conn = url.openConnection();
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));		// is�� ���۸����� ����
			
			String s = conn.getContentType();
			ta.setText("TYPE : "+s);						// Ÿ���� �˷���
			
			while((str=br.readLine())!=null) {
				if(ta.getText().equals("")) {		// null�̸� �Է�
					ta.setText(str);
				}else {
					ta.setText(ta.getText()+"\r\n" +str);		// null�̾ƴϸ� �ٳѱ�� �Է�
				}
			}
			
			is.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}

}
