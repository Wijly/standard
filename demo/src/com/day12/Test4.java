package com.day12;

interface Test{
	
	public int total();
	public void write();

}

class TestImpl implements Test{
	
	private String grade,name;
	private int kor,eng;

	public TestImpl() {			// 	기본생성자
	}
	
	public TestImpl(String grade, String name, int kor, int eng) {			// 생성자 오버로딩
		this.grade = grade;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	
	}
	public void set(String grade, String name, int kor, int eng) {			// 메소드로 초기화			
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
		System.out.println(grade + " : " + name + " : " + total()); 	//	메소드에서 메소드호출
	}
	
	public boolean equals(Object ob) {					// Object 자료형으로 해서 ob2를 업캐스팅. ob1.equals(ob2) 
		
		boolean flag = false;
		
		if(ob instanceof TestImpl) {										// intanceof원래 가지고있던 데이터 타입을 찾음
			
			TestImpl t = (TestImpl)ob;					// ob를 다운캐스트해서 t 로 저장
			
			if(t.grade.equals(grade) && name.equals(t.name)) {
				flag = true;
			}
		}
		return flag;	
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		TestImpl ob1 = new TestImpl("201437069","위준형",90,64);
		TestImpl ob2 = new TestImpl("201437069","위준형",50,50);
		
		if(ob1.equals(ob2)){				// Object 메소드 .equals		//기본 Object의 equals로는 ob2의 주소와 ob1의 주소가 다르므로 false
			System.out.println("ob1과 ob2는 동일 인물 ");
		}else																// 새로 만든 equals로는 오브젝트안의 스트링의 equals를 사용해서 학번과 이름을 비교하므로 true;
			System.out.println("ob1과 ob2는 다른 인물 ");
		
		ob1.write();
		ob2.write();
	}

}
