package multiinheri;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		Sell seller = customer;
		seller.sell();
		// buy, sell 가 customer 보다 상위이기 때문에,
		// buyer 는 buy 만, seller 는 sell 만 사용가능.
		
		customer.buy();
		customer.sell();
		// Custom 은 buy 와 sell 모두 상속(implements)받기 때문에
		// customer 는 buy 와 sell 모두 사용가능
		
		buyer.order();		// 고객 판매 주문, Customer Class 에서 주문함
		seller.order();		// 고객 판매 주문, Customer Class 에서 주문함
		customer.order();	// 고객 판매 주문, Customer Class 에서 주문함
		// buyer 는 Buy 타입이니까, seller 는 Sell 타입이니까 각각의 order 가 호출되는게 아니고,
		// 가상메서드 방식에 의해,
		// 현재 assign 된 인스턴스가 Customer 타입이기 때문에 customer 의 order 가 호출됨.
	}

}
// 다중상속 - 다이아몬드 문제
// GrandFather이라는 클래스가 myMethod() 라는 이름의 메소드를 가지고 있다고 가정.
// 그리고 FatherA와 FatherB가 각각 오버라이딩하여 구현하였다면,
// FatherA와 FatherB를 모두 상속받은 Son 클래스 입장에서는
// 어떤 부모의 myMethod()를 사용해야 할지에 관한 문제.
// 
// 하지만 JAVA 의 인터페이스는 정의를 하지않고 기능에 대한 선언만 해두기 때문에,
// 다중 상속이 되더라도 충돌할 여지가 없음.




