package com.naver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class IdExcept {

	public void inputFormat(String str) throws Exception {

		boolean num = false;
		boolean eng = false;
		
		int len = str.length();

		if (len < 8 || len > 15) {
			throw new Exception("문자열의 길이는 8~15자만 가능합니다 ");
		}
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if ((ch > 48 && ch < 57)) {
				num = true;
			}
			if((ch > 65 && ch < 90) || (ch > 97 && ch < 122)) {
				eng = true;
			}
		}
		if(num == false || eng == false) {
			throw new Exception("영문자 또는 숫자 혼용만 가능합니다.");
		}
	}
}

public class NaverImpl implements Naver {

	private List<NaverVO> lists = new ArrayList<NaverVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void input() {

		NaverVO vo = new NaverVO();
		IdExcept auth = new IdExcept();

		try {

			System.out.print("아이디 : ");
			vo.setId(sc.next());
			if (successId(vo.getId())) {
				System.out.println("아이디가 존재합니다.");
				return;
			}
			auth.inputFormat(vo.getId());
		} catch (Exception e) {
			System.out.println(e.toString());
			return;
		}
		System.out.print("비밀번호 : ");
		vo.setPw1(sc.next());
		System.out.print("비밀번호 확인 : ");
		vo.setPw2(sc.next());
		if(!(vo.getPw1().equals(vo.getPw2()))) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		System.out.print("이름 : ");
		vo.setName(sc.next());
		System.out.print("성별 (남,여) : ");
		vo.setGender(sc.next());
		System.out.print("생년월일(예.19960222) : ");
		vo.setBirth(sc.next());
		System.out.print("확인 이메일 주소 (예. abc@naver.com ) : ");
		vo.setEmail(sc.next());
		System.out.print("전화번호 : ");
		vo.setTel(sc.next());

		lists.add(vo);
		System.out.println("생성되었습니다.");

		return;
	}

	@Override
	public boolean successId(String id) { // 1. 같은 아이디값이 존재하는지

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (id.equals(vo.getId())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean succesccLogin(String id, String pw) { // 아이디와 비밀번호 확인 메소드

		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if ((id.equals(vo.getId())) && (pw.equals(vo.getPw1()))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void print() { // 전체출력 메소드
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			System.out.println(vo.toString());
		}
	}

	@Override
	public void searchID() { // 아이디 검색 메소드

		System.out.print("찾으시는 아이디를 입력해주세요. : ");
		String searchID = sc.next();
		if (!successId(searchID)) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		}
		System.out.print("비밀번호를 입력해주세요. : ");
		String searchPw = sc.next();
		if (!succesccLogin(searchID, searchPw)) {
			System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
			return;
		}
		Iterator<NaverVO> it = lists.iterator();
		while (it.hasNext()) {
			NaverVO vo = it.next();
			if (searchID.equals(vo.getId())) {
				System.out.println(vo.toString());
			}
		}

	}

	@Override
	public void delectID() {

		String del;
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("삭제하고자 하는 아이디를 입력해주세요. : ");
		String searchID = sc.next();
		if (!successId(searchID)) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		}
		System.out.print("비밀번호를 입력해주세요. : ");
		String searchPw = sc.next();

		if (!succesccLogin(searchID, searchPw)) {
			System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
			return;
		}

		System.out.print("삭제하시겠습니까? (Y/N) : ");
		del = sc.next();
		
		if (del.equals("y") || del.equals("Y")) {
		
			while (it.hasNext()) {
				NaverVO vo = it.next();
				if (searchID.equals(vo.getId())) {
					lists.remove(vo);
					System.out.println("삭제되었습니다.");
					return;
				}
			}
		} else
			return;
	}

	@Override
	public void updateId() {
		
		Iterator<NaverVO> it = lists.iterator();

		System.out.print("변경하고자 하는 아이디를 입력해주세요. : ");
		String updateID = sc.next();
		if (!successId(updateID)) {
			System.out.println("아이디가 존재하지 않습니다.");
			return;
		}
		System.out.print("비밀번호를 입력해주세요. : ");
		String updatePw = sc.next();

		if (!succesccLogin(updateID, updatePw)) {
			System.out.println("아이디 혹은 비밀번호를 확인해주세요.");
			return;
		}
		while(it.hasNext()) {
			NaverVO vo = it.next();
			if(updateID.equals(vo.getId())){
				System.out.print("변경할 비밀번호를 입력해주세요.: ");
				vo.setPw1(sc.next());
				System.out.print("한번 더 입력해주세요. : ");
				vo.setPw2(sc.next());
				if(!(vo.getPw1().equals(vo.getPw2()))) {
					System.out.println("비밀번호가 다릅니다.");
					return;
				}
			}
		}
	}

}
