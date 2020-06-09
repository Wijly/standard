package com.rooms.main;

import java.util.Scanner;

import com.db.DBConn;
import com.rooms.ex.Category;
import com.rooms.ex.Member;
import com.rooms.ex.Rooms;
import com.rooms.ex.Yeyak;

public class cateMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Category c = new Category();
		int choice;
		try {
			while (true) {
				do {
					// 이미지
					System.out.println("┏──━┳━━━━━━━━┳━─━┳━━━━━━━━━┳━━━┳━━━━━━━━━┳━━━┳━━━━━━━━━┳━━━┳━━━━━━━┓");
					System.out.println("┃   1  ┃ 카테고리 추가  ┃   2  ┃  카테고리 수정   ┃   3  ┃  카테고리 삭제   ┃   4  ┃  카테고리 조회   ┃   n  ┃  뒤로 가기   ┃");
					System.out.println("┗──━┻━━━━━━━━┻━─━┻━━━━━━━━━┻━━━┻━━━━━━━━━┻━━━┻━━━━━━━━━┻━━━┻━━━━━━━┛");
			
					System.out.print(" 입력 : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 5);

				switch (choice) {
				case 1:
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					c.insert();
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					break;
				case 2:
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					c.update();
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					break;
				case 3:
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					c.delete();
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					break;
				case 4:
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					c.select();
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					break;
				case 5:
				default:				
					adminMain.main(args);
					break;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}