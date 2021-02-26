package my.day06.a.FOR;

import java.util.Scanner;

public class Quiz5Main2 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	    
		  for(;;) {
			  try {
				  
				  System.out.print("1. => ");
				  int num1 = Integer.parseInt(sc.nextLine());
				  
				  System.out.print("2 => ");
				  int num2 = Integer.parseInt(sc.nextLine());
				  
				  int holsu = 0, jjaksu = 0;
				  int holSum = 0, jjakSum = 0;
				  
				  
					  
					  if(num1 % 2 == 0) {
						  
						  holsu = num1 +1;
						  jjaksu = num1;
						  
						  } else {
							  
							  holsu = num1;
							  jjaksu = num1+1;
						  }
						 
					  
					  for(;;) {
						  
						  if(holsu <= num2) 
							 holSum += holsu;
						  
						  if(jjakSum <= num2)
							 jjakSum += jjaksu;
						  
						  holsu += 2;
						  jjaksu += 2;
						  
						  if(holsu > num2 && jjaksu > num2) break;
											  
						 						  
					  }	
					  
					  System.out.println(jjakSum);
					  System.out.println(holSum);
					  
					  sc.close();
					  break;
					  
				
				  
				  
				  
			  } catch ( NumberFormatException e) {
				  System.out.println("정수만 입력하세요!");
			  }
		  }
	      
	}
}
