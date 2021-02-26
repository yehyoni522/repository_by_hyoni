package my.day07.b.FOR;

public class HomeworkMain {
	
	//		== 숙제 1 == 
	//		*
	//		**
	//		***
	//		****
	//		*****
			          
			          
	//		== 숙제 2 == 
	//		       *
	//		      **
	//		     ***
	//		    ****
	//		   ***** 

	//		== 숙제 3 == 
	//		*****   
	//		****    
	//		***    
	//		**     
	//		*   
			          
	//		  == 숙제 4 ==
			 
	//		       *
	//		      ***
	//		     ***** 
			          
	//		    == 숙제 5==
			          
	//		      *****
	//		       ***
	//		        *
			              
	//		 == 숙제 6 ==
			       
	//		        *
	//		       ***
	//		      *****
	//		       ***   
	//		        *   
/*
	== 입사문제 == 
	        
		       *********1
		       ********2
		       *******3
		       ******4
		       *****5
		       ****6
		       ***7
		       **8
		       *9
	*/
	
	public static void main(String[] args) {
			
		//		== 숙제 1 == 
		//		*
		//		**
		//		***
		//		****
		//		*****
		
		char ch = '*';
		
		System.out.println("1번");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%c",ch);
			}
			System.out.println("");
		}
		
	    //		== 숙제 2 == 
		//		       *
		//		      **
		//		     ***
		//		    ****
		//		   ***** 
		ch = '*';
		
		System.out.println("2번");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%5c",ch);
			}
			System.out.println("");
		}
		
		   System.out.println("== 구구단 3단씩 끊기 ==");
		   
		   for(int dan=1; dan<10; dan+=3) { // 3단씩 끊음.
		                                   // 1단 부터 시작해서 3단까지 하는것, 
		                                   // 4단 부터 시작해서 6단까지 하는것,
		                                   // 7단 부터 시작해서 9단까지 하는것
		      for(int jul=1; jul<=9; jul++) { // 곱해지는 수 
		         
		         for(int j=dan; j<dan+3; j++) { // 각 단을 출력한다.
		            System.out.print(j+"*"+jul+"="+(j*jul)+"\t");   
		         }
		         System.out.print("\n");
		         
		      }
		      System.out.print("\n");
		   }
		   
		   
		   System.out.println("\n~~~~~ 구구단 4단씩 끊기(!!입사문제!!) ~~~~~");
		   
		   for(int dan=2; dan<10; dan+=4) { // 4단씩 끊음.
		                              // 2단 부터 시작해서 5단까지 하는것, 
		                                   // 6단 부터 시작해서 9단까지 하는것
		      for(int jul=1; jul<=9; jul++) { // 곱해지는 수 
		      
		         for(int j=dan; j<dan+4; j++) { // 각 단을 출력한다.
		            System.out.print(j+"*"+jul+"="+(j*jul)+"\t");   
		         }
		         System.out.print("\n");
		      
		      }
		      System.out.print("\n");
		   }
		

	}

}
