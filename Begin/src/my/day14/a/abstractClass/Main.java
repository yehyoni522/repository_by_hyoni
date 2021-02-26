package my.day14.a.abstractClass;

public class Main {

	// == 미완성 클래스 ==
	// 미완성 클래스는 스스로 객체생성(인스턴스화)는 불가하지만 일반적인 자식클래스로 생성된 객체를 저장하는 용도로는 사용이 가능하다.
	
	
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
		
		/*
		 * Animal ani = new Animal(); 
		 * //Animal은 미완성 클래서(=추상 메소드, abstract class) 이므로
		 * //Animal을 사용하여 객체(instance)를 생성할 수 없다. 
		 * ani.cry();
		 */
		
		for(int i = 0; i < aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].showInfo();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i = 0; i < aniArr.length; i++) {
			if(aniArr[i] != null)
				aniArr[i].cry();
		}
		
		
		
	}

}
