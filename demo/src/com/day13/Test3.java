package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test3 {
	
	private static final String city[]= {"����","����","�뱸","�λ�","����","��õ","���"};

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		String str;
		
		System.out.println("���� �ʱ� �뷮 : "+v.capacity()); //	10
		
		for(String c: city) 
			v.add(c);
		
		System.out.println();
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("������(���)�� ���� : "+v.size());
		
		// ġȯ
		v.set(0, "Seoul");
		v.set(1, "Daejeon");

		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//����
		v.insertElementAt("���ѹα�", 0);
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//�˻�
		int index = v.indexOf("�뱸");		// index = 3 ;
		System.out.println(index);
		
		if(index !=-1) {		//ã�����ϴ� �����Ͱ� ������
			System.out.println("�˻� ���� : " + index);
		}else {
			System.out.println(" �˻� ���� : " + index);
		}
		
		// �������� ����
		Collections.sort(v);
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// �������� ����
		Collections.sort(v, Collections.reverseOrder());
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// ����
		v.remove("Daejeon");
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// �뷮 ����
		for(int i = 1 ; i<=20; i++) {
			v.add(Integer.toString(i));
		}
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		System.out.println("���� ���� �뷮 : "+v.capacity());
		System.out.println("������(���)�� ���� : "+v.size());
		
		// Ư�� ���� ����
		
		for(int i =1; i<=10; i++) {
			v.remove(7);				//7���� ����� ������ �ϳ��� �������ͼ� �������� ��� ����� ��
		}
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		System.out.println("���� ���� �뷮 : "+v.capacity());		// �ڷḦ ������ �뷮�� �ڵ����� ����������
		System.out.println("������(���)�� ���� : "+v.size());
		
		// �� ���� ���� ����
		v.trimToSize();
		System.out.println("���� ���� �뷮 : "+v.capacity());
		System.out.println("������(���)�� ���� : "+v.size());
		
		// ��� ������ ����
		v.clear();
		System.out.println("���� ���� �뷮 : "+v.capacity());
		System.out.println("������(���)�� ���� : "+v.size());
	}

}
