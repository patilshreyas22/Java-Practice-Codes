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

		
		list.clear();

		System.out.println(list.isEmpty()); //true

	}


}
