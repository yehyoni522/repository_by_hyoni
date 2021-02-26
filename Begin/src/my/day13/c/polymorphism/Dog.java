package my.day13.c.polymorphism;

public class Dog extends Animal{
	
	//Dog만 가지는 field 정의
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	
	//Dog만 가지는 method 정의
	@Override
	public void showInfo() {
		System.out.println("=== 강아지 정보 == \n"
						+ "1. 이름 : " + getName() + "\n"
						+ "2. 생년 : " + getBirthYear() + "년\n"
						+ "3. 몸무게 : " + weight + "kg\n");
		
	}	
	
	@Override
	public void cry() {
		System.out.println("강아지는 '멍멍'하며 짖습니다.");
	}
	
	public void run() {
		System.out.println(">> 강아지가 빠르게 달립니다. <<");
	}
	
	
	
	
	
}
