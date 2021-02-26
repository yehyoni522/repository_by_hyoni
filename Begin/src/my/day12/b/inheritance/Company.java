package my.day12.b.inheritance;

import java.text.DecimalFormat;

public class Company extends Member {

// 	Company 클래스는 Member 클래스의 자식 클래스가 되어진다.
//  그러므로 자식 클래스인 Company 에서는 부모 클래스인 Member 에서 선언되어진 것들을 
//  상속받아 사용할 수 있게 된다.	

	// 구인회사
	
	// 올바르게 수정
	
	// field
	private String jobType;  // 회사직종타입(제조업, 서비스업, IT, ....)
	private long seedMoney;  // 자본금 
	
	static int count;  // Company 객체(인스턴스)의 개수를 알아오려는 용도
	
	public String getJobType() {
		return jobType;
	}
	
	public void setJobType(String jobType) {
		
		// jobType 에는 "         " 와 같은 것이 들어올 수 없다.
		if(jobType != null && jobType.trim().isEmpty()) 
			System.out.println(">> 직종명을 올바르게 입력하세요!! <<");
		
		else 
			this.jobType = jobType;
	}
	
	public long getSeedMoney() {
		return seedMoney;
	}
	
	public void setSeedMoney(long seedMoney) {
		// 자본금은 0 보다 커야 한다.
		
		if(seedMoney > 0)
		   this.seedMoney = seedMoney;
		else
		   System.out.println(">> 자본금은 0 보다 커야 합니다. <<");
	}
	
	
	boolean isUseCompany() {
		if( jobType != null && seedMoney > 0 &&
			super.getId() != null && this.getPasswd() != null && getName() != null)
			return true;
		else
			return false;
	}

	// == 메소드의 재정의(method overriding) == //
	// ==> 부모클래스로 상속받은 메소드를 자식 클래스에서 메소드에 들어갈 내용물만 새롭게 만드는 것을 말한다.!!!!! 
	@Override
	public void setName(String name) {
		
		if(name != null && !name.trim().isEmpty() &&
		   2<=name.length() && name.length()<=20 ) {
			super.setCompanName(name);	
		}
		
	}
	
	public void viewInfo() {
		System.out.printf("%-10s\t%-15s\t%-4s\t%-4s\t%-10d\n",getId(),getPasswd(),getName(),getJobType(),getSeedMoney());
	}// end of public void viewInfo()-------------------
	
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#,###");
		String info = "1. 아이디 : " + getId() + "\n"
					 +"2. 암호 : " + getPasswd() + "\n"
					 +"3. 회사명 : " + getName() + "\n"
					 +"4. 업종타입 : " + jobType + "\n"
					 +"5. 자본금 : " + df.format(seedMoney)+"원\n";
		
		return info;
	}
}
