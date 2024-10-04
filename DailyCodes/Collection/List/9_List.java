import java.util.*;

class ListMethods{   
		    
		     // when you add a new element to a index which already contains a element , the new element is added to the specified index and the remaining elements after that index
		     // are incremented by one index and stored again
		  

	
	public static void main(String args []){
		
		List list = new ArrayList();

		list.add(10);
		list.add(20);

		list.add("Shashi");
		list.add("Kanha");

		System.out.println("Current Size : " + list.size()); //4 

		System.out.println(list); 

		list.add(2, "Aditya");
		
		System.out.println("Index 2 : " + list.get(2)); //Aditya

		System.out.println("Index 3 : " + list.get(3)); //Shashi

		System.out.println("Current Size : " + list.size()); //5
		
		System.out.println(list);

	}

}
		
