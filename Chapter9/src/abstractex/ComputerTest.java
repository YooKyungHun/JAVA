package abstractex;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer c1 = new Computer();
		// Computer computer = new Computer() 처럼 new 를 사용할 수 없음.
		// 인스턴스화가 되면 computer 라는 객체가 상위클래스에서 사용할 구현부분이 없는 메서드가 있기 때문임.
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
		// Desktop display()
		// NoteBook display()
		
	}

}
