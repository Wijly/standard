package com.day12;

// 4. ���� Ŭ����(Annonymous, �͸��� Ŭ����, ���� Ŭ����)

public class Test9 {
	
	public Object getTitle() {				// ��ĳ��Ʈ
		
//		return "�͸��� Ŭ����";
		return new Object() {						// return ���� Ŭ����

			@Override
			public String toString() {
				return "�͸��� Ŭ����";
			}
			
			
		};
	
	}

	public static void main(String[] args) {
		
		Test9 ob = new Test9();
		
		System.out.println(ob.getTitle());

	}

}
