package my.day05.d.SWITCH;

public class Test {

	public static void main(String[] args) {
		
		int n = 3;
		String name = "";
		//int를 string으로 바꾸는 방법 2가지
		String strn = Integer.toString(n);
		String strn2 = String.valueOf(n);
		
		if ( n > 5 ) {
			name = "이순신";
		}
		else {
			name = "엄정화";
		}
		
		String irum = (n > 5) ? "이순신" : "엄정화";
		
		System.out.println(strn);
		System.out.println(strn2);
		System.out.println(irum);

	}

}
