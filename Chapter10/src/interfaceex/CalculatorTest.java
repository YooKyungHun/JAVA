package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		// 클라이언트 코드: 인터페이스(Calc calc)를 기반으로 구현된 코드(new CompleteCalc())
		CompleteCalc calc2 = new CompleteCalc();
		
		System.out.println(calc.add(num1, num2));	// 12
		calc2.showInfo();	// 인터페이스 클래스를 구현했습니다.
		
		calc.description();  // "완벽한 계산기입니다."
		// 3. 디폴트 메서드: 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능.
		// 가상메서드 방식에 의해 인스턴스의 메서드가 호출됨.
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		// 4. 정적 메서드: 인스턴스 생성과 상관없이(new 하면서 만들 필요없이),
		// 인터페이스 타입(Calc.)으로 사용할 수 있는 메서드.

	}

}
// Calc 형 변수와 Calculator 형 변수에서 사용가능:
// add(), substract(), times(), devide()
// CompleteCalc 형 변수에서 사용가능: 
// add(), substract(), times(), devide(), showInfo()

// 인터페이스는 "Client Code" 와 서비스를 제공하는 "객체" 사이의 약속임.
// 어떤 객체가 어떤 interface 타입이라고 하면, 그 interface 가 제공하는 메서드를 구현했다는 의미임.
// Client 는 어떻게 구현되었는지 상관없이 interface 의 정의만을 보고 사용할 수 있음.

// 1. 상수: 모든 변수는 상수로 변환됨.
// 2. 추상메서드: 모든 메서드는 추상 메서드로 구현됨.
//자바 8(2014년 3월 출시) 부터 이하의 메서드도 인터페이스에 들어올 수 있음.
// 3. 디폴트 메서드: 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능.
// 4. 정적 메서드: 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드.
// 5. private 메서드: 인터페이스를 구현한 클래스에서 사용하거나 재정의 불가능.
// 인터페이스 내부에서만 기능을 제공하기 위해 구현되는 메서드.