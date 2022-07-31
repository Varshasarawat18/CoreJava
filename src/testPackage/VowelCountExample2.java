//Switch is more better then using pipeline and it inc performance as well of the code

package testPackage;

public class VowelCountExample2 
{
	public static void main(String[] args) 
	{	
		String str ="Clean World Green World";   // if string in both case then convert it in starting lowercase or uppercase then apply same logic 
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++)  //here we are iterating against each character
		{
		char ch=str.charAt(i);	
		switch(ch)
			{
		 	case 'a' :
		 	case 'e' :
		 	case 'i' :
		 	case 'o' :
		 	case 'u' :
		 		count++;
		 		break;
			}
		}
System.out.println("Print the vowel count :" +count);
	}

}

