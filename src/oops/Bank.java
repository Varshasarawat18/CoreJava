package oops;

public class Bank {

	public int AccountNUm;
	
	public void DisplayBalance()
	{
				System.out.println("Check Displaye Balance Bank Class");
	}
	public int GetBalance()
	{
		return 1000;
	}
	public void closeAccount(int accountNumber)
	{
		System.out.println("Indside Bank account class");
	}
}
