package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//
		//�ﰢ���� ����(w), ����(l), ����(h)�� �Է� �޾� ����(a)�� ���Ͻÿ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w, l, h ;
		double a;
		System.out.printf("���� : ");
		w = Integer.parseInt(br.readLine());
		//w = Double.parseDouble((br.readLine());
		System.out.printf("���� : ");
		l = Integer.parseInt(br.readLine());
		System.out.printf("���� : ");
		h = Integer.parseInt(br.readLine());
		
		a = w*l*h/2.0;
		//a = (double)w*l*h/2;
		
		System.out.printf("�ﰢ����� ���� = "+ a);
	}

}
