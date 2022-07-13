package classpart;

public class Student {
	
	int studentID;
	String studentName;
	// String 은 문자열을 구현한 jdk 제공의 class
	int grade;
	String address;
	
	// 생성자 overloading
	// (동일한 이름의 method 가 매개변수가 다른경우)
	public Student() {} 
	// default 생성자(= 기본생성자)
	// 매개변수가 없음
	// 생성자가 하나도 없을때 생성됨.
	// 하지만 생성자가 하나라도 있다면 기본 생성자가 support 되지 않지만,
	// 필요하다면 직접 코딩(public Student() {} )하여 사용할 수 있음.
	// 이 개체가 생성될때 기본적으로 하고 싶은 일들을 구현.

	// id 와 이름을 매개변수로 입력받는 생성자.
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	
	
	public void showStudentInfor( ) {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		// 해당 클래스를 사용하는 입장에서 네이밍(get)하는 것이 좋음.
		return studentName;
	}
	
	// 이름 바꾸는 class
	public void setStudentName(String name) {
		// 반환값이 없는 경우 void 를 붙여줌.
		studentName = name;
	}
	
	
	
	
	
	
	
	
}


