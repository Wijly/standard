package com.rooms.ex;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.rooms.dao.CategoryDAO;
import com.rooms.domain.CategoryVO;

public class Category {

	
	Scanner scan = new Scanner(System.in);
	CategoryDAO dao = new CategoryDAO();
	
	public void insert() {
		
		try {
		
			CategoryVO vo = new CategoryVO();
			
			System.out.println("��������������������");
			System.out.println("��   ī�װ���   ��");
			System.out.println("��������������������");
			System.out.print("�Է� : ");
			vo.setCate_name(scan.next());
			
			int result = dao.insert(vo);
			
			if(result == 1) {
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				System.out.println("������ �߰� ����");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			}
			else {
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				System.out.println("������ �߰� ����");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			}
		} catch (Exception e) {

			System.out.println(e.toString());
		}
	}
	
	public void select() {
		try {
			
			List<CategoryVO> list = dao.select();
			
			Iterator<CategoryVO> it = list.iterator();
			
			while(it.hasNext()) {
				CategoryVO vo = it.next();
				
				System.out.println(vo);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void update() {
		try {
			
			CategoryVO vo = new CategoryVO();
			System.out.println("����������������������");
			System.out.println("��   ī�װ� ��ȣ  ��");
			System.out.println("����������������������");
			System.out.print("�Է� : ");
			vo.setCate_num(scan.nextInt());
			System.out.println("��������������������");
			System.out.println("��   ī�װ���   ��");
			System.out.println("��������������������");
			System.out.print("�Է� : ");
			vo.setCate_name(scan.next());
			
			int result = dao.update(vo);
			
			if(result == 1) {
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");	
				System.out.println("������ ���� ����");
			}
			else {
				System.out.println("������ ���� ����");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void delete() {
		
		try {
			System.out.println("������������������������������");
			System.out.println("��   ������ ī�װ� ��ȣ   ��");
			System.out.println("������������������������������");
			System.out.print("�Է� : ");
			int cate_num = scan.nextInt();
			
			int result = dao.delete(cate_num);
			
			if(result == 1) {
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				System.out.println("������ ���� ����");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			}
			else {
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
				System.out.println("������ ���� ����");
				System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
