package Assignment2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Account account=new Account();

		System.out.println("Please Enter your Name");
		String name = scan.nextLine();
		System.out.println("Please Enter Which account you want to be get opned");
		System.out.println("For Saving Account Press 1 and Enter AccountBalance");
		System.out.println("For Current Account Press 2 and Enter Account Balance");
		int choise=scan.nextInt();
		if(choise==1)
		{
			int balance=scan.nextInt();
			account=new SavingAccount(name,balance);
		}
		else if(choise==2)
		{
			int balance=scan.nextInt();
			System.out.println("Enter Lience ID");
			int lienceid=scan.nextInt();
			account=new CurrentAccount(name,balance,lienceid);
		}
		else
			System.out.println("Wrong Input!");
		
		while(true)
		{
			System.out.println("Which Service you want :");
			System.out.println("Press 1 for deposit money");
			System.out.println("Press 2 for withdraw money");
			System.out.println("Press 3 for Display money");
			System.out.println("Press 4 to Exit");		
			choise=scan.nextInt();
			if(choise==1)
			{
				System.out.println("Enter Amount you want to deposit");
				double money=scan.nextDouble();
				System.out.println(" You Want to display the balance?");
				System.out.println("Press 1 to view Balance");
				choise=scan.nextInt();
				if(choise==1)
				{
					account.displayBalance();
					System.out.println("After deposit");
					account.setAccountBalance(account.getAccountBalance()+money);
					account.displayBalance();
				}
				else
				{
					account.setAccountBalance(account.getAccountBalance()+money);
				}
			}
			else if(choise==2)
			{
				System.out.println("Enter Amount you want to Withdraw");
				double money=scan.nextDouble();
				System.out.println(" You Want to display the balance?");
				System.out.println("Press 1 to view Balance");
				choise=scan.nextInt();
				if(choise==1)
				{
					account.displayBalance();
					System.out.println("After Withdraw");
					account.setAccountBalance(account.getAccountBalance()-money);
					account.displayBalance();
				}
				else
				{
					account.setAccountBalance(account.getAccountBalance()-money);
				}
			}
			else if(choise==3)
			{
				account.displayBalance();
			}
			else if(choise==4)
			{
				System.out.println("Thankyou!!");
				break;
			}
			else
			{
				System.out.println("invalid choise");
			}
		}
		
	}

}
