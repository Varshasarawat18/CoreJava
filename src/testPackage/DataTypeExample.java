package testPackage;

public class DataTypeExample {
	public static void main(String args[])
	{
	
	int num1 = 30;
    int num2 = 20;
    
    int sum = num1 + num2;
    int mul = num1 * num2;
    float div = (float) num1 /num2;   //typecasting
    
     
    System.out.println("The sum of two numbers is " + sum);
    System.out.println("The mul of two numbers is " + mul);
    System.out.println("The div of two numbers is " + div);
    
    String str="Clean green world";
    System.out.println(str);
   System.out.println("Print me length " + str.length());
    
    char chr =str.charAt (0);
    System.out.println("the first char is "+chr);
   
    char chr2=str.charAt(str.length()-1);  //to print last char
   System.out.println("print last digit/character: "+chr2);  
   
   System.out.println("The string in upper case :" + str.toUpperCase());
   System.out.println("The string in lower case :" +str.toLowerCase());
	}
}
