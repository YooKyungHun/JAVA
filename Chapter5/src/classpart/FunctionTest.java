package classpart;

public class FunctionTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);  // 40
		// class 를 수행(run 구동부분)하기 위한 main 함수가, 
		// addNum 함수를 호출함.

		
	}
	
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
		// 반환값 result 의 자료형이 int 이기 때문에, 함수명 앞에 int 붙여줌.
		// 단, 반환값이 없는 경우 void 를 붙여줌.
	}

}
