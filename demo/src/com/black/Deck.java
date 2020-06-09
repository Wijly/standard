package com.black;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX; // ī�� ����4�� ī�� �ִ����13 �� 52��

	private List<Card> deck = new ArrayList<>();

	public Deck() {

		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				getDeck().add(new Card(i+1, j+1));
			}
		}
	}

	// ī�� �̰� ���� ī�� ���ֱ�
	public Card pick() {
		int ran = (int) (Math.random()*getDeck().size());
		Card result = getDeck().get(ran);
		getDeck().remove(ran);
		return result;
	}

	public List<Card> getDeck() {
		return deck;
	}
	
}
