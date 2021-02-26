package my.day17.a.collection;

public class Member {
		String id;
		String passwd;
		String name;
		
	//기본 생성자는 기본적으로 생략되어져 있어 따로 구현을 하지 않아도 되지만
	//파라미터가 있는 생성자를 정의하면 기본 생성자는 삭제되기 때문에 따로 기재를 해줘야한다.
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String passwd, String name) {
		
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		
	}
	
	public void mbrInfoPrint() {
		
		System.out.println("== "+ name +"님의 회원 정보 ==\n"
						  + "1. 아이디 : "+ id +"\n"
						  + "2. 암   호 : "+ passwd +"\n"
						  + "3. 성   명 : "+ name +"\n");
		
	}


	
	

}
