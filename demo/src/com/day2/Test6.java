package com.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//
		//삼각형의 가로(w), 세로(l), 높이(h)를 입력 받아 넓이(a)를 구하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w, l, h ;
		double a;
		System.out.printf("가로 : ");
		w = Integer.parseInt(br.readLine());
		//w = Double.parseDouble((br.readLine());
		System.out.printf("세로 : ");
		l = Integer.parseInt(br.readLine());
		System.out.printf("높이 : ");
		h = Integer.parseInt(br.readLine());
		
		a = w*l*h/2.0;
		//a = (double)w*l*h/2;
		
		System.out.printf("삼각기둥의 넓이 = "+ a);
	}

}
