package com.day15;

import java.util.Scanner;

class MyExecp{

	// 5~10�� �̳��� �����ڸ� �Է¹ޱ� (��ҹ��� ����������)
	// ���ڿ��� ���̴� 5~10�� �Դϴ�.
	// �����ڸ� �����մϴ�.
	
	public void imputFormat(String str) throws Exception{
		
		int len = str.length();


		if(len<5 || len>10) {
			throw new Exception("���ڿ��� ���̴� 5~10�ڸ� �����մϴ� ");
		}	
	
		for (int i = 0; i<len; i++) {
			
			char ch = str.charAt(i);
			
			if((ch<65||ch>90)&&(ch<97||ch>122)) {
				throw new Exception("�����ڸ� �����մϴ�. ");	
			}
//			if((str.charAt(i)<'a' || str.charAt(i)>'z' )&& (str.charAt(i)<'A' || str.charAt(i)>'Z')) {
//				throw new Exception("�����ڸ� �����մϴ�. ");
//			}	
		}
	}

}


public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		MyExecp auth = new MyExecp();
		
		try {
			
			System.out.print("���ڿ��� �Է��ϼ��� : ");
			str = sc.next();
			
			auth.imputFormat(str);
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
		
	}

}
