package com.naver;

public interface Naver {
	
	public void input();		// 회원가입

	public boolean successId(String id);	// 아이디 조건 확인
	public boolean succesccLogin(String id, String pw);
	public void print();		// 전체 출력
	public void searchID();		// 아이디 비번 입력후 정보출력
	public void delectID();		// 아이디 비번 입력후 삭제
	public void updateId();		// 아이디 비번 입력후 비밀번호 변경
	

}
