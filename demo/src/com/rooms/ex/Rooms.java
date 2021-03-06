package com.rooms.ex;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.RoomsDAO;
import com.rooms.domain.RoomsVO;

public class Rooms {

	Scanner scan = new Scanner(System.in);
	RoomsDAO dao = new RoomsDAO();

	// 樓模蹺陛
	public void insert() {

		try {

			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			RoomsVO vo = new RoomsVO();
			System.out.println("旨式收有收收收收收收有式收有收收收收有收收有收收收收收有收收有收收收收收收有收收有收收收收旬");
			System.out.println("早 1  早 罹檣熨機   早 2  早 罹婦機 早 3  早 橾奩��蘿 早 4  早 婦惜��蘿   早 5  早 熨夢機 早");
			System.out.println("曲式收朴收收收收收收朴式收朴收收收收朴收收朴收收收收收朴收收朴收收收收收收朴收收朴收收收收旭");
			System.out.println("旨收收收收收收收旬");
			System.out.println("早   熨模碟盟   早");
			System.out.println("曲收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setCate_num(scan.nextInt());
			scan.nextLine();

			System.out.println("旨收收收收收收收旬");
			System.out.println("早   熨模檜葷   早");
			System.out.println("曲收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setRoom_name(scan.nextLine());

			System.out.println("旨收收收收收收收收收收旬");
			System.out.println("早   熨模  瞪�食醽�   早");
			System.out.println("曲收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setRoom_tel(scan.nextLine());

			System.out.println("旨收收收收收收收收收收旬");
			System.out.println("早   熨模  瞪羹輿模   早");
			System.out.println("曲收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setFull_addr(scan.nextLine());

			System.out.println("旨收收收收收收收收收收收旬");
			System.out.println("早   熨模  紫煎貲輿模   早");
			System.out.println("曲收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setStreet_addr(scan.nextLine());

			System.out.println("旨收收收收收收收收收收旬");
			System.out.println("早   熨模  辦ら廓��   早");
			System.out.println("曲收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setZipcode(scan.nextLine());

			int result = dao.insert(vo);

			if (result == 1) {
				System.out.println("等檜攪 蹺陛 撩奢");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			} else {
				System.out.println("等檜攪 蹺陛 褒ぬ");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 熨模 瞪羹 匐儀
	public void select() {

		try {
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			List<RoomsVO> list = dao.select();
			Iterator<RoomsVO> it = list.iterator();

			while (it.hasNext()) {
				RoomsVO vo = it.next();

				System.out.println(vo);
			}

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 樓模 熱薑
	public void update() {

		try {

			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			RoomsVO vo = new RoomsVO();
			System.out.println("旨收收收收收收收收旬");
			System.out.println("早    熨模 廓��   早");
			System.out.println("曲收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setNum(scan.nextInt());

			System.out.println("旨收收收收收收收收收收收旬");
			System.out.println("早   熱薑й 熨模 檜葷   早");
			System.out.println("曲收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setRoom_name(scan.next());

			System.out.println("旨收收收收收收收收收收收收旬");
			System.out.println("早   熱薑й 熨模 翱塊籀   早");
			System.out.println("曲收收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setRoom_tel(scan.next());

			System.out.println("旨收收收收收收收收收收收收收旬");
			System.out.println("早   艙機 鼻鷓(艙機/わ機)   早");
			System.out.println("曲收收收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setRun_status(scan.next());

			int result = dao.update(vo);

			if (result == 1) {
				System.out.println("等檜攪 熱薑 撩奢");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			} else {
				System.out.println("等檜攪 熱薑 褒ぬ");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 樓模 餉薯
	public void delete() {

		try {
			System.out.println("旨收收收收收收收收收收收旬");
			System.out.println("早    餉薯 熨模 廓��    早");
			System.out.println("曲收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			int num = scan.nextInt();

			int result = dao.delete(num);

			if (result == 1) {
				System.out.println("等檜攪 餉薯 撩奢");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			} else {
				System.out.println("等檜攪 餉薯 褒ぬ");
				System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 樓模 匐儀
	public void search() {
		try {

			System.out.println("旨收收收收收收收收收收收旬");
			System.out.println("早    匐儀 熨模 檜葷    早");
			System.out.println("曲收收收收收收收收收收收旭");
			System.out.print("殮溘 : ");
			String search = scan.next();
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			dao.searchRooms(search);
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 牖嬪 匐儀
	public void rankSelect() {

		try {
			List<RoomsVO> list = dao.rankSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			while (it.hasNext()) {
				RoomsVO vo = it.next();

				System.out.print("熨模 碟盟 : " + vo.getCate().getCate_name() + ", 熨模 檜葷 : " + vo.getRoom_name()
						+ ", 熨模 瞪�食醽� : " + vo.getRoom_tel() + ", 熨模 輿模 : " + vo.getFull_addr() + ", 蕨擒熱 : "
						+ vo.getRe_cnt() + ", 牖嬪 : " + vo.getCount());
				System.out.println();
			}
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// 雖羲 熨模 鱔啗
	public void regionSelect() {

		try {

			List<RoomsVO> list = dao.regionSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.println(vo.toString2());
			}
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			System.out.println();

		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}

	// 匐儀и 雖羲 掘碟 橈檜 鼻嬪 20偃 等檜攪 轎溘
	public void regionSearch() {

		try {
			System.out.print("匐儀й 雖羲 : ");
			String region = scan.nextLine();

			List<RoomsVO> list = dao.regionSearch(region);
			Iterator<RoomsVO> it = list.iterator();

			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.print("熨模 廓�� : " + vo.getNum() + ", 熨模 雖羲 : " + vo.getRegion() + ", 熨模 檜葷 : "
						+ vo.getRoom_name() + ", 熨模 瞪�食醽� : " + vo.getRoom_tel() +", 蕨擒熱 : " + vo.getRe_cnt() + ", 牖嬪 : " + vo.getCount()
						);
				System.out.println();
			}
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
