package com.black;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dealer {

	private String name;
	private int money;
	private List<Card> d = new ArrayList<>();
	
	public Dealer() {
		this("����");
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
	
	public void cardstartPrint() { // ������ �ι�° �д� �÷��̾���� ������ ������ ������
		for(Card c : d) {
			System.out.println("������ �� : " + c.toString());
			break;
		}
		System.out.println("������ �� : " + "�����");
	}
	
	public void cardPrint() {
		for(Card c : d) {
			System.out.println("������ �� : " + c.toString());
		}
	}
	
	public List<Card> returnArrayList(){ //���� ����� ���� �Լ�
		return d;
	}
	
	
}
