package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner5Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" == 정수를 문자열로 형변환 시키기 ==");
		
		System.out.print("1. 첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("2. 두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		
		//정수를 문자열로 바꾸는 방법1
		String str1 = Integer.toString(num1);
		
		//정수를 문자열로 바꾸는 방법2
		String str2 = String.valueOf(num2);
		
		System.out.println(str1 + str2);
		
		
		sc. close();
		

	}

}
