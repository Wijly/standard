package com.rooms.domain;

import java.util.Date;

public class MemberVO {

	private String id; // 아이디
	private String pwd; // 비밀번호 
	private String name; // 이름
	private String tel; // 전화번호 
	private String email; // 이메일
	private Date birth; // 생년월일 
	private String re_num; // 숙소 번호

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
