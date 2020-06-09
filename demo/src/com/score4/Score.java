package com.score4;

public interface Score {
	
	public void input();						// 입력
	public boolean searchHak(String hak);		// 학번 존재여부 확인
	public void print();					// 출력
	public void delete();					// 삭제
	public void update();					// 변경
	public void findHak();					// 학번 검색
	public void findName();					// 이름 검색

}
