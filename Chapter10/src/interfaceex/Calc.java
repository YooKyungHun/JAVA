package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	// 별도의 키워드를 적어주지 않아도 interface 내에서는 public static final 임.
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int devides(int num1, int num2);
	// interface 라는 키워드 안에서 선언이 되면,
	// 모두가 public abstract(추상 메서드) 이기 때문에 구현부분이 없이 정의만 해도 됨.
	
	// 3. 디폴트 메서드: 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능.
	default void description() {
	// 인터페이스는 구현코드를 가질 수 없어서 default 를 빼면 오류발생.
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	// 4. 정적 메서드: 인스턴스 생성과 상관없이(new 하면서 만들 필요없이),
	// 인터페이스 타입(Calc.)으로 사용할 수 있는 메서드.
	static int total(int[] arr) {
		int total = 0;
		for (int i:arr) {
			total += i;
		}
		return total;
	}
	
	// 5. private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 불가능.
	// 인터페이스 내부에서만 기능을 제공하기 위해 구현되는 메서드.
	private void myMethod() {
		System.out.println("private 메서드입니다.");
	}
}
// 인터페이스: 모든 메서드가 추상메서드(상수 포함)로 이루어진 클래스.
// 형식적인 선언만 있고, 구현은 없음.
// 인터페이스에 선언된 모든 메서드는 public abstract 로 추상메서드.
// 인터페이스에 선언된 모든 상수는 public static final 로 상수.
// 
// 1. 상수: 모든 변수는 상수로 변환됨.
// 2. 추상메서드: 모든 메서드는 추상 메서드로 구현됨.
// 자바 8(2014년 3월 출시) 부터 이하의 메서드도 인터페이스에 들어올 수 있음.
// 3. 디폴트 메서드: 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능.
// 4. 정적 메서드: 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드.
// 5. private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 불가능.
// 인터페이스 내부에서만 기능을 제공하기 위해 구현되는 메서드.