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
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		while(true) {
			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­   ¾ÆÀÌµð   ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			String id = sc.next();
			boolean result = dao.checkid(id);
			try {
				me.idCheck(id);
				if(!result) {
					System.out.println("»ç¿ë °¡´ÉÇÑ ¾ÆÀÌµðÀÔ´Ï´Ù");
					vo.setId(id);
					break;
				} else {
					System.out.println("Áßº¹µÈ ¾ÆÀÌµð°¡ Á¸ÀçÇÕ´Ï´Ù");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		while(true) {
			try {
				System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
				System.out.println("¦­    ºñ¹Ð¹øÈ£    ¦­");
				System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
				System.out.print("ÀÔ·Â : ");
				String pwd = sc.next();
				me.pwCheck(pwd);
				vo.setPwd(pwd);
				System.out.println("»ç¿ë °¡´ÉÇÑ ºñ¹Ð¹øÈ£ÀÔ´Ï´Ù");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ÀÌ    ¸§    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		vo.setName(sc.next());
		while(true) {
			try {
				System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
				System.out.println("¦­    ÀüÈ­¹øÈ£    ¦­");
				System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
				System.out.print("ÀÔ·Â : ");
				String tel = sc.next();
				me.telChcek(tel);
				vo.setTel(tel);
				System.out.println("¿Ã¹Ù¸¥ ÀüÈ­¹øÈ£ Çü½ÄÀÔ´Ï´Ù");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
				System.out.println("¦­    ÀÌ¸ÞÀÏ    ¦­");
				System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
				System.out.print("ÀÔ·Â : ");
				String email = sc.next();
				me.emailChcek(email);
				vo.setEmail(email);
				System.out.println("¿Ã¹Ù¸¥ ÀÌ¸ÞÀÏ Çü½ÄÀÔ´Ï´Ù");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    »ý³â¿ùÀÏ    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		Date d = Date.valueOf(sc.next());
		vo.setBirth(d);		
		int result = dao.register(vo);
		if(result == 0) {
			System.out.println("¿¡·¯ : È¸¿ø °¡ÀÔ¿¡ ½ÇÆÐÇÏ¼Ì½À´Ï´Ù. Á¤º¸¸¦ ´Ù½Ã ÀÔ·ÂÇØÁÖ½Ê½Ã¿À");
		} else {
			System.out.println("ÃàÇÏÇÕ´Ï´Ù!! È¸¿ø°¡ÀÔ¿¡ ¼º°øÇÏ¼Ì½À´Ï´Ù");
		}
	}
	
	public String login() {
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ¾ÆÀÌµð    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String id = sc.next();
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ºñ¹Ð¹øÈ£    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String pwd = sc.next();
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		boolean check = dao.checklogin(id, pwd);
		if(!check) {
			return "fail";
		}
		return id;
	}
	
	public void update() {
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ¾ÆÀÌµð    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String id = sc.next();
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ºñ¹Ð¹øÈ£    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String pwd = sc.next();
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
			System.out.println("·Î±×ÀÎ¿¡ ¼º°øÇÏ¼Ì½À´Ï´Ù");
			System.out.println("È¸¿ø Á¤º¸¸¦ ¼öÁ¤ÇÕ´Ï´Ù");
			MemberVO vo = new MemberVO();
			while(true) {
				System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
				System.out.println("¦­   ¾ÆÀÌµð   ¦­");
				System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦°");
				System.out.print("ÀÔ·Â : ");
				String _id = sc.next();
				boolean result = dao.checkid(_id);
				try {
					me.idCheck(_id);
					if(!result) {
						System.out.println("»ç¿ë °¡´ÉÇÑ ¾ÆÀÌµðÀÔ´Ï´Ù");
						vo.setId(_id);
						break;
					} else {
						System.out.println("Áßº¹µÈ ¾ÆÀÌµð°¡ Á¸ÀçÇÕ´Ï´Ù");
					}
					
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				
			}
			while(true) {
				try {
					System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
					System.out.println("¦­    ºñ¹Ð¹øÈ£    ¦­");
					System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
					System.out.print("ÀÔ·Â : ");
					String _pwd = sc.next();
					me.pwCheck(_pwd);
					vo.setPwd(_pwd);
					System.out.println("»ç¿ë °¡´ÉÇÑ ºñ¹Ð¹øÈ£ÀÔ´Ï´Ù");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
			System.out.println("¦­    ÀÌ    ¸§    ¦­");
			System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
			System.out.print("ÀÔ·Â : ");
			vo.setName(sc.next());
			
			while(true) {
				try {
					System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
					System.out.println("¦­    ÀüÈ­¹øÈ£    ¦­");
					System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
					System.out.print("ÀÔ·Â : ");
					String tel = sc.next();
					me.telChcek(tel);
					vo.setTel(tel);
					System.out.println("¿Ã¹Ù¸¥ ÀüÈ­¹øÈ£ Çü½ÄÀÔ´Ï´Ù");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			while(true) {
				try {
					System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
					System.out.println("¦­    ÀÌ¸ÞÀÏ    ¦­");
					System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
					System.out.print("ÀÔ·Â : ");
					String email = sc.next();
					me.emailChcek(email);
					vo.setEmail(email);
					System.out.println("¿Ã¹Ù¸¥ ÀÌ¸ÞÀÏ Çü½ÄÀÔ´Ï´Ù");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			
			dao.update(vo, id);
			
			System.out.println("¼º°øÀûÀ¸·Î È¸¿ø Á¤º¸¸¦ ¼öÁ¤ÇÏ¿´½À´Ï´Ù");
		} else {
			System.out.println("¿¡·¯ : ·Î±×ÀÎ Á¤º¸°¡ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù");
		}
	}
	
	public void delete() {
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ¾ÆÀÌµð    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String id = sc.next();
		
		System.out.println("¦®¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¯");
		System.out.println("¦­    ºñ¹Ð¹øÈ£    ¦­");
		System.out.println("¦±¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦°");
		System.out.print("ÀÔ·Â : ");
		String pwd = sc.next();
		System.out.println("¦¬¦¡¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¡¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬¦¬");
		
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			dao.delete(id);
			System.out.println("¼º°øÀûÀ¸·Î È¸¿ø Å»Åð µÇ¾ú½À´Ï´Ù");
		} else {
			System.out.println("¿¡·¯ : ¿Ã¹Ù¸¥ È¸¿ø Á¤º¸¸¦ ÀÔ·ÂÇÏ½Ê½Ã¿À");
		}
		
	}
}
