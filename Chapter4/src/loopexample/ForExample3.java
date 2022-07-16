package loopexample;

public class ForExample3 {

	public static void main(String[] args) {

		String[] strArr = {"Java", "Android", "C"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);  // Java, Android, C
		}
		
		for(String str : strArr) {
			System.out.println(str);  // Java, Android, C
		}
		
		int[] intArr = {1, 2, 3};
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);  // 1, 2, 3
		}
		
		for(int num : intArr) {
			System.out.println(num);  // 1, 2, 3
		}
	}

}
