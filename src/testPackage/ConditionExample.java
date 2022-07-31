package testPackage;

public class ConditionExample
{

	public static void main(String[] args) 
	{
		int age =17;
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else if (age==17)
		{
			System.out.println("Sorry try again next year");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
		

	}

}
