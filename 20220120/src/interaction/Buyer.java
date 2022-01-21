package interaction;

public class Buyer {
	// 구매자는 money(소지금), mango(소지망고개수)를 멤버 변수로 가집니다.
	private int money; // 소지금 
	private int mango; // 소지 망고 개수
	private int MANGO_PRICE;
	// 생성자에는 돈을 받아 소지금을 초기화해주고 망고는0으로 초기화합니다.
	public Buyer(int money) {
		this.mango = 0;
		this.money = money;
		this.MANGO_PRICE=5000;
	}
	// showBuyer()를 이용해 소지망고, 소지금을 볼수있습니다.\
	public void showBuyer() {
		System.out.println("------------구매자 정보---------------");
		System.out.println("소지한 망고 : " + this.mango + "소지금 : " + this.money);
	}
	
	// 구매자 입장에서는 망고를 구매하는 buyMango를 만듭니다
	// 구매자가 buyMang를 호출할 때 동시에 판매자의 sellMango도 동시에 호출되어야 합니다.
	//                          누구에게         몇개   를 구매할지 적습니다.
	public void buyMango(Seller seller, int mango) {
		// 판매자의 망고가 내가 구매하려는 망고보다 적은 경우
		// " 망고 재고가 부족합니다. 라고 알리고 메서드를 중지 시켜야합니다.
		// Seller쪽의 망고 재고를 Buyer쪽에서 미리 아는 방법은
		// getMango()를 Seller쪽에 만들어 주는 수 밖에 없으므로
		// getMango()를 Seller쪽에 생성해줘서 Buyer쪽에서
		// 망고개수를 조회할 수 있도록 해 주시고, 그 결과를 토대로
		// 망고재고가 부족하다면 return; 으로 BuyMango가 실행되지 않게 해주세요.
		if(seller.getMango() < mango) {
			System.out.println("망고 재고가 부족합니다.");
			return;
		}
		
		// 내 금액이 차감되고 망고가 늘어나는 로직을 작성해주세요
		this.money -= mango* MANGO_PRICE;
		this.mango += mango;
		// 판매자의 sellMango 호출
		seller.sellMango(mango);
		
	
	}


}
