package my.day03.b.operator;

public class OperatorMain {

	public static void main(String[] args) {
		
		// === 연산자 ===
		// 1. 산술 연산자 : + - * / %
		int n = 10;
		System.out.println(" n + 3 = " + ( n + 3 ));
		System.out.println(" n - 3 = " + ( n - 3 ));
		System.out.println(" n * 3 = " + ( n * 3 ));
		System.out.println(" n / 3 = " + ( n / 3 ));
		System.out.println(" n % 3 = " + ( n % 3 ));
		System.out.println("(float) n / 3 )  = " + ( (float)n / 3 )); // 실수 / 정수 = 실수

		
		System.out.println("\n");
		
		// 2. 증감 연산자 : 
		int a = 7, b = 3;
		System.out.println("a => " + a);
		
		a++;
		System.out.println("a => " + a);
		
		++a;
		System.out.println("a => " + a);
		
		
		System.out.println("b => " + b);
		//b = b - 1;
		//System.out.println("b => " + b);
		b--;
		System.out.println("b => " + b);
		--b;
		System.out.println("b => " + b);
		
		//!!!
		//후위증감연산자(a++, b--)는 다른 연산을 다 마친 이후에 1씩 증감한다.
		//전위증감연산자(++a, --b)는 맨 먼저 1씩 증감을 마친 이후에 다른 연산을 한다.
		
		int x = 10, y = 10;
		int z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		z = y++; // z = y 연산을 먼저 수행한 후 1 증가한다.
		System.out.println("z = " + z);
		System.out.println("x = " + y);
		
		// 3. 논리 연산자  &   |   &&   ||
		/*
		  	수학에서는 T∧(AND) T ∧  F ==> F (하나라도 거짓이면 거짓)
		  		   T ∧(AND) T ∧  F ==> F (하나라도 거짓이면 거짓)
		  		   
		  		   T ∨(OR)∨ T ∨ T ==> T
		  		   T ∨(OR)∨ T ∨ F ==> T
		  		   F ∨(OR)∨ F ∨ F ==> F
		 */
		
		int c = 50, d = 60, e = 70;
		
		boolean bool = (c > d) && (d < e) && (c == e);
		System.out.println(bool);
		
		bool = (c > d) || (d < e) || (c == e);
		System.out.println(bool);
		
		bool = (c > d) & (d < e) & (c == e);
		// & 가 하나라면 첫 연산이 거짓일 지라도 뒤에 오는 연산을 생략하지 않는
		System.out.println(bool);

		bool = (c > d) | (d < e) | (c == e);
		System.out.println(bool);
		
		System.out.println("\n~~~~~ 퀴즈1 ~~~~~~\n");
		int i=1;    
		int j=i++;  
		      
		if( (i > ++j) & (i++ == j) ) {
		     i=i+j;
		}
		      
		System.out.println("i="+i);  
		      
		i=1;    
		j=i++;  
		      
		if( (i > ++j) && (i++ == j) ) { 
		    i=i+j;
		}
		      
		System.out.println("i="+i);  //
		      
		System.out.println("\n~~~~~ 퀴즈2 ~~~~~~\n");
		      
		int m1=0; 
		int n1=1;

		if( (m1++ == 0) | (n1++ == 2)  ) {
		     m1=42;   // m1=42 
		}
		      
		System.out.println("m1=>"+m1 + ", n1=>"+n1); 

		      
		m1=0; 
		n1=1;
		if( (m1++ == 0) || (n1++ == 2) ) { 
		     m1=42;   // m1=42
		}
		      
		System.out.println("m1=>"+m1 + ", n1=>"+n1); 
		
		// 4. 비교 연산자
		// == 같다, != 같지 않다, >, <, =>, <=
		
		//5. 할당 연산자(연산 후 대입 연산자)
		int no = 1;
		no += 3; // no = no + 3
		System.out.println("no => " + no);
		
		no -= 2; // no = no - 3
		System.out.println("no => " + no);
		
		no *= 5; // no = no * 5
		System.out.println("no => " + no);
		
		no /= 4; // no = no / 4
		System.out.println("no => " + no);
		
		no %= 3; // no = no % 3
		System.out.println("no => " + no);
		
		// 6. 삼항 연산자
		/*
		 	변수 선언 = (조건식) ? 값1 : 값2 ==> 조건식이 참이면 값1, 거짓이면 값2
		 */
		
		int num1 = 50, num2 = 60;
		int num3 = (num1 > num2) ? num1 : num2;
		
		System.out.println("num3 => " + num3);
		
		
		
	}

}
