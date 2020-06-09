package com.score5;

public class ScoreVO {
	
	private String name;
	private String birth;
	private int score;
	
	public ScoreVO(String name, String birth, int score) {
		this.name = name;
		this.birth = birth;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %d ", name,birth,score);
	}

}
