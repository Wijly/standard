package com.day17;

import java.io.FileInputStream;

//FileInputStream


public class Test5 {

	public static void main(String[] args){
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\test.txt");		// ������ ��ġ�� fis�� ����
			
			int data;
			int tot = 0;
			while((data =fis.read())!=-1) {
//				System.out.print((char)data);			// �о��ٰ��ؼ� char�� ����� �� ����
				System.out.print((char)data);
				tot += (char)data;
				System.out.println(tot);
				System.out.flush();			// ���۰� ���������� ������ �������� �ʴµ� flush�� ������ ������ ä���ش�
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
