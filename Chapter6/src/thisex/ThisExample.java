package thisex;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		// 여기서 this 를 생략하게 되면 year 은
		// 파라미터로 사용되는 year 로 인식됨.
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);  // thisex.Birthday@77556fd
		b1.printThis();  // thisex.Birthday@77556fd
		// b1 이 가르키고 있는 값과
		// b1 의 this 가 가르키고 있는 값이 같기 때문에
		// 현재 this 는 자기자신을 가르키고 있다고 할 수 있음.
		
		System.out.println(b2);  // thisex.Birthday@368239c8
		b2.printThis();  // thisex.Birthday@368239c8
		// 또한, 같은 this 라고 하더라도, 가르키는 주소값이 다르기 때문에
		// this.year 에서 각기 다른 인스턴스의 주소값을 의미함을 알 수 있음.
	}

}

