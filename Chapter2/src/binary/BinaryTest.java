package binary;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;		// 10진수
		int bNum = 0B1010;	// 2진수
		int oNum = 012;		// 8진수
		int hNum = 0XA;		// 16진수
		// 2진수의 4bit(1010) 를 1 개의 문자(A)로 표현
		
		System.out.println(num);	// 10
		System.out.println(bNum);	// 10
		System.out.println(oNum);	// 10
		System.out.println(hNum);	// 10
	}

}


/*
8bit = 1byte
정수는 보통 32bit(4byte) 를 사용하는데, 
축약해서 8bit 만 표현하자면,
0 0 0 0 0 1 0 1 처럼 맨 앞이 0 이면 양수(+5),
1. 맨 앞의 MSB(Most Significant Bit) 을 0 에서 1 로 바꾸고, 
2. 뒤의 1과 0을 뒤집고,
3. 1 을 더하면,
즉, 1 1 1 1 1 0 1 1 이 음수(-5) 표현.
실제로 두 수를 더하면, 
1 0 0 0 0 0 0 0 0 이 되는데, 맨 앞의 1 이 날라가서 0 이 됨. 
*/

