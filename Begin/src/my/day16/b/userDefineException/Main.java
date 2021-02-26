package my.day16.b.userDefineException;

public class Main {

	public static void main(String[] args) {
		
		Product[] prodArr = new Product[3];
		
		prodArr[0] = new Product();
		prodArr[0].setProdName("새우깡");
		prodArr[0].setJango(100);
		
		prodArr[1] = new Product();
		prodArr[1].setProdName("감자깡");
		prodArr[1].setJango(50);
		
		prodArr[2] = new Product();
		prodArr[2].setProdName("양파링");
		prodArr[2].setJango(150);
		
		for(Product prod : prodArr) {
			try {
				prod.order(80);//80개 주문.
			} catch (JangolackException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("오류 메시지 : " + e.getMessage());
			} finally {
				prod.info();
			}
			
		}
		
		System.out.println("\n======================================\n");
		
		prodArr[0].setJango(100);
		prodArr[1].setJango(50);
		prodArr[2].setJango(150);
		

		for(Product prod : prodArr) {
			try {
				prod.jumun(80);//80개 주문.
			} catch (JangolackException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("오류 메시지 : " + e.getMessage());
			} finally {
				prod.info();
			}
			
		}

	}

}
