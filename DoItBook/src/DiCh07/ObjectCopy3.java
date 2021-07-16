package DiCh07;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���","������");
		bookArray1[1] = new Book("ȣ��", "��Ų");
		bookArray1[2] = new Book("���̾�", "�츣�� �켼");
		
		bookArray2[0] = new Book(); //����Ʈ �����ڷ� bookArray2 �迭 �ν��Ͻ� ����
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		for(int i=0;i<bookArray1.length;i++) { //bookArray1 �迭 ��Ҹ� ���� ������ bookArray2 �迭 �ν��Ͻ��� ����
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(Book b : bookArray2) {
			b.showBookInfo();
		}
		
		bookArray1[0].setBookName("������ ����");
		bookArray1[0].setAuthor("��Ų"); //bookArray1 ù ��� �� ����
		
		System.out.println("=== bookArray1 ===");
		for(Book b : bookArray1) {
			b.showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");
		for(Book b : bookArray2) { //bookArray1 �迭 ��� ���� �ٸ���!
			b.showBookInfo();
		}
		
	}

}
