package com.day12;

// 4. 내부 클래스(Annonymous, 익명의 클래스, 무명 클래스)

public class Test9 {
	
	public Object getTitle() {				// 업캐스트
		
//		return "익명의 클래스";
		return new Object() {						// return 무명 클래스

			@Override
			public String toString() {
				return "익명의 클래스";
			}
			
			
		};
	
	}

	public static void main(String[] args) {
		
		Test9 ob = new Test9();
		
		System.out.println(ob.getTitle());

	}

}
