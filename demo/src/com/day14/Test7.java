package com.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 사용자 정의 에러


public class Test7 {
	
	public static String getOper() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";
		
		try {
			
			System.out.print("연산자를 입력하세요 : ");
			oper = br.readLine();
			
			if(!oper.equals("+")&&!oper.equals("-")&&!oper.equals("*")&&!oper.equals("/")) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력 에러 ");
		}
		return oper;
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2,result;
		String oper;
		try {
			
			System.out.print("첫번째 수를 입력하세요 : ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("두번째 수를 입력하세요 : ");
			num2 = Integer.parseInt(br.readLine());
			
			oper = Test7.getOper();
			
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
			System.out.println("넌 그게 정수로 보이냐");
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("나도 몰라 ");
			
		}

	}

}
