package com.day19;


import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test5 extends Frame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private TextField[] tf = new TextField[4];
	private Label result = new Label("",Label.LEFT);		// Label
	private Button btn1, btn2;
	
	public Test5() {
	
		String[] title = {"�̸�", "����", "����", "����", "����"};
		setTitle("����ó��");
		
		setLayout(null); 		// null = ������ġ
		
		for(int i = 0; i<5; i++) {
			Label lbl = new Label();		// ���̺� ��ü ����
			
			lbl.setText(title[i]); 			// ���̺��� �̸��� title�� i��°
			
			lbl.setBounds(10,(i+1)*30,50,20); 	//setBound (���� ���� �� ����)	// ���� ���� ����
			
			add(lbl);			// add�� ������ �ø�
			
			if(i!=4) {
				tf[i] = new TextField();		// �ؽ�Ʈ�ʵ� ��ü ����
				tf[i].setBounds(80, (i+1)*30, 70, 20);		// �ؽ�Ʈ �ʵ� ����ֱ�
				
				// KeyHandler ������ 		 �ؽ�Ʈ�ʵ忡���� ������, ��ư1������ ������
				tf[i].addKeyListener(new KeyHandler());
				
				add(tf[i]);
			}else {
				result.setBounds(80, (i+1)*30, 70, 20);		// �� ����ֱ�
				add(result);
			}
		}
		
		btn1 = new Button("���");
		btn1.setBounds(180, 30, 60,20);
		add(btn1);
		
		btn1.addActionListener(this);
		
		// KeyHandler �ι�° �Է�
		btn1.addKeyListener(new KeyHandler());

		btn2 = new Button("����");
		btn2.setBounds(180, 60, 60, 20);
		add(btn2);
		
		btn2.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(260,180);
		setResizable(false);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Test5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {		// �̺�Ʈ�� �����ϴ� �޼ҵ�
		
		Object ob = e.getSource();
		
		if( ob instanceof Button) {
			
			Button b = (Button)ob;
			
			if(b==btn1) {		// ������ ���ϴ� ���� �޼ҵ�� ó��
				
				execute();
				/*
				// �հ�
				int tot = 0;
				
				try {
					
					for(int i=1; i<=3; i++) {
						tot += Integer.parseInt(tf[i].getText());
						
						result.setText(Integer.toString(tot));
						//result.setText(""+tot);
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					result.setText("�Է¿���");
				}
				*/
				
			}else if(b==btn2) {
				// ����
				System.exit(0);
			}		
		}
	}
	
	private void execute() {
		
		int tot = 0;
		
		try {
			
			for(int i=1; i<=3; i++) {
				tot += Integer.parseInt(tf[i].getText());
				
				result.setText(Integer.toString(tot));
				//result.setText(""+tot);
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
			result.setText("�Է¿���");
		}
	}
	
	class KeyHandler extends KeyAdapter{		// ������ �ʿ�

		@Override
		public void keyPressed(KeyEvent e) {		// Ű�� ������ �� �Ǵ� �޼ҵ�
			
			Object ob = e.getSource();
			
			if(e.getKeyCode() !=KeyEvent.VK_ENTER) {		// ���Ͱ� �ƴϸ� ����
				return;
			}
			
			// ��� ��ư
			if( ob instanceof Button) {
				
				Button b = (Button)ob;
				
				if(b==btn1) {		
					execute();
				}
			}
			
			// �ؽ�Ʈ �ڽ�
			if( ob instanceof TextField) {		//tab��� ���͸� �ļ� ���� �ѱ�� ������� �����ϰ��ϴ� �Լ�
				
				TextField t = (TextField)ob;
				
				for(int i=0; i<tf.length; i++) {  
					if(i!=3 && tf[i]==t) {
						tf[i+1].requestFocus();
						return;
					}else if(tf[3]==t) {		//�ؽ�Ʈ�ʵ� 3�϶�
						btn1.requestFocus();		// ���͸� ġ�� ����� Ŀ���� ������ ����
						return;
					}
				}
			}
		}	
	}
}
