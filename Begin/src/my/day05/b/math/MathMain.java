package my.day05.b.math;

public class MathMain {

	public static void main(String[] args) {
		
		double db1 = 93.45678, db2 = 86.87654;
		
		System.out.println("=== 반올림 하기 전 ===");
		System.out.println("db1 => " + db1 + ", db2 => " + db2);
		
		
		// Math.round(실수) ==> 입력한 실수의 정수 일의자리까지만 보여주고 나머지 소수부는 반올림하면서 삭제된다. 
	    //                 ==> 93.45678    소수부 첫번째 자리는 4이므로 반올림이 안된다. 즉, 93 이 된다.
	    //                 ==> 86.87654    소수부 첫번째 자리는 8이므로 반올림이 된다. 즉, 87 이 된다.
		
		System.out.println("\n=== 반올림 한 후 ===");
		System.out.println("db1 => " + Math.round(db1) + ", db2 => " + Math.round(db2));

		// == 특정 소수부 자리에서 반올림을 하고자 한다. ==
	    // db1 => 93.45678  ==> 93.5
	    // db2 => 86.87654  ==> 86.9
		
		System.out.println("db1 => " + Math.round(db1*10)/10.0 + ", db2 => " + Math.round(db2*10)/10.0);
		System.out.println("db1 => " + Math.round(db1*100)/100.0 + ", db2 => " + Math.round(db2*100)/100.0);

		
		double db3 = 54.0, db4 = 54.1, db5 = 54.9;
		System.out.println("\n===올림 한 후 ===");
		System.out.println("db3 => " + Math.ceil(db3) + ", db4 => " + Math.ceil(db4) + ", db5 => " + Math.ceil(db5));
		
		System.out.println("db3 => " + (int)Math.floor(db3) + ", db4 => " + (int)Math.floor(db4) + ", db5 => " + (int)Math.floor(db5));
		
		int a = 20, b = -30;
		System.out.println("a => " + a + ", b => " + b);
		System.out.println("a => " + Math.abs(a) + ", b => " + Math.abs(b));
		
		
		
		
	}

}
