package com.rooms.main;

import java.util.Scanner;

import com.db.DBConn;
import com.rooms.ex.Member;
import com.rooms.threads.Loading;
import com.rooms.threads.Main_Thread;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		Main_Thread mt = new Main_Thread();
		Loading ld = new Loading();
		
		int choice;
		try {
			mt.image_main();
			while (true) {
				do {
					System.out.println("┏──━┳━━━━━━━┳━─━┳━━━━━┳━━━┳━━━━━━━┳━━━┳━━━━━━━┳━━━┳━━━━━━━━━┳━━━┳━━━━┓");
					System.out.println("┃   1  ┃  회원 가입   ┃   2  ┃  로그인  ┃   3  ┃  회원 수정   ┃   4  ┃  회원 탈퇴   ┃   5  ┃  관리자 로그인   ┃   6  ┃  종료  ┃");
					System.out.println("┗──━┻━━━━━━━┻━─━┻━━━━━┻━━━┻━━━━━━━┻━━━┻━━━━━━━┻━━━┻━━━━━━━━━┻━━━┻━━━━┛");
					System.out.print(" 입력 : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 6);
				switch (choice) {
				case 1:
					m.register();
					break;
				case 2:
					String id = m.login();
					ld.loading();
					if(id.equals("fail")) {
						System.out.println("에러 : 가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.");
					} else {
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("로그인에 성공하셨습니다");
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						LoginMain.main(args, id);	
					}
					break;
				case 3:
					m.update();
					break;
				case 4:
					m.delete();
					break;
				case 5:
					String admin = m.login();
					ld.loading();
					if(admin.equals("fail")) {
						System.out.println("에러 : 관리자의 아이디가 아니거나, 잘못된 비밀번호입니다.");
					} else {
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						System.out.println("관리자 로그인에 성공하셨습니다");
						System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
						adminMain.main(args);	
					}
					break;
				default:
					System.out.println("빠빠잉");
					DBConn.close();
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}