package my.day06.a.FOR;

import java.util.Scanner;

public class Quiz4Main {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	      
	      for(;;) {
	      
	         try {
	            System.out.print("첫번째 정수 : ");  // 2  // 3
	            String strFirstNo = sc.nextLine();
	            int firstNo = Integer.parseInt(strFirstNo);
	            
	            System.out.print("두번째 정수 : ");  // 10
	            String strSecondNo = sc.nextLine();
	            int secondNo = Integer.parseInt(strSecondNo);
	            
	            
	            int holSum = 0;
	            int jjakSum = 0;// 홀수의 누적의 합계를 저장하는 변수
	            
	            // == 홀수의 합을 구한다. == 
	            for(;;) { 
	               // 홀수의 합을 구하는데  첫번째로 입력한 값이 firstNo => 2 (짝수) 이라면 
	               // firstNo 는 1을 더한후(즉,3) 2씩 증가시켜주면 된다.
	               
	               // 홀수의 합을 구하는데 첫번째로 입력한 값이 firstNo => 3 (홀수) 이라면
	               // 2씩 증가시켜주면 된다.
	               
	               if(firstNo%2 == 0) { // 첫번째 입력받은 값이 짝수 이라면  
	                  firstNo = firstNo+1;
	                  if (firstNo <= secondNo) { //  (9 <= 10)  (11 <= 11)
		                   holSum+=firstNo;
		               }
	               } else {
	            	   firstNo = firstNo+1;
	            	   jjakSum += firstNo;
	               }
	               
	               
	               firstNo+=2;
	               break; //  5
	               
	            }
	               
	          
	            
	                
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * try {
		 * 
		 * System.out.print("첫 번째 정수 : "); int num1 = Integer.parseInt(sc.nextLine());
		 * 
		 * System.out.print("두 번째 정수 : "); int num2 = Integer.parseInt(sc.nextLine());
		 * 
		 * 
		 * 
		 * int sum1 = 0, sum2 = 0;
		 * 
		 * for(int i = num1; i <= num2; i++) { if(i%2 == 0) sum1 += i; //String str = (i
		 * < (num2 - 1))? ",":"="; else sum2 += i; }
		 * 
		 * System.out.println(num1 + "부터 " + num2 + "까지의 홀수의 합 : "+sum2);
		 * System.out.println(num1 + "부터 " + num2 + "까지의 짝수의 합 : "+sum1);
		 * 
		 * 
		 * 
		 * 
		 * sc.close(); } catch (NumberFormatException e) {
		 * System.out.println("정수만 입력하세요!"); }
		 * 
		 * 
		 * 
		 */
		
		System.out.println(holSum);
		System.out.println(jjakSum);

	
	    sc.close();
	    break;

} catch(NumberFormatException e) {
	System.out.println("정수만 입력하세요.");
}
	
}
	}
	}
