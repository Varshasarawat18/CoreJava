package testPackage;

public class ArrayExample {
	public static void main(String args[])
	{
		int[] array= {10,20,30,40,50};
		System.out.println("Length of array: " + array.length);  //print length
		System.out.println("First array :" + array[0]);
		System.out.println("Last array: " + array[array.length-1]);  //dont harcode alwasy use array length -1
		
		String[] array2 = {"abc" , "bcd" ,"efg"};
		System.out.println("Print string array:" + array2[0]);
		
		String str ="Hello world green world";
		String[] array3 =str.split(" " );  //this split will work as and print all string as seperately {"hello" , "world" , "Green" , "world"}
		System.out.println("the first word is " + array3[0]);

	}

}
