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
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		while(true) {
			System.out.println("旨收收收收收收旬");
			System.out.println("早   嬴檜蛤   早");
			System.out.println("曲收收收收收收旭");
			System.out.print("殮溘 : ");
			String id = sc.next();
			boolean result = dao.checkid(id);
			try {
				me.idCheck(id);
				if(!result) {
					System.out.println("餌辨 陛棟и 嬴檜蛤殮棲棻");
					vo.setId(id);
					break;
				} else {
					System.out.println("醞犒脹 嬴檜蛤陛 襄營м棲棻");
				}
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
		}
		
		while(true) {
			try {
				System.out.println("旨收收收收收收收收旬");
				System.out.println("早    綠塵廓��    早");
				System.out.println("曲收收收收收收收收旭");
				System.out.print("殮溘 : ");
				String pwd = sc.next();
				me.pwCheck(pwd);
				vo.setPwd(pwd);
				System.out.println("餌辨 陛棟и 綠塵廓��殮棲棻");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("旨收收收收收收收收旬");
		System.out.println("早    檜    葷    早");
		System.out.println("曲收收收收收收收收旭");
		System.out.print("殮溘 : ");
		vo.setName(sc.next());
		while(true) {
			try {
				System.out.println("旨收收收收收收收收旬");
				System.out.println("早    瞪�食醽�    早");
				System.out.println("曲收收收收收收收收旭");
				System.out.print("殮溘 : ");
				String tel = sc.next();
				me.telChcek(tel);
				vo.setTel(tel);
				System.out.println("螢夥艇 瞪�食醽� ⑽衝殮棲棻");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		while(true) {
			try {
				System.out.println("旨收收收收收收收旬");
				System.out.println("早    檜詭橾    早");
				System.out.println("曲收收收收收收收旭");
				System.out.print("殮溘 : ");
				String email = sc.next();
				me.emailChcek(email);
				vo.setEmail(email);
				System.out.println("螢夥艇 檜詭橾 ⑽衝殮棲棻");
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("旨收收收收收收收收旬");
		System.out.println("早    儅喇錯橾    早");
		System.out.println("曲收收收收收收收收旭");
		System.out.print("殮溘 : ");
		Date d = Date.valueOf(sc.next());
		vo.setBirth(d);		
		int result = dao.register(vo);
		if(result == 0) {
			System.out.println("縑楝 : �蛾� 陛殮縑 褒ぬж樟蝗棲棻. 薑爾蒂 棻衛 殮溘п輿褊衛螃");
		} else {
			System.out.println("蹴жм棲棻!! �蛾灠㊣埥� 撩奢ж樟蝗棲棻");
		}
	}
	
	public String login() {
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		System.out.println("旨收收收收收收收旬");
		System.out.println("早    嬴檜蛤    早");
		System.out.println("曲收收收收收收收旭");
		System.out.print("殮溘 : ");
		String id = sc.next();
		System.out.println("旨收收收收收收收收旬");
		System.out.println("早    綠塵廓��    早");
		System.out.println("曲收收收收收收收收旭");
		System.out.print("殮溘 : ");
		String pwd = sc.next();
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		boolean check = dao.checklogin(id, pwd);
		if(!check) {
			return "fail";
		}
		return id;
	}
	
	public void update() {
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		System.out.println("旨收收收收收收收旬");
		System.out.println("早    嬴檜蛤    早");
		System.out.println("曲收收收收收收收旭");
		System.out.print("殮溘 : ");
		String id = sc.next();
		System.out.println("旨收收收收收收收收旬");
		System.out.println("早    綠塵廓��    早");
		System.out.println("曲收收收收收收收收旭");
		System.out.print("殮溘 : ");
		String pwd = sc.next();
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
			System.out.println("煎斜檣縑 撩奢ж樟蝗棲棻");
			System.out.println("�蛾� 薑爾蒂 熱薑м棲棻");
			MemberVO vo = new MemberVO();
			while(true) {
				System.out.println("旨收收收收收收旬");
				System.out.println("早   嬴檜蛤   早");
				System.out.println("曲收收收收收收旭");
				System.out.print("殮溘 : ");
				String _id = sc.next();
				boolean result = dao.checkid(_id);
				try {
					me.idCheck(_id);
					if(!result) {
						System.out.println("餌辨 陛棟и 嬴檜蛤殮棲棻");
						vo.setId(_id);
						break;
					} else {
						System.out.println("醞犒脹 嬴檜蛤陛 襄營м棲棻");
					}
					
				} catch (Exception e) {
					System.out.println(e.toString());
				}
				
			}
			while(true) {
				try {
					System.out.println("旨收收收收收收收收旬");
					System.out.println("早    綠塵廓��    早");
					System.out.println("曲收收收收收收收收旭");
					System.out.print("殮溘 : ");
					String _pwd = sc.next();
					me.pwCheck(_pwd);
					vo.setPwd(_pwd);
					System.out.println("餌辨 陛棟и 綠塵廓��殮棲棻");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			System.out.println("旨收收收收收收收收旬");
			System.out.println("早    檜    葷    早");
			System.out.println("曲收收收收收收收收旭");
			System.out.print("殮溘 : ");
			vo.setName(sc.next());
			
			while(true) {
				try {
					System.out.println("旨收收收收收收收收旬");
					System.out.println("早    瞪�食醽�    早");
					System.out.println("曲收收收收收收收收旭");
					System.out.print("殮溘 : ");
					String tel = sc.next();
					me.telChcek(tel);
					vo.setTel(tel);
					System.out.println("螢夥艇 瞪�食醽� ⑽衝殮棲棻");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			while(true) {
				try {
					System.out.println("旨收收收收收收收旬");
					System.out.println("早    檜詭橾    早");
					System.out.println("曲收收收收收收收旭");
					System.out.print("殮溘 : ");
					String email = sc.next();
					me.emailChcek(email);
					vo.setEmail(email);
					System.out.println("螢夥艇 檜詭橾 ⑽衝殮棲棻");
					break;
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			
			dao.update(vo, id);
			
			System.out.println("撩奢瞳戲煎 �蛾� 薑爾蒂 熱薑ж艘蝗棲棻");
		} else {
			System.out.println("縑楝 : 煎斜檣 薑爾陛 螢夥腦雖 彊蝗棲棻");
		}
	}
	
	public void delete() {
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		System.out.println("旨收收收收收收收旬");
		System.out.println("早    嬴檜蛤    早");
		System.out.println("曲收收收收收收收旭");
		System.out.print("殮溘 : ");
		String id = sc.next();
		
		System.out.println("旨收收收收收收收收旬");
		System.out.println("早    綠塵廓��    早");
		System.out.println("曲收收收收收收收收旭");
		System.out.print("殮溘 : ");
		String pwd = sc.next();
		System.out.println("收式式收收收收收收收收收收收式收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收收");
		
		boolean check = dao.checklogin(id, pwd);
		if(check) {
			dao.delete(id);
			System.out.println("撩奢瞳戲煎 �蛾� 驍黴 腎歷蝗棲棻");
		} else {
			System.out.println("縑楝 : 螢夥艇 �蛾� 薑爾蒂 殮溘ж褊衛螃");
		}
		
	}
}
