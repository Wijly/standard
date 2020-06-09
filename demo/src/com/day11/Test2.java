package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {
		
//		Calendar 
		Calendar now = Calendar.getInstance();
//		Calendar now = new GregorianCalendar();
		
		int y = now.get(Calendar.YEAR);		//년
		int m = now.get(Calendar.MONTH)+1;		//월 (0~11)이므로 +1
		int d = now.get(Calendar.DATE);		// 일
		int w = now.get(Calendar.DAY_OF_WEEK);	//주의 수(1~7, 1: 일요일, 7: 토요일)
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		System.out.println(y+" - "+ m +" - "+d+" " +yoil[w-1]);
		
		
		//달의 첫날, 마지막날
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + " : " +endDay);
		
		System.out.printf("%tF\n",now);			// 현재 날짜
		System.out.printf("%tT\n",now);			// 현재 시간

//		System.out.printf("%tF %tT\n",now,now);
		System.out.printf("%1$tF %1$tT\n",now);

		now.set(2021,10-1,10);			//2021년 10월 10일
		y = now.get(Calendar.YEAR);		//년
		m = now.get(Calendar.MONTH)+1;		//월 (0~11)이므로 +1
		d = now.get(Calendar.DATE);		// 일
		w = now.get(Calendar.DAY_OF_WEEK);	//주의 수(1~7, 1: 일요일, 7: 토요일)
		
		System.out.println(y+" - "+ m +" - "+d+" " +yoil[w-1]);
		
	}

}
