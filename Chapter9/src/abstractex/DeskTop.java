package abstractex;

public class DeskTop extends Computer {

	@Override
	public void display() {

		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {

		System.out.println("DeskTop typing()");
	}

	// DestTop Class 는 Computer 의 추상메서드를 모두 구현하였음.
	// 다른 말로는 구현의 책임을 다하였음.
	// 따라서 추상클래스와 다르게 new 도 사용하여 객체를 만들 수 있음.
}
