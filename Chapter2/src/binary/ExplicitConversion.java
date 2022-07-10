package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
			
		int iNum = 1000;
		byte bNum = (byte)iNum;
		// int 인 iNum 을 byte 인 bNum 에 할당하는 것은,
		// 큰 수에서 작은 수에 할당하는 것이기 때문에,
		// 사용자가 명시적으로 형변환을 해주어야 에러가 발생하지 않음.
		
		System.out.println(iNum);  // 1000
		System.out.println(bNum);  // -24
		// 명시적인 형변환을 해주더라도 iNum 의 값 자체가 바뀌는 것이 아니라,
		// 자료형이 바뀌어서 할당되는 것뿐.
		// byte 는 1byte 를 사용하고, int 는 4byte 를 사용하기 때문에,
		// 할당하는 과정에서 1byte 에 해당하는 값만 잘라서 할당됨(데이터의 유실).
		
		double dNum = 3.14;
		iNum = (int)dNum;
		// double 은 int 보다 더 정밀한 수 이기 때문에,
		// 직접 할당은 불가능하고, int 로 명시적 형변환을 해서 할당해야함.
		System.out.println(iNum);  // 3
		// 실수형 자료형에서 뒤의 소수부분이 잘리고(데이터의 유실),
		// 정수부분만 iNum 에 할당됨. 
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		System.out.println(num1);  // 3
		System.out.println(num2);  // 4
		// (int)dNum 는 3 이 되고 (int)fNum 는 0 이 되어, 3 으로 출력.
		// 즉, 실수에서 정수로 형변환을 하게 되면 소수부분이 잘림(데이터의 유실).
		// (dNum + fNum) 가 4.23 이 되어, 4 로 출력.
	}

}


/*
형변환
자료형은 각각 사용하는 메모리 크기와 방식이 다름.
서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어남.
묵시적(자연스러운) 형변환: 작은수에서 큰수로, 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우.
명시적 형변환: 자료의 손실이 일어날 수 있으며, 변환되는 자료형을 명시해야 함.
 */