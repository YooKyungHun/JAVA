package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		// Book 이 들어갈 Array 가 만들어진거지,
		// 아직, book 이 만들어진 상태는 아님.
		// (=객체배열은 선언한다고 해서 인스턴스가 만들어진 상태는 아님)

		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			// 태백산맥1, 조정래
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			// 태백산맥1, 조정래
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		System.out.println("=================");  
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");

		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			// 나목, 박완서
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			// 나목, 박완서
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		System.out.println("=================");  
		
		// bookArray1[0] 의 제목과 저자만 바꾸었을 뿐인데,
		// bookArray2[0] 의 제목과 저자도 바뀜.
		// 즉, System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		// 의 과정에서 값이 복사된게 아니고, 주소가 복사된 것(얉은 복사).
		// 즉, 객체 배열을 복사한다고 해서, 서로 다른 인스턴스를 가르키는 것이 아님.

		// 서로 다른 주소를 가르킬 수 있는, 깊은 복사를 위해서는,
		// bookArray2 의 인스턴스를 새로 만들고,
		// System.arraycopy 가 아니라 직접 대입해서 복사를 해주어야 함.

		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("미생");
		bookArray1[0].setAuthor("윤태호");
	
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
			// 미생, 윤태호
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
			// 나목, 박완서
			// 태백산맥2, 조정래
			// 태백산맥3, 조정래
		}
		
		// 깊은 복사를 하였기 때문에, bookArray1[0] 의 값만 달라지고
		// bookArray2[0] 의 값은 달라지지 않음.
		
		
		
		
		
		
		
	}

}


//배열복사
//System.arraycopy(src, srcPos, dest, destPos, length)
//src: 복사할 배열 이름
//srcPos: 복사할 배열의 첫 번째 위치
//dest: 복사해서 붙여넣을 대상 배열 이름
//destPos: 복사해서 대상 배열에 붙여넣기를 할 첫 번째 위치
//length: src 에서 dest 로 자료를 복사할 요소 개수
