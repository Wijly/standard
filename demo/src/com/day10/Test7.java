package com.day10;

//String�� �޼ҵ�

public class Test7 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String ss[] = s1.split(",");		// split ������ �޼ҵ�. ��ǥ�� ����
		
		for(String s: ss)
			System.out.print(s+" ");
		
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "SeOul";
		
		System.out.println(s2.equals(s3));			//		false = ��ҹ��ڰ� Ʋ���⶧����
		System.out.println(s2.equalsIgnoreCase(s3));	// 	true = ��ҹ��ڸ� ���������ʰ� ��
		
		String s4 = "abc.def.ghi";
		//			 01234567890
		System.out.println(s4.indexOf("."));		// �տ������� .�� ã�� = 3 ��°
		System.out.println(s4.lastIndexOf("."));	// �ڿ������� .�� ã�� = 7 ��°
		System.out.println(s4.indexOf("def"));		// �տ������� def�� ã�� = 4 ��°
		System.out.println(s4.indexOf("x"));		// ���� �����Ƿ� -1			//�����Ͱ� ����-
		//if(s4.indexOf("x") != -1){ }					// ������� -1�� �ƴϸ� = �����Ͱ� ������			
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����", "����");		// ġȯ		(	\n\r -> </br>	)
		System.out.println(s6);
		
		String s7 = "  a  b  c";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll(" ",""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2);
		System.out.println(ch);		// 2��° �ѱ�� = c
		
		System.out.println("abcdefg".length()); 		// ������ ���� 7
		
		System.out.println("abcdefg".startsWith("abc"));	// abc�� �����ϴ°� - true
		System.out.println("abcdefg".startsWith("abd"));	// abd�� �����ϴ°� - false
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		//������ ����
		System.out.println(s8.compareTo(s9));		
		System.out.println(s9.compareTo(s8));		
//===============================================================================================================================================		

	}

}
