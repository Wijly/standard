package com.day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*;

class Test4{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// System.in : ����ڰ� Ű����� �Է� ���� 1byte�� ����
		// InputStreamReader : System. in���� �Է¹��� 1bye�� ����(2byte)�� ��ȯ
		// BufferedReader : �޸𸮿� ������ ����� �����͸� �����ϴ� ��.
		// �Է� ���� ���� ��ȯ�Ͽ� ������� �޸��� br�� ����

		int r;
		double a, l;

		System.out.printf("������ �Է� : ");
		
		r = Integer.parseInt(br.readLine());	// br�� ���ڷ� ��ȯ�ϱ� ������ Integer�� ����� ������ �� ��ȯ�Ѵ�.
												// readLine�� ����Ϸ��� throws IOException�� ����ؾ��Ѵٰ� API�� ��õǾ��ִ�.

		a = (double)r * r * 3.14;
		l = (double)2 * r * 3.14;
		
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}