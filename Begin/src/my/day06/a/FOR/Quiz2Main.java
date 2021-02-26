package my.day06.a.FOR;

public class Quiz2Main {

	public static void main(String[] args) {
		
		String word = "sup3er007Man";
		String str = "";
		//최초로 숫자가 나오는 곳의 앞까지 문자열 출력 => super
		//최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> 5
		int cnt = 0;
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
				if(Character.isDigit(ch)) break;
				else {
					if (Character.isAlphabetic(ch)) {
						cnt += 1;
						str += ch;
					}
				}
		}
		System.out.println("최초로 숫자가 나오는 곳의 앞까지 문자열 출력 => " + str);
		System.out.println("최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> " + cnt);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("알파벳 소문자를 출력하는 데 아래처럼 나타내도록 하세요.");
		
		String str1 = "";
		for(int i = 'a'; i <= 'z'; i+=2) {
			if(i < 'y') {
				str1 += (char)i + ",";
			}else str1 += (char)i;
		}
		
		System.out.println(str1);
		
		
		
		
}
}