package array;

public class ArrayTest {

	public static void main(String[] args) {

		// 배열의 초기화 방법 1
		int[] numbers = new int[] {0, 1, 2};
		// 초기화 할 때에는 [] 안에 숫자 안씀.
		
		System.out.println(numbers);  // [I@2c13da15
		System.out.println(numbers.length);  // 3
		
		// 배열의 초기화 방법 2
		int[] numbers2 = new int[3];
		
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		
		for(int i = 0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);  // 1; 2; 3
		}
		
		// 배열의 초기화 방법 3
		int[] numbers3 = {1, 2, 3};
		
		for(int i = 0; i<numbers3.length; i++) {
			System.out.println(numbers3[i]);  // 1; 2; 3
		}
		
		// 값을 할당하지 않은 index 에는
		// int 일땐 0
		// double 일땐 0.0
		// 객체일땐 null 이 초기값으로 들어가있음.
	}

}
