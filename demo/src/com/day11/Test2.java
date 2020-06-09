package com.day11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {
		
//		Calendar 
		Calendar now = Calendar.getInstance();
//		Calendar now = new GregorianCalendar();
		
		int y = now.get(Calendar.YEAR);		//��
		int m = now.get(Calendar.MONTH)+1;		//�� (0~11)�̹Ƿ� +1
		int d = now.get(Calendar.DATE);		// ��
		int w = now.get(Calendar.DAY_OF_WEEK);	//���� ��(1~7, 1: �Ͽ���, 7: �����)
		
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y+" - "+ m +" - "+d+" " +yoil[w-1]);
		
		
		//���� ù��, ��������
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + " : " +endDay);
		
		System.out.printf("%tF\n",now);			// ���� ��¥
		System.out.printf("%tT\n",now);			// ���� �ð�

//		System.out.printf("%tF %tT\n",now,now);
		System.out.printf("%1$tF %1$tT\n",now);

		now.set(2021,10-1,10);			//2021�� 10�� 10��
		y = now.get(Calendar.YEAR);		//��
		m = now.get(Calendar.MONTH)+1;		//�� (0~11)�̹Ƿ� +1
		d = now.get(Calendar.DATE);		// ��
		w = now.get(Calendar.DAY_OF_WEEK);	//���� ��(1~7, 1: �Ͽ���, 7: �����)
		
		System.out.println(y+" - "+ m +" - "+d+" " +yoil[w-1]);
		
	}

}
