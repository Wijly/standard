package com.day11;

// �߻�Ŭ���� �ȿ��� �߻�޼ҵ尡 �Ѱ��� �����ؾ���

abstract class SortInt{						// �߻� Ŭ����.
	
	private int[] value;
	protected abstract void sorting();			// �߻� �޼ҵ�
	
	public void sort(int[] value) {
	
		this.value = value;
		
		sorting();							// �Ϸ��� ���� ���ǵǾ����� ���� �޼ҵ��̹Ƿ� �ڽ� Ŭ������ ���� ����
		
	}
	
	public int length() {			// �迭�� ������ ���� �޼ҵ�
		
		if(value == null) {
			return 0;
		}
		return value.length;
	}
	protected final int compare(int i, int j) {			//protected�� �ڽ��� �����ϴ�. override �Ұ�.	ũ��� �޼ҵ�
		
		if(value[i] == value[j]) {
			return 0;
		}else if(value[i] > value[j]) {
			return 1;
		}else
			return -1;
	}
	
	protected final void swap(int i, int j) {				// �ڸ��� �ٲٴ� �޼ҵ�
		int temp;
		temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	public void print() {
		if(value == null)
			return;
		
		for(int su : value) {
			System.out.printf("%4d", su);
		}
		System.out.println();
	}
}

class SortTest extends SortInt{						// �߻�Ŭ������ sortInt�� ��ӹ���

	@Override
	protected void sorting() {
		
		//selection sort
		for(int i =0; i<length()-1;i++) {
			for(int j=i+1; j<length();j++) {
				if(compare(i, j)> 0) {					//ũ�⸦ ���ϴ� �޼ҵ带 ȣ��		compare >0 �̸� ��ȯ�� 1
					swap(i,j);							//�޼ҵ带 ȣ���ؼ� �ڸ��ٲ�
				}
				
			}
		}
		
	}
	
	
	
}

public class Test7 {

	public static void main(String[] args) {
		
		SortTest ob = new SortTest();
		
		int[] value = {50,30,20,10,99};
		
		ob.sort(value);
		ob.print();
	}

}
