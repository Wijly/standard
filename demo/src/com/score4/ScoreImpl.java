package com.score4;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ScoreImpl implements Score{

	private Map<String, ScoreVO> hMap = new HashMap<>();		// key�� �й�, value�� ScoreV0
	
	Scanner sc = new Scanner(System.in);
	String hak;	
	
	@Override
	public void input() {
		System.out.print("�й��� �Է��ϼ���. : ");
		hak = sc.next();
		if(searchHak(hak)) {						// �й��� ������ true�� ������ �ȵǹǷ� ����
			System.out.println("�й��� �����մϴ�. �Է� ����");
			return;
		}
		
		ScoreVO vo = new ScoreVO();					// �й��� �������������Ƿ� ��ü�� �����ؼ� �������
	
		System.out.print("�̸��� �Է��ϼ���. : ");
		vo.setName(sc.next());
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setKor(sc.nextInt());
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setEng(sc.nextInt());
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);					// hMap�� �й� Ű���� �ְ� value������ vo�� ����
		
		System.out.println("Ȯ�εǾ����ϴ�. ");
		
	}

	@Override
	public boolean searchHak(String hak) {				// �й��� �˻��ϴ� �޼ҵ�
		
		if(hMap.containsKey(hak)) {					// �й��� �ִ��� �˻�. �й��� ���� ������ true�� ��ȯ
			return true;
		}
		return false;
		
//		return hMap.containsKey(hak);				// true false�� �����Ƿ� ���ٷ� �ڵ�����
	}

	@Override
	public void print() {
		
		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			
			String hak = it.next();					// �й��� ������ �����͸� ������
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak+ " "+vo.toString());
		}
		
	}

	@Override
	public void delete() {
		
		System.out.print("�����ϰ����ϴ� �й��� �Է����ּ���. : ");
		String delHak = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		if(!searchHak(delHak)) {
			System.out.println("�й��� �������� �ʽ��ϴ�.");
		}
		
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			hMap.remove(delHak, vo);
		}
		System.out.println("�����Ǿ����ϴ�. ");

	}

	@Override
	public void update() {
		
		System.out.print("�����ϰ����ϴ� �й��� �Է����ּ���. : ");
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("�й��� �������� �ʽ��ϴ�.");
			return;
		}
		
		ScoreVO preVO = hMap.get(hak);
		String preName = preVO.getName();
		
		ScoreVO vo = new ScoreVO();
		
		vo.setName(preName);
		
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setKor(sc.nextInt());
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setEng(sc.nextInt());
		System.out.print("���������� �Է��ϼ���. : ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak,vo);
		
		/*
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(hak.equals(hak)) {
				
				System.out.print("���������� �Է��ϼ���. : ");
				vo.setKor(sc.nextInt());
				System.out.print("���������� �Է��ϼ���. : ");
				vo.setEng(sc.nextInt());
				System.out.print("���������� �Է��ϼ���. : ");
				vo.setMat(sc.nextInt());
				
				hMap.put(hak,vo);
				
			}
			
		}
		*/
	}

	@Override
	public void findHak() {
		
		System.out.print("ã���ô� �й��� �Է����ּ���. : ");
		String findHak = sc.next();
		
		ScoreVO vo = hMap.get(findHak);
		if(vo==null) {
			System.out.println("�й��� �����ϴ�. ");
			return;
		}
		System.out.println(findHak + " " + vo.toString());
		
		
	}

	@Override
	public void findName() {
		
		System.out.print("ã���ô� �̸��� �Է����ּ���. : ");
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
			System.out.println("�̸��� ���������ʽ��ϴ�.");
		}
	}

}
