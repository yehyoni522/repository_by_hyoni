package my.day07.b.FOR;

public class GuguDan2Main {

	public static void main(String[] args) {
		
		/*
        	== 구구단 ==
		   2*1=2   3*1=3   4*1=4   ....   9*1=9
		   2*2=4   3*2=3   4*2=4   ....   9*2=9
		   2*3=6   3*3=3   4*3=4   ....   9*3=9
		   2*4=8   3*4=3   4*4=4   ....   9*4=9
		   2*5=10   3*5=3   4*5=4   ....   9*5=9
		   2*6=12   3*6=3   4*6=4   ....   9*6=9
		   2*7=14   3*7=3   4*7=4   ....   9*7=9
		   2*8=16   3*8=3   4*8=4   ....   9*8=9
		   2*9=18   3*9=3   4*9=4   ....   9*9=81
		 */
		
		//위의 구구단은 9행 8열이다.
		//row(행, i) => 줄, col(열, j) = >단
		
		System.out.printf("%30s", "==구구단==");
		System.out.println("입니다.");

		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				//System.out.print(j + "*" + i + "=" + i*j +"\t");
				System.out.printf(j + "*" + i + "= %-4d", i*j);
				//%f는 실수

			}
			System.out.println("");
		}
		
	}

}
