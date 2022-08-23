package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	public void washCar() {};
	// washCar 는 구현을 했지만 구현부분이 없는 것 뿐이므로 하위클래스에서 구현책임이 없음.
	// 따라서 하위클래스에서는 필요에 따라 구현(override)을 해도 되고(AICar), 하지 않아도(manualCar) 상관없음.
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// template method
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	
	}
}
