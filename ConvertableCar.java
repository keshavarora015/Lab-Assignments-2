package Assignment2;

class ConvertableCar extends Car {

	boolean isHoodOpen=false;
	
	ConvertableCar(int numberOfWheels,int numberOfPassenger,int model,String make,int doors,boolean hood)
	{
		super(numberOfWheels,numberOfPassenger,model,make,doors);
		this.isHoodOpen=hood;
	}
	
	public void display()
	{
		super.display();
		if(isHoodOpen)
		{
			System.out.println("Hood is open");
		}
		else
			System.out.println("Hood is Close");
	}
	
}