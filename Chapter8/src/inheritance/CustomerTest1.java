package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10100, "Lee");
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
//		customerKim.setCustomerID(10101);
//		customerKim.setCustomerName("Kim");
		
		// 자식 클래스의 인스턴스인 customerKim 는 
		// 부모 클래스에 정의된 메서드(setCustomerID, setCustomerName) 를
		// 사용할 수 있지만,
		// 부모 클래스의 인스턴스인 customerLee 는
		// 자식 클래스에 정의된 메서드(getAgentID) 를 사용할 수 없음.
		
		// "Customer(int, String) 호출됨"
		// "VIPCustomer(int, String) 호출됨" 이 출력된것으로 보아,
		// 상위 클래스의 생성자가 호출되고, 하위 클래스의 생성자가 호출되는 것을 알 수 있음.
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

		
		// Lee 님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
		//  Kim 님의 등급은 VIP이며, 보너스 포인트는 0입니다.

		
		
		
		
		
		
		
		
		
		
	}

}
