package my.day09.b.array;

import java.util.Random;

public class LottoMain2 {

	public static void main(String[] args) {
		
		int[] ballArr = new int[45];
		int[] tempArr = new int[5]; // 랜덤하게 뽑은 배열의 방번호를 기억하는 저장소
		
		for(int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i+1;
			}
		
		for(int i = 0; i < tempArr.length; i++) {
			tempArr[i] = -1;
			}
		
		//공의 방번호를 꺼내는 작업을 6번 반복
		//0번 방부터 44번방까지 랜덤하게 6번 봅아야한다.
		
		Random rnd = new Random();
		String result = "";
		
		outer:
		for(int i = 0; i < 6; i++) {
			int idx = rnd.nextInt(44 - 0 + 1) + 0;
			
			for(int j = 0; j < tempArr.length; j++) {
				if(idx == tempArr[j]) {
					//새로 뽑은 것과 기존에 뽑았던 숫자가 같다면
					//0~44 중에 새로이 또 뽑아야 한다.
					i--;
					continue outer;
				}
			}
				if(i < 5) {
					tempArr[i] = idx;
				}
				
				String comma = (i < 5) ? "," : "";
				result += ballArr[idx] + comma;
				
			
			
		}

		System.out.println("로또 당첨 번호 : " + result);
		
	}

}
