package com.day14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// ����� ���� ����


public class Test7 {
	
	public static String getOper() throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String oper = "";
		
		try {
			
			System.out.print("�����ڸ� �Է��ϼ��� : ");
			oper = br.readLine();
			
			if(!oper.equals("+")&&!oper.equals("-")&&!oper.equals("*")&&!oper.equals("/")) {
				throw new Exception();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�Է� ���� ");
		}
		return oper;
	}

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2,result;
		String oper;
		try {
			
			System.out.print("ù��° ���� �Է��ϼ��� : ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("�ι�° ���� �Է��ϼ��� : ");
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
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		catch(NumberFormatException e) { 
			System.out.println("�� �װ� ������ ���̳�");
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� ���� ");
			
		}

	}

}
