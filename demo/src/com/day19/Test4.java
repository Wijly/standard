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

	private Button btn; // ��ư
	private TextArea ta; // �����ִ� ��
	private TextField tf; // ���ڸ� ���°�

	public Test4() {

		// ��ü����
		btn = new Button("�߰�");
		ta = new TextArea();
		tf = new TextField();

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setTitle("������");
		setSize(500, 500);
		setBackground(new Color(137, 207, 240));

		// �ؽ�Ʈ�ʵ忡 ���� �� �۾�
		tf.addActionListener(this);
		
		// ��ư�� Ŭ������ �� �۾�
		btn.addActionListener(this);

		addWindowListener(new WindowAdapter() { // ������ Ŭ���� windowAdapter

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
	public void actionPerformed(ActionEvent e) { // �̺�Ʈ�� �����ؼ� �˷��ִ� �޼ҵ�

		Object ob = e.getSource(); // ������Ÿ���� ������Ʈ, �̺�Ʈ�� �ҽ��� �޾Ƴ���
		
		// ob�� �̺�ƮŸ���� ��ư�̰ų� �ؽ�Ʈ�ʵ��϶�
		if (ob instanceof Button || ob instanceof TextField) { 

			String str = tf.getText();

			if (!str.equals("")) { // null�� �ƴҶ�
				ta.append(str + "\r\n"); // str�Է� �� �ٳѱ�
			}
			tf.setText(""); // �ؽ�Ʈ�ʵ� �ʱ�ȭ (ȭ�� ����)
			tf.requestFocus();		//Ŀ���� �ٽ� �����ٳ���

		}
	}
}
