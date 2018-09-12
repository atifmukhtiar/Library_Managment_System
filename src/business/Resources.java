package business;

import java.util.*;

public class Resources {
	private List<Member> members = new LinkedList<>();
	private List<Book> books = new LinkedList<>();
	private List<CheckoutRecord> checkoutRecords = new LinkedList<>();
	
	public CheckoutRecord getCheckoutRecord(Member member) {
		CheckoutRecord record=null;
		
		for(CheckoutRecord rec:checkoutRecords) {
			if(member.getMemberId()==rec.getMember().getMemberId()) {
				record=rec;
			}
			break;
		}
		return record;
	}
	
	public Book isBookStocked(String title) {
		Book match=null;
		
		for(Book book:this.books) {
			if(book.getTitle()==title) {
				match=book;
				break;
			}			
		}
		
		if(match==null) {
			System.out.println("Book not found");
			return null;
		}	
		
		if(!match.isCopyAvailable()) {
			System.out.println("Book is nolonger available");
			return null;
		}
		
		return match;
		
	}

	public void addMembers(Member member) {
		this.members.add(member);
	}
	
	public List<Member> getMembers(){
		return this.members;
	}
	
	public List<Book> getBooks(){
		return this.books;
	}
	
	public List<CheckoutRecord> getCheckoutRecords(){
		return this.checkoutRecords;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void addCheckoutRecord(CheckoutRecord checkoutrecord) {
		this.checkoutRecords.add(checkoutrecord);
	}

	public static void main(String[] args) {
		//creating members
		Member m1 = new Member(1, "Deusdedit", "Lutwama", "+1(641)481-4468", "1000N 4th Street", "Fairfield", "Iowa",52557);
		Member m2 = new Member(2, "Atif", "Mukhtiar", "+1(641)480-0000", "1000N 4th Street", "Fairfield", "Iowa",52557);
		Member m3 = new Member(3, "Dawit", "Kahsay", "+1(641)299-1111", "1000N 4th Street", "Fairfield", "Iowa", 52557);
		
		
		//creating checkoutRecords
		CheckoutRecord checkoutrecordM1=new CheckoutRecord(m1);
		CheckoutRecord checkoutrecordM2=new CheckoutRecord(m2);
		CheckoutRecord checkoutrecordM3=new CheckoutRecord(m3);
		
		//creating Books and their copies
		Book englishBook=new Book("Learning English",1234,21,true);
		BookCopyFactory.bookCopyFactory(englishBook);
		BookCopyFactory.bookCopyFactory(englishBook);
		BookCopyFactory.bookCopyFactory(englishBook);
		BookCopyFactory.bookCopyFactory(englishBook);
		BookCopyFactory.bookCopyFactory(englishBook);
		
		Book frenchBook=new Book("Learning French",2341,21,true);
		BookCopyFactory.bookCopyFactory(frenchBook);
		BookCopyFactory.bookCopyFactory(frenchBook);
		BookCopyFactory.bookCopyFactory(frenchBook);
		BookCopyFactory.bookCopyFactory(frenchBook);
		BookCopyFactory.bookCopyFactory(frenchBook);
		
		Book germanBook=new Book("Learning German",3412,7,true);
		BookCopyFactory.bookCopyFactory(germanBook);
		BookCopyFactory.bookCopyFactory(germanBook);
		BookCopyFactory.bookCopyFactory(germanBook);
		BookCopyFactory.bookCopyFactory(germanBook);
		BookCopyFactory.bookCopyFactory(germanBook);

		Book swahiliBook=new Book("Learning Swahili",4123,7,true);
		BookCopyFactory.bookCopyFactory(swahiliBook);
		BookCopyFactory.bookCopyFactory(swahiliBook);
		BookCopyFactory.bookCopyFactory(swahiliBook);
		BookCopyFactory.bookCopyFactory(swahiliBook);
		BookCopyFactory.bookCopyFactory(swahiliBook);
		
		
		Resources library=new Resources();
		//Adding members to Library
		library.addMembers(m1);
		library.addMembers(m2);
		library.addMembers(m3);
		
		//Stocking Book copies
		library.addBook(englishBook);
		library.addBook(frenchBook);
		library.addBook(swahiliBook);
		library.addBook(germanBook);
		
		//Adding checkoutRecords for each member
		library.addCheckoutRecord(checkoutrecordM1);
		library.addCheckoutRecord(checkoutrecordM2);
		library.addCheckoutRecord(checkoutrecordM3);
				
		//System.out.println(library.getBooks().get(1).getCopies());
		
		checkoutBook(library,"Learning French",m1);
		checkoutBook(library,"Learning French",m1);
		
		System.out.println(library.getCheckoutRecord(m1).getCheckoutentries());
	}
	
	public static void checkoutBook(Resources library, String bookTitle, Member member) {
		Book book=library.isBookStocked(bookTitle);
		CheckoutEntry checkoutentry=new CheckoutEntry(book.getBookCopy());	
		CheckoutRecord memberCheckoutRecord=library.getCheckoutRecord(member);
		memberCheckoutRecord.addCheckoutentries(checkoutentry);
		
		//System.out.println(checkoutentry);
		
	}

}
