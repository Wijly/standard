package com.day13;

import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		
		Vector<Test> vt = new Vector<Test>();

//		Test ob = new Test();
//		
//		ob.name = "홍길동";
//		ob.age = 30;
//		
//		vt.add(ob);
//		
//		ob.name = "유인나";
//		ob.age = 37;
//		vt.add(ob);
//		
//		for(Test t : vt){
//			System.out.println(t.name + " : "+ t.age); 		// 주소가 같은 곳을 가르키므로 초기화를 시킴	ex)10번지 홍길동, 10번지 유인나
//		}
		
		Test ob = new Test();
		
		ob.name = "홍길동";
		ob.age = 30;
		vt.add(ob);
		
		ob = new Test();				// 새로운 주소의 ob객체 생성			ex) 10번지 :홍길동, 20번지 : 유인나
		
		ob.name = "유인나";
		ob.age = 37;
		vt.add(ob);
		
		for(Test t : vt){
			System.out.println(t.name + " : "+ t.age); 		// 주소가 같은 곳을 가르키므로 초기화를 시킴
		}
		
	}

}
