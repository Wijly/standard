package com.day12;

//Interface
// 추상클래스의 일종으로 선언만있고 정의가 없다.
// final 변수만 정의할 수 있다.
// 인터페이스를 구현하기위해서는 implements를 사용한다
// 하나의 인터페이스를 구현하면 인터페이스의 모든 메소드를 재정의 해야한다.
// 인터페이스가 인터페이스를 상속받을 수 있으며 이때는 extends를 사용한다.
// 또한 클래스와는 다르게 다중상속이 가능하다.

// 인터페이스 =  저장소

interface Fruit{

	String Won = "원";		// 무조건 public, static, final이 생략되어있음
	
	int getPrice();			// public abstract 생략되어있음
	public String getName();	// 메소드는 보통 abstract만 생략
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {				//1000을 반환
		return 1000;
	}

	@Override
	public String getName() {				// 사과를 반환
		return "사과";
	}
	
	public String getItems() {
		
		
		return "과일";
	}
	

}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.print(ob1.getItems()+" ");
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;			// 일종의 UP CAST
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItem());
		
	}

}
