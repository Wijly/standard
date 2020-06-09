package com.black;

public class Card {

	public static final int KIND_MAX = 4; // 카드 종류 수

	public static final int NUM_MAX = 13; // ACE 1, JACK 11, Queen 12, King 13

	public static final int SPADE = 1;
	public static final int CLOVER = 2;
	public static final int DIAMOND = 3;
	public static final int HEART = 4;

	private int kind;
	private int number;

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// 나중에 A의 값 변경시 사용
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {

		String kind = ""; // 1=A, 11=J, 12=Q, 13=K
		String number = "";

		switch (this.kind) {
		case 1:
			kind = "♠";
			break;
		case 2:
			kind = "♣";
			break;
		case 3:
			kind = "◆";
			break;
		case 4:
			kind = "♥";
			break;
		}

		switch (this.number) {
		case 1:
			number = "Ace 1";
			this.number = 1;
			break;
		case 11:
			number = "Jack 10";
			this.number = 10;
			break;
		case 12:
			number = "Queen 10";
			this.number = 10;
			break;
		case 13:
			number = "King 10";
			this.number = 10;
			break;
		default:
			number = "" + this.number;
			break;
		}
		return "종류 : " + kind + ", " + "숫자 : " + number;
	}

}
