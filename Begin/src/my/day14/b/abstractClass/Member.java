package my.day14.b.abstractClass;


import my.util.MyUtil;

public abstract class Member {

	// Gujikja 클래스와 Company 클래스가 공통으로 가져야 하는 field 생성 
	private String id;      // 아이디(5글자 이상 10글자 이하까지만 사용가능함)
	private String passwd;  // 암호 
	private String name;    // 이름(회사명, 개인성명)
	
	static int count; //자식 클래스인 Gujikja 객체와 Company 객체의 갯수를 알아오려는 용도
	
	
	// Gujikja 클래스와 Company 클래스가 공통으로 가져야 하는 method 생성
	//public String getId() {
	protected String getId() {
		return id;
	}
	
	//public String setId(String id) {
	protected void setId(String id) {
		
		if(id != null && !id.trim().isEmpty() &&
		   5 <= id.length() && id.length() <= 10 )
		   this.id = id;
		else
		   System.out.println(">> 아이디는 공백만으로는 불가합니다. \n"
		   		            + " 또한 5글자 이상 10글자 이하까지만 가능합니다.<<");
		
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {

		boolean bool = MyUtil.isCheckPasswd(passwd);
		
		if(bool) 
			this.passwd = passwd;
		
		else 
			System.out.println(">> 암호는 8글자 이상 15글자 이하의 영대,소문자 및 숫자, 특수문자가 혼합되어야 합니다. <<");
	}
	
	
	public String getName() {
		return name;
	}
	
	public abstract void setName(String name);
	
	public void saveName(String name) {
		this.name = name;
	}
	
	public void setCompanName(String name) {
		this.name = name;
	}
	
	///////////////////////////////////////
	// 자식클래스인 Gujikja와 Company에서 showInfo()를 상속받아 사용하는데
	// 보여주는 내용물이 Gujikja와 Company는 서로 다르다.
	// 그러므로 부모클래스인 Member에서는 showInfo() 메소드를 정의할 필요가 없다.
	// 반드시 자식클래스인 Gujikja 와 Company에서는 showInfo() 재정의를 꼭 해주어야 한다.
	// 그러므로 부모클래스인 Member에서는 showInfo() 메소드를 미완성(추상)메소드로 만들어야 한다.
	public abstract String showInfo();
	
	public abstract boolean isUse();

	public abstract void viewInfo();
	
	
	
}
