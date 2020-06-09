package com.day12;

import java.util.Scanner;

interface FruitA{

	String Won = "원";			//static, void, final이 생략
	
	public int getPrice();
	public String getName();
}

interface ItemFruit extends FruitA{			// 상속받음
	
	public String getItems();	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
}

class Apple implements	ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
}


public class Test5 {
	
	public void packing(ItemFruit ob) {
	
	System.out.println(ob.getItems());
	System.out.println(ob.getName());
	System.out.println(ob.getPrice()+ Fruit.Won);
	
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();
		
		System.out.print("1. 오렌지, 2. 사과  : ");
		int n = sc.nextInt();
		if(n == 1) 
			t.packing(new Orange());
		else
			t.packing(new Apple());
		
		/*
		ItemFruit or = new Orange();
//		Orange or = new Orange();
		System.out.println(or.getItems());
		System.out.println(or.getName());
		System.out.println(or.getPrice()+ Fruit.Won);
		
		System.out.println();
		
		Apple ap = new Apple();
		System.out.println(ap.getItems());
		System.out.println(ap.getName());
		System.out.println(ap.getPrice()+ Fruit.Won);
		
		*/
	}

}
