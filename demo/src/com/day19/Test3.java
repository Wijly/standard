package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame{
	
	public Test3() {
		setTitle("扩档快");
		setSize(500,500);
		setBackground(new Color(137,207,240));
		addWindowListener(new MyWindowAdapter());	// 流立按眉 积己
		
		setVisible(true);
	}
	
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		new Test3();
	}

}
