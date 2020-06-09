package com.rooms.domain;

import java.util.Date;

public class ReservationVO {

	private int number;
	private String id;
	private int room_num;
	private String room_name;
	private String FULL_ADDR;
	private String room_tel;
	private String mem_tel;
	private Date re_start;
	private Date re_end;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public String getFULL_ADDR() {
		return FULL_ADDR;
	}

	public void setFULL_ADDR(String fULL_ADDR) {
		FULL_ADDR = fULL_ADDR;
	}

	public String getRoom_tel() {
		return room_tel;
	}

	public void setRoom_tel(String room_tel) {
		this.room_tel = room_tel;
	}

	public String getMem_tel() {
		return mem_tel;
	}

	public void setMem_tel(String mem_tel) {
		this.mem_tel = mem_tel;
	}

	public Date getRe_start() {
		return re_start;
	}

	public void setRe_start(Date re_start) {
		this.re_start = re_start;
	}

	public Date getRe_end() {
		return re_end;
	}

	public void setRe_end(Date re_end) {
		this.re_end = re_end;
	}

	@Override
	public String toString() {
		String str;
		str = String.format("아이디 : %s, 숙소명 : %s, 숙소 주소 : %s, 숙소 전화번호 :  %s, 예약날짜 : %s, 퇴실날짜 : %s\n"
				, id, room_name, FULL_ADDR, room_tel, re_start, re_end);
		return str;
	}

}
