package ifexample;


public class SwitchCase {

	public static void main(String[] args) {

		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank +"등 메달의 색깔은 " + medalColor + "입니다.");
		
		// 만약 case 1 의 break 가 없다면,
		// case 2 가 아님에도 medalColor = 'S' 구문이 실행되어 논리오류발생.
		
		
		if (rank == 1) {
			medalColor = 'G';
		}
		else if (rank == 2) {
			medalColor = 'S';
		}
		else if (rank == 3) {
			medalColor = 'B';
		}
		else {
			medalColor = 'A';
		}
		System.out.println(rank +"등 메달의 색깔은 " + medalColor + "입니다.");
		
	}

}

/*
switch-Case 문
조건식의 결과가 정수 또는 문자열 값이고 그 값에 따라 수행문이 결정될 때,
if else 문을 대신하여 switch case 문을 사용할 수 있음.
중괄호는 한 번만 사용함.
*/