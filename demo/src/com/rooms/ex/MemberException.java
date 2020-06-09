package com.rooms.ex;

import java.util.regex.Pattern;

public class MemberException {

	public void idCheck(String id) throws Exception {
		boolean number = false;
		boolean alphabet = false;

		if (id.length() < 5 || id.length() > 10) {
			throw new Exception("5~10�� ���� �� �ҹ���, ���ڸ� ����ϼ���.");
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
			throw new Exception("5~10�� ���� �� �ҹ���, ���ڸ� ����ϼ���.");
		}
	}
	
	public void pwCheck(String pwd) throws Exception {
		boolean number = false;
		boolean alphabet = false;

		if (pwd.length() < 8 || pwd.length() > 16) {
			throw new Exception("8~16�� ���� �� �ҹ���, ���ڸ� ����ϼ���.");
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
			throw new Exception("8~16�� ���� �� �ҹ���, ���ڸ� ����ϼ���.");
		}
	}
	
	public void telChcek(String tel) throws Exception {
		boolean check = Pattern.matches(
				"(010|011|016|017|018?019)-(\\d{3,4})-(\\d{4})", tel);
		if (!check)
			throw new Exception("��ȭ��ȣ �Է� ������ [XXX-XXXX-XXXX]�Դϴ�");
	}

	public void emailChcek(String email) throws Exception {
		boolean check = Pattern.matches(
				"^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$", email);
		if (!check)
			throw new Exception("�ùٸ� �̸��� ������ �ƴմϴ�");
	}
	
	
}
