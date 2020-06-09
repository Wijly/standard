package com.day13;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("서울");
		v.add(30);
		v.add('c');
		
		System.out.println(v);
		
		String str;
		str = (String)v.get(0);		// 형변환, downCast
				
		System.out.println(str);
		
		Integer i;
		i = (Integer)v.get(1);
		
		System.out.println(i);		// 형변환, downcast
		
		char c;
		c= (char)v.get(2);
		
		System.out.println(c);		// 형변환, downcast

	}

}
