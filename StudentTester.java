package Assignment2;

import java.util.Scanner;

public class StudentTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student student = null;
		System.out.println("Enter your choice 1.--to create object   2.--Display the object");
		int choice = scan.nextInt();
		if (choice == 1) {
			System.out.println("What input you want to provide");
			System.out.println("1. you want to give name , id and grade");
			System.out.println("2. you want to give name and id");
			System.out.println("3. you want to give id");
			choice = scan.nextInt();
			student = new Student();
			if (choice == 1) {
				String name = scan.nextLine();
				String id =scan.nextLine();
				double grade =scan.nextDouble();
				student = new Student(name,id,grade);
			}
			else if (choice == 2) {
				String name = scan.nextLine();
				String id =scan.nextLine();
				student = new Student(name,id);
			}
			else if (choice == 3) {
				String id =scan.nextLine();
				student = new Student(id);
			}
			else
			{
				System.out.println("Invalid choice");
			}
		}
		if (choice == 2) {
			if(student==null)
			{
				System.out.println("object not created !! ");
				return;
			}
			System.out.println("you want to display the year?");
			System.out.println("1.-YES");
			System.out.println("2.-NO");
			int year=scan.nextInt();
			if(year==1)
			{
				System.out.println("Enter Year ");
				year=scan.nextInt();
				student.display(year);
			}
			else
			{
				student.display();
			}
		}
		scan.close();
	}
}
