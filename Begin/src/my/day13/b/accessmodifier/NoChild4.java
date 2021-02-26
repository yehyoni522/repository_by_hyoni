package my.day13.b.accessmodifier;

import my.day12.b.inheritance.Member;

public class NoChild4{
	
	void test() {
		Member mbr = new Member();
		
		//mbr.setId("hongkd");
		//Nochild4는 Member 클래스의 자식 클래스가 아니고
		//setId 메소드는 접근제한자가 protected 이므로
		//초종적으로 접근이 불가하다
		//System.out.println(mbr.getId());
		
		mbr.setName("홍길동");
		//setName 메소드의 접근제한자가 public 이므로
		//최종적으로 누구나 접근이 가능하다
		System.out.println(mbr.getName());
		
	}

}
