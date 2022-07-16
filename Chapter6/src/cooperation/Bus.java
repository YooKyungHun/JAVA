package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
	// Bus 를 생성할 때, 생성자에서 매개변수를 무조건 받고자 함.
	// 즉, 버스번호가 있어야만 Bus 를 생성(new)할 수 있게 하려고 함.
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + 
				"명이고, 수입은 " + money + "입니다.");
	}
}
