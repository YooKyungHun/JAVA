package classpart;

public class StudentTest {

	public static void main(String[] args) {
	// 이 class 에 정의되어있지는 않지만,
	// 다른 class 에 정의된 Student class 를 호출할 수 있음.
		
	// class 를 수행(run 구동부분)하기 위한 main method 로서 형식이 동일함.
	// 하지만 main 부분은 Student 의 method 라고 부르지 않음.
	// 또한 이 main method 가 항상 같은 java 파일에 있는 것이 아니라,
	// 다른 class(StudentTest.java) 에서 호출하는 것도 가능함. 
		
		Student studentLee = new Student();
		// Student 가 참조형 데이터 타입.
		// studentLee 가 참조변수, Student() 가 생성자.
		// studentID, studentName, grade, address 가 멤버변수.
		studentLee.studentID = 100;
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";

		Student studentKim = new Student();
		// default 생성자가 있다면, new Student(101, "김유신"); 으로 작성하거나,
		// 생성자 overloading 을 함.
		studentKim.studentID = 101;
		studentKim.studentName = "김유신";
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);  // classpart.Student@77556fd
		System.out.println(studentKim);  // classpart.Student@368239c8
		// classpart.Student 는 Studnet class 의 패키지 이름까지 포함한 풀네임.
		// 77556fd 와 368239c8 는 16진수로 4byte * 8자리 = 32bit 의 address(참조값).
		// studentLee, studentKim 가 stack 에서 
		// Heap 에 저장된 각각의 멤버변수의 주소를 가르키고 있음.
	}
	
}


