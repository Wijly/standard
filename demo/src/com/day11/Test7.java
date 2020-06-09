package com.day11;

// 추상클래스 안에는 추상메소드가 한개는 존재해야함

abstract class SortInt{						// 추상 클래스.
	
	private int[] value;
	protected abstract void sorting();			// 추상 메소드
	
	public void sort(int[] value) {
	
		this.value = value;
		
		sorting();							// 하려고 보니 정의되어지지 않은 메소드이므로 자식 클래스로 가서 실행
		
	}
	
	public int length() {			// 배열의 갯수를 세는 메소드
		
		if(value == null) {
			return 0;
		}
		return value.length;
	}
	protected final int compare(int i, int j) {			//protected라 자식은 가능하다. override 불가.	크기비교 메소드
		
		if(value[i] == value[j]) {
			return 0;
		}else if(value[i] > value[j]) {
			return 1;
		}else
			return -1;
	}
	
	protected final void swap(int i, int j) {				// 자리를 바꾸는 메소드
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

class SortTest extends SortInt{						// 추상클래스인 sortInt를 상속받음

	@Override
	protected void sorting() {
		
		//selection sort
		for(int i =0; i<length()-1;i++) {
			for(int j=i+1; j<length();j++) {
				if(compare(i, j)> 0) {					//크기를 비교하는 메소드를 호출		compare >0 이면 반환값 1
					swap(i,j);							//메소드를 호출해서 자리바꿈
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
