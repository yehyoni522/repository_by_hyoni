package my.day16.b.userDefineException;

public class Product {
	
	private String prodName; //제품명 ("새우깡", "감자깡", "양파링")
	private int jango; //잔고(100, 50, 150)
	
	
	protected String getProdName() {
		return prodName;
	}
	protected void setProdName(String prodName) {
		this.prodName = prodName;
	}
	protected int getJango() {
		return jango;
	}
	protected void setJango(int jango) {
		this.jango = jango;
	}

	public void info() {
		String info = "1. 제품명 : " + prodName + "\n"
					+ "2. 잔고량 : " + jango + "개\n";
		
		System.out.println(info);
	}
	
	//주문을 받는 메소드 생성1
	void order(int jumunSu) throws JangolackException {
		//order(int jumunsu)는 파라미터로 들어오는 jumunsu의 값에 따라서 
		//사용자(개발자)가 만든 JangolackException 을 유발할 수 있다.
		
		if(jango < jumunSu ) {
			//잔고량이 주문량보다 부족할 시 JangolackException 을 유발시켜줘야 한다.
			throw new JangolackException();
			
		} else {
			jango -= jumunSu;
			System.out.println(prodName + " 제품을 " + jumunSu + "개를 주문하셨습니다.");
		}
	}
	//주문을 받는 메소드 생성2
	void jumun(int jumunSu) throws JangolackException {
		//order(int jumunsu)는 파라미터로 들어오는 jumunsu의 값에 따라서 
		//사용자(개발자)가 만든 JangolackException 을 유발할 수 있다.
		
		if(jango < jumunSu ) {
			//잔고량이 주문량보다 부족할 시 JangolackException 을 유발시켜줘야 한다.
			throw new JangolackException(prodName + "은 잔고가 " + jango + "개 인데 주문량이  " + jumunSu + "라서 잔고 부족으로 주문이 불가합니다.");
			
		} else {
			jango -= jumunSu;
			System.out.println(prodName + " 제품을 " + jumunSu + "개를 주문하셨습니다.");
		}
	}
	

}
