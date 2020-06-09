package com.black;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Game {

	Player player;
	Dealer dealer;
	Deck deck;
	List<Card> play, deal; // �÷��̾�, ���� ����ī�带 �����ϴ� List
	Iterator<Card> playit, dealit; // List ��ü�� �����ϴ� Iterator
	Card playcard, dealcard; // Iterator�� �� ��ü�� �����ϴ� Card
	int playercardsum = 0, dealercardsum = 0;
	boolean pair = false; // PairBet üũ
	boolean surrender = false; // Surrender üũ
	int c; // �Է� ��ȣ üũ

	Main_Close mc = new Main_Close(); // ���� �̹��� ��� Ŭ����

	Scanner scan = new Scanner(System.in);

	public Game(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
		deck = new Deck();
		dealer.setName("����");
		dealer.setMoney(100000000);
	}

	public void playerMoney() {
		System.out.println(player.getName() + "���� ���� ������ �ִ� ���� " + player.getMoney() + "���Դϴ�.");
	}

	public void batting(int money) {
		player.setBat(money);
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	
	//����
	public void pairbet() throws IOException {
		for (int i = 0; i < 2; i++) {
			player.playerPick(deck.pick());
		}

		play = player.returnArrayList();
		playit = play.iterator();

		while (playit.hasNext()) {

			playcard = playit.next();
			System.out.println(player.getName() + "���� �� : " + playcard);
		}

		if (play.get(0).getNumber() == play.get(1).getNumber()) {
			System.out.println("pair bet�� �����ϼ̽��ϴ�");
			System.out.println(player.getName() + "���� �¸�");
			player.setMoney(player.getMoney() - player.getBat());
			player.setMoney(player.getMoney() + (player.getBat() * 11));
			System.out.println(player.getName() + "�� " + player.getBat() * 11 + "���� �����̽��ϴ�.");

		} else {
			System.out.println("pair bet�� �����Ͽ����ϴ�");
			System.out.println(player.getName() + "���� �й�");
			player.setMoney(player.getMoney() - player.getBat());
			System.out.println(player.getName() + "�� " + player.getBat() + "���� �����̽��ϴ�.");

		}
		play.clear();
	}

	public void start() throws IOException { // ó���� ������ �÷��̾ ī�� ������ ����
		surrender = true; // surrender ����
		playercardsum = 0;
		dealercardsum = 0;

		for (int i = 0; i < 2; i++) {
			player.playerPick(deck.pick());
			dealer.dealerPick(deck.pick());
		}

		play = player.returnArrayList();
		playit = play.iterator();

		while (playit.hasNext()) {
			playcard = playit.next();
			System.out.println(player.getName() + "���� �� : " + playcard);
			playercardsum += playcard.getNumber();

		}

		System.out.println(player.getName() + "���� ī�� �հ� : " + playercardsum);
		System.out.println();

		deal = dealer.returnArrayList();
		dealit = deal.iterator();

		boolean dealcheck = false;
		
		while (dealit.hasNext()) {
			if (!dealcheck) {
				dealcard = dealit.next();
				System.out.println(dealer.getName() + "���� �� : " + dealcard);
				dealcard.toString();
				dealercardsum += dealcard.getNumber();
				dealcheck = true;
				
			} else {
				dealcard = dealit.next();
				System.out.println(dealer.getName() + "���� �� : ���� : ??, ���� : ??");
				dealcard.toString();
				dealercardsum += dealcard.getNumber();
				
			}
		}

		System.out.println();

		// ����
		if ((playercardsum == 21)) {
			System.out.println(player.getName() + "�� ���ϵ帳�ϴ� �����Դϴ�!");
			System.out.println();
			player.setMoney((int) (player.getBat() * 1.5));
			System.out.println(player.getName() + "�� " + player.getMoney() + "���� �����̽��ϴ�.");
			return;
		}

		// A 2��
		if ((playercardsum == 22)) {
			System.out.println(player.getName() + "�� ���ϵ帳�ϴ� AA�Դϴ�!");
			System.out.println();
			player.setMoney((int) (player.getBat() * 10));
			System.out.println(player.getName() + "�� " + player.getMoney() + "���� �����̽��ϴ�.");
			return;
		}
		battle(); // ��� ����
	}

	public void battle() throws IOException {

		boolean status = true; // �÷��̾� ����, true = ����, false = Ż��
		boolean doublecheck = false;

		Table t = new Table();
		int cnt = 0;

		out: while (true) {

			do {
				System.out.println(
						" =================================================================================================");
				System.out.println(
						"��1�� Hit           ��2�� Stay             ��3�� Double             ��4�� Surrender              ��");
				System.out.println(
						" =================================================================================================");
				System.out.print("�Է� : ");
				c = scan.nextInt();
				System.out.println();
			} while (c < 1 || c > 4);

			switch (c) {

			case 1:
				while (true) {

					cnt++;

					if (doublecheck) {
						System.out.println("������ �ϼ̱� ������ ī�带 ���� �� �����ϴ�.");
						break;
					}
					if(cnt==1){
						t.imageHit();
					}
					if(cnt==2){
						t.imageHit2();
						cnt=0;
					}
					System.out.println(
							"=================================================================================================");
					playcard = deck.pick();
					System.out.println(player.getName() + "�� ���� ī�� : " + playcard);
					playercardsum += playcard.getNumber();
					
					
					// 21�� �Ѿ��� �� �ٷ� �й�
					if (playercardsum > 21) {
						System.out.println(player.getName() + "���� ī�� ���� " + playercardsum + "���ν� Bust");
						System.out.println(player.getName() + "�� �й�");
						System.out.println("���� ����");

						System.out.println();

						player.setMoney(player.getMoney() - player.getBat());
						System.out.println(player.getName() + "�� " + player.getBat() + "���� �����̽��ϴ�..");
						status = false; // �÷��̾� ���� Ż������ ����
						break out;
					}
					System.out.println("���� " + player.getName() + "���� ī�� �հ�: " + playercardsum);
					System.out.println();
					break;
				}
				break;

			case 2:		// stay���� ��
				System.out.println(
						"=================================================================================================");
				System.out.println(player.getName() + "���� ī�� �� �հ� : " + playercardsum);
				System.out.println(player.getName() + " �� ����");
				System.out.println();

				System.out.println(dealer.getName() + "�� ����");
				
//				System.out.println("����������*����������*��������*��������*��������");
				DealerWait dw = new DealerWait();
				dw.start();
				try {
					dw.join();
				} catch (Exception e) {
				}

				// ����ī�� ���
				dealer.cardPrint();

				if (dealercardsum >= 17) {		// ����ī���� ���� 17�� ���� ��
					if ((status && playercardsum > dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) { // �÷��̾�
																													// ��
						System.out.println(
								"=================================================================================================");
						System.out.println(dealer.getName() + "�� ī�� �� �հ� : " + dealercardsum);
						System.out.printf(player.getName() + "���� �� : %d > " + dealer.getName() + "���� �� : %d\n", playercardsum, dealercardsum);
						System.out.println(player.getName() + "���� �¸�");
						System.out.println();
						player.setMoney(player.getMoney() + player.getBat());
						System.out.println(player.getName() + "�� " + player.getBat()*2 + "���� �����̽��ϴ�.");
						break out;
					} else if ((status && playercardsum == dealercardsum)&& (playercardsum < 22 && dealercardsum < 22)) { // ���º�
						
						System.out.println(
								"=================================================================================================");
						System.out.println("������ ī�� ���հ�: " + dealercardsum);
						System.out.printf(player.getName() + "���� �� : %d = " + dealer.getName() + "���� �� : %d\n",playercardsum, dealercardsum);
						System.out.println(player.getName() + "�԰� " + dealer.getName() + "���� �����ϴ�.");
						System.out.println(player.getName() + "�� " + player.getBat() + "���� ���� �����̽��ϴ�.");
						System.out.println();
						
						break out;
						
					} else if ((status && playercardsum < dealercardsum)&& (playercardsum < 22 && dealercardsum < 22)) { // �÷��̾� ��
						
						System.out.println(
								"=================================================================================================");
						System.out.println(dealer.getName() + "�� ī�� �� �հ� : " + dealercardsum);
						System.out.printf(player.getName() + "���� �� : %d < " + dealer.getName() + "���� : �� %d\n",playercardsum, dealercardsum);
						System.out.println(player.getName() + "���� �й�");
						System.out.println();
						player.setMoney(player.getMoney() - player.getBat());
						System.out.println(player.getName() + "�� " + player.getBat() + "���� �����̽��ϴ�.");
						
						break out;
						
					}
				} // if�� ��

				System.out.println();
				

				// ������ ���ں������� ī�带 ����
				while (true) {		
					dealcard = deck.pick();
					dealcard.toString();
					if(dealcard.getNumber() == 11 || dealcard.getNumber() == 12 || dealcard.getNumber() == 13) {
						dealcard.setNumber(10);
					}
					System.out.println(dealer.getName() + "�� ���� ī�� : " + dealcard);		
					dealercardsum += dealcard.getNumber();

					if (dealercardsum > 21) {
						
						System.out.println(dealer.getName() + "�� ī�� ���� " + dealercardsum + "���� 21�� �ʰ��� Bust �Դϴ�.");
						System.out.println("���� ����");
						System.out.println();

						player.setMoney(player.getMoney() + player.getBat());
						System.out.println(player.getName() + "���� �¸�");
						System.out.println(player.getName() + "�� " + player.getBat()*2 + "���� �����̽��ϴ�.");

						break out;
						
					} else if (dealercardsum >= 17) {

						if ((status && playercardsum > dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							System.out.println(
									"=================================================================================================");
							System.out.println(dealer.getName() + "�� ī�� �� �հ� : " + dealercardsum);
							System.out.printf(player.getName() + "���� �� : %d > " + dealer.getName() + "���� �� : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "���� �¸�");
							player.setMoney(player.getMoney() + player.getBat());
							System.out.println(player.getName() + "�� " + player.getBat()*2 + "���� �����̽��ϴ�.");
							break out;
							
						} else if ((status && playercardsum == dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							
							System.out.println(
									"=================================================================================================");
							System.out.println("������ ī�� ���հ�: " + dealercardsum);
							System.out.printf(player.getName() + "���� �� : %d = " + dealer.getName() + "���� �� : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "�԰� " + dealer.getName() + "���� �����ϴ�.");
							System.out.println();
							break out;
							
						} else if ((status && playercardsum < dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							
							System.out.println(
									"=================================================================================================");
							System.out.println(dealer.getName() + "�� ī�� �� �հ� : " + dealercardsum);
							System.out.printf(player.getName() + "���� �� : %d < " + dealer.getName() + "���� �� : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "���� �й�");
							player.setMoney(player.getMoney() - player.getBat());
							System.out.println(player.getName() + "�� " + player.getBat() + "���� �����̽��ϴ�.");
							break out;
							
						}
						// 16���� ������ ī�带 ������
					} else if (dealercardsum <= 16) {
						System.out.println("���� ������ ī���� �� : " + dealercardsum);
						System.out.println();
					}
				} 


			case 3:		// ���� ����ΰ�
				if (player.getMoney() < player.getBat() * 2) {
					System.out.println("������ �� �� �����ϴ�.");
					playerMoney();
					System.out.println("�����ݾ��� �����մϴ�.");
					System.out.println();
					break;
				}
				if(!doublecheck) {
				int doublemoney = player.getBat() * 2; // ���� �ݾ�
				playcard = deck.pick();
				playcard.toString();
				playercardsum += playcard.getNumber();

				if (playercardsum > 21) {
					System.out.println(
							"=================================================================================================");
					System.out.println(player.getName() + "�� ���� ī�� : " + playcard);	
					System.out.println(player.getName() + "�� ī�� ���� " + playercardsum + "���� 21�� �ʰ��� Bust �Դϴ�.");
					System.out.println("���� ����");
					player.setMoney(player.getMoney() - doublemoney);
					System.out.println(player.getName() + "�� " + player.getBat() + "���� �����̽��ϴ�.");
					status = false; // �÷��̾� ���� Ż������ ����
					break out;
				}
				System.out.println(player.getName() + "�� ���� ī�� : " + playcard);	
				System.out.println(player.getName() + "���� ī�� �� : " + playercardsum);
				System.out.println("���̻� ī�带 ���� �� �����ϴ�");
				doublecheck = true;
				player.setBat(doublemoney);
				System.out.println();
				} else {
					System.out.println("�̹� ������ �߽��ϴ�. 2�� Stay�� ��������.");
				}
				break; // case 3 break;

				// ������
			case 4:		
				if (doublecheck) {
					System.out.println("������ �ϼ̱� ������ �������� �Ͻ� �� �����ϴ�.");
					break;
				}
				System.out.println("Surrender");
				System.out.println(player.getName() + "���� �й�");
				player.setMoney(player.getMoney() - (player.getBat() / 2));
				System.out.println(player.getName() + "�� " + player.getBat()/2 + "���� �����̽��ϴ�.");
				break out;
			}
			
		}
		deck = new Deck();
	}
}