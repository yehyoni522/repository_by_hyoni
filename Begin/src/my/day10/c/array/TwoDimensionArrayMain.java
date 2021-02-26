package my.day10.c.array;

public class TwoDimensionArrayMain {

	public static void main(String[] args) {
		
		int[][] pointArr = new int[4][3];
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int [][] jumsuArr = {{90, 80, 70}, {80, 85, 76}, {85, 70, 90}, {60, 80, 50}};
		
		@SuppressWarnings("unused")
		int[] totalArr = new int[jumsuArr.length];
		int[] subjectTotalArr = new int[3];

		for(int i = 0; i < jumsuArr.length; i++) {
			int sum = 0;
			for(int j = 0; j < jumsuArr[i].length; j++) {
				sum += jumsuArr[j][i];
				
			}
			subjectTotalArr[i] = sum;
		}
		
		System.out.println();
		
		
		

	}

}
