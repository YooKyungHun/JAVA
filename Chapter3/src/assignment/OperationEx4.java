package assignment;

public class OperationEx4 {

	public static void main(String[] args) {

		int num1 = 10;
		System.out.println(num1 += 1);  // 11
		System.out.println(num1 %= 10);  // 1
		
		num1 -= 1;
		System.out.println(num1);  // 0
		
		int num2 = (5 > 3) ? 10 : 20;
		System.out.println(num2);  // 10
	}

}
