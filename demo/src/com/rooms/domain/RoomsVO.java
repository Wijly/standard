package com.rooms.domain;

public class RoomsVO {

	private int num; // 숙소 번호
	private String room_name; // 숙소 이름
	private String room_tel; // 숙소 전화번호 
	private String full_addr; // 전체 주소 
	private String street_addr; // 도로명 주소
	private String zipcode; // 우편 번호
	private int re_cnt; // 순위
	private String status; // 숙소 분류 
	private String run_status; // 영업 상태
	private int cate_num; // 숙소 분류
	private String region; // 지역
	private int count; // 업소수 

	private CategoryVO cate;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCate_num() {
		return cate_num;
	}

	public void setCate_num(int cate_num) {
		this.cate_num = cate_num;
	}

	public String getRoom_name() {
		return room_name;
	}

	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}

	public String getRoom_tel() {
		return room_tel;
	}

	public void setRoom_tel(String room_tel) {
		this.room_tel = room_tel;
	}

	public int getRe_cnt() {
		return re_cnt;
	}

	public void setRe_cnt(int re_cnt) {
		this.re_cnt = re_cnt;
	}

	public String getFull_addr() {
		return full_addr;
	}

	public void setFull_addr(String full_addr) {
		this.full_addr = full_addr;
	}

	public String getStreet_addr() {
		return street_addr;
	}

	public void setStreet_addr(String street_addr) {
		this.street_addr = street_addr;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRun_status() {
		return run_status;
	}

	public void setRun_status(String run_status) {
		this.run_status = run_status;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public CategoryVO getCate() {
		if (cate == null) {
			cate = new CategoryVO();
		}
		return cate;
	}

	public void setCate(CategoryVO cate) {
		this.cate = cate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "숙소 분류 : " + cate.getCate_name() + ", 숙소 이름 : " + room_name + ", 숙소 전화번호 : " + room_tel + ", 숙소 전체주소 "
				+ full_addr + ", 도로명 주소 : " + street_addr + ", 우편번호 : " + zipcode + ", 영업 상태 : " + run_status
				+ ", 순위 : " + re_cnt;
	}

	public String toString2() {
		return "지역 : " + region + ", 업소수 : " + count + ", 순위 : " + re_cnt;
	}

}
