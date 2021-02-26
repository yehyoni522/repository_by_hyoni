package my.day01;

import my.day01.Member;

public class Main {

	public static void main(String[] args) {

		//1명의 새로운 회원이 필요하다.
		Member lssmbr = new Member();
		lssmbr.id = "leess";
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		Member.address = "서울시 마포구";
		
		
		//1명의 새로운 회원이 필요하다.
		Member eomjhmbr = new Member();
		eomjhmbr.id = "eomjh";
		eomjhmbr.pwd = "qwer1234";
		eomjhmbr.name = "엄정화";
		eomjhmbr.email = "eomjh@gmail.com";
		//Member.address = "경기도 군포시 오금로";
		
		System.out.println(lssmbr);
		System.out.println(eomjhmbr);
		
		
		System.out.println("lssmbr 객체의 성명 : " + lssmbr.name);
		System.out.println("eomjhmbr 객체의 성명 : " + eomjhmbr.name);

		
		//System.out.println("lssmbr 객체의 주소 : " + lssmbr.address);
		//System.out.println("eomjhmbr 객체의 주소 : " + eomjhmbr.address);
		System.out.println("Member 클래스로 생성되어진 객체들이 공유해서 사용하는 변수인 주소 : " + Member.address);

		//lssmbr 인스턴스에 대한 회원정보 조회하기
		lssmbr.showInfo();
		
		System.out.println("");
		
		eomjhmbr.showInfo();

	}

}
