package Assignment2;

public class SavingAccount extends Account {
	private double intrest=5;
	private double maxLimit=25000;
	private double minBalance=5000;
	
	public SavingAccount() {}

	public SavingAccount(String name,double accountBalance) {
		super(name,accountBalance);
	}
	
	public double getBalance()
	{
		return this.getAccountBalance()+this.getAccountBalance()*intrest*(0.01);
	}
	
	public void withdraw(double money)
	{
		if(money > this.getAccountBalance())
		{
			System.out.println("Sorry Don't go beyond your limits!!" );
		}
		else {
			double tempBalance=this.getAccountBalance()-money;
			if(tempBalance < minBalance || money >maxLimit )
			{
				System.out.println("Sorry Don't go beyond your limits!!" );
			}
			else
			{
				this.setAccountBalance(tempBalance);
			}
			
		}
		
		
	}
}
