package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");  // 55
	
		
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		}while (num <= 10);
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");  // 55
		// do { } 의 내용을 1번은 기본적으로 수행하고,
		// while 내의 조건문을 판단하여 true 일 경우 do { } 의 내용 반복수행.
		
	
	}

}
