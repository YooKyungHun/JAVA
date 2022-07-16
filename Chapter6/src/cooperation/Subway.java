package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
	// Bus 를 생성할 때, 생성자에서 매개변수를 무조건 받고자 함.
	// 즉, 버스번호가 있어야만 Bus 를 생성할 수 있게 하려고 함.
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은 " + passengerCount + 
				"명이고, 수입은 " + money + "입니다.");
	}
}
