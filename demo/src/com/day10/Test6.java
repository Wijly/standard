package com.day10;

public class Test6 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		// ������Ÿ���� StringBuffer
		sb.append("����");
		sb.append("�λ�");
		sb.append("�뱸");
		
		System.out.println(sb);
		
		// ������Ÿ���� String���� ��ȯ�ؼ� ����Ѵ�.
		String str = sb.toString();
		
		System.out.println(str);			// ���� str�� �־� �ٸ����� ���� �� �ִ�.
		
		//Integer
		int a = 25;
		System.out.println(a);
		System.out.println(Integer.toString(a)+1);		// ���ڷ� ��ȯ
		System.out.println(Integer.toString(a,2));		// 2������ �����Ͱ� ����
		System.out.println(Integer.toString(a,16));		// 16������ �����Ͱ� ����
		
	}

}
