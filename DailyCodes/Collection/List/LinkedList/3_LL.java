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

		System.out.println("5th element : " + ll.get(5));

		ll.addFirst("Rajesh");
		ll.addLast(29);

		System.out.println("LinkedList : " + ll);

		ll.add(5 , 55.55);

		ll.removeFirst();

		ll.removeLast();
		
		System.out.println("LinkedList : " + ll);

		System.out.println("Removing the first element of the LinkedList : " + ll.remove());

		System.out.println("LinkedList : " + ll);
	
	}

}
