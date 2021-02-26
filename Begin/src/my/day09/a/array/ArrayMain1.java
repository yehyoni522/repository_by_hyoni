package my.day09.a.array;

public class ArrayMain1 {

	public static void main(String[] args) {
		
		/*
		 	=== 배열 (array)이란?
		 	동일한 데이터타입을 가지는 여러 개의 데이터를 저장할 수 있는 데이터 타입을 말한다.
		 	그리고 배열 또한 객체라는 것을 꼭 기억하도록 하자.
		 */
		
		int[] subjectArr;
		
		subjectArr = new int[7];
		
		System.out.println("배열 subjectArr 의 길이 : " + subjectArr.length);
		
		for(int i = 0; i < subjectArr.length; i++) {
			int val = subjectArr[i];
			System.out.println("subjectArr [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		subjectArr[0] = 85;
		subjectArr[1] = 75;
		subjectArr[2] = 85;
		subjectArr[3] = 90;
		subjectArr[4] = 98;
		subjectArr[5] = 100;
		subjectArr[6] = 90;
		
		for(int i = 0; i < subjectArr.length; i++) {
			int val = subjectArr[i];
			System.out.println("subjectArr [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		int sum = 0;
		for(int i = 0; i < subjectArr.length; i++) {
			sum += subjectArr[i];
		}
		
		System.out.println("subjectArr 합계 = " + sum);
		
		double avg = Math.round((double)sum/subjectArr.length * 10) / 10;
		
		System.out.println("평균 : " + avg);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int[] subjectArr2;
		
		subjectArr2 = new int[7];
		
		System.out.println("배열 subjectArr2 의 길이 : " + subjectArr2.length);
		
		for(int i = 0; i < subjectArr2.length; i++) {
			int val = subjectArr2[i];
			System.out.println("subjectArr2 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		subjectArr2[0] = 85;
		subjectArr2[1] = 75;
		subjectArr2[2] = 85;
		subjectArr2[3] = 90;
		subjectArr2[4] = 98;
		subjectArr2[5] = 100;
		subjectArr2[6] = 90;
		
		for(int i = 0; i < subjectArr2.length; i++) {
			int val = subjectArr2[i];
			System.out.println("subjectArr2 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		sum = 0;
		for(int i = 0; i < subjectArr2.length; i++) {
			sum += subjectArr2[i];
		}
		
		System.out.println("subjectArr2 합계 = " + sum);
		
		avg = Math.round((double)sum/subjectArr2.length * 10) / 10;
		
		System.out.println("평균 : " + avg);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int[] subjectArr4;
		
		subjectArr4 = new int[7];
		
		System.out.println("배열 subjectArr2 의 길이 : " + subjectArr4.length);
		
		for(int i = 0; i < subjectArr4.length; i++) {
			int val = subjectArr4[i];
			System.out.println("subjectArr2 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		subjectArr4[0] = 85;
		subjectArr4[1] = 75;
		subjectArr4[2] = 85;
		subjectArr4[3] = 90;
		subjectArr4[4] = 98;
		subjectArr4[5] = 100;
		subjectArr4[6] = 90;
		
		for(int i = 0; i < subjectArr4.length; i++) {
			int val = subjectArr4[i];
			System.out.println("subjectArr2 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		sum = 0;
		for(int i = 0; i < subjectArr4.length; i++) {
			sum += subjectArr4[i];
		}
		
		System.out.println("subjectArr2 합계 = " + sum);
		
		avg = Math.round((double)sum/subjectArr4.length * 10) / 10;
		
		System.out.println("평균 : " + avg);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int[] subjectArr3;
		
		subjectArr3 = new int[7];
		
		System.out.println("배열 subjectArr2 의 길이 : " + subjectArr3.length);
		
		for(int i = 0; i < subjectArr3.length; i++) {
			int val = subjectArr3[i];
			System.out.println("subjectArr3 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		subjectArr3[0] = 85;
		subjectArr3[1] = 75;
		subjectArr3[2] = 85;
		subjectArr3[3] = 90;
		subjectArr3[4] = 98;
		subjectArr3[5] = 100;
		subjectArr3[6] = 90;
		
		for(int i = 0; i < subjectArr3.length; i++) {
			int val = subjectArr3[i];
			System.out.println("subjectArr3 [" + i + "] = " + val);
		}
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		
		sum = 0;
		for(int i = 0; i < subjectArr3.length; i++) {
			sum += subjectArr3[i];
		}
		
		System.out.println("subjectArr3 합계 = " + sum);
		
		avg = Math.round((double)sum/subjectArr3.length * 10) / 10;
		
		System.out.println("평균 : " + avg);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		for(int subject : subjectArr4) {
			System.out.println(subject);
		}
		
				//국어
		//영어
		//수학
		//과학
		//사회
		//음악
		//체육

	}

}
