package my.day12.a.encapsulation;

public class GujikjaMain {

	public static void main(String[] args) {
		
		Gujikja[] guArr = new Gujikja[5];
		
		Gujikja gu1 = new Gujikja();
		gu1.setUserid("hongkd");
		gu1.setPasswd("qwer1234$A");
		gu1.setName("홍길동");
		gu1.setJubun("9501222");
		if(gu1.isUseGujikja()) guArr[0] = gu1;
		
		Gujikja gu2 = new Gujikja();
		gu2.setUserid("eomjh");
		gu2.setPasswd("qwer1234$B");
		gu2.setName("엄정화");
		gu2.setJubun("9501211");
		if(gu2.isUseGujikja()) guArr[1] = gu2;
		
		for(int i = 0; i < guArr.length; i++) {
			if(guArr[i] != null)
			System.out.println(guArr[i].getName());
		}

	}//end of Main=================

}
