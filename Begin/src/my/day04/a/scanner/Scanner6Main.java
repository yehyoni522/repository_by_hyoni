package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner6Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" == 2개의 숫자를 입력받아서 더한 결과 ==");
		
		
		String inputStr = "";
		
		try {
			
			System.out.print("1. 첫번째 정수 : ");
			inputStr = sc.nextLine();
			int num1 = Integer.parseInt(inputStr);
			
			System.out.print("2. 두번째 정수 : ");
			inputStr = sc.nextLine();
			int num2 = Integer.parseInt(inputStr);
			
			Calculator calc = new Calculator();
			String result = calc.plus(num1, num2);
		
			System.out.println(result);
			
			result = calc.minus(num1, num2);
			System.out.println(result);
			
			result = calc.muliply(num1, num2);
			System.out.println(result);
			
			result = calc.devide(num1, num2);
			System.out.println(result);
			
		} catch (NumberFormatException e) {
			
			System.out.println(inputStr + " 는(은) 정수가 아니므로 정수로 입력하세요. <<<");
			
		}	
		sc. close();
		

	}

}
