package com.day8.bank;

import java.util.Random;
import java.util.Scanner;

// 1.계좌만들기 2.입금 3.출금 4.조회
// (등록된 계좌가 없습니다.) 조회 - 이름, 계좌번호, 비밀번호 입력 - 정보와 가진 금액 출력
// 계좌만들기 = 주민등록번호 확인, 이름입력 - 랜덤번호 15자리 - 비밀번호 입력 후 출력-

public class Calc {
	
	int input;
	static int count=0; 			// 클래스 배열, +1씩하면서 추가하기
	int i,j;				//for문에 쓸 변수 선언
	int succ = 0;
	
	Record[] rec= new Record[100];
	
	Scanner sc = new Scanner(System.in);
	
	public void set() {										// 주민등록번호 확인
		
		int t,temp;
		int[] chk = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};		// 주민번호 체크
						
		System.out.print("주민번호 13자리를 입력하세요 (xxxxxx-xxxxxxx): ");
		String userNum = sc.next();
		
		if(userNum.length()!=14){
			System.out.println("주민번호 입력 오류 ");
			return;		// stop 의 의미
		}
		
		t = 0;
		
		for(i=0; i<12; i++) {	// 등호와 마지막자리를 뺀 12자리
			
			if(i>=6) 			// 주민번호 뒷자리
				t += chk[i]*Integer.parseInt(userNum.substring(i+1,i+2));
			
			else				// 생년월일 비교
				t += chk[i]*Integer.parseInt(userNum.substring(i,i+1));
		}
		
		temp = 11-t%11;
		temp = temp%10;
		
		if(temp==Integer.parseInt(userNum.substring(13))) {
			System.out.println("정확한 주민번호입니다.");
		}else
			System.out.println("정확한 주민번호가 아닙니다.");
	}
	
	public void createAccount() {								// 계정 생성
		
		String name;
		
		rec[count] = new Record();
		
		Random rd = new Random();
		
		System.out.print("이름을 입력해주세요. : ");
		rec[count].name = sc.next();
		System.out.print("사용하실 비밀번호를 입력해주세요. : ");
		rec[count].pass = sc.nextInt();
		System.out.println("계좌를 입력해주세요. :");
		rec[count].account = sc.nextInt();
		rec[count].won = 0;							// 사용자가 가진금액을 0으로 초기화.
		System.out.println(rec[count].account +"로 계좌가 생성되었습니다. ");
		
		count ++;
		
	}
	
	private int passwordCheck(int account,int pass) {
		
		for(i=0;i<count;i++) {
			if(account == rec[i].account && pass == rec[i].pass) {
				System.out.println("계좌가 확인되었습니다. ");
				succ = 1;
			}else {
				System.out.println("계좌 혹은 비밀번호를 확인해주십시요.");
				succ = 0;

			}
		}
		return succ;
		
	}
	
	public void inputWon(){
		
		int account ,pass, money;				// 확인할 계정과 비밀번호, 넣을 돈
		
		while(true) {
			System.out.print("계좌번호를 입력해주세요. : ");
			account = sc.nextInt();
			System.out.print("비밀번호를 입력해주세요. : ");
			pass = sc.nextInt();
			passwordCheck(account, pass);
			
			if(succ == 1) {
				System.out.print("입금하실 금액을 적어주세요. : ");
				money = sc.nextInt();
				for(i=0;i<count;i++) {
					if(account == rec[i].account)
						rec[i].won += money;
				}
				break;
			}else if(succ == 0){
				System.out.println("계좌 혹은 비밀번호를 확인해주세요. ");
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
				break;
			}
		}
	}
	
	public void viewUser(int a) {
		
	}
	
	public void viewAccount() {								// 계좌 목록 보여주기
		for(i=0;i<count;count++) {
			System.out.printf("%s,%3d,%2d,%2d\n",rec[i].name, rec[i].account,rec[i].pass,rec[i].won );
		}
	}
	

}
