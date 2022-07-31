package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		String[] array = {"abc","def","ghi"};   //in array we have to define size 
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list = new ArrayList<Integer>();   //to define 
		
		list.add("leana");
		list.add("john");
		list.add("Marry");
		
		System.out.println("List of array: " + list);
		System.out.println("Size of array is : " + list.size());
		
		list.add(0,"varsha");    //to insert data at specific locations
		list.add(1,"Rani");
		System.out.println("List of array after inserting two more: " + list);
		System.out.println("Size of array is : " + list.size());
					
		list.remove(2);    //to delete data at specific locations
		System.out.println("List of array after deleting : " + list);
		System.out.println("Size of array is : " + list.size());

		System.out.println("Array at given position: " + list.get(1));   //to find data at specific position
		
		list.set(0,"Anshu");
		System.out.println("Array after replacing " + list);   //to replace someone is list
		
		Collections.sort(list);
		System.out.println("Array after sorting " + list);   //to sort array
		
		for(int i=0;i<list.size();i++)  //to traverse each array 
		{
			System.out.println("List of array via for loop :" + list.get(i));
			
		}
		
		for(String name :list)
		{
			System.out.println("List of array via for each loop: " +name);  
		}
		
		//WAP to find out position of Rani in list
		for(int i=0;i<list.size();i++)  //to traverse each array 
		{
			if (list.get(i).contains("Rani"))
			{
				System.out.println(i);
				break;
			}			
		}


}

}
