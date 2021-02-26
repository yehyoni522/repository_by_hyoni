package my.day08.c.random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain2 {

	public static void main(String[] args) {
		
		//보안상 Math.random() 보다는 new Random(); 을 사용하는 것이 더 안전하다.
		
		Random rnd = new Random();
		//int rndNum = rnd.nextInt(마지막수 - 처음수 + 1) + 처음수;
		
		//random => 0.3227150635471796
		//random => 0.45977544860996167
		//random => 0.607272082849592

		/*
		 java.lang.Math.random() 메소드는 
		 0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다.
		  즉, 0.0 <= 임의의 난수(실수) < 1.0
		  
		  1부터 10까지 중 랜덤한 정수를 얻어와 본다.
		  
		  랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
         
         0.0        (int)(0.0*(10-1+1))+1         ==>  1
         0.23346438 (int)(0.23346438*(10-1+1))+1  ==>  3
         0.67835431 (int)(0.67835431*(10-1+1))+1  ==>  7
         0.99999999 (int)(0.99999999*(10-1+1))+1  ==> 10
         
         3 부터 7까지중 랜덤한 정수를 얻어와 본다.
         
         0.0        (int)(0.0*(7-3+1))+3         ==>  3
         0.23346438 (int)(0.23346438*(7-3+1))+3  ==>  4
         0.67835431 (int)(0.67835431*(7-3+1))+3  ==>  6
         0.99999999 (int)(0.99999999*(7-3+1))+3  ==>  7
         
		 */
		
		int rand1 = rnd.nextInt(10 - 1 + 1) + 1;		
		System.out.println("1부터 10까지 중 랜덤하게 발생한 값 : " + rand1);
		
		int rand2 = rnd.nextInt(7 - 3 + 1) + 3;	
		System.out.println("3부터 7까지 중 랜덤하게 발생한 값 : " + rand2);
		
		int rand3 = rnd.nextInt('z' - 'a' + 1) + 'a';	
		System.out.println("a부터 z까지 중 랜덤하게 발생한 소문자 : " + (char)rand3);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//인증키는 랜덤한 숫자 3개와 랜덤한 소문자4개로 만든다.
		
		String key = "";
		
		for(int i = 0; i < 7; i++) {
			if(i <= 2) key += rnd.nextInt(9 - 0 + 1) + 0;
			else {
				int j = rnd.nextInt('z' - 'a' + 1) + 'a';
				key += (char)j;
			}
		}
		
		
		System.out.println("인증키 => " + key);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("선택 [1:홀수 / 0:짝수]");
		String choice = sc.nextLine();
		char ch = choice.charAt(0);
		
		int choiceNo = ch - '0';
		
		int randNo = rnd.nextInt(10 - 1 + 1) + 1;
		
		String result = "";
		
		if(choiceNo == randNo % 2) result = "맞추었습니다.";	
		else result = "틀렸습니다.";

		
		System.out.println(result + " 랜덤하게 나온 수는 " + randNo + "입니다.");
		
		sc.close();
		
	}	
	
		

}
