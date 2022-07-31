/*
* 
**
***
****
*****
 */
//WAP to print above pattern
// for row and column two loops required

package testPackage;

public class PatternsExample {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");   //we dont want to move next line so print instead if println
			}
			System.out.println("");
		}

	}

}
