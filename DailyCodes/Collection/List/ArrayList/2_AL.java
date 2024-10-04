import java.util.*;

class ArrayListMethods extends ArrayList{

	
	public static void main(String args []){
		
		//ArrayList al = new ArrayList();
	
	ArrayListMethods al = new ArrayListMethods();

	for(int i = 10 ; i<=50 ; i+=10){
	
		
		al.add(i);
	
	}

	al.add(30);
	al.add(40);
	al.add(50);
	al.add("Shreyas");
	

	System.out.println(al);

	//indexOf(Object o)
	System.out.println(al.indexOf(30)); //2 (The index of the first 30 which comes in the list is returned )
	
	//lastIndexOf(Object 0)
	System.out.println(al.lastIndexOf(30)); //5 (The index of the last 30 which comes in the list is returned )
	
	//size
	System.out.println(al.size());
	
	//remove
	al.remove(8);

	System.out.println(al.size());

	//trimToSize()	THIS METHOD IS USEFUL WHEN YOU WANT TO OPTIMIZE MEMORY USAGE AFTER ADDING OR REMOVING ELEMENTS FROM THE ARRAYLIST
	//		When elements are removed from the list , the size decreases , bu the capacity remains unchanged unless trimToSize() is called
	//		trimToSize() trims the internal capacity of the ArrayList to match its currentSize , ensuring that no extra memory is allocated beyond whats needed for the elements
	//		list
	al.trimToSize();

	System.out.println(al.size());


	}


}
