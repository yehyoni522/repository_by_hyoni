package my.day14.b.abstractClass;

import java.util.Scanner;

public class GujikjaCompanyMain {

	public static void main(String[] args) {
		
		Member[] mbrArr = new Member[10];
		
		Gujikja gu1 = new Gujikja();
		gu1.setId("eomjh");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("엄정화");
		gu1.setJubun("9501252");
		
		if(gu1.isUse()) {
			mbrArr[Member.count++] = gu1;
		}	
		
	//	System.out.println(gu1.getName());
	//	System.out.println("gu1.isUseGujikja() => " + gu1.isUseGujikja());
		
		Gujikja gu2 = new Gujikja();
		gu2.setId("leess");
		gu2.setPasswd("qwer1234$B");
		gu2.setName("이순신");
		gu2.setJubun("9709251");
		
		if(gu2.isUse()) {
			mbrArr[Member.count++] = gu2;
		}
		
		////////////////////////////////////////////////////
		
		Company co1 = new Company();
		co1.setId("skcompany");
		co1.setPasswd("abcd1234$C");
		co1.setName("SK");
		co1.setJobType("IT");
		co1.setSeedMoney(20000000);
		
		if(co1.isUse()) {
			mbrArr[Member.count++] = co1;
		}
		
	//	System.out.println(co1.getName());
	//	System.out.println("co1.isUseCompany() => " + co1.isUseCompany());
		
		Company co2 = new Company();
		co2.setId("ktcompany");
		co2.setPasswd("abcd1234$D");
		co2.setName("KT");
		co2.setJobType("IT");
		co2.setSeedMoney(30000000);
		
		if(co2.isUse()) {
			mbrArr[Member.count++] = co2;
		}
		
		//////////////////////////////////////////////////
		
		GujikjaCompanyCtrl ctrl = new GujikjaCompanyCtrl();
		
		Scanner sc = new Scanner(System.in);
	    
		String smenuNo = "";
		
		Member mbr = null;
		String title = "";
		
		do {
			if(mbr == null) title = "======== >> 메인메뉴 << ========";
			else {
				String who = (mbr instanceof Gujikja)?"구직자" : "구인회사";
				title = "====== >> 메인메뉴 [" + who + " " + mbr.getName()+ "] 로그인 중.. ======";
			}
			
			System.out.println(title +"\n"
					         + "1. 구직자 회원가입    2. 구인회사 회원가입 \n"
					         + "3. 구직자 로그인       4. 구인회사 로그인 \n"
					         + "5. 모든 구직자 출력   6. 모든 구인회사 출력 \n"
					         + "7. 로그아웃              8. 내 정보 수정하기 \n"
					         + "9. 프로그램 종료\n");
			
			System.out.print("▷ 메뉴번호 선택 => "); 
			smenuNo = sc.nextLine();
			
			switch (smenuNo) {
				case "1": // 구직자 회원가입 
					mbr = ctrl.register(1, sc, mbrArr);
					mbrArr[Member.count++] = mbr;
					System.out.println(">> 구직자 회원가입 성공!! \n");
					
					break;
	
				case "2": // 구인회사 회원가입
					mbr = ctrl.register(2, sc, mbrArr);
					mbrArr[Member.count++] = mbr;
					System.out.println(">> 구인회사 회원가입 성공!! \n");
					
					break;
					
				case "3": // 구직자 로그인
					if(mbr == null)
						mbr = ctrl.login(3, sc, mbrArr);
					else if(mbr != null && mbr instanceof Gujikja) System.out.println("현재 구직자로 로그인이 되어있는 상태입니다.");
					else System.out.println("현재 구인회사로 로그인 되어있는 상태입니다.");
					break;
					
				case "4": // 구인회사 로그인
					if(mbr == null)
						mbr = ctrl.login(4, sc, mbrArr);
					else if(mbr != null && mbr instanceof Gujikja) System.out.println("현재 구직자로 로그인이 되어있는 상태입니다.");
					else System.out.println("현재 구인회사로 로그인 되어있는 상태입니다.");
						
					break;	
					
				case "5": // 모든 구직자 출력
					ctrl.showAllGujikja(mbrArr);
					break;
					
				case "6": // 모든 구인회사 출력
					ctrl.showAllCompany(mbrArr);
					break;
					
				case "7": // 로그아웃
					 mbr = null;
		             System.out.println(">> 로그아웃 되었습니다. << \n");
		             break;   
					
		          
				case "8": // 내정보 변경하기
					if(mbr == null) System.out.println(">> 먼저 로그인 하셔야 합니다.");
					else if(mbr != null && mbr instanceof Gujikja)
						mbr = ctrl.updateMyInfo(5, sc, mbr);
				    else
				    	mbr = ctrl.updateMyInfo(6, sc, mbr);
	                break;
					
				default:
					break;
				}
			
		} while (!("9".equals(smenuNo)));

		sc.close();
		
		System.out.println("\n~~~~ 프로그램 종료 ~~~~");
		
	}// end of main()-----------------------------

}
