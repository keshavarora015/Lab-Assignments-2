package Assignment2;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Book()
	{}
	
	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.print( " Title : " + bookTitle);
		System.out.print( " Author:" + author);
		System.out.print( " ISBN Number:" + ISBN);
		System.out.print( " No. of copies avail. : " + numOfCopies);
		System.out.println();
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
}
