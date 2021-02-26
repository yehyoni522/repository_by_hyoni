package my.day14.a.abstractClass;

//abstract public class Animal {
// 또는
public abstract class Animal { // 미완성 클래스 (=추상 메소드, abstract class) 	
/*
	미완성 메소드 (=추상 메소드, abstract method)가 있는 클래스는 반드시 미완성 클래스 (=추상 메소드, abstract class)로 만들어야한다.
	왜 미완성 메소드 (=추상 메소드, abstract method) 만들어야 하나?
	-> 자식클래스에서 메소드를 오버라이딩(Override, 재정의)를 하기 때문에
	-> 부모클래스에서는 메소드를 정의 할 필요가 없으므로 미완성 메소드로 만들어 버린다.
	
	일반적으로 부모클래스를 미완성클래스(=추상 메소드, abstract class)로 만든다.
	미완성 클래스(=추상 메소드, abstract class)를 사용하여 객체(instance)를 생성할 수 없다. new class(); <- 이런 식으로 사용 불가
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
	
	//abstract public  void cry();
	//또는 
	abstract void cry(); // 미완성 메소드 (=추상 메소드, abstract method) 	
	// 미완성 메소드 (=추상 메소드, abstract method)는 자식 클래스에서 '무조건' 재정의(Override)를 꼭 해주어야만 한다.
	

}
