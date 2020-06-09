package com.naver;

public class NaverVO {
	
	// 아이디는 8~15자 이내, 영문자 숫자 혼용
	
	private String id;		//아이디
	private String pw1;		// 비밀번호
	private String pw2;		// 비밀번호 확인
	private String name;	// 이름
	private String gender;	// 성별
	private String birth;	// 생년월일
	private String email;	// 이메일주소
	private String tel;		// 전화번호
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw1() {
		return pw1;
	}
	public void setPw1(String pw1) {
		this.pw1 = pw1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPw2() {
		return pw2;
	}
	public void setPw2(String pw2) {
		this.pw2 = pw2;
	}
	@Override
	public String toString() {
		
		String str = String.format("아이디 : %s, 비밀번호 : %s, 이름 : %s, 성별 : %s, 생년월일 : %s, 이메일 : %s, 전화번호 : %s", id,pw1,name,gender,birth,email,tel);
		
		return str;
	}

	
	
}
