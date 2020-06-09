package com.black;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Game {

	Player player;
	Dealer dealer;
	Deck deck;
	List<Card> play, deal; // 플레이어, 딜러 보유카드를 저장하는 List
	Iterator<Card> playit, dealit; // List 객체를 저장하는 Iterator
	Card playcard, dealcard; // Iterator의 각 객체를 저장하는 Card
	int playercardsum = 0, dealercardsum = 0;
	boolean pair = false; // PairBet 체크
	boolean surrender = false; // Surrender 체크
	int c; // 입력 번호 체크

	Main_Close mc = new Main_Close(); // 종료 이미지 출력 클래스

	Scanner scan = new Scanner(System.in);

	public Game(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
		deck = new Deck();
		dealer.setName("딜러");
		dealer.setMoney(100000000);
	}

	public void playerMoney() {
		System.out.println(player.getName() + "님이 현재 가지고 있는 돈은 " + player.getMoney() + "원입니다.");
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
	
	
	//페어빗
	public void pairbet() throws IOException {
		for (int i = 0; i < 2; i++) {
			player.playerPick(deck.pick());
		}

		play = player.returnArrayList();
		playit = play.iterator();

		while (playit.hasNext()) {

			playcard = playit.next();
			System.out.println(player.getName() + "님의 패 : " + playcard);
		}

		if (play.get(0).getNumber() == play.get(1).getNumber()) {
			System.out.println("pair bet에 성공하셨습니다");
			System.out.println(player.getName() + "님의 승리");
			player.setMoney(player.getMoney() - player.getBat());
			player.setMoney(player.getMoney() + (player.getBat() * 11));
			System.out.println(player.getName() + "님 " + player.getBat() * 11 + "원을 얻으셨습니다.");

		} else {
			System.out.println("pair bet에 실패하였습니다");
			System.out.println(player.getName() + "님의 패배");
			player.setMoney(player.getMoney() - player.getBat());
			System.out.println(player.getName() + "님 " + player.getBat() + "원을 잃으셨습니다.");

		}
		play.clear();
	}

	public void start() throws IOException { // 처음은 딜러와 플레이어가 카드 두장을 받음
		surrender = true; // surrender 가능
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
			System.out.println(player.getName() + "님의 패 : " + playcard);
			playercardsum += playcard.getNumber();

		}

		System.out.println(player.getName() + "님의 카드 합계 : " + playercardsum);
		System.out.println();

		deal = dealer.returnArrayList();
		dealit = deal.iterator();

		boolean dealcheck = false;
		
		while (dealit.hasNext()) {
			if (!dealcheck) {
				dealcard = dealit.next();
				System.out.println(dealer.getName() + "님의 패 : " + dealcard);
				dealcard.toString();
				dealercardsum += dealcard.getNumber();
				dealcheck = true;
				
			} else {
				dealcard = dealit.next();
				System.out.println(dealer.getName() + "님의 패 : 종류 : ??, 숫자 : ??");
				dealcard.toString();
				dealercardsum += dealcard.getNumber();
				
			}
		}

		System.out.println();

		// 블랙잭
		if ((playercardsum == 21)) {
			System.out.println(player.getName() + "님 축하드립니다 블랙잭입니다!");
			System.out.println();
			player.setMoney((int) (player.getBat() * 1.5));
			System.out.println(player.getName() + "님 " + player.getMoney() + "원을 얻으셨습니다.");
			return;
		}

		// A 2개
		if ((playercardsum == 22)) {
			System.out.println(player.getName() + "님 축하드립니다 AA입니다!");
			System.out.println();
			player.setMoney((int) (player.getBat() * 10));
			System.out.println(player.getName() + "님 " + player.getMoney() + "원을 얻으셨습니다.");
			return;
		}
		battle(); // 경기 시작
	}

	public void battle() throws IOException {

		boolean status = true; // 플레이어 상태, true = 생존, false = 탈락
		boolean doublecheck = false;

		Table t = new Table();
		int cnt = 0;

		out: while (true) {

			do {
				System.out.println(
						" =================================================================================================");
				System.out.println(
						"┃1┃ Hit           ┃2┃ Stay             ┃3┃ Double             ┃4┃ Surrender              ┃");
				System.out.println(
						" =================================================================================================");
				System.out.print("입력 : ");
				c = scan.nextInt();
				System.out.println();
			} while (c < 1 || c > 4);

			switch (c) {

			case 1:
				while (true) {

					cnt++;

					if (doublecheck) {
						System.out.println("더블을 하셨기 때문에 카드를 받을 수 없습니다.");
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
					System.out.println(player.getName() + "가 뽑은 카드 : " + playcard);
					playercardsum += playcard.getNumber();
					
					
					// 21을 넘었을 때 바로 패배
					if (playercardsum > 21) {
						System.out.println(player.getName() + "님의 카드 합은 " + playercardsum + "으로써 Bust");
						System.out.println(player.getName() + "의 패배");
						System.out.println("게임 종료");

						System.out.println();

						player.setMoney(player.getMoney() - player.getBat());
						System.out.println(player.getName() + "님 " + player.getBat() + "원을 잃으셨습니다..");
						status = false; // 플레이어 상태 탈락으로 변경
						break out;
					}
					System.out.println("현재 " + player.getName() + "님의 카드 합계: " + playercardsum);
					System.out.println();
					break;
				}
				break;

			case 2:		// stay했을 때
				System.out.println(
						"=================================================================================================");
				System.out.println(player.getName() + "님의 카드 총 합계 : " + playercardsum);
				System.out.println(player.getName() + " 턴 종료");
				System.out.println();

				System.out.println(dealer.getName() + "패 공개");
				
//				System.out.println("─────*─────*────*────*────");
				DealerWait dw = new DealerWait();
				dw.start();
				try {
					dw.join();
				} catch (Exception e) {
				}

				// 딜러카드 출력
				dealer.cardPrint();

				if (dealercardsum >= 17) {		// 딜러카드의 합이 17을 넘을 때
					if ((status && playercardsum > dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) { // 플레이어
																													// 승
						System.out.println(
								"=================================================================================================");
						System.out.println(dealer.getName() + "의 카드 총 합계 : " + dealercardsum);
						System.out.printf(player.getName() + "님의 합 : %d > " + dealer.getName() + "님의 합 : %d\n", playercardsum, dealercardsum);
						System.out.println(player.getName() + "님의 승리");
						System.out.println();
						player.setMoney(player.getMoney() + player.getBat());
						System.out.println(player.getName() + "님 " + player.getBat()*2 + "원을 얻으셨습니다.");
						break out;
					} else if ((status && playercardsum == dealercardsum)&& (playercardsum < 22 && dealercardsum < 22)) { // 무승부
						
						System.out.println(
								"=================================================================================================");
						System.out.println("딜러의 카드 총합계: " + dealercardsum);
						System.out.printf(player.getName() + "님의 합 : %d = " + dealer.getName() + "님의 합 : %d\n",playercardsum, dealercardsum);
						System.out.println(player.getName() + "님과 " + dealer.getName() + "님이 비겼습니다.");
						System.out.println(player.getName() + "님 " + player.getBat() + "원을 돌려 받으셨습니다.");
						System.out.println();
						
						break out;
						
					} else if ((status && playercardsum < dealercardsum)&& (playercardsum < 22 && dealercardsum < 22)) { // 플레이어 패
						
						System.out.println(
								"=================================================================================================");
						System.out.println(dealer.getName() + "의 카드 총 합계 : " + dealercardsum);
						System.out.printf(player.getName() + "님의 합 : %d < " + dealer.getName() + "님의 : 합 %d\n",playercardsum, dealercardsum);
						System.out.println(player.getName() + "님의 패배");
						System.out.println();
						player.setMoney(player.getMoney() - player.getBat());
						System.out.println(player.getName() + "님 " + player.getBat() + "원을 잃으셨습니다.");
						
						break out;
						
					}
				} // if문 끝

				System.out.println();
				

				// 딜러가 숫자부족으로 카드를 뽑음
				while (true) {		
					dealcard = deck.pick();
					dealcard.toString();
					if(dealcard.getNumber() == 11 || dealcard.getNumber() == 12 || dealcard.getNumber() == 13) {
						dealcard.setNumber(10);
					}
					System.out.println(dealer.getName() + "가 뽑은 카드 : " + dealcard);		
					dealercardsum += dealcard.getNumber();

					if (dealercardsum > 21) {
						
						System.out.println(dealer.getName() + "님 카드 합이 " + dealercardsum + "으로 21을 초과한 Bust 입니다.");
						System.out.println("게임 종료");
						System.out.println();

						player.setMoney(player.getMoney() + player.getBat());
						System.out.println(player.getName() + "님의 승리");
						System.out.println(player.getName() + "님 " + player.getBat()*2 + "원을 얻으셨습니다.");

						break out;
						
					} else if (dealercardsum >= 17) {

						if ((status && playercardsum > dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							System.out.println(
									"=================================================================================================");
							System.out.println(dealer.getName() + "의 카드 총 합계 : " + dealercardsum);
							System.out.printf(player.getName() + "님의 합 : %d > " + dealer.getName() + "님의 합 : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "님의 승리");
							player.setMoney(player.getMoney() + player.getBat());
							System.out.println(player.getName() + "님 " + player.getBat()*2 + "원을 얻으셨습니다.");
							break out;
							
						} else if ((status && playercardsum == dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							
							System.out.println(
									"=================================================================================================");
							System.out.println("딜러의 카드 총합계: " + dealercardsum);
							System.out.printf(player.getName() + "님의 합 : %d = " + dealer.getName() + "님의 합 : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "님과 " + dealer.getName() + "님이 비겼습니다.");
							System.out.println();
							break out;
							
						} else if ((status && playercardsum < dealercardsum) && (playercardsum < 22 && dealercardsum < 22)) {
							
							System.out.println(
									"=================================================================================================");
							System.out.println(dealer.getName() + "의 카드 총 합계 : " + dealercardsum);
							System.out.printf(player.getName() + "님의 합 : %d < " + dealer.getName() + "님의 합 : %d\n",playercardsum, dealercardsum);
							System.out.println(player.getName() + "님의 패배");
							player.setMoney(player.getMoney() - player.getBat());
							System.out.println(player.getName() + "님 " + player.getBat() + "원을 잃으셨습니다.");
							break out;
							
						}
						// 16보다 작으면 카드를 더뽑음
					} else if (dealercardsum <= 16) {
						System.out.println("현재 딜러의 카드의 합 : " + dealercardsum);
						System.out.println();
					}
				} 


			case 3:		// 묻고 더블로가
				if (player.getMoney() < player.getBat() * 2) {
					System.out.println("더블을 할 수 없습니다.");
					playerMoney();
					System.out.println("보유금액이 부족합니다.");
					System.out.println();
					break;
				}
				if(!doublecheck) {
				int doublemoney = player.getBat() * 2; // 더블 금액
				playcard = deck.pick();
				playcard.toString();
				playercardsum += playcard.getNumber();

				if (playercardsum > 21) {
					System.out.println(
							"=================================================================================================");
					System.out.println(player.getName() + "가 뽑은 카드 : " + playcard);	
					System.out.println(player.getName() + "님 카드 합이 " + playercardsum + "으로 21을 초과한 Bust 입니다.");
					System.out.println("게임 종료");
					player.setMoney(player.getMoney() - doublemoney);
					System.out.println(player.getName() + "님 " + player.getBat() + "원을 잃으셨습니다.");
					status = false; // 플레이어 상태 탈락으로 변경
					break out;
				}
				System.out.println(player.getName() + "가 뽑은 카드 : " + playcard);	
				System.out.println(player.getName() + "님의 카드 합 : " + playercardsum);
				System.out.println("더이상 카드를 받을 수 없습니다");
				doublecheck = true;
				player.setBat(doublemoney);
				System.out.println();
				} else {
					System.out.println("이미 더블을 했습니다. 2번 Stay를 누르세요.");
				}
				break; // case 3 break;

				// 서렌더
			case 4:		
				if (doublecheck) {
					System.out.println("더블을 하셨기 때문에 서렌더를 하실 수 없습니다.");
					break;
				}
				System.out.println("Surrender");
				System.out.println(player.getName() + "님의 패배");
				player.setMoney(player.getMoney() - (player.getBat() / 2));
				System.out.println(player.getName() + "님 " + player.getBat()/2 + "원을 잃으셨습니다.");
				break out;
			}
			
		}
		deck = new Deck();
	}
}