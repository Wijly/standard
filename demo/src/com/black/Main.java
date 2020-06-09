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
		Table t = new Table(); // ���̺� ���� ī��, ���� ��� ��ġ
		Shuffle s = new Shuffle(); // �����̹���

		Main_Close mc = new Main_Close(); // ���� �̹����� Ŭ���� �̹���
		mc.image_main();
		out : while (true) {
			do {
				System.out.println(
						" ===================================================================================================");
				System.out.println("��1�� �ݾ� Ȯ��        ��2�� �ݾ� ����         ��3�� ���� ����           ��4�� ���� ����           ��");
				System.out.println(
						" ===================================================================================================");
				System.out.print(" �Է� : ");
				c = scan.nextInt();
			} while (c < 1 || c > 4);

			switch (c) {

			case 1:
				System.out.println(
						" ===================================================================================================");
				System.out.println(p.getName() + "���� " + "�����Ͻ� �ݾ��� " + p.getMoney() + "���Դϴ�.");
				System.out.println();
				break;

			case 2:
				try {
					System.out.println(
							" ===================================================================================================");
					System.out.print("������ �ݾ��� �Է����ּ��� : ");
					int money = scan.nextInt();
					p.setMoney(p.getMoney() + money);
					System.out.println(p.getName() + "�� " + money + "���� ���� �Ǿ����ϴ�.");
					System.out.println(p.getName() + "���� " + "�����Ͻ� �ݾ��� " + p.getMoney() + "���Դϴ�.");
					System.out.println();
					break;
				} catch (InputMismatchException e) {
					System.out.println("�Է� ����! ������ �Է��ؾ� �մϴ�.");
					System.out.println();
					break;
				}

			case 3:
				if (p.getMoney() == 0) {
					System.out.println(
							" ===================================================================================================");
					System.out.println(p.getName() + "���� " + "�����Ͻ� �ݾ��� " + p.getMoney() + "���Դϴ�. ");
					System.out.println("�ݾ��� �����ؾ� ���尡���մϴ�");
					System.out.println();
					break;
				}

				Game game = new Game(p, d);
				game.playerMoney();
				System.out.println();
				int g;

				boolean check = false; // �������� üũ
				boolean finish = false; // ������ �ѹ��� ����

				t.no_coin();
				in: while (true) {
					do {
						System.out.println(
								" =================================================================================================");
						System.out.println(
								"��1�� ���� �ϱ�        ��2�� ī�� �ޱ�         ��3�� Pair Bet          ��4�� ������             ��");
						System.out.println(
								" =================================================================================================");
						System.out.print("�Է� : ");
						g = scan.nextInt();
					} while (g < 1 || g > 4);

					switch (g) {

					case 1:
						try {
							
							if (finish) {
								System.out.println("�̹� ������ �Ϸ��ϼ̽��ϴ�");
								System.out.println(p.getName() + "���� ���� ���� �ݾ��� " + p.getBat() + "���Դϴ�.");
								System.out.println(p.getName() + "���� ���� ���� �ݾ��� " + (p.getMoney() - p.getBat()) + "���Դϴ�.");
								System.out.println();
								t.coin();
								break;
							}  
							System.out.println(
									" =================================================================================================");
							System.out.println(p.getName() + "���� ���� ���� �ݾ��� " + p.getMoney() + "���Դϴ�.");
							
							if(p.getMoney()==0) {
								mc.image_close();
								System.out.println("�����ݾ��� �����ϴ�. �����ϼ���.");
								break;
							}
							
							System.out.print("������ �ݾ��� �Է��ϼ��� : ");
							
							int bat = scan.nextInt();
							
							if (bat == 0) {
								System.out.println("0���� ������ �� �����ϴ�");
								System.out.println(p.getName() + "���� ���� ���� �ݾ��� " + p.getMoney() + "���Դϴ�.");
								System.out.println();
								t.no_coin();
								break;
							} else if (bat > game.player.getMoney()) {
								System.out.println("���� �ݾ��� ���� �ݾ׺��� �����ϴ�");
								System.out.println(p.getName() + "���� ���� ���� �ݾ��� " + p.getMoney() + "���Դϴ�.");
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
							System.out.println("�Է� ����! ������ �Է��ؾ� �մϴ�");
							System.out.println();
						}

					case 2:
						if (check) {
							s.suffle();					// ����ȭ��
							t.print();					// ī�� ���ȭ�� ȭ��
							
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
							System.out.println("������ �ؾ� ������ ������ �� �ֽ��ϴ�");
							t.no_coin();
							break;
						}

					case 3:
						if (!finish) {
							System.out.println(
									"=================================================================================================");
							System.out.println("���� ������ ���� �ʾҽ��ϴ�");
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
					
				} // in while ��
			case 4:
				mc.image_close();
				System.exit(0);
			}

		}

	}

}