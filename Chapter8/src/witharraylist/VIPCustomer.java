package witharraylist;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID, customerName);
		// 내가 super() 코드를 적지 않아도, 컴파일러가 super() 코드를 넣어줌.
		// super() 는 자기 자신이 아니라 바로 위 상위 클래스를 가르키는 키워드임.
		// 매개변수가 없다면, 상위 클래스의 default 생성자(Customer())를 호출함.
		// 따라서, 자식 클래스가 실행될 때, 
		// 상위 클래스의 생성자가 호출되고 나서, 하위 클래스의 생성자가 호출되는 것을 알 수 있음.
		// ('호출' 이라기보다 상위 클래스 생성자의 내용이 먼저 실행되고,
		// 하위 클래스 생성자의 내용이 다음 실행된다고 이해하기)
		
		// 하지만, 매개변수가 있다면, 내가 상위 클래스에서 별도로 만들어준,
		// 매개변수를 활용한 생성자가 있어야하고, 해당 생성자가 호출됨.
		// (public Customer(int customerID, String customerName))
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		// super() 로 인해 상위클래스에서 
		// customerGrade = "SILVER"; bonusRatio = 0.01; 이 설정되었지만,
		// 다시 하위클래스로 오면서
		// customerGrade = "VIP"; bonusRatio = 0.05; 
		// saleRatio = 0.1; this.agentID = agentID; 로 재설정됨.

		
		System.out.println("VIPCustomer(int, String) 호출됨 " + customerName);

	}
	// 고객의 초기 등급은 "VIP", 보너스비율은 0.05
	// 부모 클래스의 customerGrade 가 private 이면,
	// 자식 클래스에서 가져다 사용하지 못하지만,
	// protected 이면 기존처럼 외부클래스에서는 접근이 불가능하지만
	// 자식 클래스에서는 접근가능함(패키지가 달라도 접근가능).
	// 가시성 낮음 - private - default - protected - public - 가시성 높음
	
	
	// 메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	// VIP 고객은 일반 고객과 다르게 보너스포인트도 적립해주고,
	// 가격할인이 들어가기 때문에, 메서드 오버라이딩을 해줌.
	
	
	public int getAgentID() {
		return agentID;
	}


	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 ID 는" + agentID + "입니다.";
	}
	
	
	
	
	
	
	
	
}

