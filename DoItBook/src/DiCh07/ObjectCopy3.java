package DiCh07;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("호빗", "톨킨");
		bookArray1[2] = new Book("데미안", "헤르만 헤세");
		
		bookArray2[0] = new Book(); //디폴트 생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i=0;i<bookArray1.length;i++) { //bookArray1 배열 요소를 새로 생성한 bookArray2 배열 인스턴스에 복사
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(Book b : bookArray2) {
			b.showBookInfo();
		}
		
		bookArray1[0].setBookName("반지의 제왕");
		bookArray1[0].setAuthor("톨킨"); //bookArray1 첫 요소 값 수정
		
		System.out.println("=== bookArray1 ===");
		for(Book b : bookArray1) {
			b.showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(Book b : bookArray2) { //bookArray1 배열 요소 값과 다르다!
			b.showBookInfo();
		}
		
	}

}
