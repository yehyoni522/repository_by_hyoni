package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class GawibawiboMain4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int userNum = 0;
		
		do {
			System.out.println("========= 메뉴 =========");
			System.out.println("1. 가위\t2.바위\t3.보\t4.게임종료");
			System.out.println("======================");
			System.out.print(">> 선택하세요 =>");
			
			try {
				
				userNum = Integer.parseInt(sc.nextLine());
				
				if( ! (1 <= userNum && userNum <= 4)) {
					System.out.println(">>메뉴에 존재하지 않는 번호입니다. \n");
					continue;
				}
				if( userNum != 4) {
					//사용자가 1,2,3 중 하나를 낸 경우
					
					Random rnd = new Random();
					int pcNum = rnd.nextInt(3 - 1 + 1) + 1;
					String msg = "";
					
					//사용자가 이긴 경우
					
					if( (pcNum == 1 && userNum == 2)  ||
					    (pcNum == 2 && userNum == 3)  ||
					    (pcNum == 3 && userNum == 1)) {
						
						msg = ">> 사용자님이 이겼습니다!!\n";
					}
					
					//pc가 이긴 경우
					else if( (pcNum == 1 && userNum == 3)  ||
					         (pcNum == 2 && userNum == 1)  ||
						     (pcNum == 3 && userNum == 2)) {
							
							msg = ">> 사용자님이 졌습니다!!\n";
						}
					//사용자와 pc가 비긴 경우
					
					else {
							msg = ">> 사용자님이 비겼습니다!!\n";
						}
					
					System.out.println(msg);
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">>숫자로만 입력하세요! \n");
			}
		}while(!(userNum == 4));
		
		sc.close();
		System.out.println("\n~~~~프로그램 종료 ~~~~~~");

	}

}
