package com.day11;

// Singleton		
// �޸𸮿� ��ü�� �����ص� static�̱⿡ �ϳ��� �����ǰ�
// getInstance�� ��ü�� �ҷ��͵� ���� ���� �ҷ���

class Sing{

	private static Sing ob;				// �ʱ갪 null
	
	public static Sing getInstance() {
	
		if(ob == null) {
			ob = new Sing();
		}
		
		return ob;
	
	}

}

public class Test4 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1 == ob2) {
			System.out.println("������ ��ü");
		}else
			System.out.println("�ٸ� ��ü");

	}

}
