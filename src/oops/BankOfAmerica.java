package oops;

public class BankOfAmerica extends Bank 
{ 
	public int CreditCard;
	public void CCBalance()
	{
		System.out.println("Check CC Balance");
	}
	public void closeAccount(int CreditCard)
	{
		System.out.println("Indside Bank of america class");
	}
}

