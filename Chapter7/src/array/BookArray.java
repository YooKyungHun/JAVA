package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		// Book 이 들어갈 Array 가 만들어진거지,
		// 아직, book 이 만들어진 상태는 아님.
		// (=객체배열은 선언한다고 해서 인스턴스가 만들어진 상태는 아님)
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);  // null; *5
		}
		
		library[0] = new Book("태백산맥 1편", "조정래");
		library[1] = new Book("태백산맥 2편", "조정래");
		library[2] = new Book("태백산맥 3편", "조정래");
		library[3] = new Book("태백산맥 4편", "조정래");
		library[4] = new Book("태백산맥 5편", "조정래");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
//			
		}
	}

}



