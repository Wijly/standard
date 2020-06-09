package com.day8;

import java.util.Calendar;

// Data 클래스 사용

public class Test3 {

	public static void main(String[] args) {

//		Data ob = new Data();
//		
//		ob.print();

		Data.print();
		
		//static 하나의 메모리만 사용하는 경우 =
		
		Calendar cal1 = Calendar.getInstance();				// 다 똑같은 메모리를 가르킨다.
		Calendar cal2 = Calendar.getInstance();				// 
		Calendar cal3 = Calendar.getInstance();
		Calendar cal4 = Calendar.getInstance();		

	}

}
