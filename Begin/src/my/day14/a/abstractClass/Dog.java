package my.day14.a.abstractClass;

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
	 public void cry()  { 
	 //메소드 오버라이딩(메소드 재정의)시 접근제한자는 부모 클래스에서 정의된 미완성 메소드(추상 메소드)의 접근제한자와 같거나 넓은 범위를 가져야한다.
		System.out.println("강아지는 '멍멍'하며 짖습니다.");
	}
	 
	public void run() {
		System.out.println(">> 강아지가 빠르게 달립니다. <<");
	}
	
	
	
	
	
}
