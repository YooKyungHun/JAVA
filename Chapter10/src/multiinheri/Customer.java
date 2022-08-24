package multiinheri;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문, Customer Class 에서 주문함");
	}
	// Customer 가 Buy 와 Sell 을 implements 했는데,
	// Buy 와 Sell 에 동일한 이름의 default method 가 있기 때문에 에러가 발생함.
	// 따라서 구현클래스인 Customer class 에서 중복된 default method 를 overriding 해줌.
}
