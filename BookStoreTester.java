package Assignment2;
import java.util.Scanner;
public class BookStoreTester {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Book book[] = new Book[10];
		
		for (int i = 0; i < 10; i++) {
			book[i]=new Book("Author"+(i+1),"Book" + (i + 1),"ISBN" + (i + 1),10);
		}
		
		BookStore object = new BookStore(book);
		String option;
		int choice;
		do{
			System.out.println("Enter Your Choice");
			System.out.println("Enter 1 for Display the Books ");
			System.out.println("Enter 2 to order new books");
			System.out.println("Enter 3 to sell books  ");
			System.out.println("Enter 0 for Exit the application ");
			choice = scan.nextInt();
		            switch (choice) {
		            case 1:
		                object.display();
		                break;
		            case 2:
		            	System.out.println("Enter ISBN and Number of copies you want to order");
		            	String isbn=scan.nextLine();
		            	int number=scan.nextInt();
		                object.order(isbn, number);
		                break;
		            case 3:
		            	System.out.println("Enter BookName and Number of copies you Sold");
		            	String bookName=scan.nextLine();
		            	int number1=scan.nextInt();
		                object.sell(bookName, number1);
		                break;
		            case 0:
		                System.exit(0);
		                break;
		            default:
		                System.out.println("Invalid Input");
		            }
		        System.out.println("Wnat to continue ? (Yes/No)");
		        option = scan.next();
		}while(option.equals("YES")||option.equals("yes"));
		scan.close();
	}

}
