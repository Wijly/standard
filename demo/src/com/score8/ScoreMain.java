package com.score8;

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
					System.out.print("1) insert, 2) update, 3) delete, 4) selectAll, 5) 학번 검색, 6) 종료 : ");
					n = sc.nextInt();	
				}while(n<1 || n>6);
				
				switch(n) {
				
				case 1:
					ob.insert();
					break;
				case 2:
					ob.update();
					break;
				case 3:
					ob.delete();
					break;					
				case 4:
					ob.selectAll();
					break;					
				case 5:
					ob.searchHak();
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
