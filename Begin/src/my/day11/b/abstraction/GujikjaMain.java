package my.day11.b.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaMain {
	
   

   public static void main(String[] args) {
      
      Gujikja[] guArr = new Gujikja[5];
      
      Gujikja gu1 = new Gujikja();
      gu1.userid = "eomjh";
      gu1.passwd = "qwer1234$A";
      gu1.name = "엄정화";
      
   //  boolean bool = MyUtil.isCheckJubun(null);
   //  boolean bool = MyUtil.isCheckJubun("950115");
   //  boolean bool = MyUtil.isCheckJubun("95011512");
   //  boolean bool = MyUtil.isCheckJubun("9501t51");
   //  boolean bool = MyUtil.isCheckJubun("9501155");
   //  boolean bool = MyUtil.isCheckJubun("9513151");
   //  boolean bool = MyUtil.isCheckJubun("9501321");
   //  boolean bool = MyUtil.isCheckJubun("9502301");
       
      String jubun = "9501212";
      
      boolean bool = MyUtil.isCheckJubun(jubun);
   //  System.out.println(bool);
       
       if(bool) {
          gu1.jubun = jubun;
          guArr[0] = gu1;
          
          Gujikja.count++;
       }
      
       // === 아래는 정규표현식(Regular Expression)을 사용하여 검사한 것이다. === 
       //  bool = MyUtil.isCheckJubun2(null);
      //  bool = MyUtil.isCheckJubun2("950115");
      //  bool = MyUtil.isCheckJubun2("95011512");
      //  bool = MyUtil.isCheckJubun2("9501t51");
      //  bool = MyUtil.isCheckJubun2("9501155");
      //  bool = MyUtil.isCheckJubun2("9513151");
             
       // System.out.println(bool);
       
   //   System.out.println("성별 : " + gu1.getGender());
   //   System.out.println("나이 : " + gu1.getAge());
       
      Gujikja gu2 = new Gujikja();
      gu2.userid = "leess";
      gu2.passwd = "qwer1234$B";
      gu2.name = "이순신";
      gu2.jubun = "9710201";
      
      guArr[1] = gu2;
      Gujikja.count++;
      
      Gujikja gu3 = new Gujikja();
      gu3.userid = "youks";
      gu3.passwd = "qwer1234$C";
      gu3.name = "유관순";
      gu3.jubun = "8510202";

      guArr[2] = gu3;
      Gujikja.count++;      
      
      /////////////////////////////////////////////////////
      GujikjaCtrl ctrl = new GujikjaCtrl();
      
      Scanner sc = new Scanner(System.in);
       
      String smenuNo = "";
      
      do {
         
         System.out.println(" === 메인메뉴 === \n"
                        + "1.구직자 회원가입   2.구직자 모두 보기 3.검색  4.프로그램 종료 \n");
         
         System.out.print("▷ 검색메뉴번호 선택 => "); 
         smenuNo = sc.nextLine();
         
         switch (smenuNo) {
            case "1": // 구직자 회원가입 
               Gujikja gujikja = ctrl.register(sc, guArr);
               guArr[Gujikja.count++] = gujikja;
               System.out.println(">> 회원가입 성공!! \n");
               break;
   
            case "2": // 구직자 모두 보기
               ctrl.showAll(guArr);
               break;
            case "3": //검색 메뉴를 보여주도록 호출
            	searchMenu(sc, ctrl, guArr);
            default:
               break;
            }
      } while (!("4".equals(smenuNo)));

      sc.close();
      
      System.out.println("\n~~~~ 프로그램 종료 ~~~~");
      
   }// end of main()-------------------------------
 
static void searchMenu(Scanner sc, GujikjaCtrl ctrl,Gujikja[] guArr) {
	   
	   String sMenoNo = "";
	   do {
		   System.out.println(" === 검색 메뉴 === \n"
				   			+ "1.연령대 검색 2.성별 검색 3.연령대 및 성별 검색 4.메인으로 돌아가기\n");
		   System.out.print("▷검색메뉴번호 선택 => ");
		   sMenoNo = sc.nextLine();
	       
	       switch(sMenoNo) {
		         case "1": //연령대 검색
		        	 System.out.print("▷ 연령대 => ");
		        	 String sageline = sc.nextLine();
		        	 int ageline = Integer.parseInt(sageline); 
		        	 
		        	 ctrl.showByageline(guArr,Gujikja.count,ageline);
		        	 
		        	 break;
		         case "2": //성별 검색
		        	 System.out.print("▷ 성별(여 or 남으로 검색) => ");
		        	 String findGender = sc.nextLine();
		        	 
		        	 ctrl.showByGender(guArr, Gujikja.count, findGender);
		        	 
		        	 break;
		         case "3":
		        	 System.out.print("▷ 연령대 => ");
		        	 sageline = sc.nextLine();
		        	 ageline = Integer.parseInt(sageline); 
		        	 
		        	 System.out.print("▷ 성별(여 or 남으로 검색) => ");
		        	 findGender = sc.nextLine();
		        	 
		        	 ctrl.showByAgeGen(guArr, Gujikja.count, ageline, findGender);
		        	 
		        	 break;
		         default:
		        	 
		        	break;
	       }
	   } while(!("4".equals(sMenoNo)));
	   
   }//end of searchMenu----------------

}