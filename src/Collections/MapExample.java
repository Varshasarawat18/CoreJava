package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<Integer,String>();   //in hashmpa we store data in index and value format so its easy to retrieve
		
		map.put(1, "Matt");  //map starts index with 1, hashmap is much much faster as we are using unique key to store data
		map.put(2, "Katee");
		map.put(3, "John");
		map.put(4, "Max");
		map.put(5, "Matt");
		map.put(3, "Arpita");    //this will replace automatically 3 position
		map.put(100, "Praveen");    
		
		System.out.println("Map value:" + map);   // no guarantee how we retrieve data in any order in can be 
		System.out.println("Data at 4 position: " + map.get(4)); 
		System.out.println("Data at 10 position: " + map.get(10)); 
		System.out.println("Data at 100 position: " + map.get(100)); 
		
		map.remove(100);
		System.out.println("Map value:" + map); 
		
		for(Integer key : map.keySet())
		{
			System.out.println("key is: " + key );
			System.out.println("value is: " + map.get(key));
		}

		
	}

}
