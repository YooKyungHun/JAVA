package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr1 = new int[2][3];
		
		System.out.println(arr1.length);  // 2	
		System.out.println(arr1[0].length);  // 3

		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(arr2.length);  // 2	
		System.out.println(arr2[0].length);  // 3
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);  // 1, 2, 3, 4, 5, 6
			}
		}
	}

}
