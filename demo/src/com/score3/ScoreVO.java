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

	// public ScoreVO() { // ������ �����ε�. ������ �ʱ�ȭ, �Ϲ������� �Ű������� �ϳ��϶���
//	
//	}
//	
//	public ScoreVO(String hak, String name, int kor, int eng, int mat) {		 // ������ �����ε�. ������ �ʱ�ȭ, �Ϲ������� �Ű������� �ϳ��϶���
//		this.hak = hak;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mat = mat;
//	}
//	
	/*
	 * public void set(String hak, String name, int kor, int eng, int mat) { // �ʱ�ȭ
	 * �޼ҵ� , �ؿ� ������ ���� �ʱ�ȭ ��Ŵ this.hak = hak; this.name = name; this.kor = kor;
	 * this.eng = eng; this.mat = mat; }
	 */
	public void setHak(String hak) { // �й�����, �й��� �ʱ�ȭ��Ű�� �޼ҵ�
		this.hak = hak;
	}

	public String getHak() {
		return hak;
	}

	public void setName(String name) { // �̸� ����, �̸��� �ʱ�ȭ��Ű�� �޼ҵ�
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) { // �������� ����
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) { // �������� ����
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMat(int mat) { // �������� ����
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

		String str = String.format("�й� : %s, �̸� : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d, ��� :%3.1f", hak, name, kor,
				eng, mat, getTot(), getTot() / 3.0);

		return str;
	}
}
