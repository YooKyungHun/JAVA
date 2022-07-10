package assignment;

public class OperationEx2 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(++num);  // 11
		
		int num2 = 10;
		System.out.println(num2++);  // 10
		System.out.println(num2);  // 11
		// ++ 이 변수 앞에 있는 경우는 해당 statement(;) 가 끝나기 전에 연산.
		// ++ 이 변수 뒤에 있는 경우는 해당 statement(;) 가 끝난 뒤에 연산.
		
		System.out.println(3<5);  // true
		System.out.println(3>5);  // false
		
		int num10 = 10;
		int num5 = 5;
		boolean flag = (num10 > num5);
		System.out.println(flag);  // true
	}

}
