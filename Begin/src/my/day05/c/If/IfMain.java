package my.day05.c.If;

public class IfMain {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		if( n1 == n2) {
			System.out.println(n1 + " 은 " + n2 + "와 같습니다.");
		} else System.out.println(n1 + " 은 " + n2 + " 와 같지 않습니다.");

		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		
		String name1 = "이순신"; //데이터 비교
		String name2 = "엄정화";
		
		if(name1 == name2) System.out.println(name1 + " 은" + name2 +" 와 같습니다." );
		else System.out.println(name1 + " 은" + name2 +" 와 같지 않습니다." );
		
		String name3 = new String("강감찬"); //메모리 주소 비교
		String name4 = new String("이감찬");
		
		if(name1 == name2) System.out.println(name3 + " 은 " + name4+" 와 같습니다." );
		else System.out.println(name3 + " 은 " + name4 +" 와 같지 않습니다." );
		
		System.out.println("===============================");
		
		if(name3.equals(name4))System.out.println(name3 + " 은" + name4+" 와 같습니다." );
		else System.out.println(name3 + " 은  " + name4 +" 와 같지 않습니다." );
		
	}

}
