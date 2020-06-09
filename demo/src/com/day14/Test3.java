package com.day14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {

		// Set : 중복값을 허용 안함(Map의 key)
		Set<String> s = new HashSet<>();

		s.add("서울");
		s.add("대전");
		s.add("대구");

		System.out.println(s);

		Iterator<String> it = s.iterator(); // 데이터 출력
		while (it.hasNext()) {
			String str = it.next();
			System.out.print(str + " ");
		}
		System.out.println();

		s.add("서울");
		System.out.println(s);
		System.out.println("-*-*-*-*-*-*-***-*-*-*-*-*-");

		// Stack
		Stack<String> st = new Stack<>();
		st.add("서울");
		st.push("대전");
		st.push("대구");
		st.push("부산");

		while (!st.empty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();

		// Queue
		Queue<String> q = new LinkedList<>();

		q.add("서울");
		q.offer("광주");
		q.offer("화성");
		q.offer("당진");

		while (q.peek() != null) {
			System.out.print(q.poll() + " ");
		}
		System.out.println();

		List<String> lists1 = new LinkedList<>();

		lists1.add("A");
		lists1.add("B");
		lists1.add("C");
		lists1.add("D");
		lists1.add("E");
		lists1.add("F");
		lists1.add("G");
		lists1.add("H");
		lists1.add("I");

		List<String> lists2 = new LinkedList<>();

		lists2.add("경기");
		lists2.add("감자");
		lists2.add("빵");
		
		lists2.addAll(lists1);						// lists2에 1을 추가
		
		for(String a : lists2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		lists2.subList(2, 5).clear();				// index 2에서 5 -1까지 삭제
		for(String a : lists2) {
			System.out.print(a+" ");
		}
		System.out.println();
		
//		-=-=-=-=-=-===========------------------
		
		String[] str = {"사","다","바","가","나","마","라"};
		
		for (String a : str) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		Arrays.sort(str);
		for(String a : str) {
			System.out.print(a+" ");
		}
		System.out.println();
		
	}

}

/*

 	Iterater<저장할자료형> it = lists.iterator();
 	while(it.hasNext()){ 
 		저장할 자료형 data = it.next();
 	}
 	---------------------------------------------------------------------------------
 	[List]
 	List<저장할 자료형> lists = new ArrayList<저장할 자료형> ();
 	List<저장할 자료형> lists = new Vector<저장할 자료형>();
 																				==
 	ArrayList<저장할 자료형> lists = new ArrayList<저장할자료형>();
 	Vector<저장할 자료형> lists = new Vector<저장할자료형>();
 	
 	입력 : lists.add(값);
 	
 	출력 :
 	Iterater<저장할자료형> it = lists.iterator();
 	 	
 	Iterater<저장할자료형> it = lists.iterator();
 		while(it.hasNext()){ 
 			저장할 자료형 data = it.next();
 		}
 	-----------------------------------------------------------------------------------
 	[Map]
 	Map<키, 저장할 자료형> map = new HashMap<>();
 	Map<키, 저장할 자료형> map = new HashTable<>();
 																				==
 	HashMap<키, 저장할 자료형> map = new HashMap<>();
 	HashTable<키, 저장할 자료형> map = new HashTable<>();
 	
 	입력 : map.put(키,값);
 	
 	출력 : 
 	Iterater<키자료형> it = map.keySet().iterator();
 	
 	while(it.hasNext()){ 
 		키자료형 key = it.next();
 		저장할 자료형 data = map.get(key);
 	}
*/











