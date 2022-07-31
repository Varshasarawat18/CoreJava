package testPackage;

public class LoopExample1
{

	public static void main(String[] args) 
	{
		int[] array= {10,20,30,40,50};
			for (int i=0; i<array.length;i++)   //here length only not length() as we are not using method here , we are using property length
			{
				System.out.println("Print all number : " + array[i]);
			}
		}

}
