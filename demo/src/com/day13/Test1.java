package com.day13;

import java.util.Iterator;
import java.util.Vector;

// Collection Framework
// List(I) - Vector, ArrayList(C)
// Map(I) - HashMap,TreeMap(C)

public class Test1 {
	
	private static final String city[]= {"서울","대전","대구","부산","광주","인천","울산"};

	public static void main(String[] args) {
		
		// E 에 벡터의 데이터타입을 입력
		Vector<String> v = new Vector<String>();	// 자료형 (Object)	, <String> : Generic. 형변환을 피하기위한 선언
		
		for(String c : city) {		// city의 값을 c에넣고 c를 벡터에 집어넣음
			v.add(c);	// upcast, stirng타입을 object로
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
		
		// Iterator(반복자)
		// Collection 전용 출력기
		
		Iterator<String> ite = v.iterator();
		
		while(ite.hasNext()) {			//ite.hasNext  : 데이터가 있을 때 까지
			str = ite.next();
			System.out.print(str + " ");
		}
		System.out.println("\n---------------------------");
		
		while(ite.hasNext()) {			// next를 통해서 꺼낸 것은 데이터가 움직여서 빈공간이 됌, 두번연속 출력불가능
			str = ite.next();
			System.out.print(str + " ");
		}
		
	}

}
