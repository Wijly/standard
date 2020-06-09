package com.score6;

import java.util.Scanner;

import com.db.DBConn;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score ob = new Score();
		
		int n;
		
		try {
			
			while (true) {
			
				do {
					System.out.print("1) insert, 2) update, 3) delete, 4) selectAll, 5) �̸� �˻�, 6) ���� : ");
					n = sc.nextInt();	
				}while(n<1 || n>6);
				
				switch(n) {
				
				case 1:
					ob.insertData();
					break;
				case 2:
					ob.updateData();
					break;
				case 3:
					// 0�� �ƴϿ��� �� ���
					if(ob.deleteData()!=0)
						System.out.println("���� ����");
					break;
				case 4:
					ob.selectAll();
					break;
				case 5:
					ob.nameSearch();
					break;
				case 6: 
					DBConn.close();
					System.exit(0);
				}
			
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
