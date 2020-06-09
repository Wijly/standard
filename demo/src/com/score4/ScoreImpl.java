package com.score4;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ScoreImpl implements Score{

	private Map<String, ScoreVO> hMap = new HashMap<>();		// key는 학번, value는 ScoreV0
	
	Scanner sc = new Scanner(System.in);
	String hak;	
	
	@Override
	public void input() {
		System.out.print("학번을 입력하세요. : ");
		hak = sc.next();
		if(searchHak(hak)) {						// 학번이 있으면 true로 조건이 안되므로 실행
			System.out.println("학번이 존재합니다. 입력 실패");
			return;
		}
		
		ScoreVO vo = new ScoreVO();					// 학번이 존재하지않으므로 객체를 생성해서 집어넣음
	
		System.out.print("이름을 입력하세요. : ");
		vo.setName(sc.next());
		System.out.print("국어점수를 입력하세요. : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수를 입력하세요. : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수를 입력하세요. : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);					// hMap에 학번 키값을 넣고 value값으로 vo를 넣음
		
		System.out.println("확인되었습니다. ");
		
	}

	@Override
	public boolean searchHak(String hak) {				// 학번을 검사하는 메소드
		
		if(hMap.containsKey(hak)) {					// 학번이 있는지 검사. 학번이 만약 있으면 true값 반환
			return true;
		}
		return false;
		
//		return hMap.containsKey(hak);				// true false를 만들어내므로 한줄로 코딩가능
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			
			String hak = it.next();					// 학번을 꺼내서 데이터를 가져옴
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak+ " "+vo.toString());
		}
		
	}

	@Override
	public void delete() {
		
		System.out.print("삭제하고자하는 학번을 입력해주세요. : ");
		String delHak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		if(!searchHak(delHak)) {
			System.out.println("학번이 존재하지 않습니다.");
		}
		
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			hMap.remove(delHak, vo);
		}
		System.out.println("삭제되었습니다. ");

	}

	@Override
	public void update() {
		
		System.out.print("변경하고자하는 학번을 입력해주세요. : ");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("학번이 존재하지 않습니다.");
			return;
		}
		
		ScoreVO preVO = hMap.get(hak);
		String preName = preVO.getName();
		
		ScoreVO vo = new ScoreVO();
		
		vo.setName(preName);
		
		System.out.print("국어점수를 입력하세요. : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어점수를 입력하세요. : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학점수를 입력하세요. : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak,vo);
		
		/*
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(hak.equals(hak)) {
				
				System.out.print("국어점수를 입력하세요. : ");
				vo.setKor(sc.nextInt());
				System.out.print("영어점수를 입력하세요. : ");
				vo.setEng(sc.nextInt());
				System.out.print("수학점수를 입력하세요. : ");
				vo.setMat(sc.nextInt());
				
				hMap.put(hak,vo);
				
			}
			
		}
		*/
	}

	@Override
	public void findHak() {
		
		System.out.print("찾으시는 학번을 입력해주세요. : ");
		String findHak = sc.next();
		
		ScoreVO vo = hMap.get(findHak);
		if(vo==null) {
			System.out.println("학번이 없습니다. ");
			return;
		}
		System.out.println(findHak + " " + vo.toString());
		
		
	}

	@Override
	public void findName() {
		
		System.out.print("찾으시는 이름을 입력해주세요. : ");
		String findName = sc.next();
		
		boolean flag = false;
		
		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(findName.equals(vo.getName())){
				flag = true;
				System.out.println(hak + " "+ vo.toString());
			}
		
		}if(!flag) {
			System.out.println("이름이 존재하지않습니다.");
		}
	}

}
