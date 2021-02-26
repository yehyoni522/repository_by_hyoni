package my.day09.a.array;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain5 {

	public static void main(String[] args) {
		
		Member4[] mbrArr = new Member4[3];
				
		Scanner sc = new Scanner(System.in);
		
		
		int menuNo = 0;
		do {
			
			System.out.println("=== >> 메뉴 << ===");
			System.out.println("1.회원가입\t 2.모든회원조회\t3.프로그램종료");
			System.out.print("▷선택하세요 => ");
			
			try {
				
				menuNo = Integer.parseInt(sc.nextLine());
				
				if( !( 1 <= menuNo && menuNo <= 3)) {
					System.out.println(">>메뉴에 없는 번호입니다.");
					continue;
				}
				
				switch (menuNo) {
					case 1 :
						Member4 mbr = new Member4();
						Member4.count++;
						
						System.out.print("1. 아이디 : ");
						mbr.id = sc.nextLine();
						
						
						
						do {
							System.out.print("2. 패스워드 : ");
						String passwd = sc.nextLine();
						
						boolean bool = MyUtil.isCheckPasswd(passwd);
						if(bool) {
							mbr.pwd = passwd;
							break;
						} else {
							System.out.println(">> 암호는 8글자 이상 15글자 이하의 영문대소문자와 숫자, 특수기호를 포함해야합니다.");
						}
						} while(true);
						
						System.out.print("3. 성명 : ");
						mbr.name = sc.nextLine();
						
						for(int i = 0; i < mbrArr.length; i++) {
							if(mbrArr[i] == null) {
								mbrArr[i] = mbr;
								break;
							}
						}
						
						break;
					case 2:
						
						for(int i = 0; i < Member4.count; i++) {
								System.out.println(mbrArr[i].showInfo() + "\n");
							
						}
						
						if(Member4.count == 0) {
							System.out.println(">>가입된 회원이 0입니다. <<");
						}
						
						break;
				}
				
				
			}catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요 <<");
			}
			
		} while( !(menuNo==3));
		
		
		
		sc.close();
		System.out.println("===프로그램 종료===");

	}

}
