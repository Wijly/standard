package com.day2;

import java.io.*;

class Test5 {
	public static void main(String[] args)throws IOException{

		//�����, ��������, ��������
		//�����

		String name;
		int kor, eng, tot;

	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(" �̸� : "); 
		name  = br.readLine();
		System.out.println();
		System.out.print(" ���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.print(" ���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		tot = kor + eng;

		System.out.println("1. �̸� : " + name + ", ���� ���� : " + kor + ", ���� ���� : " + eng + ", ���� : " + tot);
		System.out.printf("2. �̸� : %s, ���� ���� : %d, ���� ���� : %d, ���� : %d \n",name,kor,eng,tot);
	}
}
