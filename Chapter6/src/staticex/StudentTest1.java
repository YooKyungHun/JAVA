package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentJames = new Student();
		System.out.println(studentJames.studentID);  // 10001
		// 속성값을 임의로 할당해주지도 않고, static 변수를 사용하지도 않는다면,
		// 처음에는 studentID 가 시스템 임의대로 0 이 할당됨.
		
		Student studentTomas = new Student();
		System.out.println(studentTomas.studentID);  // 10002

		
		System.out.println(studentJames.getSerialNum());  // 10002
		System.out.println(studentTomas.getSerialNum());  // 10002
		// studentJames, studentTomas 가
		// static 변수인 serialNum 을 공유하고 있음.
		// static 변수는 인스턴스 생성과는 상관없이 메모리에 잡히기 때문에,
		
		System.out.println(Student.getSerialNum());  // 10002
		// 참조변수(studentJames.serialNum)로 사용하지 않고,
		// Class 이름으로 바로 참조를 함.

	}

}
