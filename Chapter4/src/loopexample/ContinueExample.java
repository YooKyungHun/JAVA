package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		
		int total = 0;
		int num;
		
		// 1 부터 100 까지 짝수만 더하기
		for (num = 1; num <= 100; num++) {  // 100 까지 반복
			if(num % 2 == 1) {				// num 값이 홀수인경우
				continue;					// 이후 수행을 생략하고 num++ 수행
			}
			total += num;					// num 값이 짝수인 경우에만 수행
		}
		System.out.println(total);
	}

}
