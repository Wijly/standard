package com.day12;

//Interface
// �߻�Ŭ������ �������� �����ְ� ���ǰ� ����.
// final ������ ������ �� �ִ�.
// �������̽��� �����ϱ����ؼ��� implements�� ����Ѵ�
// �ϳ��� �������̽��� �����ϸ� �������̽��� ��� �޼ҵ带 ������ �ؾ��Ѵ�.
// �������̽��� �������̽��� ��ӹ��� �� ������ �̶��� extends�� ����Ѵ�.
// ���� Ŭ�����ʹ� �ٸ��� ���߻���� �����ϴ�.

// �������̽� =  �����

interface Fruit{

	String Won = "��";		// ������ public, static, final�� �����Ǿ�����
	
	int getPrice();			// public abstract �����Ǿ�����
	public String getName();	// �޼ҵ�� ���� abstract�� ����
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {				//1000�� ��ȯ
		return 1000;
	}

	@Override
	public String getName() {				// ����� ��ȯ
		return "���";
	}
	
	public String getItems() {
		
		
		return "����";
	}
	

}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.print(ob1.getItems()+" ");
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;			// ������ UP CAST
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItem());
		
	}

}
