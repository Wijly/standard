package com.rooms.domain;

public class CategoryVO {

	private int cate_num; // 카테고리 번호
	private String cate_name; // 카테고리 이름

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
		return "카테고리 번호 : " + cate_num + ", 카테고리 이름 : " + cate_name;
	}

}
