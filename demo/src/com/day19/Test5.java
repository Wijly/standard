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
	
		String[] title = {"이름", "국어", "영어", "수학", "총점"};
		setTitle("성적처리");
		
		setLayout(null); 		// null = 수동배치
		
		for(int i = 0; i<5; i++) {
			Label lbl = new Label();		// 레이블 객체 생성
			
			lbl.setText(title[i]); 			// 레이블의 이름은 title의 i번째
			
			lbl.setBounds(10,(i+1)*30,50,20); 	//setBound (가로 세로 폭 높이)	// 세로 값이 변함
			
			add(lbl);			// add로 폼위에 올림
			
			if(i!=4) {
				tf[i] = new TextField();		// 텍스트필드 개체 생성
				tf[i].setBounds(80, (i+1)*30, 70, 20);		// 텍스트 필드 집어넣기
				
				// KeyHandler 리스너 		 텍스트필드에서의 리스너, 버튼1에서의 리스너
				tf[i].addKeyListener(new KeyHandler());
				
				add(tf[i]);
			}else {
				result.setBounds(80, (i+1)*30, 70, 20);		// 라벨 집어넣기
				add(result);
			}
		}
		
		btn1 = new Button("결과");
		btn1.setBounds(180, 30, 60,20);
		add(btn1);
		
		btn1.addActionListener(this);
		
		// KeyHandler 두번째 입력
		btn1.addKeyListener(new KeyHandler());

		btn2 = new Button("종료");
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
	public void actionPerformed(ActionEvent e) {		// 이벤트를 감지하는 메소드
		
		Object ob = e.getSource();
		
		if( ob instanceof Button) {
			
			Button b = (Button)ob;
			
			if(b==btn1) {		// 총합을 구하는 것을 메소드로 처리
				
				execute();
				/*
				// 합계
				int tot = 0;
				
				try {
					
					for(int i=1; i<=3; i++) {
						tot += Integer.parseInt(tf[i].getText());
						
						result.setText(Integer.toString(tot));
						//result.setText(""+tot);
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					result.setText("입력오류");
				}
				*/
				
			}else if(b==btn2) {
				// 종료
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
			result.setText("입력오류");
		}
	}
	
	class KeyHandler extends KeyAdapter{		// 리스너 필요

		@Override
		public void keyPressed(KeyEvent e) {		// 키를 눌렀을 때 되는 메소드
			
			Object ob = e.getSource();
			
			if(e.getKeyCode() !=KeyEvent.VK_ENTER) {		// 엔터가 아니면 리턴
				return;
			}
			
			// 결과 버튼
			if( ob instanceof Button) {
				
				Button b = (Button)ob;
				
				if(b==btn1) {		
					execute();
				}
			}
			
			// 텍스트 박스
			if( ob instanceof TextField) {		//tab대신 엔터를 쳐서 줄을 넘기고 결과까지 가능하게하는 함수
				
				TextField t = (TextField)ob;
				
				for(int i=0; i<tf.length; i++) {  
					if(i!=3 && tf[i]==t) {
						tf[i+1].requestFocus();
						return;
					}else if(tf[3]==t) {		//텍스트필드 3일때
						btn1.requestFocus();		// 엔터를 치면 결과에 커서를 가져다 놓음
						return;
					}
				}
			}
		}	
	}
}
