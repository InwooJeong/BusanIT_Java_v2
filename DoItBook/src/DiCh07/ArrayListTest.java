package DiCh07;
import java.util.*; //ArrayList 클래스 import

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); //ArrayList 선언
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만 헤세"));
		library.add(new Book("신곡", "단테"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생텍쥐페리"));
		
		
		for(int i=0;i<library.size();i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book i:library) {
			i.showBookInfo();
		}

	}

}
