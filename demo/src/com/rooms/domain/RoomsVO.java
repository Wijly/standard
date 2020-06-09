package com.rooms.domain;

public class RoomsVO {

	private int num; // ���� ��ȣ
	private String room_name; // ���� �̸�
	private String room_tel; // ���� ��ȭ��ȣ 
	private String full_addr; // ��ü �ּ� 
	private String street_addr; // ���θ� �ּ�
	private String zipcode; // ���� ��ȣ
	private int re_cnt; // ����
	private String status; // ���� �з� 
	private String run_status; // ���� ����
	private int cate_num; // ���� �з�
	private String region; // ����
	private int count; // ���Ҽ� 

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
		return "���� �з� : " + cate.getCate_name() + ", ���� �̸� : " + room_name + ", ���� ��ȭ��ȣ : " + room_tel + ", ���� ��ü�ּ� "
				+ full_addr + ", ���θ� �ּ� : " + street_addr + ", �����ȣ : " + zipcode + ", ���� ���� : " + run_status
				+ ", ���� : " + re_cnt;
	}

	public String toString2() {
		return "���� : " + region + ", ���Ҽ� : " + count + ", ���� : " + re_cnt;
	}

}
