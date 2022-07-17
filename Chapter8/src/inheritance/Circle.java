package inheritance;

public class Circle {
	
	// 상속(is - a 관계)의 개념이 아니라 합성(has - a 관계)의 개념.
	Point point; 
	
	private int radius;
	
	public Circle() {
		point = new Point();
	}
	
}
