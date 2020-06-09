package com.day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

// ���� ������ ���� Ŭ����

public class FileClientTest {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		String host = "127.0.0.1";
		
		Socket sc =null;
		
		ObjectOutputStream oos = null;
		
		Scanner scan = new Scanner(System.in);
		
		String file;
		
		try {
			
			System.out.print("������ ���� ��� : ");
			file = scan.next();
			
			File f = new File(file);	// ������ ��θ� ���� ���� ����
			
			if(!f.exists()) {		// ������ �������
				System.out.println("������ �����ϴ�.");
				System.exit(0);
			}
			
			// ������ ������ ���� ����
			sc = new Socket(host, port);
			
			oos = new ObjectOutputStream(sc.getOutputStream());
			oos.flush();		// ���۰� �������ʾƵ� ������ �����ͱ��� ������
			
			//���� ���� ����
			FileInfo info;
			info = new FileInfo();
			info.setCode(100);		// �������� �ڵ� 100��
			info.setData(f.getName().getBytes()); 	// �����̸��� ����ƮŸ������ �ٲ�
			info.setSize((int)f.length());		// ���ϻ���� ������ ��ȯ�ؼ� ����
			
			oos.writeObject(info); 		//info�� ������
			System.out.println(f.getName()+"���� ���� ����");
			
			Thread.sleep(30);		// �ϵ����� �����⶧���� ���� �ɷ��� ������
			
			//���ϳ��� ����
			FileInputStream fis = new FileInputStream(f);	//���� �б�
			int data;
			byte[] buffer = new byte[1024];
			
			while((data=fis.read(buffer,0,1024))!=-1) {
				
				info = new FileInfo();
				info.setCode(110);
				info.setSize(data);
				info.setData(buffer);
				
				oos.writeObject(info);
				System.out.println(data+"byte ������");
					
				buffer = new byte[1024];
				
				Thread.sleep(300);
				
			}
			
			fis.close();
			
			//�������� ����
			info = new FileInfo();
			
			info.setCode(200);
			info.setData(f.getName().getBytes());
			info.setSize((int)f.length());
			
			oos.writeObject(info);
			System.out.println(f.getName()+"���� ���� ��");
			
			Thread.sleep(300);
			
			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}