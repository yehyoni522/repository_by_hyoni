package my.day05.c.If;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 정수 입력 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.print("두번째 정수 입력 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			System.out.print("사칙연산자 선택 (+ - * /) => ");
			String operator = sc.nextLine();
			
			String result;
			
			if("+".equals(operator)) result = String.valueOf(num1 + num2);
			else if("-".equals(operator)) result = String.valueOf(num1 - num2);
			else if("*".equals(operator)) result = String.valueOf(num1 * num2);
			else if("/".equals(operator)) {
				result = String.valueOf((double)num1 / num2);
			}
			else {
				System.out.println(">> 사칙연산만 선택하세요.");
				sc.close();
				return;
			}
			
			if("/".equals(operator) && num2 == 0) {
				System.out.println("0보다 큰 정수를 입력하세요.");
			}else System.out.println(num1 + " " + operator + " "+ num2 + " = " + result );
			
			
		} catch(NumberFormatException e){
			System.out.println("정수만 입력하세요.");
		}
		sc.close();

	}

}
