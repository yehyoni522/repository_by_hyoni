package my.day14.d.block;

public class Child extends Parent {

	String name = "홍길동"; // 멤버변수의 초기화
	static int count; 	  // 멤버변수의 초기화
	
	//static 초기화 블럭
	static {
		//static 초기화 블럭은 인스턴스(객체)를 생성하기 전에 먼저 호출되어지며
		//중요한 것은 오로지 1번만 호출된다는 것이다.
		//주로 static 초기화 블럭은 환경설정 시 사용된다.
		System.out.println("*** Child클래스의 static 초기화 블럭 호출됨 ***");
		count++;
		
		//name = "똘똘이";
		//name은 instance 변수이기 때문에 instance가 호출되기 전에 static 초기화 블럭이 먼저 호출되기 때문에
		//instance 변수는 사용할 수 없다. (오로지 static 변수만 사용할 수 있다.)
	}
	
	//instance 초기화 블럭
	{
		//
		System.out.println("### Child클래스의 instance 초기화 호출됨 ###");
		
		name = "서강준";
		
	}
	
	//생성자
	public Child() {
		//super(); 생략
		System.out.println(">> 자식클래스인 Child 클래스의 기본생성자 호출됨 <<");
		name = "한지민";
	
	}
	
	
}
