package my.day06.a.FOR;

import java.util.Scanner;

public class Sum2Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(;;) {
		
		try {
		
		System.out.print(">> 누적해야 할 시작 숫자 => ");
		int startNo = Integer.parseInt(sc.nextLine());
		
		
		System.out.print(">> 누적해야 할 시작 숫자 => ");
		int endNo = Integer.parseInt(sc.nextLine());
		
		
		 for(int i = startNo; i < endNo+1 ; i++)
		 { sum += i; }
		 
		
		
		int cnt = endNo - startNo + 1;
		
		String str = "";
		
		for(int i = startNo, j = 0; j < cnt; i++, j++) {
			if (i < cnt -1 ) str += i + "+";
			else str += i;
		}
		
		System.out.println(str + "=" + sum);
		break;
		
		} catch(NumberFormatException e) {
			System.out.println(">> 정수만 입력하세요! <<");
		}
		}
	
		
		sc.close();
		
		
		
		System.out.println("=== 프로그램 종료 ===");
		
		
		}

	

}
