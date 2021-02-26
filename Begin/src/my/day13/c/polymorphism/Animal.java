package my.day13.c.polymorphism;

public class Animal {
	/*
	   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
	   ----------------------------------------------------------------------------------------------------------------------- 
	   public                                    O                    O                         O                 O  
	   protected                                 O                    O                         O                 X
	   default                                   O                    O                         X                 X
	   private                                   O                    X                         X                 X
	*/

	
	//Dog, Cat, Duck 의 공통 field
	private String name;
	private int birthYear;
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		if(name != null && !name.trim().isEmpty())
			this.name = name;
	}
	protected int getBirthYear() {
		return birthYear;
	}
	protected void setBirthYear(int birthYear) {
		if(birthYear > 0)
			this.birthYear = birthYear;
	}
	
	public void showInfo() {
		System.out.println("=== 동물 정보 == \n"
						+ "1. 이름 : " + name + "\n"
						+ "2. 생년 : " + birthYear + "년\n");
		
	}
	public void cry() {
		System.out.println(">>> 동물들이 소리를 냅니다.");
		
	}	

}
