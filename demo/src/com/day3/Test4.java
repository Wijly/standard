package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	
		public static void main(String[] args) throws IOException {
		
			//���
			// if, for, while, do-while, switch
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num;
			String str = ""; // null�� �ʱ�ȭ
			
			System.out.println("���� �Է��ϼ���. : ");
			num = Integer.parseInt(br.readLine());
			
			
			// ���� if��
/*			if(num%2==0) {
				str = "¦��";		
			}
			if(num%2 !=0) 
				str = "Ȧ��";
			System.out.println(num + " : " +str);
			
*/
			
			if(num %2 == 0) {
				str ="¦��";
			}else
				str ="Ȧ�� ";
		
			System.out.println(num + " : " +str);
		}
	
}
