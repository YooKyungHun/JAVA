package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);  // singleton.Company@77556fd
		System.out.println(c2);  // singleton.Company@77556fd
		// 동일한 값이 나온다는 
	}

}
