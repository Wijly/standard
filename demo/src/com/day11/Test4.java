package com.day11;

// Singleton		
// 메모리에 객체를 생성해도 static이기에 하나만 생성되고
// getInstance로 객체를 불러와도 같은 것을 불러옴

class Sing{

	private static Sing ob;				// 초깃값 null
	
	public static Sing getInstance() {
	
		if(ob == null) {
			ob = new Sing();
		}
		
		return ob;
	
	}

}

public class Test4 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1 == ob2) {
			System.out.println("동일한 객체");
		}else
			System.out.println("다른 객체");

	}

}
