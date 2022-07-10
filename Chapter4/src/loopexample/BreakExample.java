package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		
		// 0 부터 시작하여 1씩 늘리며 숫자의 합이 100 을 초과하는 경우,
		// 그 수와 합을 구하는 예제.
		int sum = 0;
		int num = 1;
		
		while (true) {
			sum += num;
			if(sum > 100) {
				break;
			}
			num++;
		}
		
		System.out.println(sum);  // 105
		System.out.println(num);  // 14
	}

}
