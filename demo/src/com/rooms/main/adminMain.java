package com.rooms.main;

import java.util.Scanner;

import com.db.DBConn;
import com.rooms.ex.Rooms;
import com.rooms.threads.Admin_main;

public class adminMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rooms r = new Rooms();
		Admin_main am = new Admin_main();
		int choice;
		try {
			am.run();
			while (true) {
				do {
					System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
					System.out.println("旨式收有收收收收收有式收有收收收收收收收收有收收有收收收收收有收收有收收收收收有收收有收收收收收有收有收收收收收有收有收收收收收收收有收有收收收收收有收有收收收旬");
					System.out.println("早 1  早 熨模蹺陛 早 2  早 熨模 瞪羹 匐儀 早 3  早熨模 熱薑 早 4  早熨模 餉薯 早 5  早熨模 匐儀 早6 早牖嬪 匐儀 早7 早雖羲 熨模 匐儀早8 早 蘋纔堅葬 早 n早 詭檣 早");
					System.out.println("曲式收朴收收收收收朴式收朴收收收收收收收收朴收收朴收收收收收朴收收朴收收收收收朴收收朴收收收收收朴收朴收收收收收朴收朴收收收收收收收朴收朴收收收收收朴收朴收收收旭");
					System.out.print(" 殮溘 : ");
					choice = sc.nextInt();
				} while (choice < 1 || choice > 9);

				switch (choice) {
				case 1:
					r.insert();			
					break;
				case 2:
					r.select();
					break;
				case 3:
					r.update();
					break;
				case 4:
					r.delete();
					break;
				case 5:
					r.search();
					break;
				case 6:
					r.rankSelect();
					break;
				case 7:
					r.regionSelect();
					break;
				case 8:
					cateMain.main(args);
					break;
				default:
					Main.main(args);
					break;
				}
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}
