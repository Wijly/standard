package com.day14;

import java.util.Scanner;

// Exception : ����ó��

public class Test6 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.print("�ΰ��� ���� �Է����ּ���. : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("�����ڸ� �Է����ּ���. : ");
			oper = sc.next();
			
			result = 0;
			
			if(oper.equals("+") || oper =="+") {
				result = num1 + num2;
			}else if(oper.equals("-") || oper =="-") {
				result = num1 - num2;
			}else if(oper.equals("*") || oper =="*") {
				result = num1 * num2;
			}else if(oper.equals("/") || oper =="/") {
				result = num1 / num2;
			}
			
			System.out.printf("%d %s %d = %d\n",num1,oper,num2,result);
		
		}catch(ArithmeticException e) { 
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		catch(NumberFormatException e) { 
		
		
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("�� �װ� ������ ���̳�");
			
		} finally {
			System.out.println("������ ����");
		}
		
	}

}
