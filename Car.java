package Assignment2;

class Car extends Vehicle {
	int numberOfDoors;
	Car(){}
	Car(int numberOfWheels,int numberOfPassenger,int model,String make,int doors)
	{
		super(numberOfWheels,numberOfPassenger,model,make);
		this.numberOfDoors=doors;
	}
	public void display()
	{
		super.display();
		System.out.println("No. of doors :"+ numberOfDoors);
	}
}
