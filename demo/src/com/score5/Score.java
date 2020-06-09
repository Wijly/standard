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

public class Score{
	
//	private List<ScoreVO> lists = new ArrayList<>();
	private List<ScoreVO> lists = null;
	Scanner sc = new Scanner(System.in);
	
	FileOutputStream fos;
	ObjectOutputStream oos;
	FileInputStream fis;
	ObjectInputStream ois;
	
	String path = "d:\\java\\work\\demo\\score.txt";
	File f = new File(path);

	public void input() {
		try {
			System.out.print("이름 : ");
			String name= sc.next();
			System.out.print("생년월일 : ");
			String birth = sc.next();
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			ScoreVO vo = new ScoreVO(name,birth,score);
			
			if(!f.exists()) {
				lists.add(vo);
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(lists);
				oos.flush();
				
			}else if(f.exists()){
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				
				List<ScoreVO> li = (List<ScoreVO>)ois.readObject();
				Iterator<ScoreVO> it = li.iterator();
				
				while(it.hasNext()) {
					ScoreVO vo2 = it.next();
					lists.add(vo2);
				}
				lists.add(vo);
				
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);		
				
				oos.flush();
				lists.clear();
			
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
		} 				
	}
	
	public void print() {
		
		try {
			if(f.exists()) {
				
				fis = new FileInputStream(path);	
				ois = new ObjectInputStream(fis);
	
				List<ScoreVO> li = (List<ScoreVO>)ois.readObject();
				
				Iterator<ScoreVO> it = li.iterator();
				while(it.hasNext()) {
					ScoreVO vo = it.next();
					vo.toString();
				}
			}else {
				Iterator<ScoreVO> it = lists.iterator();
				while(it.hasNext()) {
					ScoreVO vo = it.next();
					vo.toString();
				}
			}
		
		}catch(Exception e){
			
		}
		
	}

	public void save() {
		
		try {
			ois.close();
			fis.close();
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}


}
