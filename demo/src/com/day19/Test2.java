package com.day19;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test2 extends Frame implements WindowListener{
	
	public Test2() {
		setTitle("자바윈도우");
		setSize(500,500);
		
		addWindowListener(this);	// Test2에 권환을 주어라
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
		
	}

	@Override
	public void windowActivated(WindowEvent e) {		// 활성화되었을 때
	}

	@Override
	public void windowClosed(WindowEvent e) {	// 종료됐을 때
	}

	@Override
	public void windowClosing(WindowEvent e) {	// 종료 버튼을 눌렀을 때
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
