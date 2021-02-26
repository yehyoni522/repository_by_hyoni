package my.day06.a.FOR;

public class Sum1Main {

	public static void main(String[] args) {
		
		int sum = 0; //누적의 합
		String str = "";
		
			for(int i = 0; i <= 10; ++i) {
				sum += i;					
			}
			
		System.out.println("1부터 10까지의 누적의 합계 : " + sum);
	
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		sum = 0;
		
		for(int i = 1; i <= 10; ++i) {
			sum+=i;
			if (i < 10) str += i + "+";
			else System.out.println(str+ i +" = "+sum);
		}
		
	}

}
