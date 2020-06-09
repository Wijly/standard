package com.day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test4 extends Frame implements ActionListener {

	private Button btn; // 버튼
	private TextArea ta; // 보여주는 곳
	private TextField tf; // 글자를 쓰는곳

	public Test4() {

		// 객체생성
		btn = new Button("추가");
		ta = new TextArea();
		tf = new TextField();

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setTitle("윈도우");
		setSize(500, 500);
		setBackground(new Color(137, 207, 240));

		// 텍스트필드에 쳤을 때 작업
		tf.addActionListener(this);
		
		// 버튼을 클릭했을 때 작업
		btn.addActionListener(this);

		addWindowListener(new WindowAdapter() { // 무명의 클래스 windowAdapter

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 이벤트를 감지해서 알려주는 메소드

		Object ob = e.getSource(); // 데이터타입은 오브젝트, 이벤트의 소스를 받아낸다
		
		// ob의 이벤트타입이 버튼이거나 텍스트필드일때
		if (ob instanceof Button || ob instanceof TextField) { 

			String str = tf.getText();

			if (!str.equals("")) { // null이 아닐때
				ta.append(str + "\r\n"); // str입력 후 줄넘김
			}
			tf.setText(""); // 텍스트필드 초기화 (화면 지움)
			tf.requestFocus();		//커서를 다시 가져다놔라

		}
	}
}
