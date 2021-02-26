package my.day06.a.FOR;

/*
 **** 반복문(loop) ==> for 문 ****
  
          ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
               ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class ForTest1Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println( (i + 1) + ".안녕자바~~" );
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	
		
		for(int i = 0; i < 10; i+=1) {
			System.out.println( (i + 1) + ".안녕Java~~" );
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(int i = 0; i < 10; i+=1) {
			System.out.println( ++i + ".안녕Java~~" );
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println( (i + 1) + ".안녕Java~~" );
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(int i = 0, j = 0; i < 10; i++, j+=2) {
			System.out.println( (j + 1) + ".안녕Java~~" );
		}
		
		System.out.println("\n~~~프로그램 종료~~~");

	}

}
