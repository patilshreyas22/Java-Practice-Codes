import java.util.*;

class ListMethods{  //Contains() : returns a boolean val , 
		    //get() : returns the specified value at the given index
		    //isEmpty() : return a boolean val , if the list is empty , returns true , if not then false 
		    //remove() : remove the specified value at the given index

	
	public static void main(String args []){
		
		List list = new ArrayList();

		list.add(10);
		list.add(20);

		list.add("Shashi");
		list.add("Kanha");

		list.add(30.5);

		System.out.println(list);

		System.out.println(list.contains(30)); //false

		System.out.println(list.contains("Shashi")); //true

		System.out.println(list.get(4)); //30.5


		System.out.println(list.isEmpty()); //false
		
		System.out.println(list.remove(4)); // 30.5
						    
		
		System.out.println(list);
		

		System.out.println(list.get(7));  //this will throw an exception as "Index out of Bounds"
	
	}


}
