package testPackage;

import java.util.Scanner;

public class ConditionExample1 {
	public static void main(String[] args) 
	{
		//int num=33;   //dont hard take input from user 
		
		Scanner scanner= new Scanner(System.in);  //this will take input from user and check logic
		System.out.println("Enter the number:");
		int num=scanner.nextInt();
		if(num%2==0)
		{
			System.out.println("num is even");
		}
			
		else
		{
			System.out.println("Num is odd");
		}
	}
	

}
