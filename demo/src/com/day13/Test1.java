package com.day13;

import java.util.Iterator;
import java.util.Vector;

// Collection Framework
// List(I) - Vector, ArrayList(C)
// Map(I) - HashMap,TreeMap(C)

public class Test1 {
	
	private static final String city[]= {"����","����","�뱸","�λ�","����","��õ","���"};

	public static void main(String[] args) {
		
		// E �� ������ ������Ÿ���� �Է�
		Vector<String> v = new Vector<String>();	// �ڷ��� (Object)	, <String> : Generic. ����ȯ�� ���ϱ����� ����
		
		for(String c : city) {		// city�� ���� c���ְ� c�� ���Ϳ� �������
			v.add(c);	// upcast, stirngŸ���� object��
		}
		
//		v.add(10);
		String str;
		str = v.firstElement();
		System.out.println(str);
		
		str = v.get(0);
		System.out.println(str);
		
		str = v.lastElement();
		System.out.println(str);

		for(int i=0; i<v.size(); i++) {
			
			System.out.print(v.get(i)+" ");
			
		}
		System.out.println();
		
		for(String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// Iterator(�ݺ���)
		// Collection ���� ��±�
		
		Iterator<String> ite = v.iterator();
		
		while(ite.hasNext()) {			//ite.hasNext  : �����Ͱ� ���� �� ����
			str = ite.next();
			System.out.print(str + " ");
		}
		System.out.println("\n---------------------------");
		
		while(ite.hasNext()) {			// next�� ���ؼ� ���� ���� �����Ͱ� �������� ������� ��, �ι����� ��ºҰ���
			str = ite.next();
			System.out.print(str + " ");
		}
		
	}

}
