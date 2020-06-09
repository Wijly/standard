package com.day21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static String replaceAll(String str,String oldStr, String newStr) {
		
		if(str==null)
			return null;
		
		Pattern p = Pattern.compile(oldStr);	// ����
		Matcher m = p.matcher(str);			// oldStr�� str�� ��
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);		// sb���� ���ο���� ã�� // ����
			
		}
		m.appendTail(sb);				// ���Է½� "�� �Ǿ�" �� ������ ����, ���������� ã�� �ͺ��� ������������ ¥��
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		String str = "�츮���� ���ѹα� ���ѹα� ���� ������ �Ǿ� ������";
		String s = Test4.replaceAll(str, "����", "����");
		
		System.out.println(s);
		

	}

}
