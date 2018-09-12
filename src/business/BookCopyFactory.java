package business;

public class BookCopyFactory {
	private static int count=0;
	private static BookCopy bookcopy;
	
	private BookCopyFactory() {
		
	}
	
	public static BookCopy bookCopyFactory(Book book){
		bookcopy=new BookCopy(book);
		book.addBookCopy(bookcopy);
		
		return bookcopy;
	}
	
	


	

}
