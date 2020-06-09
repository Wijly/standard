package com.day18;

import java.io.Serializable;

public class MyData implements Serializable{		// Á÷·ÄÈ­½ÃÅ´

	private String name;
	private int score;
	
	public MyData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name+ " : " +score;
	}
	
	
	
}
