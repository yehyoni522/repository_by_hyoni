package my.day06.a.FOR;

public class Quiz3Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			String str = (i<9)?",":"";
			System.out.print((i+1)+str);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");
		
		
		for(int i = 0, j = 5; i < 10; i++, j++) {
			String str = (i<9)?",":"";
			System.out.print(j + str);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");	
		
		for(int i = 5; i < 15; i++) {
			String str = (i<14)?",":"";
			System.out.print(i + str);
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~\n");	

		//1~20
		String result = "";
		int sum = 0;
		for(int i = 1; i < 20; i++) {
			if(i%3 == 0) {
				sum += i;
				String	str = (i<18)?"+":"=";
				result += i+str;
			}
		}
		
		System.out.print(result + sum);
		
		
		
		
		
		
	}
}
