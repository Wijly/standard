package com.day20;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Test2 extends JFrame implements ActionListener{

	private JTextField[] tf = new JTextField[4];
	private JButton btn1, btn2;
	private JTable table;
	
	public Test2() {
		
		getContentPane().setLayout(null);
		
		String[] caption = {"이름","국어","영어","수학"};
		
		for (int i = 0; i<caption.length;i++) {			// 이름 국어 영어 수학을 입력하는 칸
			JLabel lbl = new JLabel(caption[i]);
			lbl.setBounds(10, (i+1)*30, 50, 20);
			getContentPane().add(lbl);
			
			tf[i] = new JTextField();
			tf[i].setBounds(80, (i+1)*30, 70, 20);
			getContentPane().add(tf[i]);
		}
		
		btn1 = new JButton("추가");				//추가 버튼
		btn1.setBounds(10, 160, 60, 20);
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		btn2 = new JButton("종료");				// 종료 버튼
		btn2.setBounds(90, 160, 60, 20);
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
		addTable();			// 테이블을 만드는 메소드 선언
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("성적처리");
		setSize(550,250);
		setBackground(new Color(137,207,240));
		setVisible(true);
		
	}
	
	private void addTable() {				// 테이블을 만드는 메소드 생성
		
		String[] title = {"이름","국어","영어","수학","총점","평균"};
		
		MyTableModel model = new MyTableModel(title);						// addTable에서만 사용하는 클래스
		
		// 위에서 만들어놓은 테이블 객체를 생성하고 model 값을 넣음
		table = new JTable(model);
		
		//스크롤바
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(160, 30, 355, 150);		// 스크롤바 위치
		
		getContentPane().add(sp);		// 스크롤 바 넣기
		
		//컬럼크기 자동변경 off
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 		// 컬럼의 길이가 길어지면 자동 변경 되는걸 끔
		
		//고정된 컬럼폭
		for(int i=0; i<title.length;i++) {
			TableColumn col = table.getColumnModel().getColumn(i);		//table col을 만들고
			col.setPreferredWidth(55);			//  col의 크기를 55로 고정
		}
		
	}
	
	private void process() {			// 데이터를 추가하는 메소드
		
		String[] data = new String[6];
		
		int tot;
		
		try {
			
			tot = 0;
			data[0] = tf[0].getText();		//이름
			
			for(int i = 1; i<=3; i++) {
				data[i] = tf[i].getText();			//국영수
				
				tot += Integer.parseInt(tf[i].getText());		// 총점
			}
			
			data[4] = Integer.toString(tot);		// 총점 넣기
			data[5] = Integer.toString(tot/3);		// 평균
			
			((MyTableModel)table.getModel()).addRow(data);		// 데이터를 그리드에 집어넣음 (다운캐스트)
			
			//초기화
			for(int i = 0; i<tf.length; i++) {
				tf[i].setText("");				
			}
			tf[0].requestFocus();	// 커서다시 가져다놓기
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	class MyTableModel extends DefaultTableModel{
		
		private String[] title;
		
		public MyTableModel(String[] title) {
			this.title = title;
		}
		
		//
		@Override
		public int getColumnCount() {
			
			if(title==null || title.length==0) 		// 컬럼의 개수
				return 0;
			
			return title.length;
		}
		@Override
		public String getColumnName(int column) {		// 컬럼 이름을 보냄, (이름 국어 영어 수학)

			if(title == null || title.length==0)
				return null;
			
			return title[column];
		}
	}
	
	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		// 추가버튼을 눌렀을 때
		if(ob instanceof JButton) {
			JButton b = (JButton)ob;
			
			if(b==btn1) {		// 버튼을 눌렀을 때 실행
				process();
			}else if(b==btn2) {
				System.exit(0);
			}
		}
		
	}

}
