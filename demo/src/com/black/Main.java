package com.black;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		Player p = new Player();
		Dealer d = new Dealer();
		int c;
		Table t = new Table(); // 테이블 위에 카드, 코인 등등 배치
		Shuffle s = new Shuffle(); // 셔플이미지

		Main_Close mc = new Main_Close(); // 메인 이미지와 클로즈 이미지
		mc.image_main();
		out : while (true) {
			do {
				System.out.println(
						" ===================================================================================================");
				System.out.println("┃1┃ 금액 확인        ┃2┃ 금액 충전         ┃3┃ 게임 시작           ┃4┃ 게임 종료           ┃");
				System.out.println(
						" ===================================================================================================");
				System.out.print(" 입력 : ");
				c = scan.nextInt();
			} while (c < 1 || c > 4);

			switch (c) {

			case 1:
				System.out.println(
						" ===================================================================================================");
				System.out.println(p.getName() + "님이 " + "보유하신 금액은 " + p.getMoney() + "원입니다.");
				System.out.println();
				break;

			case 2:
				try {
					System.out.println(
							" ===================================================================================================");
					System.out.print("충전할 금액을 입력해주세요 : ");
					int money = scan.nextInt();
					p.setMoney(p.getMoney() + money);
					System.out.println(p.getName() + "님 " + money + "원이 충전 되었습니다.");
					System.out.println(p.getName() + "님이 " + "보유하신 금액은 " + p.getMoney() + "원입니다.");
					System.out.println();
					break;
				} catch (InputMismatchException e) {
					System.out.println("입력 오류! 정수를 입력해야 합니다.");
					System.out.println();
					break;
				}

			case 3:
				if (p.getMoney() == 0) {
					System.out.println(
							" ===================================================================================================");
					System.out.println(p.getName() + "님이 " + "보유하신 금액은 " + p.getMoney() + "원입니다. ");
					System.out.println("금액을 충전해야 입장가능합니다");
					System.out.println();
					break;
				}

				Game game = new Game(p, d);
				game.playerMoney();
				System.out.println();
				int g;

				boolean check = false; // 베팅유무 체크
				boolean finish = false; // 베팅은 한번만 가능

				t.no_coin();
				in: while (true) {
					do {
						System.out.println(
								" =================================================================================================");
						System.out.println(
								"┃1┃ 배팅 하기        ┃2┃ 카드 받기         ┃3┃ Pair Bet          ┃4┃ 충전소             ┃");
						System.out.println(
								" =================================================================================================");
						System.out.print("입력 : ");
						g = scan.nextInt();
					} while (g < 1 || g > 4);

					switch (g) {

					case 1:
						try {
							
							if (finish) {
								System.out.println("이미 배팅을 완료하셨습니다");
								System.out.println(p.getName() + "님의 현재 배팅 금액은 " + p.getBat() + "원입니다.");
								System.out.println(p.getName() + "님의 현재 보유 금액은 " + (p.getMoney() - p.getBat()) + "원입니다.");
								System.out.println();
								t.coin();
								break;
							}  
							System.out.println(
									" =================================================================================================");
							System.out.println(p.getName() + "님의 현재 보유 금액은 " + p.getMoney() + "원입니다.");
							
							if(p.getMoney()==0) {
								mc.image_close();
								System.out.println("보유금액이 없습니다. 충전하세요.");
								break;
							}
							
							System.out.print("배팅할 금액을 입력하세요 : ");
							
							int bat = scan.nextInt();
							
							if (bat == 0) {
								System.out.println("0원은 배팅할 수 없습니다");
								System.out.println(p.getName() + "님의 현재 보유 금액은 " + p.getMoney() + "원입니다.");
								System.out.println();
								t.no_coin();
								break;
							} else if (bat > game.player.getMoney()) {
								System.out.println("배팅 금액이 보유 금액보다 많습니다");
								System.out.println(p.getName() + "님의 현재 보유 금액은 " + p.getMoney() + "원입니다.");
								System.out.println();
								t.no_coin();
								break;
							} else {
								game.player.setBat(bat);
								System.out.println();
								check = true;
								finish = true;
								t.coin();
								break;
							}

						} catch (NumberFormatException e) {
							System.out.println("입력 오류! 정수를 입력해야 합니다");
							System.out.println();
						}

					case 2:
						if (check) {
							s.suffle();					// 셔플화면
							t.print();					// 카드 출력화면 화면
							
							System.out.println(
									" =================================================================================================");
							game.start();
							check = false;
							finish = false;
							game.play.clear();
							game.deal.clear();
							break;
						} else {
							System.out.println(
									"=================================================================================================");
							System.out.println("배팅을 해야 게임을 시작할 수 있습니다");
							t.no_coin();
							break;
						}

					case 3:
						if (!finish) {
							System.out.println(
									"=================================================================================================");
							System.out.println("아직 배팅을 하지 않았습니다");
							t.no_coin();
							break;
						}
						t.coin_parebit();
						game.pairbet();
						check = false;
						finish = false;
						break;
					case 4:
						mc.image_main();
						continue out;
					}
					
				} // in while 끝
			case 4:
				mc.image_close();
				System.exit(0);
			}

		}

	}

}