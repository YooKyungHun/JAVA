package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(100010, "Lee");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불금액은 " + price + " 이고 " + 
				customerLee.showCustomerInfo());
		
		System.out.println("======================="); 
		
		VIPCustomer custoerKim = new VIPCustomer(100011, "Kim", 100);
		price = custoerKim.calcPrice(10000);
		System.out.println("지불금액은 " + price + " 이고 " + 
				custoerKim.showCustomerInfo());
		// VIPCustomer 의 calcPrice 메서드 오버라이딩을 통해,
		// 상위클래스의 Customer calcPrice 메서드를 사용하지 않고,
		// 하위클래스 VIPCustomer calcPrice 메서드를 사용할 수 있었음.
		
		System.out.println("========================");
		
		Customer custoerWho = new VIPCustomer(100012, "Who", 100);
		price = custoerWho.calcPrice(10000);
		System.out.println("지불금액은 " + price + " 이고 " + 
				custoerWho.showCustomerInfo());
		// 업캐스팅(상위클래스인 Customer)으로 선언된 CustomerWho 는
		// Customer 의 참조변수와 메서드만 참조가능하지만,
		// 참조메서드(calcPrice) 가 하위클래스에서 재정의(overriding) 가 되어 있다면,
		// 하위클래스 VIPCustomer 의 메서드가 호출됨.
		// 가상함수, 가상메서드의 개념인데 재정의(overriding) 된 메서드는
		// 상위클래스에서 처음 정의된 메서드와 메서드 주소가 다르기 때문임.
		// Customer 클래스의 가상메서드 테이블
		// calcPrice(재정의됨) 			 	- 0xFF00FFAA - ㄱ
		// showCustomerInfo(재정의되지않음) 	- 0x112233AA
		// VIPCustomer 클래스의 가상메서드 테이블
		// calcPrice(재정의됨) 			 	- 0x00335577 - ㄴ
		// showCustomerInfo(재정의되지않음) 	- 0x112233AA
		// getAgentID(하위클래스에서 새로추가됨)  - 0x8899BB33
		// 에서 ㄱ 과 ㄴ 이 메서드 주소가 다르기 때문에 서로 다른 메서드 영역을 가르킴.
		
		
		
	}

	
}


//업캐스팅
//하위클래스는 상위클래스의 부분임.
//즉, VIP 고객은 고객이라고도 할 수 있음.
//따라서, 상위클래스형으로 변수를 선언하고, 하위클래스 인스턴스를 생성할 수 있음(업캐스팅).
//하위클래스는 상위클래스의 타입을 내포하고 있으므로, 상위클래스로의 묵지적 형변환이 가능함.
//Customer vc = new VIPCustomer(); 에서
//vc 의 메모리는 VIPCustomer 로 생성되어, agentID, saleRatio 변수도 가지고 있지만,
//실제 사용은 할 수 없음(vc.agentID 는 불가능)
//Customer 클래스의 멤버변수와 메서드만 사용가능.