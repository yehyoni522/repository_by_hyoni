package my.day14.c.superComstructor;

public class MainTest {

	public static void main(String[] args) {
		
		Child child = new Child();
		//자식클래스의 기본생성자 호출
		
		//이것은 child의 부모 클래스인 parent 클래스의 기본생성자가 먼저 호출 되어지고 나서
		//그 다음에 자식클래스인 child의 기본생성자가 호출되어진다.
		
		child.ChildInfo();

	}

}
