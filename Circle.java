package Assignment2;

public class Circle {
	private double radius;
	 String color;
	
	public Circle()
	{}
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea(double radius)
	{
		return (Math.PI)*radius*radius;
	}
	public double getCircumfremce(double radius)
	{
		return 2*(Math.PI)*radius;
	}
	public String returnString()
	{
		String s="Circle[radius="+ radius +"]";
		System.out.println(color);
		return s;
	}
		
}
