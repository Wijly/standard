package com.rooms.domain;

public class CategoryVO {

	private int cate_num; // ī�װ� ��ȣ
	private String cate_name; // ī�װ� �̸�

	public int getCate_num() {
		return cate_num;
	}

	public void setCate_num(int cate_num) {
		this.cate_num = cate_num;
	}

	public String getCate_name() {
		return cate_name;
	}

	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}

	@Override
	public String toString() {
		return "ī�װ� ��ȣ : " + cate_num + ", ī�װ� �̸� : " + cate_name;
	}

}
