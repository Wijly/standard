package com.score3;

public interface Score {
	
	public int input();
	public void print();
	
	public void searchHak();			// 학번 검색
	public void searchName();			// 이름 검색
	public void descSortTot();			// 총점 내림차순 정렬
	public void ascSortHak();			// 학번 오름차순 정렬
	
}
