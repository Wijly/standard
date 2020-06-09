package com.day2;

import java.io.*;

class Test5 {
	public static void main(String[] args)throws IOException{

		//사용자, 국어점수, 영어점수
		//선언부

		String name;
		int kor, eng, tot;

	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(" 이름 : "); 
		name  = br.readLine();
		System.out.println();
		System.out.print(" 국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.print(" 영어 점수 : ");
		eng = Integer.parseInt(br.readLine());

		tot = kor + eng;

		System.out.println("1. 이름 : " + name + ", 국어 점수 : " + kor + ", 영어 점수 : " + eng + ", 총점 : " + tot);
		System.out.printf("2. 이름 : %s, 국어 점수 : %d, 영어 점수 : %d, 총점 : %d \n",name,kor,eng,tot);
	}
}
