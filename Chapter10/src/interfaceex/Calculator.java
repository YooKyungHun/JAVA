package interfaceex;

public abstract class Calculator implements Calc{
	// Calc 의 추상 메서드를 모두 구현하지 않았으므로 Calculator 도 추상 클래스가 됨.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}


}
// Calc 인터페이스를 Calculator 클래스에서 구현.
// Calc 의 모든 추상 메서드를 구현하지 않으면, Calculator 는 추상 메서드가 됨.
//
// CompleteCalc 클래스가 Calculator 를 상속받은 후 모든 메서드를 구현 