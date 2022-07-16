package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1);
		// 기본적으로 생성자가 호출되는 시점은 new 키워드를 통해 인스턴스가 생성될 때인데,
		// 생성자 내에서는 this 를 사용하면 다른 생성자를 호출할 수 있음.
		// 또한 이 경우에, this 이전에 어떠한 statement 도 작성할 수 없음.
		// 여기서는
		// name = "이름없음"
		// age = 1 과 같은 코드임.
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
	// data type 은 자기 자신 class 인 Person 으로 반환형을 설정.
		return this;
	}
}




public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);  // 이름없음
		
		System.out.println(p1.returnSelf());  // thisex.Person@77556fd
	}

}



/*
this 가 하는 일
1. 자신의 메모리를 가르킴
2. 생성자에서 다른 생성자 호출
3. 자신의 주소를 반환
*/