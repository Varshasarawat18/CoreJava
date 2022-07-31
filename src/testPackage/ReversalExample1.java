//WAP to reverse integar no

package testPackage;

public class ReversalExample1 {

	public static void main(String[] args) {
		int num =456789;
		System.out.println("Actual no is : "+ num);
		int rev=0;
		while (num>0)
		{
			int rem=num%10;
			rev =rev*10+rem;
			num= num/10;
		}
		System.out.println("Reverse no is: " + rev);

	}

}
