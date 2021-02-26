package my.day06.a.FOR;

public class Member {
	
	String id;
	String pwd;
	String name;
	
	boolean alphabetFlag = false, numFlag = false, specialFlag = false;
	
	
	
	boolean checkPwd(String pwd) { 
		
		int length = pwd.length();
		
		if(8 <= length && length <=15) {
			for(int i = 0; i < length; i++) {
				char ch = pwd.charAt(i);
				
				if(Character.isAlphabetic(ch+0)) alphabetFlag = true;
				else if(Character.isDigit(ch)) numFlag = true;
				else specialFlag = true;
			}
			if(alphabetFlag && numFlag && specialFlag) {
				return true;
			} else return false;  
		}else return false;
	}

}
