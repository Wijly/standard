package com.day21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

	public static String replaceAll(String str,String oldStr, String newStr) {
		
		if(str==null)
			return null;
		
		Pattern p = Pattern.compile(oldStr);	// 대한
		Matcher m = p.matcher(str);			// oldStr과 str을 비교
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);		// sb에서 새로운것을 찾음 // 大韓
			
		}
		m.appendTail(sb);				// 미입력시 "의 건아" 가 나오지 않음, 마지막으로 찾은 것부터 마지막까지를 짜름
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		String str = "우리나라 대한민국 대한민국 만세 대한의 건아 위준형";
		String s = Test4.replaceAll(str, "대한", "大韓");
		
		System.out.println(s);
		

	}

}
