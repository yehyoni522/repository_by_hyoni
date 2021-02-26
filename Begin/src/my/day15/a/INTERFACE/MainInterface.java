package my.day15.a.INTERFACE;

public class MainInterface {

	public static void main(String[] args) {
		
		//final 변수 ==> 상수변수라고 부른다.
		final double PI = 3.141592;
		
		System.out.println("반지름이 5인 원의 원둘레 크기 => " + 2 * PI * 5);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Triangle tri = new Triangle();
		Rectangle rt = new Rectangle();
		
		
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 : " + tri.area(4, 5));
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 : " + rt.area(4, 5));
		
		//다형성 Polymorphism
		//자식클래스로 생성되어진 객체를 부모클래스의 타입으로 받을 수 있다.
		//특정한 인터페이스로 구현된 클래스의 객체를 특정한 인터페이스의 타입으로 받을 수가 있다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		 Figure fg1 = new Triangle(); 
		 Figure fg2 = new Triangle();
		 Figure fg3 = new Circle();
		 
		 System.out.println("밑변 4, 높이 5인 삼각형의 넓이 : " + fg1.area(4, 5));
	  	 System.out.println("밑변 4, 높이 5인 삼각형의 넓이 : " + fg2.area(4, 5));
	  	 System.out.println("반지름이 4인 원의 넓이 => " + fg3.circleArea(4));
		 
		
		//Figure fgArr = new Figure[3]; ==> 오류!
		//인터페이스로는 Figure는 new Figure[3]; 와 같이 할 수 없다.
		

	}

}
