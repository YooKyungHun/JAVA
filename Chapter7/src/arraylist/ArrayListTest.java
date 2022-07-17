package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three";  // 오류발생
		// array 가 가진 크기보다 더 많이 data 를 넣었기 때문에 오류발생(실행시).
		// 데이터의 크기를 모르는 경우에 사용하기 어렵다는 한계
		
		// 이에 ArrayList class 를 이용해서 배열과 비슷한 작업을 수행가능.
		// 배열과는 다르게 몇 개의 data 를 담을 수 있는지 작성을 하지 않아도 됨.
		// ArrayList 는 배열이 아님.

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		// ArrayList 의 add() 메서드는 어떠한 형태의 data 타입도 수용할 수 있음.
		// 이것이 가능하기 위해서는 add() 의 인자가 object 여야함.
		// object 는 모든 데이터 타입의 최상위이기 때문임.
		// 따라서 "one" 이라는 String 타입의 데이터는 ArrayList 에 저장될때,
		// object 타입으로 저장이 됨.
		
		String firstValue = list.get(1);
		// object 타입의 list 의 원소를 String 타입의 변수에 담기 위해서는 
		// (String)list.get(1) 로 형변환을 해주어야 하는데,
		// 이는 옛날 방식이고,
		// ArrayList<String> 이 최근방식.
		// ArrayList 인 list 에 추가되는 값인 "one" 이 String 이라고 지정해 준다는 의미.

		
		for(String str : list) {
			System.out.println(str);  // aaa, bbb, ccc
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));  // aaa, bbb, ccc
		}
		// ArrayList 는 list[idx] 로 접근이 불가능함.
		// ArrayList 는 length 로 접근이 불가능함.
		// ArrayList 는 size() 메서드로 접근.
		// ArrayList 는 배열이 아니기 때문.
	}

}
