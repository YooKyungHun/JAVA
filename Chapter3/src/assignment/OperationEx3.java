package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		boolean value = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		System.out.println(value);  // true
		System.out.println(num1);  // 20
		System.out.println(i);  // 4
		// && 는 곱 연산자로 앞의 항과 뒤의 항 모두 참이어야 true 가 되는데,
		// 이미 앞의 항(num1 = num1 + 10) > 10)이 true 이기 때문에,
		// 뒤의 항(i = i + 2) < 10)도 true 인지 false 인지 확인을 위해 연산이 실행됨.
		// 따라서 i 는 연산 결과대로 4임.

		int num2 = 10;
		int i2 = 2;
		boolean value2 = ((num2 = num2 + 10) < 10) && ((i2 = i2 + 2) < 10);
		System.out.println(value2);  // false
		System.out.println(num2);  // 20
		System.out.println(i2);  // 2
		// && 는 곱 연산자로 앞의 항과 뒤의 항 모두 참이어야 true 가 되는데,
		// 이미 앞의 항(num2 = num2 + 10) < 10)이 false 가 되어버렸기 때문에,
		// 뒤의 항(i2 = i2 + 2) < 10)은 실행되지 않음.
		// 따라서 i2 는 초기값 그대로 2임.
		
		int num3 = 10;
		int i3 = 2;
		boolean value3 = ((num3 = num3 + 10) > 10) || ((i3 = i3 + 2) < 10);
		System.out.println(value3);  // true
		System.out.println(num3);  // 20
		System.out.println(i3);  // 2
		// || 는 합 연산자로 앞의 항과 뒤의 항 중 하나만 참이어도 true 가 되는데,
		// 이미 앞의 항(num3 = num3 + 10) > 10)이 true 이기 때문에,
		// 뒤의 항(i3 = i3 + 2) < 10)은 실행되지 않음.
		// 따라서 i3 는 초기값 그대로 2임.
		
		
		int num4 = 10;
		int i4 = 2;
		boolean value4 = ((num4 = num4 + 10) < 10) || ((i4 = i4 + 2) < 10);
		System.out.println(value4);  // true
		System.out.println(num4);  // 20
		System.out.println(i4);  // 4
		// || 는 합 연산자로 앞의 항과 뒤의 항 중 하나만 참이어도 true 가 되는데,
		// 앞의 항(num4 = num4 + 10) < 10)이 false 이기 때문에,
		// 뒤의 항(i4 = i4 + 2) < 10)도 true 인지 false 인지 확인을 위해 연산이 실행됨.
		// 따라서 i4 는 연산 결과대로 4임.
	}

}


/*
논리연산자
&&(논리 곱): 두 항이 모두 참인경우에만 결과값이 참.
||(논리 합): 두 항 중 하나 이상의 항이 참이면 결과값이 참.
*/
