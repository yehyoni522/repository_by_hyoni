package my.day02;

// === 지역변수, instance 변수의 차이점에 대해서 알아본다. ===


public class Main01 {
	
	//String 문자열 
	//static이 없으면 instance
	String id;
	String pwd;
	String name = "차은우";
	String email;
	
	//int 정수형
	int age = 33;
	
	/*
	 멤버변수 = instance 변수와 static 변수를 합친 것
	 instance 변수 및 static 변수는 초기화 하지 않더라도 자동적으로 초기화가 된다.
	 정수형인 데이터타입은 자동적으로 0으로 초기화가 되고
	 실수형인 데이터타입은 자동적으로 0.0으로 초기화가 되고
	 String 을 포함한 클래스 타입은 자동적으로 null로 초기화가 된다.
	 */
	
	
	
	void showInfo1() {
		//지역변수는 {} 안에서만 사용됨
		//지역변수는 자동적으로 RAM에서 삭제되어진다.
		//지역변수는 반드시 값을 초기화해주어야한다.
		int hopeMoney = 25000;
		String shopeMoney = "십오억";

		System.out.println("=== 회원 정보 ===\n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"
				+ "6. 희망급여 : " + hopeMoney + "\n"
				+ "7. 희망연봉 : " + shopeMoney);
				
	}
	
	    String showInfo2() {
	    	
		int hopeMoney = 900000000;
		
		
		return "=== 회원 정보 ===\n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"
				+ "6. 희망급여 : " + hopeMoney;
	}

	public static void main(String[] args) {
		
		//instance화(객체 생성) static 변수가 아닐 경우 무조건.
		Main01 ma1 = new Main01();
		ma1.id = "leess";
		ma1.pwd = "qwer1234";
		ma1.name = "이순신";
		ma1.email = "leess@naver.com";
		ma1.age = 25;
		
		ma1.showInfo1();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		String info1 = ma1.showInfo2();
		System.out.println(info1);
		
		System.out.println("#######################");
		
		Main01 ma2 = new Main01();
		ma2.showInfo1();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		String info2 = ma2.showInfo2();
		System.out.println(info2);
		
		
		
	}

}
