package com.score4;

public class ScoreVO {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}	
	public int getTot() {
		tot = kor+eng+mat;
		return tot;
	}
	
	@Override
	public String toString() {
		
		String str;
		double avg = getTot()/3;
		
		str = String.format("이름 : %s,국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f", name,kor,eng,mat,tot,avg);
		
		return str;
	}
}
