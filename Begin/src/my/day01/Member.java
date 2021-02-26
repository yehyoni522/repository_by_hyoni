package my.day01;

public class Member {

	/*
	 만약에 쇼핑몰 프로그램을 작성하고자 한다라면
	 회원, 제품, 장바구니, 주문내역 부품이 필요할 것이다.
	 여기서 필요로 하는 부품의 설계도면을 "클래스"라고 보면 된다.
	 */
	
	// 추성화 ==> 필요한 속성만 뽑아내는 것을 말한다.
	// 회원가입(병원) ==> 신장, 혈액형, 몸무게
	// 회원가입(쇼핑몰) ==> 아이디, 비밀번호, 성명, 이메일, 전화번호, 주소, 마일리지(포인트),...
	//attribute == property == field == 속성
	
	//1. instance 변수
	//instance 변수는 서로 다른 instance
	String id; //String 은 문자열을 뜻하는 클래스(자료형)이다.
			   //id 라는 변수(변하는 수)에는 문자열이 들어온다는 뜻
	String pwd;
	String name;
	String email;
	
	//id, pwd, name, email 은 instance 변수라고 부른다
	//인스턴스 변수를 다른말로 non static 변수라고도 한다.
	
	//2. static 변수
	//static 변수는 동일한 클래스로 생성되어진 서로 다른 instance 들끼리 공유하는 변수이다.
	static String address;
	
	//behavior == 행위 == 기능 == method
	//자바에서 괄호가 나오는 것은 오로지 2개밖에 없다.
	//1.생성자  2.메소드
	
	void showInfo() {
		//void는 return 타입이 없다는 말이다.
		System.out.println("===회원정보===");
		System.out.println("1. 아이디 : " + id);
		System.out.println("2. 비밀번호 : " + pwd);
		System.out.println("3. 이름: " + name);
		System.out.println("4. 이메일 : " + email);
	}
	
}
