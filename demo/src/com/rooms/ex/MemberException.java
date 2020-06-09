package com.rooms.ex;

import java.util.regex.Pattern;

public class MemberException {

	public void idCheck(String id) throws Exception {
		boolean number = false;
		boolean alphabet = false;

		if (id.length() < 5 || id.length() > 10) {
			throw new Exception("5~10자 영문 대 소문자, 숫자를 사용하세요.");
		}
		
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				alphabet = true;
			}
			if (c >= '0' && c <= '9') {
				number = true;
			}
		}
		
		if(alphabet == false && number == false) {
			throw new Exception("5~10자 영문 대 소문자, 숫자를 사용하세요.");
		}
	}
	
	public void pwCheck(String pwd) throws Exception {
		boolean number = false;
		boolean alphabet = false;

		if (pwd.length() < 8 || pwd.length() > 16) {
			throw new Exception("8~16자 영문 대 소문자, 숫자를 사용하세요.");
		}
		
		for (int i = 0; i < pwd.length(); i++) {
			char c = pwd.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				alphabet = true;
			}
			if (c >= '0' && c <= '9') {
				number = true;
			}
		}
		
		if(alphabet == false || number == false) {
			throw new Exception("8~16자 영문 대 소문자, 숫자를 사용하세요.");
		}
	}
	
	public void telChcek(String tel) throws Exception {
		boolean check = Pattern.matches(
				"(010|011|016|017|018?019)-(\\d{3,4})-(\\d{4})", tel);
		if (!check)
			throw new Exception("전화번호 입력 형식은 [XXX-XXXX-XXXX]입니다");
	}

	public void emailChcek(String email) throws Exception {
		boolean check = Pattern.matches(
				"^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$", email);
		if (!check)
			throw new Exception("올바른 이메일 형식이 아닙니다");
	}
	
	
}
