package my.day18.b.ENUM;

public class EnumMain_2 {

	public static void main(String[] args) {
		
		// 모든 enum(열거형)은 추상 클래스 Enum 의 자손이다. 
	    // 즉, enum(열거형)의 조상은 java.lang.Enum 클래스이다.
	    // 그러므로 enum(열거형)타입은 클래스이며 java.lang.Enum 클래스에서 정의되어진 메소드들을 사용할 수 있게 된다.
			
		
		SeasonType_1[] seasonArr = SeasonType_1.values();
		//value() 메소드는 enum의 모든 상수를 배열에 담아 반환해주는 것이다.
		
		System.out.println("1.~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(SeasonType_1 season : seasonArr) {
			String seasonName = season.name();
			//name()메소드는 enum(열거형) 상수의 값을 문자열(String)로 반환해주는 것이다.
			System.out.println(seasonName);
		}
		
	}

}
