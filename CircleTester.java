package Assignment2;

import java.util.Scanner;

public class CircleTester {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Entre Radius");
	double radius=scan.nextDouble();
	scan.nextLine();
	System.out.println("Enter color");
	String color=scan.nextLine();
	//in.nextLine();
	
	Circle object=new Circle(radius,color);
	String s=object.returnString();
	System.out.println(s);
	scan.close();
}
}