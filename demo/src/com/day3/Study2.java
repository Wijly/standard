package com.day3;

//예제 6-17 CarTest

class Car{
	
	String color;		//색깔
	String gearType;	// 변속기 종류 - auto, manual
	int door;			// 문 개수

	Car(){}
	Car(String c, String g, int d){
		color = c;
		gearType =	g;
		door = d;
	}
}

public class Study2{
	public static void main(String [] argc) {
		
		Car car1 = new Car();
		
		car1.color = "하얀색";
		car1.gearType = "auto";
		car1.door = 5;
		
		Car car2 = new Car("검은색","수동",4);
		System.out.println("car1의 색 = "+car1.color+", 기어타입 : "+car1.gearType + ", 문 갯수 : "+car1.door);
		System.out.println("car2의 색 = "+car2.color+", 기어타입 : "+car2.gearType + ", 문 갯수 : "+car2.door);
		
	
	}
}
