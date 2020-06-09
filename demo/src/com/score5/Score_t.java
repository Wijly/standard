package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score_t {
	
	private List<ScoreVO_t> lists = null;
	private String path = System.getProperty("user.dir");
//	private String path = "d:\\java\\work\\demo\\score.txt";
	private File f = new File(path);
	
	public Score_t() {
		try {
			
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (ArrayList<ScoreVO_t>)ois.readObject();
				
				ois.close();
				fis.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	
	public void writeFile() {
		try {
			
			if(lists!=null) {
				
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				
				System.out.println("파일 저장 성공");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void print() {
		
		Iterator<ScoreVO_t> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO_t data = it.next();
			System.out.println(data.toString());
		}
	}
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		ScoreVO_t vo = new ScoreVO_t();
		
		System.out.print("이름 : ");
		vo.setName(sc.next());
		
		System.out.print("생년월일 : ");
		vo.setBirth(sc.next());
		
		System.out.print("점수 : ");
		vo.setScore(sc.nextInt());
		
		if(lists == null) {
			lists = new ArrayList<>();
		}
		lists.add(vo);
	}
}
