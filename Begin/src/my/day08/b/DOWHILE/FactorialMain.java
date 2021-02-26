package my.day08.b.DOWHILE;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
			System.out.print(" >> 알고 싶은 팩토리얼 수 입력 => ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num <= 0) {
				System.out.println(">> 자연수만 입력하세요!");
				continue;
			}
			
			int result = 1;
			for(int i = num; i > 0; i--) {
				result *= i;
			}
			
			System.out.println(num + "! = " + result);
			
			break;
			}catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력해주세요! <<");
			}
		}while(true);
		
		sc.close();
		
		System.out.println("\n~~~~~~프로그램 종료~~~~~~\n");

	}

}
