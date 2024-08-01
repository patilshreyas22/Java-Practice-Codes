import java.util.*;

class DescTreeSetDemo{  //Sorted Set also sorts the data in ascending order but the thing is Sorted Set is a Interface , and TreeSet is a class , so basically TreeSet is a Concrete
		    //Implementation of SortedSet Interface , TreeSet uses the Red-Black Tree Data Structure to store its elements (Self Balancing Binary Search Tree)

	public static void main(String args []){
	
		TreeSet t = new TreeSet();

		t.add("Kanha");

		t.add("Ashish");

		t.add("Rahul");

		t.add("Badhe");

		t.add("Shashi");
	
		System.out.println(t.descendingSet()); // This is the Method descendingSet(); which prints the data in descending order	
		
	}
}
