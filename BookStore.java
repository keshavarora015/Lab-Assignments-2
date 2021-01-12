package Assignment2;

public class BookStore {
	private Book[] book;
	
	public BookStore() {}
	
	public BookStore(Book[] book) {
		this.book=new Book[book.length];
		for(int i=0;i<book.length;i++)
		{
			this.book[i]=book[i];
		}
	}
	public void sell(String bookTitle,int noOfCopies)
	{
		for(int i=0;i<book.length;i++)
		{
			if(bookTitle==book[i].getBookTitle())
			{
				int numberCopies=book[i].getNumOfCopies();
				if(numberCopies>noOfCopies)
				book[i].setNumOfCopies(numberCopies-noOfCopies);
				else
					System.out.println("Sold Out!!! Not Available");
			}
		}
	}
	public void order(String ISBN, int noOfCopies)
	{
		int flag=0;
		for(int i=0;i<book.length;i++)
		{
			if(ISBN.equals(book[i].getISBN()))
			{
				int numberCopies=book[i].getNumOfCopies();
				book[i].setNumOfCopies(numberCopies+noOfCopies);
				flag=1;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("First Add books to book store");
		}
	}
	public void display()
	{
		for(int i=0;i<book.length;i++)
		{
			book[i].display();
		}
	}
}
