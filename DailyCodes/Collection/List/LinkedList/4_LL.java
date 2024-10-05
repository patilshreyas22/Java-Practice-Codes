//The peek() and poll() methods are part of the Queue Interface , which the LinkedList class implements , These methods are commonly used when LinkedList is used as queue or deque 

//The peek() method just retives the first element of the LinkedList but does not remove it , it just returns the first element , also returns null if theres no element at the first place

//The poll() method retrives and removes the first element (head) of the list . returns the first element of the list , or null if the list is empty 

import java.util.*;

class LinkedListDemo{
	
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

		System.out.println("Peeked Element : " + ll.peek());

		System.out.println("Removing the First Element of the LinkedList by Poll() Method : " + ll.poll());

		System.out.println("LinkedList : " + ll);
		
		System.out.println("Clearing all the elements in the list");

		ll.clear();

		System.out.println("Peeked Element : " + ll.peek());
		
		System.out.println("Removing the First Element of the LinkedList by Poll() Method : " + ll.poll());



	
	}

}
