package DiCh07;
import java.util.*; //ArrayList Ŭ���� import

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>(); //ArrayList ����
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("�Ű�", "����"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		
		for(int i=0;i<library.size();i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===���� for�� ���===");
		for(Book i:library) {
			i.showBookInfo();
		}

	}

}
