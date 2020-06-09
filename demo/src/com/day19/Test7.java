package com.day19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test7 extends Frame{
	
	private int x,y;
	private Label lbl = new Label("",Label.CENTER);		// 라벨을 만들어 가운대에다 둠	
	
	public Test7() {
		
		
		
		add(lbl,BorderLayout.SOUTH);
		
		addMouseListener(new MouseHandler());		// 마우스 이벤트 리스너
		addMouseMotionListener(new MouseMotionHandler());
		//
		//
		
		setBackground(new Color(137,207,240));
		setForeground(new Color(0,0,255));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("좌표출력");
		setSize(500,500);
		setVisible(true);
	
	
	}

	public static void main(String[] args) {
		new Test7();
	}

	@Override
	public void paint(Graphics g) {		// 클릭한 곳에 좌표 str 출력

		String str;
		str = "(" + x +", " + y +")";
		g.drawString(str, x, y);
		
	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	class MouseHandler extends MouseAdapter{	// 마우스 이벤트

		@Override
		public void mousePressed(MouseEvent e) {		// 마우스를 눌렀을 때
			
			x = e.getX();
			y = e.getY();
			
			repaint();		// update() -> paint()호출
		}

		@Override
		public void mouseReleased(MouseEvent e) {		// 마우스를 뗐을 때

		}
	}
	
	class MouseMotionHandler extends MouseMotionAdapter{

		@Override
		public void mouseDragged(MouseEvent e) {
			String str = String.format("(%d, %d)", e.getX(),e.getY());
			lbl.setText(str);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			
			repaint();		// update() -> paint()호출
		}
		
	}
}
