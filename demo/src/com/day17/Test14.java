package com.day17;

import java.io.File;
import java.io.FileFilter;

// FileFilter �������̽�
class MyFilterList implements FileFilter{

	private File f;
	
	public MyFilterList(String filePath) {		// ������
		// TODO Auto-generated constructor stub
		f = new File(filePath);					// File Ŭ���� ��ü ������ ���ÿ� �Ű������� �޴� �ʱ�ȭ���� 
	}
	
	public void result() {
	
		try {
			
			if(!f.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				return;
			}
			
			System.out.println("���� ��� : "+f.getAbsolutePath());
			System.out.println("���� ũ�� : " +f.length());
			
			// ������  ������ ���
			if(f.isDirectory()) {
				File[] lists = f.listFiles(this);
				System.out.println("\n������ ���� ��");
				for(int i=0; i<lists.length; i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			// ���丮 ����(C:, D:)
			System.out.println("���丮 ���� ��");
			File[] root = File.listRoots();
			
			for(int i = 0; i<root.length; i++) {
				System.out.println(root[i].getPath());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory();
	}
}


public class Test14 {

	public static void main(String[] args) {
		
		MyFilterList mf = new MyFilterList("C:\\");
		
		mf.result();

	}

}
