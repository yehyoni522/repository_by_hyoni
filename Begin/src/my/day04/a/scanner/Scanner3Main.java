package my.day04.a.scanner;

import java.util.*;

public class Scanner3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		try {
			
			String inputStr = sc.nextLine();
			//문자열 String을 int 타입으로 형변화 시켜주는 메소드
			Integer.parseInt(inputStr);
			
			System.out.println("입력한 정수 : " + inputStr);
			
			
		} catch (InputMismatchException e) {
			
			System.out.println(">>> 정수만 입력하세요. <<<");
			e.printStackTrace();
			
		}
		
		
		sc.close();

	}

}
