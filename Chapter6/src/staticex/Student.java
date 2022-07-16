package staticex;

public class Student {
	
	private static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		// 학생이 생성할 때마다 constructor 가 호출된다는 점을 이용해서,
		// 생성자에서 serialNum 을 ++ 해줌.
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10;
		i++;
		System.out.println(i);
		// 지역변수
		
//		studentName = "홍길동";
		// 멤버변수(=인스턴스 변수)
		// static method 에서는 멤버변수(=인스턴스 변수) 를 사용할 수 없음.
		// 인스턴스 변수는 반드시 인스턴스가 먼저 생성되어야 하므로,
		// static method 에서 인스턴스 변수의 생성이 불확실하기 때문.
		
		return serialNum;
		// static변수(=클래스 변수)
	}
	
}



//static 변수
//여러 개의 인스턴스가 같은 메모리의 값을 공유하기 위해 사용됨(ex)studentID).
//James, Tomas 등이 같이 사용할 수 있음.
//Heap 메모리는 객체가 생성될 때 할당을 받고, 소멸되면 메모리가 사라짐.
//static 변수는 Heap 메모리에 생성되는 것이 아니라, 
//data 영역, 정적 영역 등으로 불리는 별도의 메모리 공간에 저장됨.
//따라서, 인스턴스 변수들처럼 new 할 때 Heap 에 할당받는 것이 아니라,
//전체 프로그램이 메모리에 load 될 때 할당됨.
//static 변수 외에도 상수, literal 메모리에 할당됨.
//또한, 인스턴스의 생성과 관계없이 클래스 이름으로 직접 참조하기 때문에
//클래스 변수 라고도 함.
//멤버변수(=인스턴스 변수), static변수(=클래스 변수)
