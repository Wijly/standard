package com.day13;

import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		
		Vector<Test> vt = new Vector<Test>();

//		Test ob = new Test();
//		
//		ob.name = "ȫ�浿";
//		ob.age = 30;
//		
//		vt.add(ob);
//		
//		ob.name = "���γ�";
//		ob.age = 37;
//		vt.add(ob);
//		
//		for(Test t : vt){
//			System.out.println(t.name + " : "+ t.age); 		// �ּҰ� ���� ���� ����Ű�Ƿ� �ʱ�ȭ�� ��Ŵ	ex)10���� ȫ�浿, 10���� ���γ�
//		}
		
		Test ob = new Test();
		
		ob.name = "ȫ�浿";
		ob.age = 30;
		vt.add(ob);
		
		ob = new Test();				// ���ο� �ּ��� ob��ü ����			ex) 10���� :ȫ�浿, 20���� : ���γ�
		
		ob.name = "���γ�";
		ob.age = 37;
		vt.add(ob);
		
		for(Test t : vt){
			System.out.println(t.name + " : "+ t.age); 		// �ּҰ� ���� ���� ����Ű�Ƿ� �ʱ�ȭ�� ��Ŵ
		}
		
	}

}
