package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
	// Student 를 생성할 때, 생성자에서 매개변수를 무조건 받고자 함.
	// 즉, 이름과 학생의 돈이 있어야만 Student 를 생성(new)할 수 있게 하려고 함.
		
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체의 협업
	// bus 라는 객체를 받아서, bus 의 take method 를 호출함으로써 영향을 줌.
	public void takeBus(Bus bus) {
	// 어떤 bus 를 탈지 bus 에 대한 정보를 매개변수로 받음.
	// 생성된 인스턴스가 매개변수로 들어와야 함.
		
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeBus(Subway subway) {
		
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}



