package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test3 {
	
	private static final String city[]= {"서울","대전","대구","부산","광주","인천","울산"};

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		
		String str;
		
		System.out.println("벡터 초기 용량 : "+v.capacity()); //	10
		
		for(String c: city) 
			v.add(c);
		
		System.out.println();
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("데이터(요소)의 갯수 : "+v.size());
		
		// 치환
		v.set(0, "Seoul");
		v.set(1, "Daejeon");

		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//삽입
		v.insertElementAt("대한민국", 0);
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		//검색
		int index = v.indexOf("대구");		// index = 3 ;
		System.out.println(index);
		
		if(index !=-1) {		//찾고자하는 데이터가 있으면
			System.out.println("검색 성공 : " + index);
		}else {
			System.out.println(" 검색 실패 : " + index);
		}
		
		// 오름차순 정렬
		Collections.sort(v);
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// 삭제
		v.remove("Daejeon");
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		// 용량 증가
		for(int i = 1 ; i<=20; i++) {
			v.add(Integer.toString(i));
		}
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		
		System.out.println("벡터 현재 용량 : "+v.capacity());
		System.out.println("데이터(요소)의 갯수 : "+v.size());
		
		// 특정 범위 삭제
		
		for(int i =1; i<=10; i++) {
			v.remove(7);				//7번을 지우면 앞으로 하나씩 땡겨져와서 같은곳을 계속 지우면 됨
		}
		for(String c : v)
			System.out.print(c + " ");
		System.out.println();
		System.out.println("벡터 현재 용량 : "+v.capacity());		// 자료를 지워도 용량을 자동으로 지우지않음
		System.out.println("데이터(요소)의 갯수 : "+v.size());
		
		// 빈 공간 벡터 삭제
		v.trimToSize();
		System.out.println("벡터 현재 용량 : "+v.capacity());
		System.out.println("데이터(요소)의 갯수 : "+v.size());
		
		// 모든 데이터 삭제
		v.clear();
		System.out.println("벡터 현재 용량 : "+v.capacity());
		System.out.println("데이터(요소)의 갯수 : "+v.size());
	}

}
