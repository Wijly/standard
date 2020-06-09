package com.day21;

import java.io.Serializable;

public class FileInfo implements Serializable{
	
	/*
		code
		100 : 파일 전송 시작(파일명)
		110 : 파일내용전송
		200 : 파일 전송 종료(파일명)
		
		size : 전송 크기
		data : 파일 전송 내용
	
	*/
	private int code;
	private int size;
	private byte[] data = new byte[1024];
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
	
	
}
