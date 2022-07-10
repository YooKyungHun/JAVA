package binary;

public class ImplicitConversion {

	public static void main(String[] args) {

		// 묵시적 형변환
		byte bNum = 10;
		int num = bNum;
		// bNum 은 1byte, num 은 4byte.
		// 이때 할당은 아무런 문제가 되지 않음.
		// 자연스러운 형변환.
		
		long lNum = 10;
		// 10 은 정수이기 때문에 int 로서 4byte 로 저장됨.
		// long 이라는 8byte 변수에 저장되더라도, 아무런 문제가 되지 않음.
		// 자연스러운 형변환.
		
		float fNum = lNum;
		// lNum 은 8byte 지만 정수(덜 정밀한 수)이고
		// float 는 실수(더 정밀한 수)이기 때문에, 아무런 문제가 되지 않음.
		// 자연스러운 형변환.
		System.out.println(fNum);  // 10.0
		
		double dNum = fNum + num;
		// fNum 과 num 을 더하기 위해
		// num 이 int 에서 float 로 형변환이 일어나고,
		// fNum + num 가 float 에서 double 에 할당하면서 형변환이 일어남.

	}

}


/*
형변환
자료형은 각각 사용하는 메모리 크기와 방식이 다름.
서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어남.
묵시적(자연스러운) 형변환: 작은수에서 큰수로, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우.
명시적 형변환: 자료의 손실이 일어날 수 있으며, 변환되는 자료형을 명시해야 함.
 */