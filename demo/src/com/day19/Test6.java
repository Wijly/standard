package com.day19;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6 extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TextField tf1, tf2, tf3;
	private Button btn1, btn2, btn3, btn4;

	public Test6() {

		setLayout(new GridLayout(4, 1)); // 필드를 4개로 짜름,
											// 한 필드당 1개씩 텍스트 필드가 들어감
		tf1 = new TextField();
		add(tf1);

		tf2 = new TextField();
		add(tf2);

		// 3번째 필드에 들어갈 패널
		Panel p = new Panel();

		// 패널에 들어갈 버튼
		btn1 = new Button("+");
		btn1.addActionListener(this);
		p.add(btn1);

		btn2 = new Button("-");
		btn2.addActionListener(this);
		p.add(btn2);

		btn3 = new Button("*");
		btn3.addActionListener(this);
		p.add(btn3);

		btn4 = new Button("/");
		btn4.addActionListener(this);
		p.add(btn4);

		add(p);

		tf3 = new TextField(); // 4번째 필드, 3번째 필드에는 패널이 들어감
		add(tf3);

		addWindowListener(new WindowAdapter() { // 윈도우 아답터
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // x를 누르면 종료
			}
		});

		setTitle("계산기");
		setSize(200, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test6();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		if (ob instanceof Button) {
			Button b = (Button) ob;
			int tot = 0;
			try {
				
				int num1 = Integer.parseInt(tf1.getText());
				int num2 = Integer.parseInt(tf2.getText());
				String str="";
				if (b == btn1) {
					tot = num1 + num2;
					str = String.format("%d + %d = %d",num1,num2,tot);
				} else if (b == btn2) {
					tot = num1-num2;
					str = String.format("%d - %d = %d",num1,num2,tot);
				} else if (b == btn3) {
					tot = num1 * num2;
					str = String.format("%d * %d = %d",num1,num2,tot);
				} else if (b == btn4) {
					tot = num1 / num2;
					str = String.format("%d / %d = %d",num1,num2,tot);
				}
				
				tf3.setText(str);
				
			}catch(Exception e1){
				tf3.setText("입력오류");
			}
		}
	}

	class KeyHandler extends KeyAdapter {

	}

}
