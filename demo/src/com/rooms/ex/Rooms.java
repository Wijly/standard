package com.rooms.ex;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.RoomsDAO;
import com.rooms.domain.RoomsVO;

public class Rooms {

	Scanner scan = new Scanner(System.in);
	RoomsDAO dao = new RoomsDAO();

	// ¼Ó¼ÒÃß°¡
	public void insert() {

		try {

			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			RoomsVO vo = new RoomsVO();
			System.out.println("¦®¦¡¦¬¦³¦¬¦¬¦¬¦¬¦¬¦¬¦³¦¡¦¬¦³¦¬¦¬¦¬¦¬¦³¦¬¦¬¦³¦¬¦¬¦¬¦¬¦¬¦³¦¬¦¬¦³¦¬¦¬¦¬¦¬¦¬¦¬¦³¦¬¦¬¦³¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­ 1  ¦­ ¿©ÀÎ¼÷¾÷   ¦­ 2  ¦­ ¿©°ü¾÷ ¦­ 3  ¦­ ÀÏ¹ÝÈ£ÅÚ ¦­ 4  ¦­ °ü±¤È£ÅÚ   ¦­ 5  ¦­ ¼÷¹Ú¾÷ ¦­");
			System.out.println("¦±¦¡¦¬¦µ¦¬¦¬¦¬¦¬¦¬¦¬¦µ¦¡¦¬¦µ¦¬¦¬¦¬¦¬¦µ¦¬¦¬¦µ¦¬¦¬¦¬¦¬¦¬¦µ¦¬¦¬¦µ¦¬¦¬¦¬¦¬¦¬¦¬¦µ¦¬¦¬¦µ¦¬¦¬¦¬¦¬¦°");
			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼ÒºÐ·ù   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setCate_num(scan.nextInt());
			scan.nextLine();

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼ÒÀÌ¸§   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setRoom_name(scan.nextLine());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼Ò  ÀüÈ­¹øÈ£   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setRoom_tel(scan.nextLine());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼Ò  ÀüÃ¼ÁÖ¼Ò   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setFull_addr(scan.nextLine());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼Ò  µµ·Î¸íÁÖ¼Ò   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setStreet_addr(scan.nextLine());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼÷¼Ò  ¿ìÆí¹øÈ£   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setZipcode(scan.nextLine());

			int result = dao.insert(vo);

			if (result == 1) {
				System.out.println("µ¥ÀÌÅÍ Ãß°¡ ¼º°ø");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			} else {
				System.out.println("µ¥ÀÌÅÍ Ãß°¡ ½ÇÆÐ");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ¼÷¼Ò ÀüÃ¼ °Ë»ö
	public void select() {

		try {
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
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

	// ¼Ó¼Ò ¼öÁ¤
	public void update() {

		try {

			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			RoomsVO vo = new RoomsVO();
			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­    ¼÷¼Ò ¹øÈ£   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setNum(scan.nextInt());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼öÁ¤ÇÒ ¼÷¼Ò ÀÌ¸§   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setRoom_name(scan.next());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¼öÁ¤ÇÒ ¼÷¼Ò ¿¬¶ôÃ³   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setRoom_tel(scan.next());

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¿µ¾÷ »óÅÂ(¿µ¾÷/Æó¾÷)   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setRun_status(scan.next());

			int result = dao.update(vo);

			if (result == 1) {
				System.out.println("µ¥ÀÌÅÍ ¼öÁ¤ ¼º°ø");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			} else {
				System.out.println("µ¥ÀÌÅÍ ¼öÁ¤ ½ÇÆÐ");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ¼Ó¼Ò »èÁ¦
	public void delete() {

		try {
			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­    »èÁ¦ ¼÷¼Ò ¹øÈ£    ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			int num = scan.nextInt();

			int result = dao.delete(num);

			if (result == 1) {
				System.out.println("µ¥ÀÌÅÍ »èÁ¦ ¼º°ø");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			} else {
				System.out.println("µ¥ÀÌÅÍ »èÁ¦ ½ÇÆÐ");
				System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ¼Ó¼Ò °Ë»ö
	public void search() {
		try {

			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­    °Ë»ö ¼÷¼Ò ÀÌ¸§    ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			String search = scan.next();
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			dao.searchRooms(search);
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// ¼øÀ§ °Ë»ö
	public void rankSelect() {

		try {
			List<RoomsVO> list = dao.rankSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			while (it.hasNext()) {
				RoomsVO vo = it.next();

				System.out.print("¼÷¼Ò ºÐ·ù : " + vo.getCate().getCate_name() + ", ¼÷¼Ò ÀÌ¸§ : " + vo.getRoom_name()
						+ ", ¼÷¼Ò ÀüÈ­¹øÈ£ : " + vo.getRoom_tel() + ", ¼÷¼Ò ÁÖ¼Ò : " + vo.getFull_addr() + ", ¿¹¾à¼ö : "
						+ vo.getRe_cnt() + ", ¼øÀ§ : " + vo.getCount());
				System.out.println();
			}
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// Áö¿ª ¼÷¼Ò Åë°è
	public void regionSelect() {

		try {

			List<RoomsVO> list = dao.regionSelect();
			Iterator<RoomsVO> it = list.iterator();
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.println(vo.toString2());
			}
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			System.out.println();

		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}

	// °Ë»öÇÑ Áö¿ª ±¸ºÐ ¾øÀÌ »óÀ§ 20°³ µ¥ÀÌÅÍ Ãâ·Â
	public void regionSearch() {

		try {
			System.out.print("°Ë»öÇÒ Áö¿ª : ");
			String region = scan.nextLine();

			List<RoomsVO> list = dao.regionSearch(region);
			Iterator<RoomsVO> it = list.iterator();

			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			while (it.hasNext()) {
				RoomsVO vo = it.next();
				System.out.print("¼÷¼Ò ¹øÈ£ : " + vo.getNum() + ", ¼÷¼Ò Áö¿ª : " + vo.getRegion() + ", ¼÷¼Ò ÀÌ¸§ : "
						+ vo.getRoom_name() + ", ¼÷¼Ò ÀüÈ­¹øÈ£ : " + vo.getRoom_tel() +", ¿¹¾à¼ö : " + vo.getRe_cnt() + ", ¼øÀ§ : " + vo.getCount()
						);
				System.out.println();
			}
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");

			System.out.println();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
