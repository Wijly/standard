package com.day17;

import java.io.File;
import java.io.FileFilter;

// FileFilter 인터페이스
class MyFilterList implements FileFilter{

	private File f;
	
	public MyFilterList(String filePath) {		// 생성자
		// TODO Auto-generated constructor stub
		f = new File(filePath);					// File 클라스의 객체 생성과 동시에 매개변수를 받는 초기화까지 
	}
	
	public void result() {
	
		try {
			
			if(!f.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("절대 경로 : "+f.getAbsolutePath());
			System.out.println("파일 크기 : " +f.length());
			
			// 파일이  폴더인 경우
			if(f.isDirectory()) {
				File[] lists = f.listFiles(this);
				System.out.println("\n폴더의 내용 ┐");
				for(int i=0; i<lists.length; i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			// 디렉토리 구조(C:, D:)
			System.out.println("디렉토리 구조 ┐");
			File[] root = File.listRoots();
			
			for(int i = 0; i<root.length; i++) {
				System.out.println(root[i].getPath());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
	}
}


public class Test14 {

	public static void main(String[] args) {
		
		MyFilterList mf = new MyFilterList("C:\\");
		
		mf.result();

	}

}
