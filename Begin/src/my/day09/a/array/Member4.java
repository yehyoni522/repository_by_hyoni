package my.day09.a.array;

public class Member4 {

	
	String id;
	String pwd;
	String name;
	
	static int count = 0;
	
	public String showInfo() {
		return    "1. 아이디 : " + id + "\n"
				+ "2. 패스워드 : " + pwd + "\n"
				+ "3. 이름 : " + name;
	}
}
