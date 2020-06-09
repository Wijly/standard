package com.rooms.main;

import java.util.Scanner;

import com.rooms.ex.Rooms;
import com.rooms.ex.Yeyak;
import com.rooms.threads.Login;

public class LoginMain {

	public static void main(String[] args, String id) {

		Scanner sc = new Scanner(System.in);
		Rooms r = new Rooms();
		Yeyak y = new Yeyak();
		Login lg = new Login();
		int choice;
		try {
			
			while (true) {
				do {
					// 이미지
					lg.run();
					System.out.println("┏─┳━━━━━━━┳━┳━━━━┳━┳━━━━━━━┳━┳━━━━━━━┳━━┳━━━━━━━┳━━┳━━━━┳━━┳━━━━━━━━┳━┳━━━━┓");
					System.out.println("┃ 1┃ 숙소전체검색 ┃ 2┃  예약  ┃ 3┃  예약 확인   ┃ 4┃  예약 취소   ┃ 5  ┃  숙소 검색   ┃ 6  ┃  순위  ┃ 7  ┃지역별 숙소검색 ┃n ┃로그아웃┃");
					System.out.println("┗─┻━━━━━━━┻━┻━━━━┻━┻━━━━━━━┻━┻━━━━━━━┻━━┻━━━━━━━┻━━┻━━━━┻━━┻━━━━━━━━┻━┻━━━━┛");
					System.out.print(" 입력 : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 8);

				switch (choice) {
				case 1:
					y.select();
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					break;
				case 2:
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					
					// 예약이 없으면 실행
					if(y.yeyakPossible(id) == false) {
						y.insertReserv(id);
					}
					else {
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println(" 확인 : 이미 예약된 건이 있습니다. ");
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					}
					break;
				case 3:
					y.searchYeyak(id);
					break;
				case 4:
					if(y.yeyakPossible(id) == false) {
						System.out.println("┏━──━━━━━━━━━━━──┓");
						System.out.println("┃ 고객님의 예약된 건이 없습니다. ┃");
						System.out.println("┗──━━━━━━━━━━━─━─┛");
					} else {
						y.yeyakCancel(id);
					}
					break;
				case 5:
					r.search();
					break;
				case 6:
					r.rankSelect();
					break;
				case 7:	
					r.regionSearch();
					break;
				default:
					System.out.println("메인화면으로 이동합니다.");
					Main.main(args);
					break;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}