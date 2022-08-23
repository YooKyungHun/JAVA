package abstractex;

public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display()");
	}

	// NoteBook Class 는 Computer 의 추상메서드(display(), typing()) 중.
	// display() 만 구현하였고, typing() 은 구현하지 못했음.
	// 다른 말로는 구현의 책임을 다하지 못하였음.
	// 따라서 추상클래스와 다르게 new 도 사용하여 객체를 만들 수 없음.

}
