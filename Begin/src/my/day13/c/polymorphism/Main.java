package my.day13.c.polymorphism;

public class Main {

	//다형성(Polymorphism) : 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술 
	//자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(polymorphism)이다
	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog();
		//Dog dg = new Dog();
		//Animal ani1 = new Dog();
		dog.setName("뽀삐");
		dog.setBirthYear(2010);
		dog.setWeight(5);
		
		aniArr[0] = dog;
		
		Cat cat = new Cat();
		//cat c = new Cat();
		//Animal ani2 = new Cat();
		cat.setName("톰");
		cat.setBirthYear(2017);
		cat.setColor("검은");
		
		aniArr[1] = cat;
		
		Duck duck = new Duck();
		//Duck dc = new Duck();
		//Animal ani3 = new Duck();
		duck.setName("도널드");
		duck.setBirthYear(2018);
		duck.setPrice(5000);
		
		aniArr[2] = duck;
		
		for(int i = 0; i < aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].showInfo();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i = 0; i < aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].cry();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i = 0; i < aniArr.length; i++) {
			if(aniArr[i] != null) {
				if(aniArr[i] instanceof Dog) 
					//aniArr[i] 저장소에 들어있는 instance(객체)가 Dog라는 클래스로 만든 instance(객체)인지를 묻는다.
					((Dog)aniArr[i]).run();
				else if(aniArr[i] instanceof Cat) 
					((Cat)aniArr[i]).jump();
				else if(aniArr[i] instanceof Duck)
					((Duck)aniArr[i]).swim();
			}
		}
		
		
	}

}
