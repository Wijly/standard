package com.day17;

import java.io.IOException;

// Stream
// ������ ����½� ��� �����͸� ���¿� ���þ��� �Ϸõ� �帧���� �����ϴ� ��
// byte ��Ʈ�� = ��ǻ�Ϳ� ��ǻ�ͻ��̿��� ������ ������ �� byte�� ������.


public class Test1 {

	public static void main(String[] args) throws IOException{
		
		int data;
		System.out.print("���ڿ��� �Է��ϼ���. :");
		while((data = System.in.read())!=-1) {			// system.in.read �� int�� �޾Ƴ���.
			char ch = (char)data;
			System.out.print(ch);
		
		}
		

	}

}
