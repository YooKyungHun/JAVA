package inheritance;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}


class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날읍니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개로 비행합니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
	}
	
	
	
	
	public void moveAnimal(Animal animal) {
	// Animal animal = new Human(); (업캐스팅)후
	// moveAnimal(animal) 한것과 같음.
	// 즉, animal 은 상위클래스로 선언되어, Animal 의 참조변수와 메서드만 접근가능하지만,
	// move() 라는 메서드가 하위클래스에서 재정의(overriding) 되어있어서, 
	// 각각 하위클래스에서 재정의된 move() 가 호출된 것.
	// 다형성과 분리하지말고, 상속, overriding, 가상함수 의 큰 흐름으로 이해할 것. 
	
		animal.move();
		// 사람이 두발로 걷습니다.
		// 호랑이가 네발로 뜁니다.
		// 독수리가 하늘을 날읍니다.
		
		if (animal instanceof Human) {
		// animal 의 자료형이 Human 형이라면,
			Human human = (Human) animal;
			// animal 을 Animal 형에서 Human 형으로 다운캐스팅.
			human.readBook();
		}
		else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		}
		else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		}
		// animal 은 상위클래스로 선언되었기 때문에
		// 재정의된 메서드를 제외하고는 Animal 의 참조변수와 메서드만 접근가능함.
		// 따라서 하위클래스의 메서드인(readBook, hunting, flying) 을 사용할 수 없음.
		// 이때 굳이 쓰고자한다면 다운캐스팅을 해서 명시적 형변환을 해주어야함.
		// 다운캐스팅보단 overriding 코딩이 더 좋음.
		
		
	}
	// 다형성
	// 하나의 클래스(Animal) 를 상속받은 여러 클래스(Human, Tiger, Eagle) 가 있는 경우,
	// 각 클래스마다 같은 이름(move())의 서로 다른 메서드를 재정의함.
	// 상위 클래스 타입으로 선언된 하나의 변수가
	// 여러 인스턴스에 대입되어 다양한 구현이 실행될 수 있음.

}
