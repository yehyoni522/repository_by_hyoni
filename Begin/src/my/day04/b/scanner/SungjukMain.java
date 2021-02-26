package my.day04.b.scanner;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk Sj = new Sungjuk();
		Scanner sc = new Scanner(System.in);
		
		int inputType = 0;
		
		
		try {
		System.out.print("1. 학번 : ");
		Sj.hakbun = sc.nextLine();
		
		System.out.print("2. 성명 : ");
		Sj.name = sc.nextLine();
		
		inputType = 1;
		
		System.out.print("3. 국어 성적 : ");
		byte kor = Byte.parseByte(sc.nextLine());
		
		
		if(!Sj.checkJumsu(kor)) {
			sc.close();
			return;
		}
		else {
			Sj.kor = kor;
		}
		
		System.out.print("4. 영어 성적 : ");
		byte eng = Byte.parseByte(sc.nextLine());
		
		if(!Sj.checkJumsu(eng)) {
			
			sc.close();
			return;
		}
		else {
			Sj.eng = eng;
		};
		
		System.out.print("4. 영어 성적 : ");
		byte math = Byte.parseByte(sc.nextLine());
		
		if(!Sj.checkJumsu(math)) {
			
			sc.close();
			return;
		}
		else {
			Sj.math = math;
		};
		inputType = 2;
		System.out.print("5. 나이 : ");
		short age = sc.nextShort();
		
		if(!Sj.checkAge(age)) {
			
			sc.close();
			return;
		}
		else {
			Sj.age = age;
		}
		
			String str = Sj.showInfo(Sj.hakbun, Sj.name, Sj.kor, Sj.eng, Sj.math, Sj.age);
			System.out.println(str);
			
		}catch(NumberFormatException  e) {
			if(inputType == 1) {
			System.out.println(">> 점수 입력은 0 ~ 100까지만 가능합니다.");
			}
			else if(inputType == 2) {
				System.out.println(">> 나이 입력은 20 ~ 50까지만 가능합니다.");
			}
			e.printStackTrace();
			
		}
		
		
		
		sc.close();
	}

}
