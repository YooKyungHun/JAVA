package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// Customer 에서 상속받은 모든 종류의 객체들이 들어갈 수 있음.
		
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
	
		System.out.println("========고객정보 출력=======");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
			// 참조메서드(showCustomerInfo) 가 하위클래스에서 재정의(overriding) 가 되어 있다면,
			// 하위클래스 VIPCustomer 의 메서드가 호출됨.
		}
//		========고객정보 출력=======
//		이순신 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
//		신사임당 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
//		홍길동 님의 등급은 GOLD이며, 보너스 포인트는 0입니다.
//		이율곡 님의 등급은 GOLD이며, 보너스 포인트는 0입니다.
//		김유신 님의 등급은 VIP이며, 보너스 포인트는 0입니다.

		
		System.out.println("========할인율과 보너스 포인트 결과 =======");

		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + " 를 지불하셨습니다");
			System.out.println(customer.showCustomerInfo());
			// 참조메서드(showCustomerInfo) 가 하위클래스에서 재정의(overriding) 가 되어 있다면,
			// 하위클래스의 메서드가 호출됨.
		}
//		========할인율과 보너스 포인트 결과 =======
//		이순신님이 10000 를 지불하셨습니다
//		이순신 님의 등급은 SILVER이며, 보너스 포인트는 100입니다.
//		신사임당님이 10000 를 지불하셨습니다
//		신사임당 님의 등급은 SILVER이며, 보너스 포인트는 100입니다.
//		홍길동님이 9000 를 지불하셨습니다
//		홍길동 님의 등급은 GOLD이며, 보너스 포인트는 200입니다.
//		이율곡님이 9000 를 지불하셨습니다
//		이율곡 님의 등급은 GOLD이며, 보너스 포인트는 200입니다.
//		김유신님이 9000 를 지불하셨습니다
//		김유신 님의 등급은 VIP이며, 보너스 포인트는 500입니다. 담당 상담원의 ID 는12345입니다.
//	
		
		
		
		
		
	}

}