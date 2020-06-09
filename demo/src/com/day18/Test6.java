package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

// 객체의 직렬화
// 메모리에 생성된 클래스 객체의 멤버변서의 현재상태를 그대로 보존해서 파일에 저장하거나
// 네트워크를 통해 전송 할 수 있는 기능
// 오로지 바이트 단위로만 데이터를 송수신

// 장점 : 객체 자체의 내용을 입출력 형식에 구애받지않고 객체를 저장함으로써
//		  영속성을 제공할 수 있다. 객체 자체를 네트워크를 통해 손쉽게 교환 가능

// implements Serializable로 구현 ( 메소드는 없다 )
// 	map<> 에는 serializable이 구현되어있다.

public class Test6 {

	public static void main(String[] args) {
		
		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "다스리");
		h.put("2", "즐리");
		h.put("3", "chadol");		// 직렬화 된 상태
		try {

			FileOutputStream fos = new FileOutputStream("d:\\doc\\out8.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);		// object < 업캐스트
			
			oos.writeObject(h);
			
			oos.close();
			fos.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		

	}

}
