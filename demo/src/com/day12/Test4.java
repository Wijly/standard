package com.day12;

interface Test{
	
	public int total();
	public void write();

}

class TestImpl implements Test{
	
	private String grade,name;
	private int kor,eng;

	public TestImpl() {			// 	�⺻������
	}
	
	public TestImpl(String grade, String name, int kor, int eng) {			// ������ �����ε�
		this.grade = grade;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	
	}
	public void set(String grade, String name, int kor, int eng) {			// �޼ҵ�� �ʱ�ȭ			
		this.grade = grade;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public int total() {
		return kor+eng;
	}

	@Override
	public void write() {
		System.out.println(grade + " : " + name + " : " + total()); 	//	�޼ҵ忡�� �޼ҵ�ȣ��
	}
	
	public boolean equals(Object ob) {					// Object �ڷ������� �ؼ� ob2�� ��ĳ����. ob1.equals(ob2) 
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) {										// intanceof���� �������ִ� ������ Ÿ���� ã��
			
			TestImpl t = (TestImpl)ob;					// ob�� �ٿ�ĳ��Ʈ�ؼ� t �� ����
			
			if(t.grade.equals(grade) && name.equals(t.name)) {
				flag = true;
			}
		}
		return flag;	
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		TestImpl ob1 = new TestImpl("201437069","������",90,64);
		TestImpl ob2 = new TestImpl("201437069","������",50,50);
		
		if(ob1.equals(ob2)){				// Object �޼ҵ� .equals		//�⺻ Object�� equals�δ� ob2�� �ּҿ� ob1�� �ּҰ� �ٸ��Ƿ� false
			System.out.println("ob1�� ob2�� ���� �ι� ");
		}else																// ���� ���� equals�δ� ������Ʈ���� ��Ʈ���� equals�� ����ؼ� �й��� �̸��� ���ϹǷ� true;
			System.out.println("ob1�� ob2�� �ٸ� �ι� ");
		
		ob1.write();
		ob2.write();
	}

}
