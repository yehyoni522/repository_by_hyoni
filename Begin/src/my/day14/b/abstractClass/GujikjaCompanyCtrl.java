package my.day14.b.abstractClass;

import java.util.Scanner;

public class GujikjaCompanyCtrl {

	// == 구직자(Gujikja) 및 구인회사(Company) 신규 회원가입을 해주는 메소드 생성하기 ==  
	
	public Member register(int n, Scanner sc, Member[] mbrArr) {
		
		Member mbr = null;
		
		if(n == 1) { //Gujikja 신규 회원가입
			
			mbr = new Gujikja();
			
			do {
			System.out.print("1. 아이디 : ");
			String id = sc.nextLine(); 
			
			mbr.setId(id);
			id = mbr.getId();
			
			if(id != null) { 
                			
				// == 등록되어진 구직자 중에서 중복아이디 검사하기 == //
				boolean idFlag = false;
				
				for(int i=0; i<Member.count; i++) {
					if( mbrArr[i] instanceof Gujikja && id.equals(mbrArr[i].getId()) ) {     
						System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
						idFlag = true;
						break;
					}
				}// end of for---------------------
				
				if(!idFlag)
					break;
			}
			
		} while (true);
		
		////////////////////////////////////////////
		
		do {
			System.out.print("2. 암호 : ");
			String passwd = sc.nextLine();
			
			mbr.setPasswd(passwd);
			passwd = mbr.getPasswd();
			
			if(passwd != null) 
				break;
			
		} while(true);
		
		////////////////////////////////////////////
		
		do {
			System.out.print("3. 성명 : ");
			String name = sc.nextLine();
			
			mbr.setName(name);
			name = mbr.getName();
			
			if(name != null)
			   break;
			
		} while(true);
		
		////////////////////////////////////////////
		
		do {
			System.out.print("4. 주민번호 앞의 7자리만 : ");
			String jubun = sc.nextLine();
			
			((Gujikja)mbr).setJubun(jubun);
			jubun = ((Gujikja)mbr).getJubun();
			
			if(jubun != null) 
				break;
			
		} while(true);
			
		} else { //Company 신규 회원가입
			
			mbr = new Company();
			
			do {
				System.out.print("1. 아이디 : ");
				String id = sc.nextLine(); 
				
				mbr.setId(id);
				id = mbr.getId();
				
				if(id != null) { 
	                			
					// == 중복아이디 검사하기 == //
					boolean idFlag = false;
					
					for(int i=0; i<Member.count; i++) {
						if( mbrArr[i] instanceof Company && id.equals(mbrArr[i].getId()) ) {     
							System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
							idFlag = true;
							break;
						}
					}// end of for---------------------
					
					if(!idFlag)
						break;
				}
				
			} while (true);
			
			////////////////////////////////////////////
			
			do {
				System.out.print("2. 암호 : ");
				String passwd = sc.nextLine();
				
				mbr.setPasswd(passwd);
				passwd = mbr.getPasswd();
				
				if(passwd != null) 
					break;
				
			} while(true);
			
			////////////////////////////////////////////
			
			do {
				System.out.print("3. 회사명 : ");
				String name = sc.nextLine();
				
				mbr.setName(name);
				name = mbr.getName();
				
				if(name != null)
				   break;
				
			} while(true);
			
			////////////////////////////////////////////
			
			do {
				System.out.print("4. 회사직종타입 : ");
				String jobType = sc.nextLine();
				
				((Company)mbr).setJobType(jobType);
				jobType = ((Company)mbr).getJobType();
				
				if(jobType != null) 
					break;
				
			} while(true);
			
			/////////////////////////////////////////////
			
			do {
				System.out.print("5. 자본금 : ");
				String sseedMoneny = sc.nextLine();
				
				((Company)mbr).setSeedMoney(Long.parseLong(sseedMoneny));
				long seedMoneny = ((Company)mbr).getSeedMoney();
				
				if(seedMoneny > 0) 
					break;
				
			} while(true);
			
		}
		return mbr;
	}// end of public Member register(int n, Scanner sc, Gujikja[] guArr)-------
	
	
	// == 구직자의 정보를 모두 보여주는 메소드 생성하기 == 
	public void showAllGujikja(Member[] mbrArr) {
		
		System.out.println("------------------------------------------------------");
		System.out.printf("%-10s\t\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("------------------------------------------------------");
		
		for(int i=0; i<Member.count; i++) {
			if(mbrArr[i] instanceof Gujikja)
				mbrArr[i].viewInfo();
			
		}// end of for-----------------------
		
		System.out.print("\n");
		
	}// end of public void showAllGujikja(Gujikja[] guArr)----------
	
	
	// == 구인회사의 정보를 모두 보여주는 메소드 생성하기 == 
	public void showAllCompany(Member[] mbrArr) {
		
		System.out.println("------------------------------------------------------");
		System.out.printf("%-10s\t\t%-15s\t%-4s\t%-4s\t%-10s\n","아이디","암호","회사명","업종","자본금");
		System.out.println("------------------------------------------------------");
		
		for(int i=0; i<Company.count; i++) {
			if(mbrArr[i] instanceof Company)
				mbrArr[i].viewInfo();
			
		}// end of for-----------------------
		
		System.out.print("\n");
		
	}// end of public void showAllCompany(Company[] coArr)----------

	// 구직자 및 구인회사로 로그인 하는 메소드 생성하기
	public Member login(int n, Scanner sc, Member[] mbrArr) {
		
		Member mbr = null;
		
		System.out.print("\n>아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("\n>암호 : ");
		String passwd = sc.nextLine();
		
		for(int i = 0; i < Member.count; i++) {
			
			if(n == 3 && mbrArr[i] instanceof Gujikja) {
				//구직자로 로그인
				if(id.equals(mbrArr[i].getId()) && passwd.equals(mbrArr[i].getPasswd())) {
					mbr = mbrArr[i];
					break;
				}
			} else if(n == 4 && mbrArr[i] instanceof Company){
				//구인회사로 로그인
				if(id.equals(mbrArr[i].getId()) && passwd.equals(mbrArr[i].getPasswd())) {
					mbr = mbrArr[i];
					break;
				}
			}
			
		}		
		if(mbr == null) System.out.println(">> 로그인 실패!! <<");
		else System.out.println(">> 로그인 성공 <<");

		return mbr;
	}


	//구직자의 내 정보 변경하기
	// 메소드 오버로딩 Method Overloading
	//파라미터(매개변수)의 갯수 또는 파라미터의 종류 또는 파라미터의 순서가 다르면
	//메소드의 이름은 같지만 전혀 다른 메소드로 취급을 한다.
	//이 때 주의할 것은 리턴타입은 뭐가 오든 관계가 없다는 것이다.
	public Member updateMyInfo(int n, Scanner sc, Member mbr) {
				
		System.out.println("\n 내 정보 변경하기");
		
		System.out.println(mbr.showInfo());
		
		if(n == 5) {
			do {
			System.out.print("> 암호 변경 => ");
			String newPasswd = sc.nextLine();
			
			mbr.setPasswd(newPasswd);
			String passwd = mbr.getPasswd();
			
			if(newPasswd.equals(passwd)) break;
			
		} while(true);
			
			do {
			System.out.print("> 성명 변경 => ");
			String newName = sc.nextLine();
			
			mbr.setName(newName);
			String name = mbr.getName();
			
			if(newName.equals(name)) break;
			
		} while(true);
		
		do {
			System.out.print("> 주민번호 변경 => ");
			String newJubun = sc.nextLine();
			
			((Gujikja)mbr).setJubun(newJubun);
			String jubun = ((Gujikja)mbr).getJubun();
			
			if(newJubun.equals(jubun)) break;
			
		} while(true);
		
		System.out.println("");
		} else {
			do {
				System.out.print("> 암호 변경 => ");
				String newPasswd = sc.nextLine();
				
				mbr.setPasswd(newPasswd);
				String passwd = mbr.getPasswd();
				
				if(newPasswd.equals(passwd)) break;
				
			} while(true);
			
			do {
				System.out.print("> 회사명 변경 => ");
				String newName = sc.nextLine();
				
				mbr.setName(newName);
				String name = mbr.getName();
				
				if(newName.equals(name)) break;
				
			} while(true);
			
			do {
				System.out.print("> 직종 변경 => ");
				String newJobType = sc.nextLine();
				
				((Company)mbr).setJobType(newJobType);
				String jobType = ((Company)mbr).getJobType();
				
				if(newJobType.equals(jobType)) break;
				
			} while(true);
			
			/////////////////////////////////////////////
			
			do {
				System.out.print("> 자본금 금액 변경 => ");
				String NewSeedMoney = sc.nextLine();
				
				long newSeedMoney = Long.parseLong(NewSeedMoney);
				
				((Company)mbr).setSeedMoney(Long.parseLong(NewSeedMoney));
				long seedMoney = ((Company)mbr).getSeedMoney();
				
				if(seedMoney > 0 && newSeedMoney == seedMoney) break;
				
			} while(true);
			
			System.out.println("");
		}
		
		if(mbr == null) System.out.println(">> 변경 실패 <<");
		System.out.println(">> 변경 완료 <<");
		
		return mbr;
	}
	
	
}
