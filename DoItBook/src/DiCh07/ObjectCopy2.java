package DiCh07;

public class ObjectCopy2 { //���� ����shallow copy : �ּ� ���� �����Ѵ�.

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("���ַ�", "��Ű�� ����");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(Book b : bookArray2) {
			b.showBookInfo();
		}
		
		bookArray1[0].setBookName("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("===bookArray1===");
		for(Book b : bookArray1) {
			b.showBookInfo();
		}
		
		System.out.println("===bookArray2===");
		for(Book b : bookArray2) { 
			b.showBookInfo(); //bookArray1�� ���� ������ bookArray2�� �ݿ��ȴ�.
		}

	}

}
