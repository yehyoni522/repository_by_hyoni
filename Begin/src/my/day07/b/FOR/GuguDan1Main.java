package my.day07.b.FOR;

import java.util.Scanner;

public class GuguDan1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		  === 레이블을 사용하여 break 하기 ===
		  레이블명 뒤에는 : 을 붙이며 반드시 반복문 앞에 써야한다.
		 */
		outer:
		for(;;) {
			try {
				System.out.print(">> 몇 단 볼래? => ");
				String strDan = sc.nextLine();
				
				int dan = Integer.parseInt(strDan);
				
				if (2 <= dan && dan <= 9) {
					
					//해당하는 단 출력//
					
					System.out.println("=== " + dan + " 단 ===");
					for(int i = 0; i < 9; i++) {
						System.out.println(dan + "*" + (i+1) + "=" + dan*(i+1));
					}
					
					for(;;) {
					System.out.print(">> 또 하시겠습니까? [Y/N] =>");
					String yn = sc.nextLine();
					
					if("N".equalsIgnoreCase(yn)) {
						sc.close();
						break outer; //완전히 밖으로 빠져나가야함.
					} 
					else if("Y".equalsIgnoreCase(yn)) {
						break; //가장 가까운 반복문을 빠져나가는 것.
					} else System.out.println("Y 또는 N 만 가능합니다.");
						
					} //end of for
					
				} else {
					System.out.println(">>>2단부터 9단까지만 가능합니다.");
				}
			} catch(NumberFormatException e) {
				System.out.println(">>>2단부터 9단까지만 가능합니다.");
			}
			
		}
		
		System.out.println("=== 프로그램 종료 ===");
		

	}//end of main

}//end of class
