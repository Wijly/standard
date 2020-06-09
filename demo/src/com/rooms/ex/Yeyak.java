package com.rooms.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.RoomsDAO;
import com.rooms.dao.YeyakDAO;
import com.rooms.domain.ReservationVO;
import com.rooms.domain.RoomsVO;

public class Yeyak {
	Scanner sc = new Scanner(System.in);
	YeyakDAO dao = new YeyakDAO();
	RoomsDAO rdao = new RoomsDAO();

	// 전체 숙소 확인
	public void select() {

		try {

			List<RoomsVO> list = rdao.select();
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

	// 예약이 가능한지 확인하는 메소드
	public boolean yeyakPossible(String id) {

		// 반환값이 0이여야지 다음 메소드가 실행
		boolean yeyak_acc = dao.possibleYeyak(id);
		return yeyak_acc;
	}
	
	// 숙소 예약하기
		public void insertReserv(String id) {

			try {
				System.out.println("┏━━━━━━━━┓");
				System.out.println("┃   호텔  번호   ┃");
				System.out.println("┗━━━━━━━━┛");
				System.out.print("입력 : ");
				int h_num = sc.nextInt();
				System.out.println("┏━━━━━━━━┓");
				System.out.println("┃   예약  년도   ┃");
				System.out.println("┗━━━━━━━━┛");
				System.out.print("입력 : ");
				int year = sc.nextInt();
				System.out.println("┏━━━━━━━┓");
				System.out.println("┃   예약  월   ┃");
				System.out.println("┗━━━━━━━┛");
				System.out.print("입력 : ");
				int month = sc.nextInt();
				System.out.println("┏━━━━━━━━┓");
				System.out.println("┃   예약  날짜   ┃");
				System.out.println("┗━━━━━━━━┛");
				System.out.print("입력 : ");
				int day = sc.nextInt();

				System.out.println("┏━━━━━━━━━┓");
				System.out.println("┃   숙박 기간(박)  ┃");
				System.out.println("┗━━━━━━━━━┛");
				System.out.print("입력 : ");
				int bak = sc.nextInt();

				String date1 = "" + year + "-" + month + "-" + day;
				Calendar cal = Calendar.getInstance();
				cal.set(year, month - 1, day + bak);
				Date date = cal.getTime();
				DateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
				String date2 = sf.format(date);

				int res_dto = dao.insertYeyak(h_num, id, date1, date2);

				if (res_dto != 1) {
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("예약 오류");
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				} else {
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
					System.out.println("예약되었습니다.");
					System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	
	// 예약 확인
	public void searchYeyak(String id) {

		ReservationVO rsv = dao.yeyakSearch(id);

		if (rsv != null) {
			System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.print(rsv.toString());
			System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		} else {
			System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("에러 : 예약된 숙소가 없습니다.");
			System.out.println("━──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		}

	}

	// 예약 취소
	public void yeyakCancel(String id) {
		int cancel_hak = 0;
		ReservationVO rsv = dao.yeyakSearch(id);
		System.out.println("┏──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃현재 예약된 곳은 " + rsv.getRoom_name() + "입니다.");
		System.out.println("┃현재 예약된 업소를 취소하시겠습니까?                                                          ┃");
		System.out.println("┗──━━━━━━━━━━━─━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print(" 입력(Y/N) : ");
		String ans = sc.next();
		if (ans.equalsIgnoreCase("y")) {
			cancel_hak = dao.deleteYeyak(id);
			if (cancel_hak == 1) {
				System.out.println("예약이 취소되었습니다.");
			} else {
				System.out.println("에러 : 취소 실패");
			}
		} else {
			System.out.println("취소되었습니다.");
			
		}

	}


}
