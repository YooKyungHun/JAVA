package singleton;

import java.util.Calendar;

public class Company {

	private static Company instance = new Company();
	// 다른 곳에서 직접 호출하지 못하도록 private,
	// 메모리에 단 하나만 존재하기 때문에 static.
	
	private Company() {}
	// Company 라는 인스턴스는 하나만 존재하고 싶음.
	// private 생성자를 만들어 놓음으로써, 
	// default 생성자에 의해 여러 개의 인스턴스가 생성될 수 없도록 막음.
	// 즉, 외부에서 이 생성자를 호출하지 못하도록 함.
	
	public static Company getInstance() {
		return instance;
		// instance 를 다른 곳에서 직접 호출하지는 못하지만,
		// public method 를 통해 간접 호출할 수 있도록 제공.
		// static 을 통해 인스턴스를 생성하지 않고도, 가져다 쓸 수 있도록 함.
	}
	
	Calendar cal = Calendar.getInstance();
	// 날짜 개념도 여러 개가 만들어지면 안되기 때문에,
	// singleton 의 활용가능한 예시임.
}
