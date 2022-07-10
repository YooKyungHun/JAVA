package binary;

public class CharacterEx {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);  // A
		System.out.println((int)ch);  // 65
		
		ch = 66;
		System.out.println(ch);  // B
		// 이미 위에서 char type 으로 선언했기 때문에
		// 정수형으로 재할당 해주더라도, 문자로 출력됨.
	
	
		int ch2 = 67;
		System.out.println(ch2);  // 67
		System.out.println((char)ch2);  // C
	}

}

//Java 에서 문자는 2byte 를 사용함.

/* 문자세트
문자세트: 문자를 위한 코드 값(숫자 값)들을 정해놓은 세트
아스키: 1byte 로 영문자, 숫자, 특수문자를 표현.
	1byte = 8bit 로,
	2^8 = 256 개 >> (영문자 56 + 숫자 + 특수문자) 이기에 가능.
유니코드: 한글과 같은 복잡한 언어를 표현하기 위한 표준 인코딩
	UTF-8, UTF-16 이 대표적.
	Java 는 UTF-16 채택. 
*/