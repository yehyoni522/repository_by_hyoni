package my.day14.c.superComstructor;

public class Child extends Parent {
	
	//filed
	String name;
	
	//기본 생성자
	public Child() {
		//super();
		//부모클래스의 기본생성자. 자식클래스의 기본생성자에는 부모클래스의 기본생성자가 생략되어있다.
		name = "엄정화";
		System.out.println("=== 확인용 Child 클래스의 기본생성자 호출함 ===");
	}
	
	//method
	void ChildInfo() {
		String info = "아이디 : " + super.id + "\n"
					+ "암 호 : " + super.passwd + "\n"
					+ "성 명 : " + this.name;
		
		System.out.println(info);
	}

}
