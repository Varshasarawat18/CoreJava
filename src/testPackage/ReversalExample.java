//WAP to reverse the string

package testPackage;

public class ReversalExample {

	public static void main(String[] args) {
		
		String result =" ";
	String str ="Clean World Green World";
	System.out.println("Actaul String: " +str);
	for (int i=str.length()-1; i>=0; i--)
	{
		char ch= str.charAt(i);
		result = result +ch;				
		
	}
	System.out.println("Print then reverse String :" +result);
	}

}
