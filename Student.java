package Assignment2;

public class Student {
	private String name=null;
	private String id=null;
	private double grade=0.0;
	
	public Student()
	{}
	
	public Student(String id) {
		this.id=id;
	}
	
	public Student(String name, String id) {
		this(id);
		this.name = name;
	}
	
	public Student(String name, String id, double grade) {
		this(name,id);
		this.grade = grade;
	}
	
	
	public void display()
	{
		if(name!=null)
		{
			System.out.println(name);
		}
		if(id!=null)
		{
			System.out.println(id);
		}
		if(grade!=0.0)
		{
			System.out.println(grade);
		}
	}
	
	public void display(int year)
	{
		this.display();
		System.out.println("Current year :" + year);
	}
	
}
