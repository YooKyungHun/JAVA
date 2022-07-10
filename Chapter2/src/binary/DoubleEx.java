package binary;

public class DoubleEx {
	
	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14F;
		
		// 정수는 기본적으로 int 로 저장했듯이
		// 실수는 기본적으로 double 형으로 저장함.
		// 따라서 실수를 float 형으로 저장할 때에는 F 를 붙여줌.
		// float Num = 3.14 라고 할당하면 F 가 없기 때문에 에러 발생. 
	
		
		var str = "string";  // char 형으로 자동인식 
		var num2 = 3.14;  // double 형으로 자동인식.
		var num = 10;  // int 형으로 자동인식.
		
		num = 3.14;  // 이미 int 로 정의했기 때문에 double 형 할당 불가.

		/*
		자료형 추론: type 을 정하지 않고 정의(var).
		Java 10 부터 사용가능.
		멤버변수는 자료형 추론을 사용할 수 없고,
		지역변수는 자료형 추론을 사용할 수 있음.
		*/
		
		
		
	}

}

/*
실수자료형
float: 4byte = 32bit = 1bit(부호) + 8bit(지수부) + 23bit(가수부)
double: 8byte = 64bit = 1bit(부호) + 11bit(지수부) + 52bit(가수부)
실수는 기본적으로 작은 소수점도 많기 때문에 double 형으로 저장함.
*/

