package Assignment2;

public class CurrentAccount extends Account {
	private int tradeLicenseNumber;
	
	public CurrentAccount() {}

	public CurrentAccount(String name,double balance,int tradeLicenseNumber) {
		super(name,balance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	public double getBalance()
	{
		return this.getAccountBalance();
	}
	
	public int getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}

	public void withdraw(double money)
	{
		if(money>this.getAccountBalance())
		{
			System.out.println("Sorry!! please don't go beyound your limits ");
		}
		else
		{
			double tempBalance=this.getAccountBalance()-money;
			this.setAccountBalance(tempBalance);
		}
		
	}
	

}
