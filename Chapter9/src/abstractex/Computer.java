package abstractex;

public abstract class Computer {
// abstract 메서드를 가지고 있는 클래스.

	public abstract void display();
	public abstract void typing();
	// 구현부분({ 구현코드 })이 없이 선언만 한 abstract(추상) 메서드.
	// 이러한 추상 메서드가 있는 클래스는 상위클래스로서,
	// 하위클래스에게 구현의 책임을 넘김.
	// 즉, 상위클래스에서는 해당 부분이 어떻게 구현될지 알지 못할 경우에,
	// 하위클래스에서 상속받아 구현하도록 구현의 책임을 넘김.
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	// abstract 클래스는 abstract 만 가지고 있어야 하는게 아니라,
	// 구현부분({ 구현코드 })가 있는 일반 메서드도 포함할 수 있음.
}

// 추상클래스는 상속을 위한 클래스.
// return 값이 있는 메서드가 없기에 추상클래스 자기혼자 돌아갈 수 없고,
// Computer computer = new Computer() 처럼 new 를 사용할 수 없음.
// 인스턴스화가 되면 computer 라는 객체가 상위클래스에서 사용할 구현부분이 없는 메서드가 있기 때문임.
