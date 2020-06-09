package com.black;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int money;
	private int bat;
	private List<Card> d = new ArrayList<>();

	public Player() {
		this("�÷��̾�", 0);
	}

	public Player(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money < 0)
			return;

		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBat(int bat) {
		if (bat < 0)
			return;
		this.bat = bat;
		System.out.println(bat + "���� �����ϼ̽��ϴ�.");
	}

	public int getBat() {
		return bat;
	}

	public void playerPick(Card card) {
		d.add(card);
	}

	public void cardPrint() {
		for (Card c : d) {
			System.out.println(getName() + "�� �� = " + c);
		}
	}
	
	public List<Card> returnArrayList(){ //���� ����� ���� �Լ�
		return d;
	}

}
