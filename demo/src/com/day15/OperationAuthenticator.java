package com.day15;

public class OperationAuthenticator {
	
	public void inputFormat(String str) throws AuthenticatorException{
	
		String[] temp = str.split(",");									// , ��ǥ�� ������ �Է¹޴� �޼ҵ�
		
		if(temp.length !=2) {				// 2���� �ȵǸ�
			throw new AuthenticatorException("���� �Է� ���� ���� "+ str);
		}
		
	}
	
	@SuppressWarnings("unused")				// ��������ʴ� ������ �־ ��������� ǥ�������ʴ� �ڵ�
	public void number(String str) throws AuthenticatorException{
		
		try {
			
			if(str.indexOf(".") != -1){				// .�� ���� �Ǽ���
				double num = Double.parseDouble(str);		// �Ǽ��� �Ǽ��� ����ȯ
			}else {
				int num = Integer.parseInt(str);			// �Ǽ��� �ƴϸ� ��Ʈ�� ����ȯ
			}
			
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			throw new AuthenticatorException("���� ��ȯ �Ұ� : " + str);
			
		}
	}
	
	public void operator(char ch) throws AuthenticatorException{
		
		switch(ch) {
		case '+' :case '-' :case '*' :case '/' :
			return;					// �����ȣ�� �´��� Ȯ�θ� ��
		default:
			throw new AuthenticatorException("������ ���� : " + ch);
		}
	}

}
