package my.day05.d.SWITCH;

public class Sungjuk {
	
	String hakbun;
	String name;
	int kor;
	int eng;
	int math;
	
	int total() {
		return kor + eng + math;
	}
	
	float avg() {
		return total() / 3.0F;
	}
	
	String grade() {
		
		String result;
		
		switch((int) avg() / 10) { //괄호 속에는 String, byte, short, int, char 만 들어올 수 있다.
		
		case 10:
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
			break;
		}
		
		return result;
	}
	

	String gift() {
		
		String gift = "";
		
		switch(grade()) {
			case "A":
				gift += "놀이공원이용권, ";
			case "B":
				gift += "치킨, ";
			case "C":
				gift += "피자, ";
			case "D":
				gift += "아이스크림";
				break;
			default:
				gift += "꿀밤 세 대--^";
				break;
		}
		return gift;
	}
		
	}



