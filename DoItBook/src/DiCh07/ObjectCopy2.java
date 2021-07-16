package DiCh07;

public class ObjectCopy2 { //얕은 복사shallow copy : 주소 값만 복사한다.

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("군주론", "마키아 벨리");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(Book b : bookArray2) {
			b.showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===bookArray1===");
		for(Book b : bookArray1) {
			b.showBookInfo();
		}
		
		System.out.println("===bookArray2===");
		for(Book b : bookArray2) { 
			b.showBookInfo(); //bookArray1의 변경 사항이 bookArray2에 반영된다.
		}

	}

}
