package com.day15;

public class OperationAuthenticator {
	
	public void inputFormat(String str) throws AuthenticatorException{
	
		String[] temp = str.split(",");									// , 쉼표로 갯수를 입력받는 메소드
		
		if(temp.length !=2) {				// 2개가 안되면
			throw new AuthenticatorException("숫자 입력 형식 오류 "+ str);
		}
		
	}
	
	@SuppressWarnings("unused")				// 사용하지않는 변수가 있어도 노란색줄을 표시하지않는 코드
	public void number(String str) throws AuthenticatorException{
		
		try {
			
			if(str.indexOf(".") != -1){				// .을 보고 실수면
				double num = Double.parseDouble(str);		// 실수면 실수로 형변환
			}else {
				int num = Integer.parseInt(str);			// 실수가 아니면 인트로 형변환
			}
			
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			throw new AuthenticatorException("숫자 변환 불가 : " + str);
			
		}
	}
	
	public void operator(char ch) throws AuthenticatorException{
		
		switch(ch) {
		case '+' :case '-' :case '*' :case '/' :
			return;					// 연산기호가 맞는지 확인만 함
		default:
			throw new AuthenticatorException("연산자 오류 : " + ch);
		}
	}

}
