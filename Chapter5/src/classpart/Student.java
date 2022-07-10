package classpart;

public class Student {
	
	int studentID;
	String studentName;
	// String 은 문자열을 구현한 jdk 제공의 class
	int grade;
	String address;
	
	public void showStudentInfor( ) {
		System.out.println(studentName + ", " + address);
	}
	
	// class 를 수행(run 구동부분)하기 위한 main method 로서 형식이 동일함.
	// 하지만 main 부분은 Student 의 method 라고 부르지 않음.
	// 또한 이 main method 가 항상 같은 java 파일에 있는 것이 아니라,
	// 다른 class 에서 호출하는 것도 가능함. 
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
	}
	
}


