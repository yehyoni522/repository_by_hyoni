package my.day04.b.scanner;

public class Sungjuk {
	
	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;
	
	short age;

	boolean checkJumsu(byte jum) {
		
		if(0 <= jum && jum <= 100) {
			return true;
		}
		
		else {
			System.out.println(" 점수 입력은 0 ~ 100까지만 가능합니다.");
			return false;
		}
	}
	
	boolean checkAge(short age) {
		
		if(20 <= age && age <= 50) {
			return true;
		}
		
		else {
			System.out.println(" 나이 입력은 25 ~ 50까지만 가능합니다.");
			return false;
		}
	}
	
	String showInfo(String hakbun, String name, byte kor, byte eng, byte math, short age) {
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
		char grade = 0;
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else if(avg >= 60) grade = 'D';
		else grade = 'F';
		
		return " === 이순신님의 성적결과 ===\n" + "1. 학번 : " + hakbun +"\n"
				+ "2. 이름: " + name +"\n"
				+ "3. 국어 : " + kor +"\n"
				+ "4. 영어 : " + eng +"\n"
				+ "5. 수학 : " + math +"\n"
				+ "6. 나이 : " + age +"\n"
				+ "7. 총점 : " + sum +"\n"
				+ "8. 평균 : " + Math.round(avg*10)/10.0 +"\n"
				+ "9. 학점 : " + grade +"\n";
		
		
	}
	
}
