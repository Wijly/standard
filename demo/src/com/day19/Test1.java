package com.day19;

import java.awt.Color;
import java.awt.Frame;

// AWT(Abstract Window Toolkit) :
// �̺�Ʈ ���� ���α׷�

public class Test1 extends Frame{
	
	private static final long serialVersionUID = 1L;

	public Test1() {
		
		setTitle("�ڹ� ������");
		setSize(200,300);
		setBackground(new Color(137,204,240));
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Test1();
		

	}

}
