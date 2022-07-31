//WAP to find count vowels in string

package testPackage;

public class VowelCheckExample
{

	public static void main(String[] args) {

		String str ="Clean World Green World";   // if string in both case then convert it in starting lowercase or uppercase then apply same logic 
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)  //here we are iterating against each character
		{
		char ch=str.charAt(i);
		
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
			count++;
				}
		
		}
		System.out.println("Print the no:" + count) ;

	}

}
