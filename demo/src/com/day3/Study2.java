package com.day3;

//���� 6-17 CarTest

class Car{
	
	String color;		//����
	String gearType;	// ���ӱ� ���� - auto, manual
	int door;			// �� ����

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
		
		car1.color = "�Ͼ��";
		car1.gearType = "auto";
		car1.door = 5;
		
		Car car2 = new Car("������","����",4);
		System.out.println("car1�� �� = "+car1.color+", ���Ÿ�� : "+car1.gearType + ", �� ���� : "+car1.door);
		System.out.println("car2�� �� = "+car2.color+", ���Ÿ�� : "+car2.gearType + ", �� ���� : "+car2.door);
		
	
	}
}
