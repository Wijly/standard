package com.day13;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("����");
		v.add(30);
		v.add('c');
		
		System.out.println(v);
		
		String str;
		str = (String)v.get(0);		// ����ȯ, downCast
				
		System.out.println(str);
		
		Integer i;
		i = (Integer)v.get(1);
		
		System.out.println(i);		// ����ȯ, downcast
		
		char c;
		c= (char)v.get(2);
		
		System.out.println(c);		// ����ȯ, downcast

	}

}
