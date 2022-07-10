package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);  // 55
		System.out.println(num);  // 11
		
		for(sum = 0, num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println(sum);  // 55
		System.out.println(num);  // 11
		
		
		// 9*9단
		int dan;
		int times;
		int result;
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				result = dan * times;
				System.out.println(dan + "X" + times + "=" + result);
			}
			System.out.println();
		}
		
		int dan2 = 2;
		int times2 = 1;
		int result2;
		
		while (dan2<=9) {
			times2 = 1;
			while (times2<=9) {
				result2 = dan2 * times2;
				System.out.println(dan2 + "X" + times2 + "=" + result2);
				times2++;
			}
			dan2++;
			System.out.println();
		}
		
	}

}
