package my.day12.a.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Gujikja {
	
	/*
	   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	   ----------------------------------------------------------------------------------------------------------------------- 
	   public                                    O                    O                         O                 O  
	   protected                                 O                    O                         O                 X
	   default                                   O                    O                         X                 X
	   private                                   O                    X                         X                 X
	*/
	
	//field
	
	private String userid;     // 아이디
	private String passwd;     // 암호
	private String name;       // 성명
	private String jubun;      // 주민번호 앞의 7자리 까지만   
	                   // 예: "9501151"  남자   "0105103"  남자
	                   // 예: "9501152"  여자   "0105104"  여자
	
	
	static int count; //Gujikja 객체의 개수를 알아오려는 용도
	
	//method
	public void setUserid(String userid) {
		//아이디 글자수가 5글자 이상 10글자 이하
		
		int len = userid.length();
		
		if( 5 <= len && len <= 10) {
			this.userid = userid;
		}else System.out.println(">> 아이디는 5글자 이상 10글자 이하여야 합니다 <<");
		
	}
	
	public void setPasswd(String passwd) {
		
		boolean bool = MyUtil.isCheckPasswd(passwd);
		
		if(bool) {
			this.passwd = passwd;
		}else System.out.println("암호는 8글자 이상 15글자 이하의 대,소문자와 숫자,특수기호를 포함해야합니다.");
		
	}
	
	public void setName(String name) { 
		
		if(name == null) {
			System.out.println("성함은 공백없이 한글로 2-5글자만 가능합니다.");
			return;
		}
		
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");
		Matcher m = p.matcher(name);
		
		boolean b = m.matches();
		if(b) this.name = name;
		else System.out.println("성함은 공백없이 한글로 2-5글자만 가능합니다.");
	}
	
	public void setJubun(String jubun) {
		
		boolean bool = MyUtil.isCheckJubun(jubun);
		
		if(bool) this.jubun = jubun;
		else System.out.println("주민번호 앞의 7자리가 올바르지 않습니다.");
		
	}
	
	

	//userid, passwd, name, jubun field의 값이 모두 null이 아닐 경우
	//true를 리턴해주고, 적어도 1개 이상이 null이라면 false를 리턴해주는 메소드를 생성한다.
	public boolean isUseGujikja() {
		if(userid != null && passwd != null &&
		   name != null && jubun != null) return true;
		else return false;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getUserid() {
		return userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getJubun() {
		return jubun;
	}

}
