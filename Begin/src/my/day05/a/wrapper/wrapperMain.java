package my.day05.a.wrapper;

import java.util.Scanner;

/*
	   === *** wrapper 클래스 *** ===
	   
	   ------------------------------------------------
	     기본자료형(원시형, primitive)     wrapper 클래스
	   ------------------------------------------------
	    byte                           Byte 
	    short                          Short
	    int                            Integer  
	    long                           Long
	    char                           Character
	    float                          Float
	    double                         Double
	    boolean                        Boolean 
	    ------------------------------------------------
	    
	     기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
	    wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
	     아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
	*/
public class wrapperMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch = 'a';
		System.out.println("ch => " + ch);
		System.out.println(ch+1);
		System.out.println((char)(ch-32));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Character chr = new Character('a');
		System.out.println("ch => " + chr);
		System.out.println(chr + 1);
		System.out.println( (char)(chr - 32));
		System.out.println( (char)('a' - 32));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase(97));
		System.out.println(Character.toLowerCase(65));

		char ch2 = 'C';
		
		if( ch2 == 68) { //char 타입은 비교연산자를 만나면 자동적으로 int 타입으로 형변환 되어진다.
			System.out.println("호호호");
		}
		
		if( Character.isUpperCase(ch2)) {
			System.out.println(ch2 + "는 대문자 입니다.");
		}
		else if( Character.isLowerCase(ch2)) {
			System.out.println(ch2 + "는 소문자 입니다.");
		}
		else if( Character.isDigit(ch2)) {
			System.out.println(ch2 + "는 숫자입니다.");
		}
		else System.out.println(ch2 + "는 기타문자입니다.");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.print("한 글자만 입력하세요. => ");
		String str   = sc.nextLine();
		char chr1 = str.charAt(0);
		
		if(chr1 >= 65 && chr1 < 97) {
			System.out.println("입력하신 " + chr1 + "는 대문자 입니다.");
		}
		else if (chr1 >= 97 && chr1 < 123) {
			System.out.println("입력하신 " + chr1 + "는 소문자 입니다.");
		}
		else System.out.println("입력하신 " + chr1 + "는 알파벳 문자가 아닙니다.");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("== 오토박싱, 오토언박싱에 대해서 알아봅니다. ==");
		// Boxing(박싱, 포장을 하는것) 이란 ?
	    // ==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를 
	    //     객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)   
	    //     타입의 객체로 만들어주는 것을 말한다.
		
		int a1 = 10;
		Integer a2 = new Integer(a1); //Boxing
		System.out.println("a1 => " + a1);
		
		int b1 = 10;
		Integer b2 = new Integer(b1); //Boxing
		System.out.println("b1 => " + b1);
		
		// UnBoxing(언박싱, 포장을 푸는것) 이란?   
	    // ==> Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)로 
	    //     되어져 있는 객체를 기본자료형(boolean, byte, short, int, long, char, float, double)으로 
	    //     만들어주는 것을 말한다.
		
		Integer a3 = new Integer(20);
		int a4 = a3.intValue();
		System.out.println("a4 => " + a4);
		
		int a5 = new Integer(20);
		System.out.println("a5 => " + a5);
		
		Double db1 = new Double(1.234567);
		double db2 = db1.doubleValue();
		System.out.println("db2=> " + db2);
		
		double db3 = new Double(1.234567);
		System.out.println("db3 => " + db3);
		
		
		
		
		
		
		
		
		sc.close();
		

	}
	

}
