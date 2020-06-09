package com.day14;

import java.util.Scanner;

// Exception : 예외처리

public class Test6 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.print("두개의 수를 입력해주세요. : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("연산자를 입력해주세요. : ");
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
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		catch(NumberFormatException e) { 
		
		
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("넌 그게 정수로 보이냐");
			
		} finally {
			System.out.println("무적권 실행");
		}
		
	}

}
