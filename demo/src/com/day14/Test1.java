package com.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
	
		lists.add("����");
		lists.add("����");
		lists.add("�뱸");
		lists.add("�λ�");
		
		Iterator<String> it = lists.iterator();			// �迭�� ����� �� �ְ�����
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+ " ");
		}
		System.out.println();
		
		ListIterator<String> it1 = lists.listIterator();
		
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		
		while(it1.hasPrevious()) {
			System.out.print(it1.previous()+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		
		
		List<String> lists1 = new ArrayList<>();
		
		lists1.addAll(lists);				// ����Ʈ ��ü ����
		lists1.add("��õ");
		
		int n = lists1.indexOf("�λ�");			// �λ��°�� index���� n�� ����
		lists1.add(n+1,"����");					// �λ� ������ ���ָ� ����
		for(String s:lists1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		
		List<String> lists2 = new ArrayList<>();
		lists2.add("�ڹ������ѷηα׷���");
		lists2.add("�����ӿ�ũ");
		lists2.add("�ڹ� jjjjjava");
		lists2.add("���");
		lists2.add("������");
		
		String str;
		
		Iterator<String> it2 = lists2.iterator();
		
		while(it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("�ڹ�")) {				// �ڹٷ� �����ϴ� �� 
				System.out.println(str);
			}
		}
		
	}

}
