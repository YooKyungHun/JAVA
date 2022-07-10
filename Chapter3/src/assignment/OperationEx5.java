package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		// 비트연산 &
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2;
		System.out.println(result);  // 0
		// 5  =  0 0 0 0 0 1 0 1
		// 10 =  0 0 0 0 1 0 1 0
		// res = 0 0 0 0 0 0 0 0 
		
		
		// 비트연산 |
		int result2 = num1 | num2;
		System.out.println(result2);  // 15
		// 5  =  0 0 0 0 0 1 0 1
		// 10 =  0 0 0 0 1 0 1 0
		// res = 0 0 0 0 1 1 1 1 
		
		int num3 = 5;  // 00000101
		System.out.println(num3 << 1);  // 10, 00001010
		System.out.println(num3 << 2);  // 20, 00010100
		System.out.println(num3 << 3);  // 40, 00101000
		System.out.println(num3 >> 1);  // 2, 00000010
		System.out.println(num3);  // 5, 00000101
		// 연산이지, num3 가 바뀌는 것은 아님
		
		
	}

}


/*
비트연산
<<(왼쪽SHIFT): 오른쪽에서 왼쪽으로 이동하는 연산자
>>(오른쪽SHIFT): 왼쪽에서 오른쪽으로 이동하는 연산자
정수 15의 왼쪽으로 2자리를 이동하는 경우(15 << 2)
00000000 00000000 00000000 00001111 = 15
00000000 00000000 00000000 00111100 = 60
즉 왼쪽으로 n 만큼 이동할 때, 2^n 만큼 곱해지고
오른쪽으로 n 만큼 이동할 때, 2^n 만큼 나눠지는 연산.
*/