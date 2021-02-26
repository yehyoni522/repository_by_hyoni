package my.day05.d.SWITCH;

public class SungjukMain {

	public static void main(String[] args) {
		
		Sungjuk sj = new Sungjuk();
		
		sj.hakbun = "091234";
		sj.name = "김민석";
		sj.kor = 90;
		sj.eng = 90;
		sj.math = 90;
		
		System.out.println("총점 : " + sj.total());
		System.out.println("평균 : " + sj.avg());
		System.out.println("학점 : " + sj.grade());
		System.out.println("상품 : " + sj.gift());

	}

}
