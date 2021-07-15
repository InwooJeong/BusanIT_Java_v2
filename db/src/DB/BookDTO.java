package DB;

public class BookDTO {
	private int bookid, price;
	private String bookname, publisher;
	
	public BookDTO() {
		
	}
	
	public BookDTO(int bookid, int price, String bookname, String publisher) {
		super();
		this.bookid = bookid;
		this.price = price;
		this.bookname = bookname;
		this.publisher = publisher;
	}
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return bookid +"\t\t"+ bookname +"\t\t"+ publisher +"\t\t\t"+ price ;
	}
	
//	@Override
//	public String toString() {
//		return "Book [bookid=" + bookid + ", price=" + price + ", bookname=" + bookname + ", publisher=" + publisher
//				+ "]";
//	}
	
	
	
}

