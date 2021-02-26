package my.day16.b.userDefineException;

// == 사용자가 정의하는 예외 클래스 만들기 ==
/*
  	1. Exception 클래스를 상속받아야 한다.
  	2. 생성자 내에서 예외메시지(오류 메시지)를 등록해주면 끝
 */
public class JangolackException extends Exception {

	private static final long serialVersionUID = 1L;

	//기본 생성자
	public JangolackException() {
		super(">> 잔고량이 주문량보다 적으므로 주문이 불가능합니다. <<");
	}

	public JangolackException(String string) {
		super(string);
	}
	
}
