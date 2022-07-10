package binary;

public class VariableEx2 {

	public static void main(String[] args) {

		long num = 12345678900L;
		
		System.out.println(num);  // 12345678900
		
		// 숫자는 기본형이 int 이기 때문에,
		// 우변의 숫자는 long num 과는 상관없이 int(4byte) 로 저장되어 있음.
		// 하지만 int 의 범위(-2^31 ~ 2^31 -1) 를 넘는 수이기 때문에,
		// 에러가 발생하고,
		// 올바르게 저장하기 위해 L 을 붙임(long type 으로 저장).
	}
}
