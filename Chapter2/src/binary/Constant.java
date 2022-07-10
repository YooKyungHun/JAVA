package binary;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;
		final double PI = 3.14;
		// 상수는 일반적으로 대문자를 사용함.
		
		PI = 3.15;  // final 로 선언된 상수는 다른 값을 대입할 수 업음.
		
		// 활용: 프로그램 내에서 변경되지 말아야 할 값을 상수로 선언.
		// 효과: 혹시 변경하더라도, 선언된 값만 수정하기 때문에 편리함.

	}

}
 