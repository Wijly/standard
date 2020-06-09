package com.day14;

import java.util.Hashtable;
import java.util.Iterator;

//	Map<키,값> - List	
//	HashTable - Vector = 동기화를 한다
// 	HashMap - ArrayList = 동기화를 하지않는다.

// 키는 중복값을 가질 수 없다. - 기본키
// 키가 중복값이면 마지막값이 저장된다 ( 수정 )
// Map은 Iterator가 없다.
// put(키, 값) - 입력
// get

public class Test2 {

	public static final String name[] = { "위준형", "유병욱", "정민교", "전종훈", "현정우", "유태우", "다스링" }; // value = 값

	public static final String tel[] = { "111-111", "222-222", "333-333", "222-222", "555-555", "666-666", "777-777" }; // key
																														// =
																														// 기본키

	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<>();

		for (int i = 0; i < name.length; i++) {
			h.put(tel[i], name[i]); // 배열 입력
		}

		System.out.println(h);

		String str;
		str = h.get("111-111"); // Key 값으로 Value를 검색한다.
		System.out.println(str);

		// 키가 존재하는지 검사
		if (h.containsKey("222-222")) {
			System.out.println("키값이 존재합니다.");
		} else {
			System.out.println("존재하지않습니다.");
		}

		// value 값이 존재하는지 검사
		if (h.containsValue("다스링")) {
			System.out.println("다스링 여기이따");
		} else {
			System.out.println("다스리없따");
		}

		//키값 제거
		h.remove("222-222");
		if (h.containsKey("222-222")) {			// 키가 존재하는지 검사
			System.out.println("키값이 존재합니다.");
		} else {
			System.out.println("존재하지않습니다.");
		}
		
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			
			String key = it.next();
			String value = h.get(key);
			
			System.out.println(key + " : " + value);
			
		}

	}

}
