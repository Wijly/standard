package com.day19;

import java.awt.Color;
import java.awt.Frame;

// AWT(Abstract Window Toolkit) :
// 이벤트 단위 프로그램

public class Test1 extends Frame{
	
	private static final long serialVersionUID = 1L;

	public Test1() {
		
		setTitle("자바 윈도우");
		setSize(200,300);
		setBackground(new Color(137,204,240));
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Test1();
		

	}

}
