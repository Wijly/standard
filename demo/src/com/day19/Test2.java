package com.day19;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener{
	
	public Test2() {
		setTitle("�ڹ�������");
		setSize(500,500);
		
		addWindowListener(this);	// Test2�� ��ȯ�� �־��
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
		
	}

	@Override
	public void windowActivated(WindowEvent e) {		// Ȱ��ȭ�Ǿ��� ��
	}

	@Override
	public void windowClosed(WindowEvent e) {	// ������� ��
	}

	@Override
	public void windowClosing(WindowEvent e) {	// ���� ��ư�� ������ ��
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
