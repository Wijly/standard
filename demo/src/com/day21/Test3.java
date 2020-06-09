package com.day21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ����ȭ ǥ����
// �ܾ�ٲٱ�, �����ּҰ˻�, �����̸����� � ���
/*
 	c[a-z]* : c�� �����ϴ� ���ܾ� (c, ca, caaa)
 	c[a-z] : c�� �����ϴ� �ΰ��� ���ܾ�(ca, cb, cz)
 	c[a-zA-Z0-9]: ca, cA, c9
 	c. : ca,cB,c&
 	c.* : c�� �����ϴ� ��� ����
 	c.*t : ct, chhhht, c632t �� c�ν����ؼ� t�γ����� ����
 	[b|c].* �Ǵ� [b-c].* : b�� c�� �����ϴ� �ܾ�,bbb,bfa,csaf
 	[\\b]+ �Ǵ� [0-9]+ : �ϳ� �̻��� ����
  
*/
public class Test3 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "cb", "c.", "c0", "car", "commit", "count", "date", "disc",
				"rubat" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		System.out.println("---------------");
		
		p = Pattern.compile("c[a-z]+");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		
		System.out.println("---------------");
		
		p = Pattern.compile("c.*");

		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches())
				System.out.println(s);
		}
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		// ���� Ȯ��
		String[] mails = {"abc@naver.com","@aaa.co.kr","@bbb.com","aaa@hanmire.co.kr","sbs.co.kr","abc@abc"};
		
		// [\\w]+ : �ѱ��� �̻��� ��,����
		// @ : at
		// (\\.[\\w]+) : ��ȣ�ȿ� �ִ°��� �ݵ�� �ѹ��� ����
		// \\. : ��Ʈ�� �ݵ�� ����
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";		// �ѱ��̻� ������ + @�� ���� + �ݵ�ó��;��ϴ� .������
		
		for(String s : mails) {
			
			if(Pattern.matches(pat, s)) {
				System.out.println(s);
			}
		}
		
	}
}
