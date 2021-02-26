package my.day07.b.FOR;

public class MultiForMain {

	public static void main(String[] args) {
		
		//다중 for문에 대해서 알아보자.
		
		char ch = 'a';
		for(int i = 0; i < 3; i++) {//바깥 for문 ==> 행
			for(int j = 0; j < 7; j++) {
				//내부 for문 ==> 열
				System.out.print(ch++);
			}
			System.out.println("");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		ch = 'a';
		int cnt = 0;
		for(int i = 0; i < 21; i++) {
			
			if(cnt < 6) {
				cnt++;
				System.out.print(ch++);
				
			} else {
				cnt = 0;
				System.out.println(ch++);
			}
			
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

			
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[" +i+","+j +"]");
			}
			System.out.println("");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

		for(int i = 0; i < 4; i++) {
			if(i == 2) continue;
			for(int j = 0; j < 3; j++) {
				System.out.print("[" +i+","+j +"]");
			}
			System.out.println("");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				if(j==1) continue;
				System.out.print("[" +i+","+j +"]");
			}
			System.out.println("");
		}
		
		System.out.println("안녕하세요\t내일\t또뵐께요~~");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

		for(int i = 5; i > 0; i--) {
			if(i == 4) continue;
			for(int j = 1; j <= 5; j++) {
				if(j == 4) continue;
				System.out.print(i+"0"+j+"호"+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
	
		
		
		
		}
}