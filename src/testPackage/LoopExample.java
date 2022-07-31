package testPackage;

public class LoopExample {

	public static void main(String[] args) {
		
			int num=2;
			while (num<=10)
			{
				if(num==6)  //skip instead of instead this one 
				{
					
				}
				else
				{
				System.out.println("print no :" +num );
				}
				num= num+2;
			}
			for (int index=1;index<=10;index++)
			{
				if(index==6)
					continue;
				System.out.println("print index: " + index);
			}
			//if we want to iterate via look like want to do with array number
			int [] array= {10,20,30,40,50};
			{
				for(int num1 :array) //using like this is for each loop
				{
					 System.out.println("num1: " + num1);
				}
			}
	}

}
