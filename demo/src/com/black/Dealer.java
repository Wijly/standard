package com.black;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dealer {

	private String name;
	private int money;
	private List<Card> d = new ArrayList<>();
	
	public Dealer() {
		this("딜러");
	}
	
	public Dealer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if(money < 0)
			return;
		this.money = money;
	}
	
	public void dealerPick(Card card) {
		d.add(card);
	}
	
	public void cardstartPrint() { // 딜러의 두번째 패는 플레이어들의 배팅이 끝난뒤 보여줌
		for(Card c : d) {
			System.out.println("딜러의 패 : " + c.toString());
			break;
		}
		System.out.println("딜러의 패 : " + "비공개");
	}
	
	public void cardPrint() {
		for(Card c : d) {
			System.out.println("딜러의 패 : " + c.toString());
		}
	}
	
	public List<Card> returnArrayList(){ //리턴 사용자 정의 함수
		return d;
	}
	
	
}
