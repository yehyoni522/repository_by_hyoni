package my.day11.b.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {

   // == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 ==  
   Gujikja register(Scanner sc, Gujikja[] guArr) {
      
      String userid = null;
      String passwd = null;
      String name = null;
      String jubun = null;
      
      boolean useridFlag;
      
      do {
         useridFlag = false;
         
         System.out.print("1. 아이디 : ");
         userid = sc.nextLine(); 
         
         // == 중복아이디 검사하기 == //
         for(int i=0; i< Gujikja.count; i++) {
            if( userid.equals(guArr[i].userid) ) {     
               System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
               useridFlag = true;
               break;
            }
         }// end of for---------------------
         
      } while (useridFlag);
      
      ////////////////////////////////////////////
      
      do {
         System.out.print("2. 암호 : ");
         passwd = sc.nextLine();
         
         if( !MyUtil.isCheckPasswd(passwd) ) 
            System.out.println(">> 암호는 8글자 이상 15글자 이하의 대,소문자 및 숫자, 특수기호가 혼합되어야 합니다.\n");   
         
         else 
            break;
         
      } while(true);
      
      ////////////////////////////////////////////
      
      System.out.print("3. 성명 : ");
      name = sc.nextLine();
      
      ////////////////////////////////////////////
      
      do {
         System.out.print("4. 주민번호 앞의 7자리만 : ");
         jubun = sc.nextLine();
         
         if (!MyUtil.isCheckJubun(jubun)) 
            System.out.println(">> 주민번호 7자리를 올바르게 넣으세요!! << \n");
         
         else 
            break;
         
      } while(true);
      
      /////////////////////////////////////////////
      
      Gujikja gu = new Gujikja();
      gu.userid = userid;
      gu.passwd = passwd;
      gu.name = name;
      gu.jubun = jubun;
      
      return gu;
   }// end of Gujikja register(Scanner sc)-----------
   
   
	// == 구직자의 정보를 모두 보여주는 메소드 생성하기 == 
	   void showAll(Gujikja[] guArr) {
	      
	      System.out.println("------------------------------------------------------");
	      System.out.printf("%-13s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
	      System.out.println("------------------------------------------------------");
	      
	      for(int i=0; i<Gujikja.count; i++) {
	         
	      //   guArr[i].showInfo();
	         guArr[i].viewInfo();
	         
	      }// end of for-----------------------
	      
	      System.out.print("\n");
	      
	   }// end of void showAll(Gujikja[] guArr)----------
	   
	   void showByageline(Gujikja[] guArr, int gucount ,int ageline) {
		      System.out.println("------------------------------------------------------");
		      System.out.printf("%-13s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		      System.out.println("------------------------------------------------------");
		      
		   boolean flag = false;
		   
		   for(int i = 0; i < gucount; i++) {
			  int storedAge = (guArr[i].getAge() / 10) * 10;
			  
			  if(storedAge == ageline) {
				  flag = true;
				  guArr[i].viewInfo();
			  }
		   }
		   
		   if(!flag) {
			   System.out.println("검색하신 연령대 " + ageline +"대는 없습니다.");
		   }
		   
		   System.out.println("");
		   
	   } //end of void showByageline(Gujikja[] guArr, int ageline)
	   
	   void showByGender(Gujikja[] guArr, int gucount ,String gender) {
		      System.out.println("------------------------------------------------------");
		      System.out.printf("%-13s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		      System.out.println("------------------------------------------------------");		    
		   
		   boolean flag = false;
		   
		   for(int i = 0; i < gucount; i++) {
			   
			   if(guArr[i].getGender().equals(gender)) {
				   flag = true;
				   guArr[i].viewInfo();
			   }else flag = false;

		   }
		   
		   if(!flag) {
			   System.out.println("검색하신 성별 " + gender +"은 없습니다.");
		   }
		   
		   System.out.println("\n");
	   }
	   
	   void showByAgeGen(Gujikja[] guArr, int gucount, int ageline, String gender) {
		   
		      System.out.println("------------------------------------------------------");
		      System.out.printf("%-13s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		      System.out.println("------------------------------------------------------");
		      
		   boolean flag = false;
		   
		   for(int i = 0; i < gucount; i++) {
			  int storedAge = (guArr[i].getAge() / 10) * 10;
			  if(storedAge == ageline) {
				  if(guArr[i].getGender().equals(gender)) {
				  flag = true;
				  guArr[i].viewInfo();
				  }
			  }
		   }
		   
		   if(!flag) {
			   System.out.println("검색하신 연령대 " + ageline +"대에는 " +gender+"성이 없습니다.");
		   }
		   
		   System.out.println("");
		   
	   }
	      
	     
   }// end of GujikjaCtrl----------
   
   
   
