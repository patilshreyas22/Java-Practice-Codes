import java.util.*;

class LinkedListMethods{
	
	public static void main(String args []){
		
		LinkedList ll = new LinkedList();

		ll.add("Shreyas");
		ll.add(22);
		ll.add("Shrishti");
		ll.add(30);
		ll.add("Aditya");
		ll.add(24);
		ll.add("Rekha");
		ll.add(10);
		ll.add("Anil");
		ll.add(25);

		System.out.println("LinkedList : " + ll);

		System.out.println("First Element : " + ll.getFirst());
		
		System.out.println("Last Element : " + ll.getLast());

		System.out.println("Current size of LinkedList : " + ll.size());

		System.out.println("Is LinkedList empty?  : " + ll.isEmpty());

		ll.clear();

		System.out.println("LinkedList : " + ll);

		System.out.println("Is LinkedList empty?  : " + ll.isEmpty());

		System.out.println("Current size of LinkedList : " + ll.size());


	
	}

}
