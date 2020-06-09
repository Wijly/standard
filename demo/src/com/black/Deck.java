package com.black;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	public static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX; // 카드 종류4개 카드 최대숫자13 총 52개

	private List<Card> deck = new ArrayList<>();

	public Deck() {

		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				getDeck().add(new Card(i+1, j+1));
			}
		}
	}

	// 카드 뽑고 뽑은 카드 없애기
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
