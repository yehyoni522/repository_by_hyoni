package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class BingoMain3 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(100 - 1 + 1) + 1;		
		
		int cnt = 0;
		
		do {
			System.out.print("1부터 100 사이의 숫자 입력 : ");
			int inputNum = Integer.parseInt(sc.nextLine());
			cnt++;
			
			if(rndNum > inputNum) {
				System.out.println(inputNum + "보다 큰 수 입니다.");
			}
			else if (rndNum < inputNum) {
				System.out.println(inputNum + "보다 작은 수 입니다.");
			}
			else {
				System.out.println("빙고!" + cnt + "번 만에 맞추셨습니다.");
				sc.close();
				break;
			} 
		} while(true);

	}

}
