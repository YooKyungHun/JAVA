package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devides(int num1, int num2) {
		if (num2 != 0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("인터페이스 클래스를 구현했습니다.");
	}

	@Override
	public void description() {
	// 3. 디폴트 메서드: 기본 구현을 가지는 메서드, 구현클래스에서 재정의 가능.
		System.out.println("완벽한 계산기입니다.");
		
	}

}
