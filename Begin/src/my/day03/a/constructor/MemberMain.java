package my.day03.a.constructor;

public class MemberMain {

	public static void main(String[] args) {
		
		Member hongMbr = new Member("hongkd", "qwer1234", "홍길동", 30, 100);
		
		Member cheonghaMbr = new Member();
		cheonghaMbr.userid = "chengha";
		cheonghaMbr.passwd = "abcd";
		cheonghaMbr.name = "청하";
		cheonghaMbr.age = 20;
		cheonghaMbr.point = 300;
		
		
		hongMbr.showInfo();
		cheonghaMbr.showInfo();
		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		hongMbr.changeInfo("KDhong", "1234", "홍길동", 25, 150);
		
		String info = cheonghaMbr.updateInfo("cha", "abcd0070", "청하", 21, 7000);
		System.out.println(info);
		
		
	
		
		
	}

}
