package com.naver;

public interface Naver {
	
	public void input();		// ȸ������

	public boolean successId(String id);	// ���̵� ���� Ȯ��
	public boolean succesccLogin(String id, String pw);
	public void print();		// ��ü ���
	public void searchID();		// ���̵� ��� �Է��� �������
	public void delectID();		// ���̵� ��� �Է��� ����
	public void updateId();		// ���̵� ��� �Է��� ��й�ȣ ����
	

}
