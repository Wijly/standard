package com.day20;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

//  swing

public class Test1 extends JFrame implements ActionListener {

	private JLabel lbl;

	public Test1() {

		lbl = new JLabel("메시지", JLabel.CENTER);
		getContentPane().add(lbl);

		// 메뉴 추가
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;

		menu = new JMenu("메세지 대화상자 ");

		mi = new JMenuItem("메세지");
		mi.addActionListener(this);
		menu.add(mi);

		mi = new JMenuItem("입력");
		mi.addActionListener(this);
		menu.add(mi);

		mi = new JMenuItem("종료");
		mi.addActionListener(this);
		menu.add(mi);

		mbar.add(menu);

		setJMenuBar(mbar);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("대화상자");
		setSize(300, 300);
		setBackground(new Color(137, 207, 240));
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼, 텍스트필드 등은 오브젝트로 받지만
		// 메뉴는 스트링으로 받음.
		String str = e.getActionCommand();
		if (str.equals("메세지")) {

			JOptionPane.showMessageDialog(this, "오늘의 날씨", "날씨", JOptionPane.INFORMATION_MESSAGE); // 오늘의 날씨 : 필드값, 날씨 :
																									// 제목

		} else if (str.equals("입력")) {

			String age = JOptionPane.showInputDialog(this, "당신의 나이를 입력하세요 : ", "나이확인", JOptionPane.QUESTION_MESSAGE);

			lbl.setText("나이는 : " + age + "살 입니다.");

		} else if (str.equals("종료")) {

			int result = JOptionPane.showConfirmDialog(this, "프로그램을 종료하시겠습니까?", "종료확인", 
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
//			lbl.setText(Integer.toString(result));
//			System.exit(0);

			if (result == JOptionPane.YES_OPTION) { // yes를 누르면 종료
				System.exit(0);
			}

		}

	}

}
