package my.day06.a.FOR;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member mbr = new Member();
		
		System.out.println(">>> 회원가입 <<<");
		
		System.out.print("1. 아이디 : ");
		String id = sc.nextLine();
		 
		System.out.print("2. 비밀번호(8글자 이상 15글자 이하에서 영문자, 숫자, 특수문자를 포함하시오) : ");
		String pwd = sc.nextLine();
		
		System.out.print("3. 회원명 : ");
		String name = sc.nextLine();
		
		mbr.id = id;
		
		
		
		if( mbr.checkPwd(pwd) ) {
			mbr.pwd = pwd;
		} else System.out.println("비밀번호는 8글자 이상 15글자 이하에서 영문자, 숫자, 특수문자를 포함해야합니다.");
		
		
		mbr.name = name;
		
		if( mbr.id.length() > 0 && mbr.id != null && 
			mbr.pwd != null && 
			mbr.name.length() > 0 && mbr.name != null) 
			System.out.println("== 회원가입 성공 ==");
		else System.out.println("== 회원가입 실패 ==");
		
		
		
		
	
		sc.close();

	}

}
