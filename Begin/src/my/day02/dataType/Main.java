package my.day02.dataType;

public class Main {

	public static void main(String[] args) {
		
		Sungjuk lssSj = new Sungjuk();
		lssSj.hakbun = "001234";
		lssSj.name = "이순신";
		lssSj.kor = 68;
		lssSj.eng = 95;
		lssSj.math = 100;
		
		Sungjuk eomSj = new Sungjuk();
		eomSj.hakbun = "109876";
		eomSj.name = "엄정화";
		eomSj.kor = 78;
		eomSj.eng = 88;
		eomSj.math = 95;
		
		lssSj.showSungjuk();
		System.out.println("~~~~~~~~~~~~~~~~~");
		eomSj.showSungjuk();
		
		/*
		 * System.out.println("5/2 => " + 5/2); 
		 * System.out.println("5/2.0 => " + 5/2.0);
		 * System.out.println("5.0/2 => " + 5.0/2); 
		 * System.out.println("5.0/2.0 => " + 5.0/2.0);
		 * 
		 * System.out.println("5%2 => " + 52);
		 */



		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("lssSj => " + lssSj);
		//lssSj => my.day02.dataType.Sungjuk@15db9742
		//@ 뒤의 숫자는 메모리 상의 주소를 뜻한다.
		System.out.println("eomSj => " + eomSj);
		//eomSj => my.day02.dataType.Sungjuk@6d06d69c
		
		Sungjuk hongSj = new Sungjuk();
		System.out.println("hongSj => " + hongSj);
		//hongSj => my.day02.dataType.Sungjuk@7852e922
		
		hongSj = eomSj;
		System.out.println("hongSj =>" + hongSj);
		//hongSj =>my.day02.dataType.Sungjuk@6d06d69c
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		
		hongSj.name = "EomJungHwa";
		eomSj.showSungjuk();

	}

}
