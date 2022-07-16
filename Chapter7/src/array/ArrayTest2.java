package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		int size = 0;
		// length 와는 달리 유효한 값의 개수를 변수로 설정
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		
		for(int i = 0; i < size; i++) {
			System.out.println(num[i]);
			total *= num[i];
		}
		
		System.out.println("total = " + total);  // total = 6000.0
		
	}

}


// 값을 할당하지 않은 index([3], [4]) 에는
// int 일땐 0
// double 일땐 0.0
// 객체일땐 null 이 초기값으로 들어가있음.