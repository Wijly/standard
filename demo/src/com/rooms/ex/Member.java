package com.rooms.ex;

import java.sql.Date;
import java.util.Scanner;

import com.rooms.dao.MemberDAO;
import com.rooms.domain.MemberVO;

public class Member {

	MemberDAO dao = new MemberDAO();
	MemberException me = new MemberException();
	Scanner sc = new Scanner(System.in);

	public void register() {
		MemberVO vo = new MemberVO();
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		while(true) {
			System.out.println("����������������");
			System.out.println("��   ���̵�   ��");
			System.out.println("����������������");
			System.out.print("�Է� : ");
			String id = sc.next();
			boolean result = dao.checkid(id);
			try {
				me.idCheck(id);
				if(!result) {
					System.out.println("��� ������ ���̵��Դϴ�");
					vo.setId(id);
					break;
				} else {
					System.out.println("�ߺ��� ���̵� �����մϴ�");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		while(true) {
			try {
				System.out.println("��������������������");
				System.out.println("��    ��й�ȣ    ��");
				System.out.println("��������������������");
				System.out.print("�Է� : ");
				String pwd = sc.next();
				me.pwCheck(pwd);
				vo.setPwd(pwd);
				System.out.println("��� ������ ��й�ȣ�Դϴ�");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("��������������������");
		System.out.println("��    ��    ��    ��");
		System.out.println("��������������������");
		System.out.print("�Է� : ");
		vo.setName(sc.next());
		while(true) {
			try {
				System.out.println("��������������������");
				System.out.println("��    ��ȭ��ȣ    ��");
				System.out.println("��������������������");
				System.out.print("�Է� : ");
				String tel = sc.next();
				me.telChcek(tel);
				vo.setTel(tel);
				System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.println("������������������");
				System.out.println("��    �̸���    ��");
				System.out.println("������������������");
				System.out.print("�Է� : ");
				String email = sc.next();
				me.emailChcek(email);
				vo.setEmail(email);
				System.out.println("�ùٸ� �̸��� �����Դϴ�");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("��������������������");
		System.out.println("��    �������    ��");
		System.out.println("��������������������");
		System.out.print("�Է� : ");
		Date d = Date.valueOf(sc.next());
		vo.setBirth(d);		
		int result = dao.register(vo);
		if(result == 0) {
			System.out.println("���� : ȸ�� ���Կ� �����ϼ̽��ϴ�. ������ �ٽ� �Է����ֽʽÿ�");
		} else {
			System.out.println("�����մϴ�!! ȸ�����Կ� �����ϼ̽��ϴ�");
		}
	}
	
	public String login() {
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("������������������");
		System.out.println("��    ���̵�    ��");
		System.out.println("������������������");
		System.out.print("�Է� : ");
		String id = sc.next();
		System.out.println("��������������������");
		System.out.println("��    ��й�ȣ    ��");
		System.out.println("��������������������");
		System.out.print("�Է� : ");
		String pwd = sc.next();
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		boolean check = dao.checklogin(id, pwd);
		if(!check) {
			return "fail";
		}
		return id;
	}
	
	public void update() {
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("������������������");
		System.out.println("��    ���̵�    ��");
		System.out.println("������������������");
		System.out.print("�Է� : ");
		String id = sc.next();
		System.out.println("��������������������");
		System.out.println("��    ��й�ȣ    ��");
		System.out.println("��������������������");
		System.out.print("�Է� : ");
		String pwd = sc.next();
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			System.out.println("����������������������������������������������������������������������������������������������������������������������������������������");
			System.out.println("�α��ο� �����ϼ̽��ϴ�");
			System.out.println("ȸ�� ������ �����մϴ�");
			MemberVO vo = new MemberVO();
			while(true) {
				System.out.println("����������������");
				System.out.println("��   ���̵�   ��");
				System.out.println("����������������");
				System.out.print("�Է� : ");
				String _id = sc.next();
				boolean result = dao.checkid(_id);
				try {
					me.idCheck(_id);
					if(!result) {
						System.out.println("��� ������ ���̵��Դϴ�");
						vo.setId(_id);
						break;
					} else {
						System.out.println("�ߺ��� ���̵� �����մϴ�");
					}
					
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				
			}
			while(true) {
				try {
					System.out.println("��������������������");
					System.out.println("��    ��й�ȣ    ��");
					System.out.println("��������������������");
					System.out.print("�Է� : ");
					String _pwd = sc.next();
					me.pwCheck(_pwd);
					vo.setPwd(_pwd);
					System.out.println("��� ������ ��й�ȣ�Դϴ�");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			System.out.println("��������������������");
			System.out.println("��    ��    ��    ��");
			System.out.println("��������������������");
			System.out.print("�Է� : ");
			vo.setName(sc.next());
			
			while(true) {
				try {
					System.out.println("��������������������");
					System.out.println("��    ��ȭ��ȣ    ��");
					System.out.println("��������������������");
					System.out.print("�Է� : ");
					String tel = sc.next();
					me.telChcek(tel);
					vo.setTel(tel);
					System.out.println("�ùٸ� ��ȭ��ȣ �����Դϴ�");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			while(true) {
				try {
					System.out.println("������������������");
					System.out.println("��    �̸���    ��");
					System.out.println("������������������");
					System.out.print("�Է� : ");
					String email = sc.next();
					me.emailChcek(email);
					vo.setEmail(email);
					System.out.println("�ùٸ� �̸��� �����Դϴ�");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			
			dao.update(vo, id);
			
			System.out.println("���������� ȸ�� ������ �����Ͽ����ϴ�");
		} else {
			System.out.println("���� : �α��� ������ �ùٸ��� �ʽ��ϴ�");
		}
	}
	
	public void delete() {
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("������������������");
		System.out.println("��    ���̵�    ��");
		System.out.println("������������������");
		System.out.print("�Է� : ");
		String id = sc.next();
		
		System.out.println("��������������������");
		System.out.println("��    ��й�ȣ    ��");
		System.out.println("��������������������");
		System.out.print("�Է� : ");
		String pwd = sc.next();
		System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
		
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			dao.delete(id);
			System.out.println("���������� ȸ�� Ż�� �Ǿ����ϴ�");
		} else {
			System.out.println("���� : �ùٸ� ȸ�� ������ �Է��Ͻʽÿ�");
		}
		
	}
}
