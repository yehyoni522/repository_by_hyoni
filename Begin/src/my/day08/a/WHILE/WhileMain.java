package my.day08.a.WHILE;

public class WhileMain {
	
	/*
	   === while 문 형식 ===
	   
	   변수의 초기화;
	      
	   while(조건식) {
	      조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고,
	      조건식이 거짓(false)이라면 while의 { } 이부분을 빠져나간다. 
	      
	      반복해서 실행할 명령문;
	      증감식;
	   }
	*/

	public static void main(String[] args) {
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");

		int cnt = 5, loop = 0;
		
		while(loop < cnt) {
			System.out.println("안녕 자바~~");
			loop++;
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		
		
		cnt = 5; loop = 0;
		while(loop++ < cnt) {
			System.out.println((loop) + ". Hello Java~~~");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");

		cnt = 5; loop = 0;
		while(loop < cnt) {
			System.out.println(++loop + ". Hi Eclipse~~~");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");

		loop = 0;
		while(true) {
			System.out.println(++loop + ". Hi 이클립스~~~");
			if(loop == 5) break;
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		
		loop = 0;
		while(!(++loop > 5)) { 
			//!(  ) ==> 괄호 속에는 while 반복문을 빠져나갈 조건식을 정의한다.
			System.out.println(++loop + ". 안녕 오라클~~~");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");

		loop = 0;
		while(true) {
			if(++loop >= 10) break;
			if(loop %2 == 0) continue; //아래로 안 내려가고 while()의 조건식으로 이동한다.
			System.out.println(loop + ". Hi 이클립스~~~");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		loop = 0;
		while(++loop < 10) {
			System.out.println("5 * " + loop  + " = " + 5*loop);			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		loop = 0;
		while(true) {
			if(++loop > 9) break;
			System.out.println("6 * " + loop  + " = " + 6*loop);			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		loop = 0;
		while(!(++loop > 9)) {
			System.out.println("7 * " + loop  + " = " + 7*loop);			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");

		System.out.printf("%35s\n", "=== 구구단 ===");
		
		//9행 8열
		
		int jul = 0, dan = 1;
		
		while(!(++jul > 9)) {
			while(!(++dan > 9)) {
				String str = (dan < 9)? "\t":"\n";
				System.out.print(dan + "*" + jul + "=" + (jul * dan) + str);
			}
			dan = 1;
		}
		
		
		
		System.out.println("\n== 프로그램 종료 ==");
	}

}
