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

		setLayout(new GridLayout(4, 1)); // �ʵ带 4���� ¥��,
											// �� �ʵ�� 1���� �ؽ�Ʈ �ʵ尡 ��
		tf1 = new TextField();
		add(tf1);

		tf2 = new TextField();
		add(tf2);

		// 3��° �ʵ忡 �� �г�
		Panel p = new Panel();

		// �гο� �� ��ư
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

		tf3 = new TextField(); // 4��° �ʵ�, 3��° �ʵ忡�� �г��� ��
		add(tf3);

		addWindowListener(new WindowAdapter() { // ������ �ƴ���
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // x�� ������ ����
			}
		});

		setTitle("����");
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
				tf3.setText("�Է¿���");
			}
		}
	}

	class KeyHandler extends KeyAdapter {

	}

}
