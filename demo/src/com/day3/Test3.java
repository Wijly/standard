package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException{
		
/*		//char
		char a = 'a';
		char b = '��';
		String s = "��";
	*/	
		char ch = 'a';
		
		// �ƽ�Ű ���� �����ִ� ��. �� a = 97��° �ƽ�Ű�ڵ� �̹Ƿ� a�� �����ϴ� ���� �ƴ� 97��°�� ����
		System.out.println(ch);
		System.out.println(Integer.toString(ch));
		
		char ar,result;
		
		System.out.print("�Ѱ��� ���� : "); //ab(97,98)�� �Է��ص� char�̹Ƿ� a(97)�� ������
		ar = (char)System.in.read();
		
			// �빮�ڰ� ������ +32�� �ؼ� �ҹ��ڷ� �ٲ� // �ҹ��ڰ� ������ �빮�ڷ� �ٲ�
		result = ar>=65 && ar<=90?(char)(ar+32):(ar>='a'&&ar<=122?(char)(ar-32):ar);
		
		System.out.println(ar + " => "+ result);
		
		
	}

}
