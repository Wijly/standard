package com.day11;

import java.util.Scanner;

/*
1. �ڹٸ� �������ϰ� �����ϴ� ���
: ���ι� �ȿ� �Լ�,������ �Է��ϰ� ctrl + F11 �Ǵ� ���� ����

2. �ڷ���
day5.Test1
: boolean(true, false)
: byte < short <  int < long		������
: float < double					�Ǽ���
: char (2byte)
��������� : +,-,*,/,%,++,--
���� ������ : >, <, <=, >=
� ������ : ==, !=
�� ������ : &&, ||, !
��Ʈ ������ :  &, |, ^, ~, >>, <<, >>>
���� ������ : =, +=, -=, *=, /=

3. ���� �������� ���� �� ������ ���� �����
day3.Test2
���� ? (���϶��� ����) : (�����϶��� ����)
int a=5;
String str;

str = a>0 ? "a�� ���":(a<0 ?"a�� ����":"a=0")
// a�� 0���� ũ�� "a�� ���", 
// a�� 0���� ������, a<0�� �������ΰɰ�
// 0���� ������ ����, 0�� ������ "a=0" ���

4. ����� ���� �� ������ �����ϰ� ����� ������ ���� �ϳ��� �����
���ǹ� : if��, switch��
�ݺ��� : for��, while��, do-while��

5. �迭�� ���� �� �迭�� ����, �ʱⰪ�� �ο��ϴ� ���
day6.Test1

6. ������, ����Ʈ ������ ����
day9.Test2

7. �޼ҵ� �����ε�
day9.Test3
*/
public class Quest3 {
	
	//6
	public Quest3() {			// �⺻������
	}
	public void print() {
		System.out.println("�⺻������ �Դϴ�.");
	} 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("�� ���� �Է��ϼ���. : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//4.
		if(a>b) {
			System.out.println("a�� b���� ũ��.");
			for(int i = b; i<a; i++) {
				System.out.print(b+" ");
				b++;
			}
		}else if(a<b){
			System.out.println("a�� b���� �۴�.");
			for(int i = a; i<b; i++) {
				System.out.print(a+" ");
				a++;
			}
		}else
			System.out.println("a�� b�� ����");
		
		
		//5
		int score;
		int[] num;
		System.out.print("�迭�����Է� : ");
		int c = sc.nextInt();
		num = new int[c];		//�޸� �Ҵ�, ��ü����
		for(int i = 0; i<num.length; i++) {		// �迭 �ʱ�ȭ
//			num[i]=0;
			System.out.print(i+"��° �� �Է� : ");
			score = sc.nextInt();
			num[i]=score;
		}
		
		Quest3 ob = new Quest3();
		ob.print();

	}

}
