package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num; 
		int sum;
		char ch;
		
		while(true) {		// ���ѷ���
			
			do {
				System.out.print("���� �Է��ϼ���. (1~9999): ");
				num = Integer.parseInt(br.readLine());
			}
			while(num<1 || num>10000);

			sum = 0;
			for(int i=1;i<=num;i++) {
				sum += i;
			}		
			System.out.println("1 ~ "+num+"������ �� : "+sum);		
			
			// ���� ����
			System.out.print("�ѹ� �� �����Ѵ�.(Y/N) : ");
			ch = (char)System.in.read();
			if(ch != 'Y'&&ch !='y') {
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			}
			
			System.in.skip(2);		// ���� (�ƽ�Ű�� 10, 13 ����)
			
		}
		
	}

}
