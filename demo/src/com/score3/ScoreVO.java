package com.score3;

//Record

// getter, setter

public class ScoreVO { // Value Object

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;

	// public ScoreVO() { // 생성자 오버로딩. 변수를 초기화, 일반적으로 매개변수가 하나일때만
//	
//	}
//	
//	public ScoreVO(String hak, String name, int kor, int eng, int mat) {		 // 생성자 오버로딩. 변수를 초기화, 일반적으로 매개변수가 하나일때만
//		this.hak = hak;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//	}
//	
	/*
	 * public void set(String hak, String name, int kor, int eng, int mat) { // 초기화
	 * 메소드 , 밑에 것으로 각각 초기화 시킴 this.hak = hak; this.name = name; this.kor = kor;
	 * this.eng = eng; this.mat = mat; }
	 */
	public void setHak(String hak) { // 학번전용, 학번을 초기화시키는 메소드
		this.hak = hak;
	}

	public String getHak() {
		return hak;
	}

	public void setName(String name) { // 이름 전용, 이름을 초기화시키는 메소드
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) { // 국어점수 전용
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) { // 영어점수 전용
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMat(int mat) { // 수학점수 전용
		this.mat = mat;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return kor + eng + mat;
	}

	@Override
	public String toString() {

		String str = String.format("학번 : %s, 이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 :%3.1f", hak, name, kor,
				eng, mat, getTot(), getTot() / 3.0);

		return str;
	}
}
