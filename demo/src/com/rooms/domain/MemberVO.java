package com.rooms.domain;

import java.util.Date;

public class MemberVO {

	private String id; // ���̵�
	private String pwd; // ��й�ȣ 
	private String name; // �̸�
	private String tel; // ��ȭ��ȣ 
	private String email; // �̸���
	private Date birth; // ������� 
	private String re_num; // ���� ��ȣ

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getRe_num() {
		return re_num;
	}

	public void setRe_num(String re_num) {
		this.re_num = re_num;
	}

}
