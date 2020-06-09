package com.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		// Set : �ߺ����� ��� ����(Map�� key)
		Set<String> s = new HashSet<>();

		s.add("����");
		s.add("����");
		s.add("�뱸");

		System.out.println(s);

		Iterator<String> it = s.iterator(); // ������ ���
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();

		s.add("����");
		System.out.println(s);
		System.out.println("-*-*-*-*-*-*-***-*-*-*-*-*-");

		// Stack
		Stack<String> st = new Stack<>();
		st.add("����");
		st.push("����");
		st.push("�뱸");
		st.push("�λ�");

		while (!st.empty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();

		// Queue
		Queue<String> q = new LinkedList<>();

		q.add("����");
		q.offer("����");
		q.offer("ȭ��");
		q.offer("����");

		while (q.peek() != null) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();

		List<String> lists1 = new LinkedList<>();

		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");

		List<String> lists2 = new LinkedList<>();

		lists2.add("���");
		lists2.add("����");
		lists2.add("��");
		
		lists2.addAll(lists1);						// lists2�� 1�� �߰�
		
		for(String a : lists2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		lists2.subList(2, 5).clear();				// index 2���� 5 -1���� ����
		for(String a : lists2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
//		-=-=-=-=-=-===========------------------
		
		String[] str = {"��","��","��","��","��","��","��"};
		
		for (String a : str) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		Arrays.sort(str);
		for(String a : str) {
			System.out.print(a+" ");
		}
		System.out.println();
		
	}

}

/*

 	Iterater<�������ڷ���> it = lists.iterator();
 	while(it.hasNext()){ 
 		������ �ڷ��� data = it.next();
 	}
 	---------------------------------------------------------------------------------
 	[List]
 	List<������ �ڷ���> lists = new ArrayList<������ �ڷ���> ();
 	List<������ �ڷ���> lists = new Vector<������ �ڷ���>();
 																				==
 	ArrayList<������ �ڷ���> lists = new ArrayList<�������ڷ���>();
 	Vector<������ �ڷ���> lists = new Vector<�������ڷ���>();
 	
 	�Է� : lists.add(��);
 	
 	��� :
 	Iterater<�������ڷ���> it = lists.iterator();
 	 	
 	Iterater<�������ڷ���> it = lists.iterator();
 		while(it.hasNext()){ 
 			������ �ڷ��� data = it.next();
 		}
 	-----------------------------------------------------------------------------------
 	[Map]
 	Map<Ű, ������ �ڷ���> map = new HashMap<>();
 	Map<Ű, ������ �ڷ���> map = new HashTable<>();
 																				==
 	HashMap<Ű, ������ �ڷ���> map = new HashMap<>();
 	HashTable<Ű, ������ �ڷ���> map = new HashTable<>();
 	
 	�Է� : map.put(Ű,��);
 	
 	��� : 
 	Iterater<Ű�ڷ���> it = map.keySet().iterator();
 	
 	while(it.hasNext()){ 
 		Ű�ڷ��� key = it.next();
 		������ �ڷ��� data = map.get(key);
 	}
*/











