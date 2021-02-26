package my.day16.a.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		System.out.println("\n1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//1. ArrayIndexOutOfBoundException
		//--> 배열의 크기가 오버가 되어지면 발생하는 오류
		
		String[] subjectArr = {"자바","오라클","JSP"};
		
		try {
			for(int i=0; i<=subjectArr.length; i++) {
			System.out.println(subjectArr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다.");
			//System.out.println(e.getMessage());
			//e.getMessage() 은 오류메세지를 알려줌
			
			//e.printStackTrace();
			
		}
		
		System.out.println("\n2.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//2. ArithmeticException
		//-->분모에 0이 들어가는 경우에 발생하는 오류
		try {
			int num = 10;
		for(int i = 2; i >= 0; i--) {
			System.out.println(num / i);
		}
		}catch (ArithmeticException e) {
			System.out.println(">> 분모에는 0이 올 수가 없습니다. <<");
			//System.out.println(e.getMessage());
			
			//e.printStackTrace();
		}
		
		System.out.println("\n3.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int []  numArr = {10, 20, 30};
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = numArr[i] / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. <<");
			} catch (ArithmeticException e) {
				System.out.println(">> 분모에는 0이 올 수 없습니다 <<");
			}
		}
		
		System.out.println("\n4.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = numArr[i] / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
				System.out.println("에러 메세제 : " + e.getMessage());
			}
		}
		
		System.out.println("\n5.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
	
		
		System.out.println("\n6.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = numArr[i] / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (Exception e) {
				System.out.println("에러 메세제 : " + e.getMessage());
			}
		}
		
		System.out.println("\n7.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		String[] strArr = {"10", "스물", "30"};
		
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = Integer.parseInt(strArr[i]) / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 : " + e.getMessage());
			}catch (ArithmeticException e ) {
				System.out.println("분모에 0을 넣을 수 없습니다.");
			}catch(Exception e ) {
				System.out.println("오류 메세지 : " + e.getMessage());
			}
		}
		
		/*
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = Integer.parseInt(strArr[i]) / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch(Exception e ) {
				System.out.println("오류 메세지 : " + e.getMessage());
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 : " + e.getMessage());
			}catch (ArithmeticException e ) {
				System.out.println("분모에 0을 넣을 수 없습니다.");
			}
		}
		
		익셉션 처리시 부모클래스의 익셉션이 맨 아래에 나와야 한다.
		왜냐하면 익셉션 처리는 위에서 처리되염ㄴ서 위의 것이 처리가 안되면
		아래로 내려가라는 말인데 부모 클래스의 익셉션이 먼저 나오고
		자식 클래스의 익셉션이 아래에 나오면 부모 클래스 익셉션이 처리를 못한 것을
		자식 클래스 익셉션이 처리를 해라는 것은 모순이기 때문이다.
		*/
		
		System.out.println("\n8.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		String[] strArr2 = {"10", "스물", "30"};
		
		int count = 0;
		
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = Integer.parseInt(strArr2[i]) / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 : " + e.getMessage());
			}catch (ArithmeticException e ) {
				System.out.println("분모에 0을 넣을 수 없습니다.");
			}finally {
				System.out.println(++count + "오류가 발생하든 안 하든~");
			}
		}
		
		System.out.println("\n9.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		String[] strArr3 = {"10", "스물", "30"};
		
		count = 0;
		
		for(int i = 3; i >= 0; i--) {
			try {
				 int val = Integer.parseInt(strArr3[i]) / i; //num[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 : " + e.getMessage());
			}catch (ArithmeticException e ) {
				System.out.println("분모에 0을 넣을 수 없습니다.");
			}finally {
				System.out.println(++count + "오류가 발생하든 안 하든~");
			}
		}
		
		
		
		
	}

}
