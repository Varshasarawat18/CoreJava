package testPackage;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) 
	{

		Scanner scanner= new Scanner (System.in);
		System.out.println("Input no your want to check:");
		Integer num= scanner.nextInt();
		Boolean flag=true;
		
		for(int i=2 ;i<num ;i++)
		{
			int remainder =num%i;
			if(remainder==0)
			{
				System.out.println("Num is not prime:" +num );
				flag=false;
				break;
			}
		}
		if (flag==true)
		{
		System.out.println("No is prime :" +num);
		
	}
}
}

