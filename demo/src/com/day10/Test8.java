package com.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��ϼ���(ex: x + y) : ");
		String str = br.readLine();
		
		str = str.replaceAll("\\s", "");
		
//		String[] oper = {"+", "-", "*", "/"};
//		for(String op : oper) {
//			
//		}
		for(String op : new String[] {"+", "-", "*", "/"}) {
			int pos = str.indexOf(op);		// ��ȣ�� �ִ� �� ��ȣ ã��
			if(pos>-1) {						// ��ȣ�� ������ -1
				int num1 = Integer.parseInt(str.substring(0,pos));		//substring(1,10) = 1�������� 10������ ã�� -1
				int num2 = Integer.parseInt(str.substring(pos+1)); 		//pos+1���� ���ڸ�����
			
				int result = 0;
				char operator = str.charAt(pos);				// ������° ���� ������Ͷ�
			
				switch(operator) {
				
				case '+' :
					result = num1+num2;break;
				case '-' :
					result = num1-num2;break;
				case '*' :
					result = num1*num2;break;
				case '/' :
					result = num1/num2;break;				
				}
				
				System.out.printf("%d %c %d = %d",num1,operator,num2,result);
				System.out.println();
				String s = String.format("%d %c %d = %d", num1,operator,num2,result);		// ������� ���� ���� s �ȿ� �־��
				
				System.out.println(s);
			
			}			
		}
	}

}
