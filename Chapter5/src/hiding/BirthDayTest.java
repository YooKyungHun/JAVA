package hiding;

class BirthDay {

	private int day;
	private int month;
	private int year;
	// private 은 같은 파일 내에 있더라도, class 안에서만 사용가능함(데이터 무결성).
	// 즉, 다른 클래스에서 직접 사용은 못하기 때문에,
	// getter setter 를 활용해서 접근하고자 함.
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1|| day > 28) {
				System.out.println("날짜오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class BirthDayTest {
// 하나의 작업 파일에 두 개 이상의 class 가 있을 수 있지만,
// public class 는 단 하나이고, Java 파일의 이름과 같아야함.
	
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2018);
	}
}

/*
접근제어자
1. public: 외부 클래스에서 임의로 사용가능.
2. private: 자기 클래스에서만 사용가능.
3. default: 같은 package 에서 사용가능.
4. 상속: 상속관계에서만 public 처럼 사용하고, 다른 class 에는 private.
*/