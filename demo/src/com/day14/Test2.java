package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

//	Map<Ű,��> - List	
//	HashTable - Vector = ����ȭ�� �Ѵ�
// 	HashMap - ArrayList = ����ȭ�� �����ʴ´�.

// Ű�� �ߺ����� ���� �� ����. - �⺻Ű
// Ű�� �ߺ����̸� ���������� ����ȴ� ( ���� )
// Map�� Iterator�� ����.
// put(Ű, ��) - �Է�
// get

public class Test2 {

	public static final String name[] = { "������", "������", "���α�", "������", "������", "���¿�", "�ٽ���" }; // value = ��

	public static final String tel[] = { "111-111", "222-222", "333-333", "222-222", "555-555", "666-666", "777-777" }; // key
																														// =
																														// �⺻Ű

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]); // �迭 �Է�
		}

		System.out.println(h);

		String str;
		str = h.get("111-111"); // Key ������ Value�� �˻��Ѵ�.
		System.out.println(str);

		// Ű�� �����ϴ��� �˻�
		if (h.containsKey("222-222")) {
			System.out.println("Ű���� �����մϴ�.");
		} else {
			System.out.println("���������ʽ��ϴ�.");
		}

		// value ���� �����ϴ��� �˻�
		if (h.containsValue("�ٽ���")) {
			System.out.println("�ٽ��� �����̵�");
		} else {
			System.out.println("�ٽ�������");
		}

		//Ű�� ����
		h.remove("222-222");
		if (h.containsKey("222-222")) {			// Ű�� �����ϴ��� �˻�
			System.out.println("Ű���� �����մϴ�.");
		} else {
			System.out.println("���������ʽ��ϴ�.");
		}
		
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();
			String value = h.get(key);
			
			System.out.println(key + " : " + value);
			
		}

	}

}
