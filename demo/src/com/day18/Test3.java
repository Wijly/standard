package com.day18;

import java.io.BufferedReader;
import java.io.FileReader;

//FileReader
// ���Ͽ��� ����Ʈ�� �о�鿩 ����, ����Ʈ ��Ʈ������ ��ȯ

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("d:\\doc\\test.txt");
			BufferedReader br = new BufferedReader(fr);		// ��ǲ��Ʈ�������� �ϴ� ���� ���� ������ �ϹǷ� fr�� �ٷ� �������
			
			String str;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
