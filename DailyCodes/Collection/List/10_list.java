import java.util.*;

class ListDemo{
	
	public static void main(String args []){
	
		List list = new ArrayList();
		
		
		list.add(20);
		list.add(40);
		list.add("Shreyas");
		list.add('b');
		list.add(42.53);
		list.add('N');
		list.add("Aditya");

		System.out.println(list.contains('N')); //true

		list.add(3,'a');

		System.out.println(list.get(3)); //a

		System.out.println(list.isEmpty()); //false

		System.out.println(list); //whole list

		list.remove(5);

		System.out.println(list.get(5)); //N
		
		System.out.println(list.contains(42.53)); //false 
		
		list.add(3 ,5);

		System.out.println(list); //whole list
		
		//there are two types of 'remove' method , 1)remove(int index) and 2)remove(Object o)
		//
		//the remove(int index) returns the element which was removed 
		//the remove(object o) returns a boolean value(true/false)
		//the removem (object o) removes the first occurrence of the specified element from the list , if present returns TRUE , otherwise returns FALSE if the element was not found
		
		System.out.println(list.remove(5)); //b

		System.out.println(list); //whole list

		System.out.println(list.remove("Shreyas")); //true

		System.out.println(list); //whole list

		System.out.println(list.size()); //6

		list.clear();

		System.out.println(list.isEmpty()); //true

	}


}
