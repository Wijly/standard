package com.day9;

import java.util.Set;

// 상속 부모 ㅡ▶ 자식
// 1. 부모 것은 자식꺼
// 2. private를 선언한 것은 상속이 안됌
// 3. protected로 선언한 것은 상속이 가능하다.
// 4. 부모와 내가 같은 객체를 가지고있으면 자기것을 쓴다.
// ★5.	자기것은 자기것. 자식것을 부모가 가져다가 쓸 수 없음. 


class SuperC{
	private String title;
//	private int area;
	protected int area;
	
//	public void set(String title, int area) {		// 초기화작업 - 메소드로 초기화
	public void set(String title) {
		this.title = title;
//		this.area = area;
	}
	
	public void print() {
		
		System.out.println(title+" : " + area);
		
	}
}
class RectA extends SuperC{				//extends SuperC << 부모클래스로부터 상속
	
	private int w,h;
	
	public RectA(int w, int h){				// 초기화 작업 - 생성자로 초기화
		this.w = w;
		this.h = h;
	}
	public void rectArea() {
	
		area = w*h;
		set("사각형");			// 부모클래스 메소드 사용
		
	}
	
}

public class Test9 {

	public static void main(String[] args) {
		
		RectA ra = new RectA(10,20);			// 생성자로 객체를 만듬
		
		ra.rectArea();
		ra.print();
		

	}

}
