package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName)
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
		
		System.out.println("VIPCustomer(int, String) 호출됨");

	}
	// 고객의 초기 등급은 "VIP", 보너스비율은 0.05
	// 부모 클래스의 customerGrade 가 private 이면,
	// 자식 클래스에서 가져다 사용하지 못하지만,
	// protected 이면 기존처럼 외부클래스에서는 접근이 불가능하지만
	// 자식 클래스에서는 접근가능함(패키지가 달라도 접근가능).
	// 가시성 낮음 - private - default - protected - public - 가시성 높음
	
	public int getAgentID() {
		return agentID;
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
// Customer 클래스의 멤버변수와 메서드만 사용가능.