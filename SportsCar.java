package Assignment2;

class SportsCar extends Car {
	SportsCar(int numberOfWheels,int numberOfPassenger,int model,String make,int doors)
	{
		super(numberOfWheels,numberOfPassenger,model,make,2);
	}
	public void display()
	{
		super.display();
		System.out.println("No. of Doors : " + 2);
	}
}
