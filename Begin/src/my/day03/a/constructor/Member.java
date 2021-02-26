package my.day03.a.constructor;

public class Member {
	
			//field, attribute, property, 속성
			String userid;
			String passwd;
			String name;
			int age;
			int point;
			
			//생성자
			
			/* 
			 * public Member() {
			 * System.out.println(">> Member 클래스의 기본생성자(default constructor)를 호출했습니다.<<"); }
			 */
			// !!! 생성자를 명시하지 않으면 아래와 같은 것이 생략되어져 있다.
			public Member(){}
			
			//!!! parameter 생성자가 선언되어 있으면 생략되어져 있던
			//기본 생성자는 자동적으로 기본생성자는 삭제된다.
			
			// () 속에 들어오는 변수를 매개변수 또는 parameter 라고 부른다.
			//parameter 생성자.
			public Member(String userid, String passwd, String name, int age, int point){
				// 지역변수명과 멤버변수(인스턴스변수와 static 변수를 모두 지칭하는 것)이
				//일치할 경우에는 지역변수가 우선된다.
				
				this.userid = userid;
				this.passwd = passwd;
				this.name = name;
				this.age = age;
				this.point = point;
				
				
			}
			
			
			//behavior, 행위, 기능, method
			//파라미터가 없고 리턴타입도 없는 메소드 만들기 예제
			void showInfo() {
				
				System.out.println(" === " + name + " 님의 회원정보 ===  \n"
									+ "1. 아이디 : " + userid + "\n"
									+ "2. 패스워드 : " + passwd + "\n"
									+ "3. 성명 : " + name + "\n"
									+ "4. 나이 : " + age + "\n"
									+ "5. 포인트 : " + point + "\n");
			
				
			}
			
			void changeInfo(String userid, String passwd, String name, int age, int point) {
				
				this.userid = userid;
				this.passwd = passwd;
				this.name = name;
				this.age = age;
				this.point = point;
				
				System.out.println(">> 변경 후 정보 조회하기 <<");
				showInfo();
				
			}
			
			//파라미터가 있고 리턴타입도 있는 메소드 만들기 예제
			
			 String updateInfo(String userid, String passwd, String name, int age, int point) {
				
				 String result1 = ">> " + this.name+ "님의 회원 수정 전 결과 <<" +"\n"
								+ "1. 아이디 : " + this.userid + "\n"
								+ "2. 패스워드 : " + this.passwd + "\n"
								+ "3. 성명 : " + this.name + "\n"
								+ "4. 나이 : " + this.age + "\n"
								+ "5. 포인트 : " + this.point + "\n"; 
				
				this.userid = userid;
				this.passwd = passwd;
				this.name = name;
				this.age = age;
				this.point = point;
				
				String result2 = ">> " + this.name+ "님의 회원 수정한 후 결과 <<" +"\n"
								+ "1. 아이디 : " + this.userid + "\n"
								+ "2. 패스워드 : " + this.passwd + "\n"
								+ "3. 성명 : " + this.name + "\n"
								+ "4. 나이 : " + this.age + "\n"
								+ "5. 포인트 : " + this.point + "\n";
				
				
				return result1 + "\n" + result2;
			}
			
			

}
