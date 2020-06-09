package com.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<String> lists = new ArrayList<>();
	
		lists.add("서울");
		lists.add("대전");
		lists.add("대구");
		lists.add("부산");
		
		Iterator<String> it = lists.iterator();			// 배열을 출력할 수 있게해줌
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+ " ");
		}
		System.out.println();
		
		ListIterator<String> it1 = lists.listIterator();
		
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		
		while(it1.hasPrevious()) {
			System.out.print(it1.previous()+" ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		
		
		List<String> lists1 = new ArrayList<>();
		
		lists1.addAll(lists);				// 리스트 전체 삽입
		lists1.add("인천");
		
		int n = lists1.indexOf("부산");			// 부산번째의 index값을 n에 저장
		lists1.add(n+1,"광주");					// 부산 다음에 광주를 저장
		for(String s:lists1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		
		List<String> lists2 = new ArrayList<>();
		lists2.add("자바프러롤로로그래머");
		lists2.add("프레임워크");
		lists2.add("자바 jjjjjava");
		lists2.add("사블릿");
		lists2.add("스프링");
		
		String str;
		
		Iterator<String> it2 = lists2.iterator();
		
		while(it2.hasNext()) {
			str = it2.next();
			if(str.startsWith("자바")) {				// 자바로 시작하는 것 
				System.out.println(str);
			}
		}
		
	}

}
