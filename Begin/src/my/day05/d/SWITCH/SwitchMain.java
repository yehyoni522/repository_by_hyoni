package my.day05.d.SWITCH;

import java.util.Scanner;

public class SwitchMain {

	@SuppressWarnings("resource")
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
			
			switch (operator){
			
			case "+" :
				result = String.valueOf(num1 + num2);
				break;
				
			case "-" :
				result = String.valueOf(num1 - num2);
				break;
			
			case "*" :
				result = String.valueOf(num1 * num2);
				break;
			
			case "/" :
				if(num2 == 0) result = "분모에는 0이 올 수 없습니다.";
				else result = String.valueOf(num1 / num2);
				break;
				
			default:
				System.out.println("정수만 입력하세요.");
				return;
			
			}
			
			System.out.println(num1 + " " + operator + " "+ num2 + " = " + result );
			
		} catch(NumberFormatException e){
			System.out.println("정수만 입력하세요.");
		}
		sc.close();
		

	}

}
