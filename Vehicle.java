package Assignment2;

public class Vehicle {
	int numberOfWheels;
	int numberOfPassengers;
	int model;
	String make;
	
	Vehicle(){}
	
	public Vehicle(int numberOfWheels,int numberOfPassengers,int model,String make)
	{
		super();
		this.numberOfWheels=numberOfWheels;
		this.numberOfPassengers=numberOfPassengers;
		this.model=model;
		this.make=make;
		
	}
	public void display()
	{
		System.out.println("Number of Wheels : "+ numberOfWheels);
		System.out.println("Number of Passengers : "+ numberOfPassengers);
		System.out.println("Model : "+ model );
		System.out.println("Make : "+ make);
	}
}
