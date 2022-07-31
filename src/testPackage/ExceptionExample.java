package testPackage;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int[] array= {2,3,4};
		//System.out.println(array[5]);   //if use here code with stuck here and not excute further so we try catch so that error would be skipped
		int num =10;
		
		try 
		{
			int res =num/0;
			System.out.println(array[5]); 
		}catch (ArithmeticException e)
	{
      System.out.println("Inside Arithmatic catch block");
	} catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Inside array catch block");

}
			finally 
		{
			System.out.println("Inside Finally");  //This will always be executed if you get exception or not so can put where you want to nulify something, release memory
		}
		System.out.println("After exception");
	}
	
}
